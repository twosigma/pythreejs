
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class CircleGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "CircleGeometryModel";
  public static final String RADIUS = "radius";
  public static final String SEGMENTS = "segments";
  public static final String THETALENGTH = "thetaLength";
  public static final String THETASTART = "thetaStart";
  public static final String TYPE = "type";

  private double radius = 1;
  private int segments = 8;
  private double thetaLength = 6.283185307179586;
  private double thetaStart = 0;
  private String type = "CircleGeometry";

  public CircleGeometry() {
    super();
    openComm();
  }

    public CircleGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.segments = (int) parameters.getOrDefault(SEGMENTS, (Serializable) this.segments);
      this.thetaLength = (double) parameters.getOrDefault(THETALENGTH, (Serializable) this.thetaLength);
      this.thetaStart = (double) parameters.getOrDefault(THETASTART, (Serializable) this.thetaStart);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(RADIUS, (Serializable) radius);
    content.put(SEGMENTS, (Serializable) segments);
    content.put(THETALENGTH, (Serializable) thetaLength);
    content.put(THETASTART, (Serializable) thetaStart);
    content.put(TYPE, (Serializable) type);
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

  public int getSegments() {
    return segments;
  }
  public void setSegments(int segments){
    this.segments = segments;
    sendUpdate(SEGMENTS, segments);
  }

  public double getThetaLength() {
    return thetaLength;
  }
  public void setThetaLength(double thetaLength){
    this.thetaLength = thetaLength;
    sendUpdate(THETALENGTH, thetaLength);
  }

  public double getThetaStart() {
    return thetaStart;
  }
  public void setThetaStart(double thetaStart){
    this.thetaStart = thetaStart;
    sendUpdate(THETASTART, thetaStart);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
