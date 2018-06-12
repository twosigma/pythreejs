
package pythreejs;

import com.twosigma.beakerx.widget.*;
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

  private boolean autoRotate;
  private double autoRotateSpeed = 2;
  private double dampingFactor = 0.25;
  private boolean enableDamping;
  private boolean enableKeys = true;
  private boolean enablePan = true;
  private boolean enableRotate = true;
  private boolean enableZoom = true;
  private boolean enabled = true;
  private double keyPanSpeed = 7;
  private double maxAzimuthAngle = Double.MAX_VALUE;
  private double maxDistance = Double.MAX_VALUE;
  private double maxPolarAngle = 3.141592653589793;
  private double maxZoom = Double.MAX_VALUE;
  private double minAzimuthAngle = Double.MIN_VALUE;
  private double minDistance = 0;
  private double minPolarAngle = 0;
  private double minZoom = 0;
  private double rotateSpeed = 1;
  private List target = Arrays.asList(0, 0, 0);
  private double zoomSpeed = 1;

  public OrbitControls() {
    super();
    openComm();
  }

    public OrbitControls(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.autoRotate = (boolean) parameters.getOrDefault(AUTOROTATE, (Serializable) this.autoRotate);
      this.autoRotateSpeed = (double) parameters.getOrDefault(AUTOROTATESPEED, (Serializable) this.autoRotateSpeed);
      this.dampingFactor = (double) parameters.getOrDefault(DAMPINGFACTOR, (Serializable) this.dampingFactor);
      this.enableDamping = (boolean) parameters.getOrDefault(ENABLEDAMPING, (Serializable) this.enableDamping);
      this.enableKeys = (boolean) parameters.getOrDefault(ENABLEKEYS, (Serializable) this.enableKeys);
      this.enablePan = (boolean) parameters.getOrDefault(ENABLEPAN, (Serializable) this.enablePan);
      this.enableRotate = (boolean) parameters.getOrDefault(ENABLEROTATE, (Serializable) this.enableRotate);
      this.enableZoom = (boolean) parameters.getOrDefault(ENABLEZOOM, (Serializable) this.enableZoom);
      this.enabled = (boolean) parameters.getOrDefault(ENABLED, (Serializable) this.enabled);
      this.keyPanSpeed = (double) parameters.getOrDefault(KEYPANSPEED, (Serializable) this.keyPanSpeed);
      this.maxAzimuthAngle = (double) parameters.getOrDefault(MAXAZIMUTHANGLE, (Serializable) this.maxAzimuthAngle);
      this.maxDistance = (double) parameters.getOrDefault(MAXDISTANCE, (Serializable) this.maxDistance);
      this.maxPolarAngle = (double) parameters.getOrDefault(MAXPOLARANGLE, (Serializable) this.maxPolarAngle);
      this.maxZoom = (double) parameters.getOrDefault(MAXZOOM, (Serializable) this.maxZoom);
      this.minAzimuthAngle = (double) parameters.getOrDefault(MINAZIMUTHANGLE, (Serializable) this.minAzimuthAngle);
      this.minDistance = (double) parameters.getOrDefault(MINDISTANCE, (Serializable) this.minDistance);
      this.minPolarAngle = (double) parameters.getOrDefault(MINPOLARANGLE, (Serializable) this.minPolarAngle);
      this.minZoom = (double) parameters.getOrDefault(MINZOOM, (Serializable) this.minZoom);
      this.rotateSpeed = (double) parameters.getOrDefault(ROTATESPEED, (Serializable) this.rotateSpeed);
      this.target = (List) parameters.getOrDefault(TARGET, (Serializable) this.target);
      this.zoomSpeed = (double) parameters.getOrDefault(ZOOMSPEED, (Serializable) this.zoomSpeed);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(AUTOROTATE, (Serializable) autoRotate);
    content.put(AUTOROTATESPEED, (Serializable) autoRotateSpeed);
    content.put(DAMPINGFACTOR, (Serializable) dampingFactor);
    content.put(ENABLEDAMPING, (Serializable) enableDamping);
    content.put(ENABLEKEYS, (Serializable) enableKeys);
    content.put(ENABLEPAN, (Serializable) enablePan);
    content.put(ENABLEROTATE, (Serializable) enableRotate);
    content.put(ENABLEZOOM, (Serializable) enableZoom);
    content.put(ENABLED, (Serializable) enabled);
    content.put(KEYPANSPEED, (Serializable) keyPanSpeed);
    content.put(MAXAZIMUTHANGLE, (Serializable) maxAzimuthAngle);
    content.put(MAXDISTANCE, (Serializable) maxDistance);
    content.put(MAXPOLARANGLE, (Serializable) maxPolarAngle);
    content.put(MAXZOOM, (Serializable) maxZoom);
    content.put(MINAZIMUTHANGLE, (Serializable) minAzimuthAngle);
    content.put(MINDISTANCE, (Serializable) minDistance);
    content.put(MINPOLARANGLE, (Serializable) minPolarAngle);
    content.put(MINZOOM, (Serializable) minZoom);
    content.put(ROTATESPEED, (Serializable) rotateSpeed);
    content.put(TARGET, (Serializable) target);
    content.put(ZOOMSPEED, (Serializable) zoomSpeed);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getAutoRotate() {
    return autoRotate;
  }
  public void setAutoRotate(boolean autoRotate){
    this.autoRotate = autoRotate;
    sendUpdate(AUTOROTATE, autoRotate);
  }

  public double getAutoRotateSpeed() {
    return autoRotateSpeed;
  }
  public void setAutoRotateSpeed(double autoRotateSpeed){
    this.autoRotateSpeed = autoRotateSpeed;
    sendUpdate(AUTOROTATESPEED, autoRotateSpeed);
  }

  public double getDampingFactor() {
    return dampingFactor;
  }
  public void setDampingFactor(double dampingFactor){
    this.dampingFactor = dampingFactor;
    sendUpdate(DAMPINGFACTOR, dampingFactor);
  }

  public boolean getEnableDamping() {
    return enableDamping;
  }
  public void setEnableDamping(boolean enableDamping){
    this.enableDamping = enableDamping;
    sendUpdate(ENABLEDAMPING, enableDamping);
  }

  public boolean getEnableKeys() {
    return enableKeys;
  }
  public void setEnableKeys(boolean enableKeys){
    this.enableKeys = enableKeys;
    sendUpdate(ENABLEKEYS, enableKeys);
  }

  public boolean getEnablePan() {
    return enablePan;
  }
  public void setEnablePan(boolean enablePan){
    this.enablePan = enablePan;
    sendUpdate(ENABLEPAN, enablePan);
  }

  public boolean getEnableRotate() {
    return enableRotate;
  }
  public void setEnableRotate(boolean enableRotate){
    this.enableRotate = enableRotate;
    sendUpdate(ENABLEROTATE, enableRotate);
  }

  public boolean getEnableZoom() {
    return enableZoom;
  }
  public void setEnableZoom(boolean enableZoom){
    this.enableZoom = enableZoom;
    sendUpdate(ENABLEZOOM, enableZoom);
  }

  public boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(boolean enabled){
    this.enabled = enabled;
    sendUpdate(ENABLED, enabled);
  }

  public double getKeyPanSpeed() {
    return keyPanSpeed;
  }
  public void setKeyPanSpeed(double keyPanSpeed){
    this.keyPanSpeed = keyPanSpeed;
    sendUpdate(KEYPANSPEED, keyPanSpeed);
  }

  public double getMaxAzimuthAngle() {
    return maxAzimuthAngle;
  }
  public void setMaxAzimuthAngle(double maxAzimuthAngle){
    this.maxAzimuthAngle = maxAzimuthAngle;
    sendUpdate(MAXAZIMUTHANGLE, maxAzimuthAngle);
  }

  public double getMaxDistance() {
    return maxDistance;
  }
  public void setMaxDistance(double maxDistance){
    this.maxDistance = maxDistance;
    sendUpdate(MAXDISTANCE, maxDistance);
  }

  public double getMaxPolarAngle() {
    return maxPolarAngle;
  }
  public void setMaxPolarAngle(double maxPolarAngle){
    this.maxPolarAngle = maxPolarAngle;
    sendUpdate(MAXPOLARANGLE, maxPolarAngle);
  }

  public double getMaxZoom() {
    return maxZoom;
  }
  public void setMaxZoom(double maxZoom){
    this.maxZoom = maxZoom;
    sendUpdate(MAXZOOM, maxZoom);
  }

  public double getMinAzimuthAngle() {
    return minAzimuthAngle;
  }
  public void setMinAzimuthAngle(double minAzimuthAngle){
    this.minAzimuthAngle = minAzimuthAngle;
    sendUpdate(MINAZIMUTHANGLE, minAzimuthAngle);
  }

  public double getMinDistance() {
    return minDistance;
  }
  public void setMinDistance(double minDistance){
    this.minDistance = minDistance;
    sendUpdate(MINDISTANCE, minDistance);
  }

  public double getMinPolarAngle() {
    return minPolarAngle;
  }
  public void setMinPolarAngle(double minPolarAngle){
    this.minPolarAngle = minPolarAngle;
    sendUpdate(MINPOLARANGLE, minPolarAngle);
  }

  public double getMinZoom() {
    return minZoom;
  }
  public void setMinZoom(double minZoom){
    this.minZoom = minZoom;
    sendUpdate(MINZOOM, minZoom);
  }

  public double getRotateSpeed() {
    return rotateSpeed;
  }
  public void setRotateSpeed(double rotateSpeed){
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

  public double getZoomSpeed() {
    return zoomSpeed;
  }
  public void setZoomSpeed(double zoomSpeed){
    this.zoomSpeed = zoomSpeed;
    sendUpdate(ZOOMSPEED, zoomSpeed);
  }

}
