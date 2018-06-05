
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Ray extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "RayModel";
  public static final String DIRECTION = "direction";
  public static final String ORIGIN = "origin";

  private List direction = Arrays.asList(0, 0, 0);
  private List origin = Arrays.asList(0, 0, 0);

  public Ray() {
    super();
    openComm();
  }

    public Ray(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.direction = (List) parameters.getOrDefault(DIRECTION, (Serializable) this.direction);
      this.origin = (List) parameters.getOrDefault(ORIGIN, (Serializable) this.origin);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DIRECTION, (Serializable) direction);
    content.put(ORIGIN, (Serializable) origin);
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

  public List getOrigin() {
    return origin;
  }
  public void setOrigin(List origin){
    this.origin = origin;
    sendUpdate(ORIGIN, origin);
  }

}
