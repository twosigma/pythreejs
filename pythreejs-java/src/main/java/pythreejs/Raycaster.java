
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Raycaster extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "RaycasterModel";
  public static final String DIRECTION = "direction";
  public static final String FAR = "far";
  public static final String LINEPRECISION = "linePrecision";
  public static final String NEAR = "near";
  public static final String ORIGIN = "origin";
  public static final String RAY = "ray";

  private List direction = Arrays.asList(0, 0, 0);
  private double far = 1000000;
  private double linePrecision = 1;
  private double near = 0;
  private List origin = Arrays.asList(0, 0, 0);
  private Ray ray;

  public Raycaster() {
    super();
    openComm();
  }

    public Raycaster(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.direction = (List) parameters.getOrDefault(DIRECTION, (Serializable) this.direction);
      this.far = (double) parameters.getOrDefault(FAR, (Serializable) this.far);
      this.linePrecision = (double) parameters.getOrDefault(LINEPRECISION, (Serializable) this.linePrecision);
      this.near = (double) parameters.getOrDefault(NEAR, (Serializable) this.near);
      this.origin = (List) parameters.getOrDefault(ORIGIN, (Serializable) this.origin);
      this.ray = (Ray) parameters.getOrDefault(RAY, (Serializable) this.ray);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DIRECTION, (Serializable) direction);
    content.put(FAR, (Serializable) far);
    content.put(LINEPRECISION, (Serializable) linePrecision);
    content.put(NEAR, (Serializable) near);
    content.put(ORIGIN, (Serializable) origin);
    content.put(RAY, ray == null ? null : "IPY_MODEL_" + ray.getComm().getCommId());
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getDirection() {
    return direction;
  }
  public void setDirection(List direction){
    this.direction = direction;
    sendUpdate(DIRECTION, direction);
  }

  public double getFar() {
    return far;
  }
  public void setFar(double far){
    this.far = far;
    sendUpdate(FAR, far);
  }

  public double getLinePrecision() {
    return linePrecision;
  }
  public void setLinePrecision(double linePrecision){
    this.linePrecision = linePrecision;
    sendUpdate(LINEPRECISION, linePrecision);
  }

  public double getNear() {
    return near;
  }
  public void setNear(double near){
    this.near = near;
    sendUpdate(NEAR, near);
  }

  public List getOrigin() {
    return origin;
  }
  public void setOrigin(List origin){
    this.origin = origin;
    sendUpdate(ORIGIN, origin);
  }

  public Ray getRay() {
    return ray;
  }
  public void setRay(Ray ray){
    this.ray = ray;
    sendUpdate(RAY, ray == null ? null : "IPY_MODEL_"+ray.getComm().getCommId());
  }

}
