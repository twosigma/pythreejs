
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class CombinedCamera extends Camera {

  public static final String MODEL_NAME_VALUE = "CombinedCameraModel";
  public static final String FAR = "far";
  public static final String FOV = "fov";
  public static final String HEIGHT = "height";
  public static final String IMPERSONATE = "impersonate";
  public static final String MODE = "mode";
  public static final String NEAR = "near";
  public static final String ORTHOFAR = "orthoFar";
  public static final String ORTHONEAR = "orthoNear";
  public static final String TYPE = "type";
  public static final String WIDTH = "width";
  public static final String ZOOM = "zoom";

  private double far = 2000;
  private double fov = 50;
  private double height = 0;
  private boolean impersonate = true;
  private Object mode = "perspective";
  private double near = 0.1;
  private double orthoFar = 2000;
  private double orthoNear = 0.1;
  private String type = "CombinedCamera";
  private double width = 0;
  private double zoom = 1;

  public CombinedCamera() {
    super();
    openComm();
  }

    public CombinedCamera(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.far = (double) parameters.getOrDefault(FAR, (Serializable) this.far);
      this.fov = (double) parameters.getOrDefault(FOV, (Serializable) this.fov);
      this.height = (double) parameters.getOrDefault(HEIGHT, (Serializable) this.height);
      this.impersonate = (boolean) parameters.getOrDefault(IMPERSONATE, (Serializable) this.impersonate);
      this.mode = (Object) parameters.getOrDefault(MODE, (Serializable) this.mode);
      this.near = (double) parameters.getOrDefault(NEAR, (Serializable) this.near);
      this.orthoFar = (double) parameters.getOrDefault(ORTHOFAR, (Serializable) this.orthoFar);
      this.orthoNear = (double) parameters.getOrDefault(ORTHONEAR, (Serializable) this.orthoNear);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.width = (double) parameters.getOrDefault(WIDTH, (Serializable) this.width);
      this.zoom = (double) parameters.getOrDefault(ZOOM, (Serializable) this.zoom);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(FAR, (Serializable) far);
    content.put(FOV, (Serializable) fov);
    content.put(HEIGHT, (Serializable) height);
    content.put(IMPERSONATE, (Serializable) impersonate);
    content.put(MODE, (Serializable) mode);
    content.put(NEAR, (Serializable) near);
    content.put(ORTHOFAR, (Serializable) orthoFar);
    content.put(ORTHONEAR, (Serializable) orthoNear);
    content.put(TYPE, (Serializable) type);
    content.put(WIDTH, (Serializable) width);
    content.put(ZOOM, (Serializable) zoom);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getFar() {
    return far;
  }
  public void setFar(double far){
    this.far = far;
    sendUpdate(FAR, far);
  }

  public double getFov() {
    return fov;
  }
  public void setFov(double fov){
    this.fov = fov;
    sendUpdate(FOV, fov);
  }

  public double getHeight() {
    return height;
  }
  public void setHeight(double height){
    this.height = height;
    sendUpdate(HEIGHT, height);
  }

  public boolean getImpersonate() {
    return impersonate;
  }
  public void setImpersonate(boolean impersonate){
    this.impersonate = impersonate;
    sendUpdate(IMPERSONATE, impersonate);
  }

  public Object getMode() {
    return mode;
  }
  public void setMode(Object mode){
    this.mode = mode;
    sendUpdate(MODE, mode);
  }

  public double getNear() {
    return near;
  }
  public void setNear(double near){
    this.near = near;
    sendUpdate(NEAR, near);
  }

  public double getOrthoFar() {
    return orthoFar;
  }
  public void setOrthoFar(double orthoFar){
    this.orthoFar = orthoFar;
    sendUpdate(ORTHOFAR, orthoFar);
  }

  public double getOrthoNear() {
    return orthoNear;
  }
  public void setOrthoNear(double orthoNear){
    this.orthoNear = orthoNear;
    sendUpdate(ORTHONEAR, orthoNear);
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

  public double getZoom() {
    return zoom;
  }
  public void setZoom(double zoom){
    this.zoom = zoom;
    sendUpdate(ZOOM, zoom);
  }

}
