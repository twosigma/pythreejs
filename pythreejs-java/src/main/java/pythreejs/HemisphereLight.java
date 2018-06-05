
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class HemisphereLight extends Light {

  public static final String MODEL_NAME_VALUE = "HemisphereLightModel";
  public static final String GROUNDCOLOR = "groundColor";
  public static final String TYPE = "type";

  private String groundColor = "#000000";
  private String type = "HemisphereLight";

  public HemisphereLight() {
    super();
    openComm();
  }

    public HemisphereLight(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.groundColor = (String) parameters.getOrDefault(GROUNDCOLOR, (Serializable) this.groundColor);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(GROUNDCOLOR, (Serializable) groundColor);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getGroundColor() {
    return groundColor;
  }
  public void setGroundColor(String groundColor){
    this.groundColor = groundColor;
    sendUpdate(GROUNDCOLOR, groundColor);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
