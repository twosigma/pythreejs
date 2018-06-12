
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Cylindrical extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "CylindricalModel";
  public static final String RADIUS = "radius";
  public static final String THETA = "theta";
  public static final String Y = "y";

  private double radius = 1;
  private double theta = 0;
  private double y = 0;

  public Cylindrical() {
    super();
    openComm();
  }

    public Cylindrical(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.theta = (double) parameters.getOrDefault(THETA, (Serializable) this.theta);
      this.y = (double) parameters.getOrDefault(Y, (Serializable) this.y);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(RADIUS, (Serializable) radius);
    content.put(THETA, (Serializable) theta);
    content.put(Y, (Serializable) y);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

  public double getTheta() {
    return theta;
  }
  public void setTheta(double theta){
    this.theta = theta;
    sendUpdate(THETA, theta);
  }

  public double getY() {
    return y;
  }
  public void setY(double y){
    this.y = y;
    sendUpdate(Y, y);
  }

}
