
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ShaderMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "ShaderMaterialModel";
  public static final String CLIPPING = "clipping";
  public static final String EXTENSIONS = "extensions";
  public static final String FLATSHADING = "flatShading";
  public static final String FOG = "fog";
  public static final String FRAGMENTSHADER = "fragmentShader";
  public static final String LIGHTS = "lights";
  public static final String LINEWIDTH = "linewidth";
  public static final String MORPHNORMALS = "morphNormals";
  public static final String MORPHTARGETS = "morphTargets";
  public static final String SKINNING = "skinning";
  public static final String TYPE = "type";
  public static final String UNIFORMS = "uniforms";
  public static final String UNIFORMSNEEDUPDATE = "uniformsNeedUpdate";
  public static final String VERTEXSHADER = "vertexShader";
  public static final String WIREFRAME = "wireframe";
  public static final String WIREFRAMELINEWIDTH = "wireframeLinewidth";

  private boolean clipping;
  private Map<String, Serializable> extensions = new HashMap<String, Serializable>();
  private boolean flatShading;
  private boolean fog;
  private String fragmentShader;
  private boolean lights;
  private double linewidth = 1;
  private boolean morphNormals;
  private boolean morphTargets;
  private boolean skinning;
  private String type = "ShaderMaterial";
  private Map<String, Serializable> uniforms = new HashMap<String, Serializable>();
  private boolean uniformsNeedUpdate;
  private String vertexShader;
  private boolean wireframe;
  private double wireframeLinewidth = 1;

  public ShaderMaterial() {
    super();
    openComm();
  }

    public ShaderMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.clipping = (boolean) parameters.getOrDefault(CLIPPING, (Serializable) this.clipping);
      this.extensions = (Map<String, Serializable>) parameters.getOrDefault(EXTENSIONS, (Serializable) this.extensions);
      this.flatShading = (boolean) parameters.getOrDefault(FLATSHADING, (Serializable) this.flatShading);
      this.fog = (boolean) parameters.getOrDefault(FOG, (Serializable) this.fog);
      this.fragmentShader = (String) parameters.getOrDefault(FRAGMENTSHADER, (Serializable) this.fragmentShader);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.linewidth = (double) parameters.getOrDefault(LINEWIDTH, (Serializable) this.linewidth);
      this.morphNormals = (boolean) parameters.getOrDefault(MORPHNORMALS, (Serializable) this.morphNormals);
      this.morphTargets = (boolean) parameters.getOrDefault(MORPHTARGETS, (Serializable) this.morphTargets);
      this.skinning = (boolean) parameters.getOrDefault(SKINNING, (Serializable) this.skinning);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.uniforms = (Map<String, Serializable>) parameters.getOrDefault(UNIFORMS, (Serializable) this.uniforms);
      this.uniformsNeedUpdate = (boolean) parameters.getOrDefault(UNIFORMSNEEDUPDATE, (Serializable) this.uniformsNeedUpdate);
      this.vertexShader = (String) parameters.getOrDefault(VERTEXSHADER, (Serializable) this.vertexShader);
      this.wireframe = (boolean) parameters.getOrDefault(WIREFRAME, (Serializable) this.wireframe);
      this.wireframeLinewidth = (double) parameters.getOrDefault(WIREFRAMELINEWIDTH, (Serializable) this.wireframeLinewidth);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CLIPPING, (Serializable) clipping);
    content.put(EXTENSIONS, (Serializable) extensions);
    content.put(FLATSHADING, (Serializable) flatShading);
    content.put(FOG, (Serializable) fog);
    content.put(FRAGMENTSHADER, (Serializable) fragmentShader);
    content.put(LIGHTS, (Serializable) lights);
    content.put(LINEWIDTH, (Serializable) linewidth);
    content.put(MORPHNORMALS, (Serializable) morphNormals);
    content.put(MORPHTARGETS, (Serializable) morphTargets);
    content.put(SKINNING, (Serializable) skinning);
    content.put(TYPE, (Serializable) type);
    content.put(UNIFORMS, (Serializable) uniforms);
    content.put(UNIFORMSNEEDUPDATE, (Serializable) uniformsNeedUpdate);
    content.put(VERTEXSHADER, (Serializable) vertexShader);
    content.put(WIREFRAME, (Serializable) wireframe);
    content.put(WIREFRAMELINEWIDTH, (Serializable) wireframeLinewidth);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getClipping() {
    return clipping;
  }
  public void setClipping(boolean clipping){
    this.clipping = clipping;
    sendUpdate(CLIPPING, clipping);
  }

  public Map<String, Serializable> getExtensions() {
    return extensions;
  }
  public void setExtensions(Map<String, Serializable> extensions){
    this.extensions = extensions;
    sendUpdate(EXTENSIONS, extensions);
  }

  public boolean getFlatShading() {
    return flatShading;
  }
  public void setFlatShading(boolean flatShading){
    this.flatShading = flatShading;
    sendUpdate(FLATSHADING, flatShading);
  }

  public boolean getFog() {
    return fog;
  }
  public void setFog(boolean fog){
    this.fog = fog;
    sendUpdate(FOG, fog);
  }

  public String getFragmentShader() {
    return fragmentShader;
  }
  public void setFragmentShader(String fragmentShader){
    this.fragmentShader = fragmentShader;
    sendUpdate(FRAGMENTSHADER, fragmentShader);
  }

  public boolean getLights() {
    return lights;
  }
  public void setLights(boolean lights){
    this.lights = lights;
    sendUpdate(LIGHTS, lights);
  }

  public double getLinewidth() {
    return linewidth;
  }
  public void setLinewidth(double linewidth){
    this.linewidth = linewidth;
    sendUpdate(LINEWIDTH, linewidth);
  }

  public boolean getMorphNormals() {
    return morphNormals;
  }
  public void setMorphNormals(boolean morphNormals){
    this.morphNormals = morphNormals;
    sendUpdate(MORPHNORMALS, morphNormals);
  }

  public boolean getMorphTargets() {
    return morphTargets;
  }
  public void setMorphTargets(boolean morphTargets){
    this.morphTargets = morphTargets;
    sendUpdate(MORPHTARGETS, morphTargets);
  }

  public boolean getSkinning() {
    return skinning;
  }
  public void setSkinning(boolean skinning){
    this.skinning = skinning;
    sendUpdate(SKINNING, skinning);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public Map<String, Serializable> getUniforms() {
    return uniforms;
  }
  public void setUniforms(Map<String, Serializable> uniforms){
    this.uniforms = uniforms;
    sendUpdate(UNIFORMS, uniforms);
  }

  public boolean getUniformsNeedUpdate() {
    return uniformsNeedUpdate;
  }
  public void setUniformsNeedUpdate(boolean uniformsNeedUpdate){
    this.uniformsNeedUpdate = uniformsNeedUpdate;
    sendUpdate(UNIFORMSNEEDUPDATE, uniformsNeedUpdate);
  }

  public String getVertexShader() {
    return vertexShader;
  }
  public void setVertexShader(String vertexShader){
    this.vertexShader = vertexShader;
    sendUpdate(VERTEXSHADER, vertexShader);
  }

  public boolean getWireframe() {
    return wireframe;
  }
  public void setWireframe(boolean wireframe){
    this.wireframe = wireframe;
    sendUpdate(WIREFRAME, wireframe);
  }

  public double getWireframeLinewidth() {
    return wireframeLinewidth;
  }
  public void setWireframeLinewidth(double wireframeLinewidth){
    this.wireframeLinewidth = wireframeLinewidth;
    sendUpdate(WIREFRAMELINEWIDTH, wireframeLinewidth);
  }

}
