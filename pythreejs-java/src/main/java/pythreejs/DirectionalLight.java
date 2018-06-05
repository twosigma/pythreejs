
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class DirectionalLight extends Light {

  public static final String MODEL_NAME_VALUE = "DirectionalLightModel";
  public static final String SHADOW = "shadow";
  public static final String TARGET = "target";
  public static final String TYPE = "type";

  private String shadow = "uninitialized";
  private String target = "uninitialized";
  private String type = "DirectionalLight";

  public DirectionalLight() {
    super();
    openComm();
  }

    public DirectionalLight(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.shadow = (String) parameters.getOrDefault(SHADOW, (Serializable) this.shadow);
      this.target = (String) parameters.getOrDefault(TARGET, (Serializable) this.target);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(SHADOW, shadow);
    content.put(TARGET, target);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getShadow() {
    return shadow;
  }
  public void setShadow(String shadow){
    this.shadow = shadow;
    sendUpdate(SHADOW, shadow);
  }

  public String getTarget() {
    return target;
  }
  public void setTarget(String target){
    this.target = target;
    sendUpdate(TARGET, target);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
