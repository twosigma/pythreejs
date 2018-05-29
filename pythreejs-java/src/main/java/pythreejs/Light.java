package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

public abstract class Light extends Object3D {



  public static final String MODEL_NAME_VALUE = "LightModel";
  public static final String COLOR = "color";
  public static final String INTENSITY = "intensity";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private Double intensity = null;;
  private String type = "Light";

  public Light() {
    super();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, color);
    content.put(INTENSITY, intensity);
    content.put(TYPE, type);
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

  public Double getIntensity() {
    return intensity;
  }
  public void setIntensity(Double intensity){
    this.intensity = intensity;
    sendUpdate(INTENSITY, intensity);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
