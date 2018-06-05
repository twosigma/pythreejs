
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Fog extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "FogModel";
  public static final String COLOR = "color";
  public static final String FAR = "far";
  public static final String NAME = "name";
  public static final String NEAR = "near";

  private String color = "white";
  private double far = 1000;
  private String name;
  private double near = 1;

  public Fog() {
    super();
    openComm();
  }

    public Fog(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.far = (double) parameters.getOrDefault(FAR, (Serializable) this.far);
      this.name = (String) parameters.getOrDefault(NAME, (Serializable) this.name);
      this.near = (double) parameters.getOrDefault(NEAR, (Serializable) this.near);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(FAR, (Serializable) far);
    content.put(NAME, (Serializable) name);
    content.put(NEAR, (Serializable) near);
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

  public double getFar() {
    return far;
  }
  public void setFar(double far){
    this.far = far;
    sendUpdate(FAR, far);
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public double getNear() {
    return near;
  }
  public void setNear(double near){
    this.near = near;
    sendUpdate(NEAR, near);
  }

}
