
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class TrackballControls extends Controls {

  public static final String MODEL_NAME_VALUE = "TrackballControlsModel";
  public static final String DYNAMICDAMPINGFACTOR = "dynamicDampingFactor";
  public static final String ENABLED = "enabled";
  public static final String MAXDISTANCE = "maxDistance";
  public static final String MINDISTANCE = "minDistance";
  public static final String NOPAN = "noPan";
  public static final String NOROLL = "noRoll";
  public static final String NOROTATE = "noRotate";
  public static final String NOZOOM = "noZoom";
  public static final String PANSPEED = "panSpeed";
  public static final String ROTATESPEED = "rotateSpeed";
  public static final String STATICMOVING = "staticMoving";
  public static final String TARGET = "target";
  public static final String ZOOMSPEED = "zoomSpeed";

  private double dynamicDampingFactor = 0.2;
  private boolean enabled = true;
  private double maxDistance = Double.MAX_VALUE;
  private double minDistance = 0;
  private boolean noPan;
  private boolean noRoll;
  private boolean noRotate;
  private boolean noZoom;
  private double panSpeed = 0.3;
  private double rotateSpeed = 1;
  private boolean staticMoving;
  private List target = Arrays.asList(0, 0, 0);
  private double zoomSpeed = 1.2;

  public TrackballControls() {
    super();
    openComm();
  }

    public TrackballControls(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.dynamicDampingFactor = (double) parameters.getOrDefault(DYNAMICDAMPINGFACTOR, (Serializable) this.dynamicDampingFactor);
      this.enabled = (boolean) parameters.getOrDefault(ENABLED, (Serializable) this.enabled);
      this.maxDistance = (double) parameters.getOrDefault(MAXDISTANCE, (Serializable) this.maxDistance);
      this.minDistance = (double) parameters.getOrDefault(MINDISTANCE, (Serializable) this.minDistance);
      this.noPan = (boolean) parameters.getOrDefault(NOPAN, (Serializable) this.noPan);
      this.noRoll = (boolean) parameters.getOrDefault(NOROLL, (Serializable) this.noRoll);
      this.noRotate = (boolean) parameters.getOrDefault(NOROTATE, (Serializable) this.noRotate);
      this.noZoom = (boolean) parameters.getOrDefault(NOZOOM, (Serializable) this.noZoom);
      this.panSpeed = (double) parameters.getOrDefault(PANSPEED, (Serializable) this.panSpeed);
      this.rotateSpeed = (double) parameters.getOrDefault(ROTATESPEED, (Serializable) this.rotateSpeed);
      this.staticMoving = (boolean) parameters.getOrDefault(STATICMOVING, (Serializable) this.staticMoving);
      this.target = (List) parameters.getOrDefault(TARGET, (Serializable) this.target);
      this.zoomSpeed = (double) parameters.getOrDefault(ZOOMSPEED, (Serializable) this.zoomSpeed);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DYNAMICDAMPINGFACTOR, (Serializable) dynamicDampingFactor);
    content.put(ENABLED, (Serializable) enabled);
    content.put(MAXDISTANCE, (Serializable) maxDistance);
    content.put(MINDISTANCE, (Serializable) minDistance);
    content.put(NOPAN, (Serializable) noPan);
    content.put(NOROLL, (Serializable) noRoll);
    content.put(NOROTATE, (Serializable) noRotate);
    content.put(NOZOOM, (Serializable) noZoom);
    content.put(PANSPEED, (Serializable) panSpeed);
    content.put(ROTATESPEED, (Serializable) rotateSpeed);
    content.put(STATICMOVING, (Serializable) staticMoving);
    content.put(TARGET, (Serializable) target);
    content.put(ZOOMSPEED, (Serializable) zoomSpeed);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getDynamicDampingFactor() {
    return dynamicDampingFactor;
  }
  public void setDynamicDampingFactor(double dynamicDampingFactor){
    this.dynamicDampingFactor = dynamicDampingFactor;
    sendUpdate(DYNAMICDAMPINGFACTOR, dynamicDampingFactor);
  }

  public boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(boolean enabled){
    this.enabled = enabled;
    sendUpdate(ENABLED, enabled);
  }

  public double getMaxDistance() {
    return maxDistance;
  }
  public void setMaxDistance(double maxDistance){
    this.maxDistance = maxDistance;
    sendUpdate(MAXDISTANCE, maxDistance);
  }

  public double getMinDistance() {
    return minDistance;
  }
  public void setMinDistance(double minDistance){
    this.minDistance = minDistance;
    sendUpdate(MINDISTANCE, minDistance);
  }

  public boolean getNoPan() {
    return noPan;
  }
  public void setNoPan(boolean noPan){
    this.noPan = noPan;
    sendUpdate(NOPAN, noPan);
  }

  public boolean getNoRoll() {
    return noRoll;
  }
  public void setNoRoll(boolean noRoll){
    this.noRoll = noRoll;
    sendUpdate(NOROLL, noRoll);
  }

  public boolean getNoRotate() {
    return noRotate;
  }
  public void setNoRotate(boolean noRotate){
    this.noRotate = noRotate;
    sendUpdate(NOROTATE, noRotate);
  }

  public boolean getNoZoom() {
    return noZoom;
  }
  public void setNoZoom(boolean noZoom){
    this.noZoom = noZoom;
    sendUpdate(NOZOOM, noZoom);
  }

  public double getPanSpeed() {
    return panSpeed;
  }
  public void setPanSpeed(double panSpeed){
    this.panSpeed = panSpeed;
    sendUpdate(PANSPEED, panSpeed);
  }

  public double getRotateSpeed() {
    return rotateSpeed;
  }
  public void setRotateSpeed(double rotateSpeed){
    this.rotateSpeed = rotateSpeed;
    sendUpdate(ROTATESPEED, rotateSpeed);
  }

  public boolean getStaticMoving() {
    return staticMoving;
  }
  public void setStaticMoving(boolean staticMoving){
    this.staticMoving = staticMoving;
    sendUpdate(STATICMOVING, staticMoving);
  }

  public List getTarget() {
    return target;
  }
  public void setTarget(List target){
    this.target = target;
    sendUpdate(TARGET, target);
  }

  public double getZoomSpeed() {
    return zoomSpeed;
  }
  public void setZoomSpeed(double zoomSpeed){
    this.zoomSpeed = zoomSpeed;
    sendUpdate(ZOOMSPEED, zoomSpeed);
  }

}
