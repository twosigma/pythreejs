
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class PointLight extends Light {

  public static final String MODEL_NAME_VALUE = "PointLightModel";
  public static final String DECAY = "decay";
  public static final String DISTANCE = "distance";
  public static final String POWER = "power";
  public static final String SHADOW = "shadow";
  public static final String TYPE = "type";

  private double decay = 1;
  private double distance = 0;
  private double power = 12.566370614359172;
  private Widget shadow;
  private String type = "PointLight";

  public PointLight() {
    super();
    openComm();
  }

    public PointLight(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.decay = (double) parameters.getOrDefault(DECAY, (Serializable) this.decay);
      this.distance = (double) parameters.getOrDefault(DISTANCE, (Serializable) this.distance);
      this.power = (double) parameters.getOrDefault(POWER, (Serializable) this.power);
      this.shadow = (Widget) parameters.getOrDefault(SHADOW, (Serializable) this.shadow);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DECAY, (Serializable) decay);
    content.put(DISTANCE, (Serializable) distance);
    content.put(POWER, (Serializable) power);
    content.put(SHADOW, shadow == null ? "uninitialized" : "IPY_MODEL_" + shadow.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getDecay() {
    return decay;
  }
  public void setDecay(double decay){
    this.decay = decay;
    sendUpdate(DECAY, decay);
  }

  public double getDistance() {
    return distance;
  }
  public void setDistance(double distance){
    this.distance = distance;
    sendUpdate(DISTANCE, distance);
  }

  public double getPower() {
    return power;
  }
  public void setPower(double power){
    this.power = power;
    sendUpdate(POWER, power);
  }

  public Widget getShadow() {
    return shadow;
  }
  public void setShadow(Widget shadow){
    this.shadow = shadow;
    sendUpdate(SHADOW, shadow == null ? null : "IPY_MODEL_"+shadow.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
