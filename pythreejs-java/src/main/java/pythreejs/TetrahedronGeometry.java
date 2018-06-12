
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class TetrahedronGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "TetrahedronGeometryModel";
  public static final String DETAIL = "detail";
  public static final String RADIUS = "radius";
  public static final String TYPE = "type";

  private int detail;
  private double radius = 1;
  private String type = "TetrahedronGeometry";

  public TetrahedronGeometry() {
    super();
    openComm();
  }

    public TetrahedronGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.detail = (int) parameters.getOrDefault(DETAIL, (Serializable) this.detail);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DETAIL, (Serializable) detail);
    content.put(RADIUS, (Serializable) radius);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public int getDetail() {
    return detail;
  }
  public void setDetail(int detail){
    this.detail = detail;
    sendUpdate(DETAIL, detail);
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
