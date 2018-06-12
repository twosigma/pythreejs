
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Mesh extends Object3D {

  public static final String MODEL_NAME_VALUE = "MeshModel";
  public static final String DRAWMODE = "drawMode";
  public static final String GEOMETRY = "geometry";
  public static final String MATERIAL = "material";
  public static final String MORPHTARGETINFLUENCES = "morphTargetInfluences";
  public static final String TYPE = "type";

  private Object drawMode = "TrianglesDrawMode";
  private Widget geometry = new Geometry();
  private Widget material = new Material();
  private List morphTargetInfluences = new ArrayList<>();
  private String type = "Mesh";

  public Mesh() {
    super();
    openComm();
  }

    public Mesh(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.drawMode = (Object) parameters.getOrDefault(DRAWMODE, (Serializable) this.drawMode);
      this.geometry = (Widget) parameters.getOrDefault(GEOMETRY, (Serializable) this.geometry);
      this.material = (Widget) parameters.getOrDefault(MATERIAL, (Serializable) this.material);
      this.morphTargetInfluences = (List) parameters.getOrDefault(MORPHTARGETINFLUENCES, (Serializable) this.morphTargetInfluences);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DRAWMODE, (Serializable) drawMode);
    content.put(GEOMETRY, geometry == null ? null : "IPY_MODEL_" + geometry.getComm().getCommId());
    content.put(MATERIAL, material == null ? null : "IPY_MODEL_" + material.getComm().getCommId());
    content.put(MORPHTARGETINFLUENCES, (Serializable) morphTargetInfluences);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Object getDrawMode() {
    return drawMode;
  }
  public void setDrawMode(Object drawMode){
    this.drawMode = drawMode;
    sendUpdate(DRAWMODE, drawMode);
  }

  public Widget getGeometry() {
    return geometry;
  }
  public void setGeometry(BaseGeometry geometry){
    this.geometry = geometry;
    sendUpdate(GEOMETRY, geometry == null ? null : "IPY_MODEL_"+geometry.getComm().getCommId());
  }

  public Widget getMaterial() {
    return material;
  }
  public void setMaterial(Material material){
    this.material = material;
    sendUpdate(MATERIAL, material == null ? null : "IPY_MODEL_"+material.getComm().getCommId());
  }

  public List getMorphTargetInfluences() {
    return morphTargetInfluences;
  }
  public void setMorphTargetInfluences(List morphTargetInfluences){
    this.morphTargetInfluences = morphTargetInfluences;
    sendUpdate(MORPHTARGETINFLUENCES, morphTargetInfluences);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
