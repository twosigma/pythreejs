// we do this so it works in IPython or the sage cell server
var require = require || sagecell.require;
var requirejs = requirejs || sagecell.requirejs
var define = define || sagecell.define;

requirejs.config({
  paths: {
        'threejs': 'https://raw2.github.com/jasongrout/three.js/sagecell/build/three.min',
        'threejs-trackball': 'https://raw2.github.com/jasongrout/three.js/sagecell/examples/js/controls/TrackballControls',
        'threejs-orbit': 'https://raw2.github.com/jasongrout/three.js/sagecell/examples/js/controls/OrbitControls',
        'threejs-detector': 'https://raw2.github.com/jasongrout/three.js/sagecell/examples/js/Detector',
  },
  shim: {
    'threejs': {exports: 'THREE'},
    'threejs-trackball': {exports: 'THREE.TrackballControls',
                          deps: ['threejs']},
    'threejs-orbit': {exports: 'THREE.OrbitControls',
                      deps: ['threejs']},
    'threejs-detector': {exports: 'Detector'},
  },
    waitSeconds: 20,
});
define("threejs-all", ["threejs-trackball", "threejs-orbit", "threejs-detector"], function() {console.log('three.js loaded')});

require(["threejs-all", "notebook/js/widgets/widget"], function() {
    var RendererView = IPython.DOMWidgetView.extend({
        render : function(){
            console.log('created renderer');
            var width = this.model.get('width');
            var height = this.model.get('height');
            if ( Detector.webgl )
                this.renderer = new THREE.WebGLRenderer( {antialias:true} );
            else
                this.renderer = new THREE.CanvasRenderer(); 
            this.renderer.setSize( width, height);
            this.$el.empty().append( this.renderer.domElement );
            this.camera = this.create_child_view(this.model.get('camera'));
            this.scene = this.create_child_view(this.model.get('scene'));
            this.scene.obj.add(this.camera.obj);
            console.log('renderer', this.model, this.scene.obj, this.camera.obj);
            this.update();
            var that = this;
            this.controls = this.create_child_view(this.model.get('controls'), {dom: this.renderer.domElement, 
                                                                         update: function(fn, context) {
                                                                                    that.on('render:update', fn, context);
                                                                                 }
                                                                        })
            this.animate();
            window.r = this;
        },
        animate: function() {
            requestAnimationFrame( _.bind(this.animate, this) );
            this.trigger('render:update');
            this.renderer.render(this.scene.obj, this.camera.obj);
        },
        update : function(){
            console.log('update renderer', this.scene.obj, this.camera.obj);
            return IPython.DOMWidgetView.prototype.update.call(this);
        },        
    });

    IPython.WidgetManager.register_widget_view('RendererView', RendererView);

    var ThreeView = IPython.WidgetView.extend({        
        replace_obj: function(new_obj) {
            var old_obj = this.obj;
            this.obj = new_obj;
            this.trigger('replace_obj', old_obj, new_obj);
        }
    });

    
    var Object3dView = ThreeView.extend({
        // this is meant to be called *after* the object has been created, and modifies the object
        // to reflect rotation, matrix, etc.
        update_object_parameters: function() {
            var array_props = ['position', 'rotation', 'up', 'scale']
            for (var prop=0,len=array_props.length; prop<len; prop++) {
                var p = array_props[prop];
                if (p !== null) {
                    this.obj[p].fromArray(this.model.get(p));
                }
            }
            var bool_props = ['visible', 'castShadow', 'receiveShadow']
            for (var prop=0,len=bool_props.length; prop<len; prop++) {
                var p = bool_props[prop]
                this.obj[p] = this.model.get(p);
            }
            if (this.model.get('matrix').length===16) {
                this.obj.matrix.fromArray(this.model.get('matrix'));
            }
        },
        
        update_children: function(oldchildren, newchildren) {
            var that = this;
            this.do_diff(oldchildren, newchildren, function(deleted) {
                            var view = that.child_views[deleted.id];
                            that.obj.remove(view.obj);
                            view.off('replace_obj', null, that);
                            that.delete_child_view(deleted);
                         }, 
                         function(added) {
                            var view = that.create_child_view(added);
                            that.obj.add(view.obj);
                            view.on('replace_obj', that.replace_child_obj, that);
                         });
        },

        render: function() {
            this.obj = this.new_obj();
            this.update_children([], this.model.get('children'));
            this.update();
        },
        new_obj: function() {
            return new THREE.Object3D();
        },
        update: function() {
            //this.replace_obj(this.new_obj());
            this.update_object_parameters();
            if (this.model.hasChanged('children')) {
                this.update_children(this.model.previous('children'), this.model.get('children'));
            }
        },
        replace_child_obj: function(old_obj, new_obj) {
            this.obj.remove(old_obj);
            this.obj.add(new_obj);
            // TODO: trigger re-render, when we have an event-driven rendering loop
        },
    });
    IPython.WidgetManager.register_widget_view('Object3dView', SceneView);
    
    var CameraView = Object3dView.extend({
        new_obj: function() {
            return new THREE.PerspectiveCamera( this.model.get('fov'), this.model.get('ratio'), 1, 1000 );
        }
    });
    IPython.WidgetManager.register_widget_view('CameraView', CameraView);

    var OrbitControlsView = ThreeView.extend({
        render: function() {
            this.controlled_view = this.model.get('controlling').views[0];
            this.obj = new THREE.OrbitControls(this.controlled_view.obj, this.options.dom);
            this.options.update(this.obj.update, this.obj);
            delete this.options.renderer; 
        }
    });
    IPython.WidgetManager.register_widget_view('OrbitControlsView', OrbitControlsView);


    var SceneView = Object3dView.extend({
        new_obj: function() {
            return new THREE.Scene();
        }
    });
    IPython.WidgetManager.register_widget_view('SceneView', SceneView);

    var SurfaceGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            var obj = new THREE.PlaneGeometry(this.model.get('width'),
                                              this.model.get('height'),
                                              this.model.get('width_segments'),
                                              this.model.get('height_segments'));
            // PlaneGeometry constructs its vertices by going across x coordinates, starting from the maximum y coordinate
            var z = this.model.get('z');
            for (var i = 0, len = obj.vertices.length; i<len; i++) {
                obj.vertices[i].z = z[i];
            }
            obj.computeCentroids()
            obj.computeFaceNormals();
            obj.computeVertexNormals();
            this.replace_obj(obj);
        }
    });
    IPython.WidgetManager.register_widget_view('SurfaceGeometryView', SurfaceGeometryView);

    var FaceGeometryView = ThreeView.extend({
        render: function() {
            this.update();
            return this.obj;
        },
        update: function() {
            // Construct triangles
            var geometry = new THREE.Geometry();
            var vertices = this.model.get('vertices');
            var face3 = this.model.get('face3');
            var face4 = this.model.get('face4');
            var i, len;
            var v0, v1, v2;
            var f0,f1,f2,f3;
            for(i = 0, len=vertices.length; i<len; i+=3) {
                v0=vertices[i]; v1=vertices[i+1]; v2=vertices[i+2];
                geometry.vertices.push(new THREE.Vector3(v0, v1, v2));
            }
            for(i=0, len=face3.length; i<len; i+=3) {
                f0 = face3[i]; f1 = face3[i+1]; f2=face3[i+2];
                geometry.faces.push(new THREE.Face3(f0, f1, f2));
            }
            for(i=0, len=face4.length; i<len; i+=4) {
                f0=face4[i]; f1=face4[i+1]; f2=face4[i+2]; f3=face4[i+3];
                geometry.faces.push(new THREE.Face3(f0, f1, f2));
                geometry.faces.push(new THREE.Face3(f0, f2, f3));
            }
            geometry.mergeVertices();
            geometry.computeCentroids();
            geometry.computeFaceNormals();
            geometry.computeVertexNormals();
            geometry.computeBoundingSphere();
            this.replace_obj(geometry);
        }
    });
    IPython.WidgetManager.register_widget_view('FaceGeometryView', FaceGeometryView);

    
    var SphereGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.SphereGeometry(this.model.get('radius'), 32,16));
        }
    })
    IPython.WidgetManager.register_widget_view('SphereGeometryView', SphereGeometryView);
    
    var CylinderGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.CylinderGeometry(this.model.get('radiusTop'),
                                                        this.model.get('radiusBottom'),
                                                        this.model.get('height'),
                                                        this.model.get('radiusSegments'),
                                                        this.model.get('heightSegments'),
                                                        this.model.get('openEnded')));
        }
    })
    IPython.WidgetManager.register_widget_view('CylinderGeometryView', CylinderGeometryView);
    
    var CubeGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.CubeGeometry(this.model.get('width'),
                                                        this.model.get('height'),
                                                        this.model.get('depth'),
                                                        this.model.get('widthSegments'),
                                                        this.model.get('heightSegments'),
                                                        this.model.get('depthSegments')));
        }
    })
    IPython.WidgetManager.register_widget_view('CubeGeometryView', CubeGeometryView);
    
    var CircleGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.CircleGeometry(this.model.get('radius'),
                                                        this.model.get('segments'),
                                                        this.model.get('thetaStart'),
                                                        this.model.get('thetaLength')));
        }
    })
    IPython.WidgetManager.register_widget_view('CircleGeometryView', CircleGeometryView);
    
    var LatheGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.LatheGeometry(this.model.get('segments'),
                                                        this.model.get('points'),
                                                        this.model.get('phiLength'),
                                                        this.model.get('phiStart')));
        }
    })
    IPython.WidgetManager.register_widget_view('CircleGeometryView', CircleGeometryView);
    
    var IcosahedronGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.IcosahedronGeometry(this.model.get('radius'),
                                                        this.model.get('detail')));
        }
    })
    IPython.WidgetManager.register_widget_view('IcosahedronGeometryView', IcosahedronGeometryView);
    
    var OctahedronGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.OctahedronGeometry(this.model.get('radius'),
                                                        this.model.get('detail')));
        }
    })
    IPython.WidgetManager.register_widget_view('OctahedronGeometryView', OctahedronGeometryView);
    
    var PlaneGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.PlaneGeometry(this.model.get('width'),
                                                        this.model.get('height'),
                                                        this.model.get('widthSegments'),
                                                        this.model.get('heightSegments')));
        }
    })
    IPython.WidgetManager.register_widget_view('PlaneGeometryView', PlaneGeometryView);

    var TetrahedronGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.TetrahedronGeometry(this.model.get('radius'),
                                                        this.model.get('detail')));
        }
    })
    IPython.WidgetManager.register_widget_view('TetrahedronGeometryView', TetrahedronGeometryView);
    
    var TorusGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.TorusGeometry(this.model.get('radius'),
                                                        this.model.get('tube'),
                                                        this.model.get('radialSegments'),
                                                        this.model.get('tubularSegments'),
                                                        this.model.get('arc')));
        }
    })
    IPython.WidgetManager.register_widget_view('TorusGeometryView', TorusGeometryView);
    
    var TorusKnotGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.TorusKnotGeometry(this.model.get('radius'),
                                                        this.model.get('tube'),
                                                        this.model.get('radialSegments'),
                                                        this.model.get('tubularSegments'),
                                                        this.model.get('p'),
                                                        this.model.get('q'),
                                                        this.model.get('heightScale')));
        }
    })
    IPython.WidgetManager.register_widget_view('TorusKnotGeometryView', TorusKnotGeometryView);
    
    var PolyhedronGeometryView = ThreeView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.PolyhedronGeometry(this.model.get('vertices'),
                                                          this.model.get('faces'),
                                                          this.model.get('radius'),
                                                          this.model.get('detail')));
        }
    })
    IPython.WidgetManager.register_widget_view('PolyhedronGeometryView', PolyhedronGeometryView);
    
    function setProperties(obj, model) {
      console.log('in setProperties');
      for (var key in model) {
        obj[key] = model[key];
        console.log(key);
      }
    }
    
    var MaterialView = ThreeView.extend({
        render: function() {
          this.obj = new THREE.Material();
          
          return this.obj;
        },
      update: function() {
          setProperties(this.obj, this.model);
          this.obj.needsUpdate = true;
      }
    })
    IPython.WidgetManager.register_widget_view('MaterialView', MaterialView);
    
    var BasicMaterialView = MaterialView.extend({
        render: function() {
            this.obj = new THREE.MeshBasicMaterial({color: this.model.get('color'),
                                                      side: THREE.DoubleSide});
            return this.obj;
        },
        update: function() {
            MaterialView.prototype.update.call(this);
            setProperties(this.obj, this.model);
            this.obj.needsUpdate=true;
        }
    })
    IPython.WidgetManager.register_widget_view('BasicMaterialView', BasicMaterialView);
    
    var LambertMaterialView = BasicMaterialView.extend({
        render: function() {
            this.obj = new THREE.MeshLambertMaterial({color: this.model.get('color'), 
                                                      side: THREE.DoubleSide});
            return this.obj;
        },
        update: function() {
            BasicMaterialView.prototype.update.call(this);
            setProperties(this.obj, this.model);
            this.obj.needsUpdate=true;
        }
    })
    IPython.WidgetManager.register_widget_view('LambertMaterialView', LambertMaterialView);
    
    var PhongMaterialView = BasicMaterialView.extend({
        render: function() {
            this.obj = new THREE.MeshPhongMaterial({color: this.model.get('color'), 
                                                      side: THREE.DoubleSide});
            return this.obj;
        },
        update: function() {
            BasicMaterialView.prototype.update.call(this);
            setProperties(this.obj, this.model);
            this.obj.needsUpdate=true;
        }
    })
    IPython.WidgetManager.register_widget_view('PhongMaterialView', PhongMaterialView);
    
    var DepthMaterialView = MaterialView.extend({
        render: function() {
            this.obj = new THREE.MeshDepthMaterial({wireframe : this.model.get('wireframe'), 
                                                      wireframeLinewidth : this.model.get('wireframeLinewidth')});
            return this.obj;
        },
        update: function() {
            MaterialView.prototype.update.call(this);
            this.obj.needsUpdate=true;
        }
    })
    IPython.WidgetManager.register_widget_view('DepthMaterialView', DepthMaterialView);

    var LineBasicMaterial = MaterialView.extend({
        render: function() {
            this.obj = new THREE.LineBasicMaterial({color: this.model.get('color'), 
                                                      side: THREE.DoubleSide});
            return this.obj;
        },
        update: function() {
            MaterialView.prototype.update.call(this);
            setProperties(this.obj, this.model);
            this.obj.needsUpdate=true;
        }
    })
    IPython.WidgetManager.register_widget_view('LineBasicMaterial', LineBasicMaterial);
    
    var MeshView = Object3dView.extend({
        // if we replace the geometry or material, do a full re-render
        // TODO: make sure we don't set multiple such handlers, so this should probably happen in the init, not the render
        //this.model.on('change:geometry', this.render, this);
        //this.model.on('change:material', this.render, this);
        render: function() {
            this.geometryview = this.create_child_view(this.model.get('geometry'));
            this.materialview = this.create_child_view(this.model.get('material'));
            this.geometryview.on('replace_obj', this.update, this);
            this.materialview.on('replace_obj', this.update, this);
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(new THREE.Mesh( this.geometryview.obj, this.materialview.obj ));
            //this.obj.geometry = this.geometryview.obj;
            //this.obj.material = this.materialview.obj;
            //this.obj.material.needsUpdate=true;
            Object3dView.prototype.update.call(this);
        }        
    });   
        IPython.WidgetManager.register_widget_view('MeshView', MeshView);
    
    
        var Basic3dObject = Object3dView.extend({
        render: function() {
            this.update()
            return this.obj;
        },
        update: function() {
            this.replace_obj(this.new_obj());
            Object3dView.prototype.update.call(this);
        }
    });
    var AmbientLight = Basic3dObject.extend({
        new_obj: function() {
            return new THREE.AmbientLight(this.model.get('color'));
        }
    });   
    IPython.WidgetManager.register_widget_view('AmbientLight', AmbientLight);
    
    var DirectionalLight = Basic3dObject.extend({
        new_obj: function() {
            return new THREE.DirectionalLight(this.model.get('color'), this.model.get('intensity'));
        }
    });   
    IPython.WidgetManager.register_widget_view('DirectionalLight', DirectionalLight);

    var PointLight = Basic3dObject.extend({
        new_obj: function() {
            return new THREE.PointLight(this.model.get('color'), 
                                        this.model.get('intensity'),
                                        this.model.get('distance'));
        }
    });   
    IPython.WidgetManager.register_widget_view('PointLight', PointLight);
    
    var SpotLight = Basic3dObject.extend({
        new_obj: function() {
            return new THREE.SpotLight(this.model.get('color'), 
                                        this.model.get('intensity'),
                                        this.model.get('distance'));
        }
    });   
    IPython.WidgetManager.register_widget_view('SpotLight', SpotLight);

    var HemisphereLight = Basic3dObject.extend({
        new_obj: function() {
            return new THREE.HemisphereLight(this.model.get('color'),
                                             this.model.get('ground_color'),
                                             this.model.get('intensity'));
        }
    });
    IPython.WidgetManager.register_widget_view('HemisphereLight', HemisphereLight);

});
