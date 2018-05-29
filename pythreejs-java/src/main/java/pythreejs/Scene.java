package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

public class Scene extends Object3D {

  public static final String MODEL_NAME_VALUE = "SceneModel";
  public static final String AUTOUPDATE = "autoUpdate";
  public static final String BACKGROUND = "background";
  public static final String FOG = "fog";
  public static final String OVERRIDEMATERIAL = "overrideMaterial";
  public static final String TYPE = "type";

  private Boolean autoUpdate = true;
  private String background = "#ffffff";
  private Serializable fog = null;
  private Serializable overrideMaterial = null;
  private String type = "Scene";

  public Scene() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(AUTOUPDATE, autoUpdate);
    content.put(BACKGROUND, background);
    content.put(FOG, fog);
    content.put(OVERRIDEMATERIAL, overrideMaterial);
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

  public Boolean getAutoUpdate() {
    return autoUpdate;
  }
  public void setAutoUpdate(Boolean autoUpdate){
    this.autoUpdate = autoUpdate;
    sendUpdate(AUTOUPDATE, autoUpdate);
  }

  public String getBackground() {
    return background;
  }
  public void setBackground(String background){
    this.background = background;
    sendUpdate(BACKGROUND, background);
  }

  public Serializable getFog() {
    return fog;
  }
  public void setFog(Serializable fog){
    this.fog = fog;
    sendUpdate(FOG, fog);
  }

  public Serializable getOverrideMaterial() {
    return overrideMaterial;
  }
  public void setOverrideMaterial(Serializable overrideMaterial){
    this.overrideMaterial = overrideMaterial;
    sendUpdate(OVERRIDEMATERIAL, overrideMaterial);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
