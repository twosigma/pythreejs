
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class RingGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "RingGeometryModel";
  public static final String INNERRADIUS = "innerRadius";
  public static final String OUTERRADIUS = "outerRadius";
  public static final String PHISEGMENTS = "phiSegments";
  public static final String THETALENGTH = "thetaLength";
  public static final String THETASEGMENTS = "thetaSegments";
  public static final String THETASTART = "thetaStart";
  public static final String TYPE = "type";

  private double innerRadius = 0.5;
  private double outerRadius = 1;
  private int phiSegments = 8;
  private double thetaLength = 6.283185307179586;
  private int thetaSegments = 8;
  private double thetaStart = 0;
  private String type = "RingGeometry";

  public RingGeometry() {
    super();
    openComm();
  }

    public RingGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.innerRadius = (double) parameters.getOrDefault(INNERRADIUS, (Serializable) this.innerRadius);
      this.outerRadius = (double) parameters.getOrDefault(OUTERRADIUS, (Serializable) this.outerRadius);
      this.phiSegments = (int) parameters.getOrDefault(PHISEGMENTS, (Serializable) this.phiSegments);
      this.thetaLength = (double) parameters.getOrDefault(THETALENGTH, (Serializable) this.thetaLength);
      this.thetaSegments = (int) parameters.getOrDefault(THETASEGMENTS, (Serializable) this.thetaSegments);
      this.thetaStart = (double) parameters.getOrDefault(THETASTART, (Serializable) this.thetaStart);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(INNERRADIUS, (Serializable) innerRadius);
    content.put(OUTERRADIUS, (Serializable) outerRadius);
    content.put(PHISEGMENTS, (Serializable) phiSegments);
    content.put(THETALENGTH, (Serializable) thetaLength);
    content.put(THETASEGMENTS, (Serializable) thetaSegments);
    content.put(THETASTART, (Serializable) thetaStart);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getInnerRadius() {
    return innerRadius;
  }
  public void setInnerRadius(double innerRadius){
    this.innerRadius = innerRadius;
    sendUpdate(INNERRADIUS, innerRadius);
  }

  public double getOuterRadius() {
    return outerRadius;
  }
  public void setOuterRadius(double outerRadius){
    this.outerRadius = outerRadius;
    sendUpdate(OUTERRADIUS, outerRadius);
  }

  public int getPhiSegments() {
    return phiSegments;
  }
  public void setPhiSegments(int phiSegments){
    this.phiSegments = phiSegments;
    sendUpdate(PHISEGMENTS, phiSegments);
  }

  public double getThetaLength() {
    return thetaLength;
  }
  public void setThetaLength(double thetaLength){
    this.thetaLength = thetaLength;
    sendUpdate(THETALENGTH, thetaLength);
  }

  public int getThetaSegments() {
    return thetaSegments;
  }
  public void setThetaSegments(int thetaSegments){
    this.thetaSegments = thetaSegments;
    sendUpdate(THETASEGMENTS, thetaSegments);
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
