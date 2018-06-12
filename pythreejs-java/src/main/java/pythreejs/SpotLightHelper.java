
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class SpotLightHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "SpotLightHelperModel";
  public static final String COLOR = "color";
  public static final String LIGHT = "light";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private SpotLight light;
  private String type = "SpotLightHelper";

  public SpotLightHelper() {
    super();
    openComm();
  }

    public SpotLightHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.light = (SpotLight) parameters.getOrDefault(LIGHT, (Serializable) this.light);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(LIGHT, light == null ? null : "IPY_MODEL_" + light.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
    sendUpdate(COLOR, color);
  }

  public SpotLight getLight() {
    return light;
  }
  public void setLight(SpotLight light){
    this.light = light;
    sendUpdate(LIGHT, light == null ? null : "IPY_MODEL_"+light.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
