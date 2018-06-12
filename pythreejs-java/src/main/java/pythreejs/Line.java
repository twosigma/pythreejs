
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Line extends Object3D {

  public static final String MODEL_NAME_VALUE = "LineModel";
  public static final String GEOMETRY = "geometry";
  public static final String MATERIAL = "material";
  public static final String TYPE = "type";

  private Widget geometry;
  private Material material;
  private String type = "Line";

  public Line() {
    super();
    openComm();
  }

    public Line(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.geometry = (Widget) parameters.getOrDefault(GEOMETRY, (Serializable) this.geometry);
      this.material = (Material) parameters.getOrDefault(MATERIAL, (Serializable) this.material);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(GEOMETRY, geometry == null ? null : "IPY_MODEL_" + geometry.getComm().getCommId());
    content.put(MATERIAL, material == null ? null : "IPY_MODEL_" + material.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Widget getGeometry() {
    return geometry;
  }
  public void setGeometry(Widget geometry){
    this.geometry = geometry;
    sendUpdate(GEOMETRY, geometry == null ? null : "IPY_MODEL_"+geometry.getComm().getCommId());
  }

  public Material getMaterial() {
    return material;
  }
  public void setMaterial(Material material){
    this.material = material;
    sendUpdate(MATERIAL, material == null ? null : "IPY_MODEL_"+material.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
