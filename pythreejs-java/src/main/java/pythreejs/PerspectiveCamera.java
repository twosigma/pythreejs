
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class PerspectiveCamera extends Camera {

  public static final String MODEL_NAME_VALUE = "PerspectiveCameraModel";
  public static final String ASPECT = "aspect";
  public static final String FAR = "far";
  public static final String FOCUS = "focus";
  public static final String FOV = "fov";
  public static final String NEAR = "near";
  public static final String TYPE = "type";
  public static final String ZOOM = "zoom";

  private double aspect = 1;
  private double far = 2000;
  private double focus = 10;
  private double fov = 50;
  private double near = 0.1;
  private String type = "PerspectiveCamera";
  private double zoom = 1;

  public PerspectiveCamera() {
    super();
    openComm();
  }

    public PerspectiveCamera(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.aspect = (double) parameters.getOrDefault(ASPECT, (Serializable) this.aspect);
      this.far = (double) parameters.getOrDefault(FAR, (Serializable) this.far);
      this.focus = (double) parameters.getOrDefault(FOCUS, (Serializable) this.focus);
      this.fov = (double) parameters.getOrDefault(FOV, (Serializable) this.fov);
      this.near = (double) parameters.getOrDefault(NEAR, (Serializable) this.near);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.zoom = (double) parameters.getOrDefault(ZOOM, (Serializable) this.zoom);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ASPECT, (Serializable) aspect);
    content.put(FAR, (Serializable) far);
    content.put(FOCUS, (Serializable) focus);
    content.put(FOV, (Serializable) fov);
    content.put(NEAR, (Serializable) near);
    content.put(TYPE, (Serializable) type);
    content.put(ZOOM, (Serializable) zoom);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getAspect() {
    return aspect;
  }
  public void setAspect(double aspect){
    this.aspect = aspect;
    sendUpdate(ASPECT, aspect);
  }

  public double getFar() {
    return far;
  }
  public void setFar(double far){
    this.far = far;
    sendUpdate(FAR, far);
  }

  public double getFocus() {
    return focus;
  }
  public void setFocus(double focus){
    this.focus = focus;
    sendUpdate(FOCUS, focus);
  }

  public double getFov() {
    return fov;
  }
  public void setFov(double fov){
    this.fov = fov;
    sendUpdate(FOV, fov);
  }

  public double getNear() {
    return near;
  }
  public void setNear(double near){
    this.near = near;
    sendUpdate(NEAR, near);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public double getZoom() {
    return zoom;
  }
  public void setZoom(double zoom){
    this.zoom = zoom;
    sendUpdate(ZOOM, zoom);
  }

}
