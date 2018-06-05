
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class OrthographicCamera extends Camera {

  public static final String MODEL_NAME_VALUE = "OrthographicCameraModel";
  public static final String BOTTOM = "bottom";
  public static final String FAR = "far";
  public static final String LEFT = "left";
  public static final String NEAR = "near";
  public static final String RIGHT = "right";
  public static final String TOP = "top";
  public static final String TYPE = "type";
  public static final String ZOOM = "zoom";

  private double bottom = 0;
  private double far = 2000;
  private double left = 0;
  private double near = 0.1;
  private double right = 0;
  private double top = 0;
  private String type = "OrthographicCamera";
  private double zoom = 1;

  public OrthographicCamera() {
    super();
    openComm();
  }

    public OrthographicCamera(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.bottom = (double) parameters.getOrDefault(BOTTOM, (Serializable) this.bottom);
      this.far = (double) parameters.getOrDefault(FAR, (Serializable) this.far);
      this.left = (double) parameters.getOrDefault(LEFT, (Serializable) this.left);
      this.near = (double) parameters.getOrDefault(NEAR, (Serializable) this.near);
      this.right = (double) parameters.getOrDefault(RIGHT, (Serializable) this.right);
      this.top = (double) parameters.getOrDefault(TOP, (Serializable) this.top);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.zoom = (double) parameters.getOrDefault(ZOOM, (Serializable) this.zoom);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(BOTTOM, (Serializable) bottom);
    content.put(FAR, (Serializable) far);
    content.put(LEFT, (Serializable) left);
    content.put(NEAR, (Serializable) near);
    content.put(RIGHT, (Serializable) right);
    content.put(TOP, (Serializable) top);
    content.put(TYPE, (Serializable) type);
    content.put(ZOOM, (Serializable) zoom);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getBottom() {
    return bottom;
  }
  public void setBottom(double bottom){
    this.bottom = bottom;
    sendUpdate(BOTTOM, bottom);
  }

  public double getFar() {
    return far;
  }
  public void setFar(double far){
    this.far = far;
    sendUpdate(FAR, far);
  }

  public double getLeft() {
    return left;
  }
  public void setLeft(double left){
    this.left = left;
    sendUpdate(LEFT, left);
  }

  public double getNear() {
    return near;
  }
  public void setNear(double near){
    this.near = near;
    sendUpdate(NEAR, near);
  }

  public double getRight() {
    return right;
  }
  public void setRight(double right){
    this.right = right;
    sendUpdate(RIGHT, right);
  }

  public double getTop() {
    return top;
  }
  public void setTop(double top){
    this.top = top;
    sendUpdate(TOP, top);
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
