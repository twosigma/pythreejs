package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

public class PerspectiveCamera extends Camera {

  public static final String MODEL_NAME_VALUE = "PerspectiveCameraModel";
  public static final String ASPECT = "aspect";
  public static final String FAR = "far";
  public static final String FOCUS = "focus";
  public static final String FOV = "fov";
  public static final String NEAR = "near";
  public static final String TYPE = "type";
  public static final String ZOOM = "zoom";

  private Double aspect = 1.0;
  private Double far = 2000.0;
  private Double focus = 10.0;
  private Double fov = 50.0;
  private Double near = 0.1;
  private String type = "PerspectiveCamera";
  private Double zoom = 1.0;

  public PerspectiveCamera() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ASPECT, aspect);
    content.put(FAR, far);
    content.put(FOCUS, focus);
    content.put(FOV, fov);
    content.put(NEAR, near);
    content.put(TYPE, type);
    content.put(ZOOM, zoom);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  public Double getAspect() {
    return aspect;
  }
  public void setAspect(Double aspect){
    this.aspect = aspect;
    sendUpdate(ASPECT, aspect);
  }

  public Double getFar() {
    return far;
  }
  public void setFar(Double far){
    this.far = far;
    sendUpdate(FAR, far);
  }

  public Double getFocus() {
    return focus;
  }
  public void setFocus(Double focus){
    this.focus = focus;
    sendUpdate(FOCUS, focus);
  }

  public Double getFov() {
    return fov;
  }
  public void setFov(Double fov){
    this.fov = fov;
    sendUpdate(FOV, fov);
  }

  public Double getNear() {
    return near;
  }
  public void setNear(Double near){
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

  public Double getZoom() {
    return zoom;
  }
  public void setZoom(Double zoom){
    this.zoom = zoom;
    sendUpdate(ZOOM, zoom);
  }

}
