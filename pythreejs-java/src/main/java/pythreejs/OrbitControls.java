package pythreejs;


import java.io.Serializable;
import java.util.*;

public class OrbitControls extends Controls {

  public static final String MODEL_NAME_VALUE = "OrbitControlsModel";
  public static final String AUTOROTATE = "autoRotate";
  public static final String AUTOROTATESPEED = "autoRotateSpeed";
  public static final String DAMPINGFACTOR = "dampingFactor";
  public static final String ENABLEDAMPING = "enableDamping";
  public static final String ENABLEKEYS = "enableKeys";
  public static final String ENABLEPAN = "enablePan";
  public static final String ENABLEROTATE = "enableRotate";
  public static final String ENABLEZOOM = "enableZoom";
  public static final String ENABLED = "enabled";
  public static final String KEYPANSPEED = "keyPanSpeed";
  public static final String MAXAZIMUTHANGLE = "maxAzimuthAngle";
  public static final String MAXDISTANCE = "maxDistance";
  public static final String MAXPOLARANGLE = "maxPolarAngle";
  public static final String MAXZOOM = "maxZoom";
  public static final String MINAZIMUTHANGLE = "minAzimuthAngle";
  public static final String MINDISTANCE = "minDistance";
  public static final String MINPOLARANGLE = "minPolarAngle";
  public static final String MINZOOM = "minZoom";
  public static final String ROTATESPEED = "rotateSpeed";
  public static final String TARGET = "target";
  public static final String ZOOMSPEED = "zoomSpeed";

  private Boolean autoRotate = false;
  private Double autoRotateSpeed = 2.0;;
  private Double dampingFactor = 0.25;;
  private Boolean enableDamping = false;
  private Boolean enableKeys = true;
  private Boolean enablePan = true;
  private Boolean enableRotate = true;
  private Boolean enableZoom = true;
  private Boolean enabled = true;
  private Double keyPanSpeed = 7.0;;
  private Double maxAzimuthAngle = Double.MAX_VALUE;;
  private Double maxDistance = Double.MAX_VALUE;;
  private Double maxPolarAngle = 3.141592653589793;;
  private Double maxZoom = Double.MAX_VALUE;;
  private Double minAzimuthAngle = Double.MIN_VALUE;;
  private Double minDistance = 0.0;;
  private Double minPolarAngle = 0.0;;
  private Double minZoom = 0.0;;
  private Double rotateSpeed = 1.0;;
  private List target = Arrays.asList(0, 0, 0);
  private Double zoomSpeed = 1.0;;

  public OrbitControls(Object3D object3D) {
    super(object3D);
    openComm();
  }
  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(AUTOROTATE, autoRotate);
    content.put(AUTOROTATESPEED, autoRotateSpeed);
    content.put(DAMPINGFACTOR, dampingFactor);
    content.put(ENABLEDAMPING, enableDamping);
    content.put(ENABLEKEYS, enableKeys);
    content.put(ENABLEPAN, enablePan);
    content.put(ENABLEROTATE, enableRotate);
    content.put(ENABLEZOOM, enableZoom);
    content.put(ENABLED, enabled);
    content.put(KEYPANSPEED, keyPanSpeed);
    content.put(MAXAZIMUTHANGLE, maxAzimuthAngle);
    content.put(MAXDISTANCE, maxDistance);
    content.put(MAXPOLARANGLE, maxPolarAngle);
    content.put(MAXZOOM, maxZoom);
    content.put(MINAZIMUTHANGLE, minAzimuthAngle);
    content.put(MINDISTANCE, minDistance);
    content.put(MINPOLARANGLE, minPolarAngle);
    content.put(MINZOOM, minZoom);
    content.put(ROTATESPEED, rotateSpeed);
    content.put(TARGET, (Serializable) target);
    content.put(ZOOMSPEED, zoomSpeed);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  public Boolean getAutoRotate() {
    return autoRotate;
  }
  public void setAutoRotate(Boolean autoRotate){
    this.autoRotate = autoRotate;
    sendUpdate(AUTOROTATE, autoRotate);
  }

  public Double getAutoRotateSpeed() {
    return autoRotateSpeed;
  }
  public void setAutoRotateSpeed(Double autoRotateSpeed){
    this.autoRotateSpeed = autoRotateSpeed;
    sendUpdate(AUTOROTATESPEED, autoRotateSpeed);
  }

  public Double getDampingFactor() {
    return dampingFactor;
  }
  public void setDampingFactor(Double dampingFactor){
    this.dampingFactor = dampingFactor;
    sendUpdate(DAMPINGFACTOR, dampingFactor);
  }

  public Boolean getEnableDamping() {
    return enableDamping;
  }
  public void setEnableDamping(Boolean enableDamping){
    this.enableDamping = enableDamping;
    sendUpdate(ENABLEDAMPING, enableDamping);
  }

  public Boolean getEnableKeys() {
    return enableKeys;
  }
  public void setEnableKeys(Boolean enableKeys){
    this.enableKeys = enableKeys;
    sendUpdate(ENABLEKEYS, enableKeys);
  }

  public Boolean getEnablePan() {
    return enablePan;
  }
  public void setEnablePan(Boolean enablePan){
    this.enablePan = enablePan;
    sendUpdate(ENABLEPAN, enablePan);
  }

  public Boolean getEnableRotate() {
    return enableRotate;
  }
  public void setEnableRotate(Boolean enableRotate){
    this.enableRotate = enableRotate;
    sendUpdate(ENABLEROTATE, enableRotate);
  }

  public Boolean getEnableZoom() {
    return enableZoom;
  }
  public void setEnableZoom(Boolean enableZoom){
    this.enableZoom = enableZoom;
    sendUpdate(ENABLEZOOM, enableZoom);
  }

  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled){
    this.enabled = enabled;
    sendUpdate(ENABLED, enabled);
  }

  public Double getKeyPanSpeed() {
    return keyPanSpeed;
  }
  public void setKeyPanSpeed(Double keyPanSpeed){
    this.keyPanSpeed = keyPanSpeed;
    sendUpdate(KEYPANSPEED, keyPanSpeed);
  }

  public Double getMaxAzimuthAngle() {
    return maxAzimuthAngle;
  }
  public void setMaxAzimuthAngle(Double maxAzimuthAngle){
    this.maxAzimuthAngle = maxAzimuthAngle;
    sendUpdate(MAXAZIMUTHANGLE, maxAzimuthAngle);
  }

  public Double getMaxDistance() {
    return maxDistance;
  }
  public void setMaxDistance(Double maxDistance){
    this.maxDistance = maxDistance;
    sendUpdate(MAXDISTANCE, maxDistance);
  }

  public Double getMaxPolarAngle() {
    return maxPolarAngle;
  }
  public void setMaxPolarAngle(Double maxPolarAngle){
    this.maxPolarAngle = maxPolarAngle;
    sendUpdate(MAXPOLARANGLE, maxPolarAngle);
  }

  public Double getMaxZoom() {
    return maxZoom;
  }
  public void setMaxZoom(Double maxZoom){
    this.maxZoom = maxZoom;
    sendUpdate(MAXZOOM, maxZoom);
  }

  public Double getMinAzimuthAngle() {
    return minAzimuthAngle;
  }
  public void setMinAzimuthAngle(Double minAzimuthAngle){
    this.minAzimuthAngle = minAzimuthAngle;
    sendUpdate(MINAZIMUTHANGLE, minAzimuthAngle);
  }

  public Double getMinDistance() {
    return minDistance;
  }
  public void setMinDistance(Double minDistance){
    this.minDistance = minDistance;
    sendUpdate(MINDISTANCE, minDistance);
  }

  public Double getMinPolarAngle() {
    return minPolarAngle;
  }
  public void setMinPolarAngle(Double minPolarAngle){
    this.minPolarAngle = minPolarAngle;
    sendUpdate(MINPOLARANGLE, minPolarAngle);
  }

  public Double getMinZoom() {
    return minZoom;
  }
  public void setMinZoom(Double minZoom){
    this.minZoom = minZoom;
    sendUpdate(MINZOOM, minZoom);
  }

  public Double getRotateSpeed() {
    return rotateSpeed;
  }
  public void setRotateSpeed(Double rotateSpeed){
    this.rotateSpeed = rotateSpeed;
    sendUpdate(ROTATESPEED, rotateSpeed);
  }

  public List getTarget() {
    return target;
  }
  public void setTarget(List target){
    this.target = target;
    sendUpdate(TARGET, target);
  }

  public Double getZoomSpeed() {
    return zoomSpeed;
  }
  public void setZoomSpeed(Double zoomSpeed){
    this.zoomSpeed = zoomSpeed;
    sendUpdate(ZOOMSPEED, zoomSpeed);
  }

}
