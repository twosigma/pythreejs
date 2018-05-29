package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

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

  private Integer heightSegments = 6;
  private Double phiLength = 6.283185307179586;
  private Double phiStart = 0.0;
  private Double radius = 1.0;
  private Double thetaLength = 3.141592653589793;
  private Double thetaStart = 0.0;
  private String type = "SphereGeometry";
  private Integer widthSegments = 8;

  public SphereGeometry() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(HEIGHTSEGMENTS, heightSegments);
    content.put(PHILENGTH, phiLength);
    content.put(PHISTART, phiStart);
    content.put(RADIUS, radius);
    content.put(THETALENGTH, thetaLength);
    content.put(THETASTART, thetaStart);
    content.put(TYPE, type);
    content.put(WIDTHSEGMENTS, widthSegments);
    return content;
  }

  @Override
  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  public Integer getHeightSegments() {
    return heightSegments;
  }
  public void setHeightSegments(Integer heightSegments){
    this.heightSegments = heightSegments;
    sendUpdate(HEIGHTSEGMENTS, heightSegments);
  }

  public Double getPhiLength() {
    return phiLength;
  }
  public void setPhiLength(Double phiLength){
    this.phiLength = phiLength;
    sendUpdate(PHILENGTH, phiLength);
  }

  public Double getPhiStart() {
    return phiStart;
  }
  public void setPhiStart(Double phiStart){
    this.phiStart = phiStart;
    sendUpdate(PHISTART, phiStart);
  }

  public Double getRadius() {
    return radius;
  }
  public void setRadius(Double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

  public Double getThetaLength() {
    return thetaLength;
  }
  public void setThetaLength(Double thetaLength){
    this.thetaLength = thetaLength;
    sendUpdate(THETALENGTH, thetaLength);
  }

  public Double getThetaStart() {
    return thetaStart;
  }
  public void setThetaStart(Double thetaStart){
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

  public Integer getWidthSegments() {
    return widthSegments;
  }
  public void setWidthSegments(Integer widthSegments){
    this.widthSegments = widthSegments;
    sendUpdate(WIDTHSEGMENTS, widthSegments);
  }

}
