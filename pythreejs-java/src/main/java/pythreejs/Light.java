
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Light extends Object3D {

  public static final String MODEL_NAME_VALUE = "LightModel";
  public static final String COLOR = "color";
  public static final String INTENSITY = "intensity";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private double intensity = 1;
  private String type = "Light";

  public Light() {
    super();
  }

    public Light(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.intensity = (double) parameters.getOrDefault(INTENSITY, (Serializable) this.intensity);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(INTENSITY, (Serializable) intensity);
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

  public double getIntensity() {
    return intensity;
  }
  public void setIntensity(double intensity){
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
