
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Plane extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "PlaneModel";
  public static final String CONSTANT = "constant";
  public static final String NORMAL = "normal";

  private double constant = 0;
  private List normal = Arrays.asList(0, 0, 0);

  public Plane() {
    super();
    openComm();
  }

    public Plane(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.constant = (double) parameters.getOrDefault(CONSTANT, (Serializable) this.constant);
      this.normal = (List) parameters.getOrDefault(NORMAL, (Serializable) this.normal);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CONSTANT, (Serializable) constant);
    content.put(NORMAL, (Serializable) normal);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getConstant() {
    return constant;
  }
  public void setConstant(double constant){
    this.constant = constant;
    sendUpdate(CONSTANT, constant);
  }

  public List getNormal() {
    return normal;
  }
  public void setNormal(List normal){
    this.normal = normal;
    sendUpdate(NORMAL, normal);
  }

}
