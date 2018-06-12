
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class LatheGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "LatheGeometryModel";
  public static final String PHILENGTH = "phiLength";
  public static final String PHISTART = "phiStart";
  public static final String POINTS = "points";
  public static final String SEGMENTS = "segments";
  public static final String TYPE = "type";

  private double phiLength = 6.283185307179586;
  private double phiStart = 0;
  private List points = Arrays.asList();
  private int segments = 12;
  private String type = "LatheGeometry";

  public LatheGeometry() {
    super();
    openComm();
  }

    public LatheGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.phiLength = (double) parameters.getOrDefault(PHILENGTH, (Serializable) this.phiLength);
      this.phiStart = (double) parameters.getOrDefault(PHISTART, (Serializable) this.phiStart);
      this.points = (List) parameters.getOrDefault(POINTS, (Serializable) this.points);
      this.segments = (int) parameters.getOrDefault(SEGMENTS, (Serializable) this.segments);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(PHILENGTH, (Serializable) phiLength);
    content.put(PHISTART, (Serializable) phiStart);
    content.put(POINTS, (Serializable) points);
    content.put(SEGMENTS, (Serializable) segments);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getPhiLength() {
    return phiLength;
  }
  public void setPhiLength(double phiLength){
    this.phiLength = phiLength;
    sendUpdate(PHILENGTH, phiLength);
  }

  public double getPhiStart() {
    return phiStart;
  }
  public void setPhiStart(double phiStart){
    this.phiStart = phiStart;
    sendUpdate(PHISTART, phiStart);
  }

  public List getPoints() {
    return points;
  }
  public void setPoints(List points){
    this.points = points;
    sendUpdate(POINTS, points);
  }

  public int getSegments() {
    return segments;
  }
  public void setSegments(int segments){
    this.segments = segments;
    sendUpdate(SEGMENTS, segments);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
