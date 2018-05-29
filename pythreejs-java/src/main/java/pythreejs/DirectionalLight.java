package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

public class DirectionalLight extends Light {



  public static final String MODEL_NAME_VALUE = "DirectionalLightModel";
  public static final String SHADOW = "shadow";
  public static final String TARGET = "target";
  public static final String TYPE = "type";

  private Serializable shadow = "uninitialized";
  private Serializable target = "uninitialized";
  private String type = "DirectionalLight";

  public DirectionalLight() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(SHADOW, shadow);
    content.put(TARGET, target);
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

  public Serializable getShadow() {
    return shadow;
  }
  public void setShadow(Serializable shadow){
    this.shadow = shadow;
    sendUpdate(SHADOW, shadow);
  }

  public Serializable getTarget() {
    return target;
  }
  public void setTarget(Serializable target){
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
