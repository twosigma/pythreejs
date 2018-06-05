
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Sphere extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "SphereModel";
  public static final String CENTER = "center";
  public static final String RADIUS = "radius";

  private List center = Arrays.asList(0, 0, 0);
  private double radius = 0;

  public Sphere() {
    super();
    openComm();
  }

    public Sphere(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.center = (List) parameters.getOrDefault(CENTER, (Serializable) this.center);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CENTER, (Serializable) center);
    content.put(RADIUS, (Serializable) radius);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getCenter() {
    return center;
  }
  public void setCenter(List center){
    this.center = center;
    sendUpdate(CENTER, center);
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

}
