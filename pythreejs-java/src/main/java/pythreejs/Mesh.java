package pythreejs;


import java.io.Serializable;
import java.util.*;

public class Mesh extends Object3D {

  public static final String MODEL_NAME_VALUE = "MeshModel";
  private static final String IPY_MODEL = "IPY_MODEL_";
  public static final String DRAWMODE = "drawMode";
  public static final String GEOMETRY = "geometry";
  public static final String MATERIAL = "material";
  public static final String MORPHTARGETINFLUENCES = "morphTargetInfluences";
  public static final String TYPE = "type";

  private String drawMode = "TrianglesDrawMode";
  private BaseGeometry geometry = null;
  private Material material = null;
  private List morphTargetInfluences = new ArrayList<>();
  private String type = "Mesh";

  public Mesh(BaseGeometry geometry, Material material) {
    super();
    this.geometry = geometry;
    this.material = material;
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DRAWMODE, drawMode);
    content.put(GEOMETRY, IPY_MODEL + this.geometry.getComm().getCommId());
    content.put(MATERIAL, IPY_MODEL + this.material.getComm().getCommId());
    content.put(MORPHTARGETINFLUENCES, (Serializable) morphTargetInfluences);
    content.put(TYPE, type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  public Object getDrawMode() {
    return drawMode;
  }
  public void setDrawMode(String drawMode){
    this.drawMode = drawMode;
    sendUpdate(DRAWMODE, drawMode);
  }

  public BaseGeometry getGeometry() {
    return geometry;
  }
  public void setGeometry(BaseGeometry geometry){
    this.geometry = geometry;
    sendUpdate(GEOMETRY, IPY_MODEL + this.geometry.getComm().getCommId());
  }

  public Material getMaterial() {
    return material;
  }
  public void setMaterial(Material material){
    this.material = material;
    sendUpdate(MATERIAL, IPY_MODEL + this.material.getComm().getCommId());
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
