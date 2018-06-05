
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class CylinderGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "CylinderGeometryModel";
  public static final String HEIGHT = "height";
  public static final String HEIGHTSEGMENTS = "heightSegments";
  public static final String OPENENDED = "openEnded";
  public static final String RADIUSBOTTOM = "radiusBottom";
  public static final String RADIUSSEGMENTS = "radiusSegments";
  public static final String RADIUSTOP = "radiusTop";
  public static final String THETALENGTH = "thetaLength";
  public static final String THETASTART = "thetaStart";
  public static final String TYPE = "type";

  private double height = 1;
  private int heightSegments = 1;
  private boolean openEnded;
  private double radiusBottom = 1;
  private int radiusSegments = 8;
  private double radiusTop = 1;
  private double thetaLength = 6.283185307179586;
  private double thetaStart = 0;
  private String type = "CylinderGeometry";

  public CylinderGeometry() {
    super();
    openComm();
  }

    public CylinderGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.height = (double) parameters.getOrDefault(HEIGHT, (Serializable) this.height);
      this.heightSegments = (int) parameters.getOrDefault(HEIGHTSEGMENTS, (Serializable) this.heightSegments);
      this.openEnded = (boolean) parameters.getOrDefault(OPENENDED, (Serializable) this.openEnded);
      this.radiusBottom = (double) parameters.getOrDefault(RADIUSBOTTOM, (Serializable) this.radiusBottom);
      this.radiusSegments = (int) parameters.getOrDefault(RADIUSSEGMENTS, (Serializable) this.radiusSegments);
      this.radiusTop = (double) parameters.getOrDefault(RADIUSTOP, (Serializable) this.radiusTop);
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
    content.put(RADIUSBOTTOM, (Serializable) radiusBottom);
    content.put(RADIUSSEGMENTS, (Serializable) radiusSegments);
    content.put(RADIUSTOP, (Serializable) radiusTop);
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

  public double getRadiusBottom() {
    return radiusBottom;
  }
  public void setRadiusBottom(double radiusBottom){
    this.radiusBottom = radiusBottom;
    sendUpdate(RADIUSBOTTOM, radiusBottom);
  }

  public int getRadiusSegments() {
    return radiusSegments;
  }
  public void setRadiusSegments(int radiusSegments){
    this.radiusSegments = radiusSegments;
    sendUpdate(RADIUSSEGMENTS, radiusSegments);
  }

  public double getRadiusTop() {
    return radiusTop;
  }
  public void setRadiusTop(double radiusTop){
    this.radiusTop = radiusTop;
    sendUpdate(RADIUSTOP, radiusTop);
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
