
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Sprite extends Object3D {

  public static final String MODEL_NAME_VALUE = "SpriteModel";
  public static final String CENTER = "center";
  public static final String MATERIAL = "material";
  public static final String TYPE = "type";

  private List center = Arrays.asList(0.5, 0.5);
  private SpriteMaterial material;
  private String type = "Sprite";

  public Sprite() {
    super();
    openComm();
  }

    public Sprite(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.center = (List) parameters.getOrDefault(CENTER, (Serializable) this.center);
      this.material = (SpriteMaterial) parameters.getOrDefault(MATERIAL, (Serializable) this.material);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CENTER, (Serializable) center);
    content.put(MATERIAL, material == null ? null : "IPY_MODEL_" + material.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getCenter() {
    return center;
  }
  public void setCenter(List center){
    this.center = center;
    sendUpdate(CENTER, center);
  }

  public SpriteMaterial getMaterial() {
    return material;
  }
  public void setMaterial(SpriteMaterial material){
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
