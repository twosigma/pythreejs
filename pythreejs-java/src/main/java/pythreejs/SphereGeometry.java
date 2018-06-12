
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class SphereGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "SphereGeometryModel";
  public static final String HEIGHTSEGMENTS = "heightSegments";
  public static final String PHILENGTH = "phiLength";
  public static final String PHISTART = "phiStart";
  public static final String RADIUS = "radius";
  public static final String THETALENGTH = "thetaLength";
  public static final String THETASTART = "thetaStart";
  public static final String TYPE = "type";
  public static final String WIDTHSEGMENTS = "widthSegments";

  private int heightSegments = 6;
  private double phiLength = 6.283185307179586;
  private double phiStart = 0;
  private double radius = 1;
  private double thetaLength = 3.141592653589793;
  private double thetaStart = 0;
  private String type = "SphereGeometry";
  private int widthSegments = 8;

  public SphereGeometry() {
    super();
    openComm();
  }

    public SphereGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.heightSegments = (int) parameters.getOrDefault(HEIGHTSEGMENTS, (Serializable) this.heightSegments);
      this.phiLength = (double) parameters.getOrDefault(PHILENGTH, (Serializable) this.phiLength);
      this.phiStart = (double) parameters.getOrDefault(PHISTART, (Serializable) this.phiStart);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.thetaLength = (double) parameters.getOrDefault(THETALENGTH, (Serializable) this.thetaLength);
      this.thetaStart = (double) parameters.getOrDefault(THETASTART, (Serializable) this.thetaStart);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.widthSegments = (int) parameters.getOrDefault(WIDTHSEGMENTS, (Serializable) this.widthSegments);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(HEIGHTSEGMENTS, (Serializable) heightSegments);
    content.put(PHILENGTH, (Serializable) phiLength);
    content.put(PHISTART, (Serializable) phiStart);
    content.put(RADIUS, (Serializable) radius);
    content.put(THETALENGTH, (Serializable) thetaLength);
    content.put(THETASTART, (Serializable) thetaStart);
    content.put(TYPE, (Serializable) type);
    content.put(WIDTHSEGMENTS, (Serializable) widthSegments);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public int getHeightSegments() {
    return heightSegments;
  }
  public void setHeightSegments(int heightSegments){
    this.heightSegments = heightSegments;
    sendUpdate(HEIGHTSEGMENTS, heightSegments);
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

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
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

  public int getWidthSegments() {
    return widthSegments;
  }
  public void setWidthSegments(int widthSegments){
    this.widthSegments = widthSegments;
    sendUpdate(WIDTHSEGMENTS, widthSegments);
  }

}
