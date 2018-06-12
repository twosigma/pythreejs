
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class RectAreaLight extends Light {

  public static final String MODEL_NAME_VALUE = "RectAreaLightModel";
  public static final String HEIGHT = "height";
  public static final String TYPE = "type";
  public static final String WIDTH = "width";

  private double height = 10;
  private String type = "RectAreaLight";
  private double width = 10;

  public RectAreaLight() {
    super();
    openComm();
  }

    public RectAreaLight(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.height = (double) parameters.getOrDefault(HEIGHT, (Serializable) this.height);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.width = (double) parameters.getOrDefault(WIDTH, (Serializable) this.width);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(HEIGHT, (Serializable) height);
    content.put(TYPE, (Serializable) type);
    content.put(WIDTH, (Serializable) width);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getHeight() {
    return height;
  }
  public void setHeight(double height){
    this.height = height;
    sendUpdate(HEIGHT, height);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public double getWidth() {
    return width;
  }
  public void setWidth(double width){
    this.width = width;
    sendUpdate(WIDTH, width);
  }

}
