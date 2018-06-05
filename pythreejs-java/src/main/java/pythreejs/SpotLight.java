
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class SpotLight extends Light {

  public static final String MODEL_NAME_VALUE = "SpotLightModel";
  public static final String ANGLE = "angle";
  public static final String DECAY = "decay";
  public static final String DISTANCE = "distance";
  public static final String PENUMBRA = "penumbra";
  public static final String SHADOW = "shadow";
  public static final String TARGET = "target";
  public static final String TYPE = "type";

  private double angle = 1.0471975511965976;
  private double decay = 1;
  private double distance = 0;
  private double penumbra = 0;
  private Widget shadow;
  private Widget target;
  private String type = "SpotLight";

  public SpotLight() {
    super();
    openComm();
  }

    public SpotLight(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.angle = (double) parameters.getOrDefault(ANGLE, (Serializable) this.angle);
      this.decay = (double) parameters.getOrDefault(DECAY, (Serializable) this.decay);
      this.distance = (double) parameters.getOrDefault(DISTANCE, (Serializable) this.distance);
      this.penumbra = (double) parameters.getOrDefault(PENUMBRA, (Serializable) this.penumbra);
      this.shadow = (Widget) parameters.getOrDefault(SHADOW, (Serializable) this.shadow);
      this.target = (Widget) parameters.getOrDefault(TARGET, (Serializable) this.target);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ANGLE, (Serializable) angle);
    content.put(DECAY, (Serializable) decay);
    content.put(DISTANCE, (Serializable) distance);
    content.put(PENUMBRA, (Serializable) penumbra);
    content.put(SHADOW, shadow == null ? null : "IPY_MODEL_" + shadow.getComm().getCommId());
    content.put(TARGET, target == null ? null : "IPY_MODEL_" + target.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getAngle() {
    return angle;
  }
  public void setAngle(double angle){
    this.angle = angle;
    sendUpdate(ANGLE, angle);
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

  public double getPenumbra() {
    return penumbra;
  }
  public void setPenumbra(double penumbra){
    this.penumbra = penumbra;
    sendUpdate(PENUMBRA, penumbra);
  }

  public Widget getShadow() {
    return shadow;
  }
  public void setShadow(Widget shadow){
    this.shadow = shadow;
    sendUpdate(SHADOW, shadow == null ? null : "IPY_MODEL_"+shadow.getComm().getCommId());
  }

  public Widget getTarget() {
    return target;
  }
  public void setTarget(Widget target){
    this.target = target;
    sendUpdate(TARGET, target == null ? null : "IPY_MODEL_"+target.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
