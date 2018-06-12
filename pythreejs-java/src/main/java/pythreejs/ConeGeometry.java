
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ConeGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "ConeGeometryModel";
  public static final String HEIGHT = "height";
  public static final String HEIGHTSEGMENTS = "heightSegments";
  public static final String OPENENDED = "openEnded";
  public static final String RADIALSEGMENTS = "radialSegments";
  public static final String RADIUS = "radius";
  public static final String THETALENGTH = "thetaLength";
  public static final String THETASTART = "thetaStart";
  public static final String TYPE = "type";

  private double height = 100;
  private int heightSegments = 1;
  private boolean openEnded;
  private int radialSegments = 8;
  private double radius = 20;
  private double thetaLength = 6.283185307179586;
  private double thetaStart = 0;
  private String type = "ConeGeometry";

  public ConeGeometry() {
    super();
    openComm();
  }

    public ConeGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.height = (double) parameters.getOrDefault(HEIGHT, (Serializable) this.height);
      this.heightSegments = (int) parameters.getOrDefault(HEIGHTSEGMENTS, (Serializable) this.heightSegments);
      this.openEnded = (boolean) parameters.getOrDefault(OPENENDED, (Serializable) this.openEnded);
      this.radialSegments = (int) parameters.getOrDefault(RADIALSEGMENTS, (Serializable) this.radialSegments);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.thetaLength = (double) parameters.getOrDefault(THETALENGTH, (Serializable) this.thetaLength);
      this.thetaStart = (double) parameters.getOrDefault(THETASTART, (Serializable) this.thetaStart);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(HEIGHT, (Serializable) height);
    content.put(HEIGHTSEGMENTS, (Serializable) heightSegments);
    content.put(OPENENDED, (Serializable) openEnded);
    content.put(RADIALSEGMENTS, (Serializable) radialSegments);
    content.put(RADIUS, (Serializable) radius);
    content.put(THETALENGTH, (Serializable) thetaLength);
    content.put(THETASTART, (Serializable) thetaStart);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getHeight() {
    return height;
  }
  public void setHeight(double height){
    this.height = height;
    sendUpdate(HEIGHT, height);
  }

  public int getHeightSegments() {
    return heightSegments;
  }
  public void setHeightSegments(int heightSegments){
    this.heightSegments = heightSegments;
    sendUpdate(HEIGHTSEGMENTS, heightSegments);
  }

  public boolean getOpenEnded() {
    return openEnded;
  }
  public void setOpenEnded(boolean openEnded){
    this.openEnded = openEnded;
    sendUpdate(OPENENDED, openEnded);
  }

  public int getRadialSegments() {
    return radialSegments;
  }
  public void setRadialSegments(int radialSegments){
    this.radialSegments = radialSegments;
    sendUpdate(RADIALSEGMENTS, radialSegments);
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

}
