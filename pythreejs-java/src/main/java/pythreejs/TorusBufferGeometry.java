
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class TorusBufferGeometry extends BaseBufferGeometry {

  public static final String MODEL_NAME_VALUE = "TorusBufferGeometryModel";
  public static final String ARC = "arc";
  public static final String RADIALSEGMENTS = "radialSegments";
  public static final String RADIUS = "radius";
  public static final String TUBE = "tube";
  public static final String TUBULARSEGMENTS = "tubularSegments";
  public static final String TYPE = "type";

  private double arc = 6.283185307179586;
  private int radialSegments = 8;
  private double radius = 1;
  private double tube = 0.4;
  private int tubularSegments = 6;
  private String type = "TorusBufferGeometry";

  public TorusBufferGeometry() {
    super();
    openComm();
  }

    public TorusBufferGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.arc = (double) parameters.getOrDefault(ARC, (Serializable) this.arc);
      this.radialSegments = (int) parameters.getOrDefault(RADIALSEGMENTS, (Serializable) this.radialSegments);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.tube = (double) parameters.getOrDefault(TUBE, (Serializable) this.tube);
      this.tubularSegments = (int) parameters.getOrDefault(TUBULARSEGMENTS, (Serializable) this.tubularSegments);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ARC, (Serializable) arc);
    content.put(RADIALSEGMENTS, (Serializable) radialSegments);
    content.put(RADIUS, (Serializable) radius);
    content.put(TUBE, (Serializable) tube);
    content.put(TUBULARSEGMENTS, (Serializable) tubularSegments);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getArc() {
    return arc;
  }
  public void setArc(double arc){
    this.arc = arc;
    sendUpdate(ARC, arc);
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

  public double getTube() {
    return tube;
  }
  public void setTube(double tube){
    this.tube = tube;
    sendUpdate(TUBE, tube);
  }

  public int getTubularSegments() {
    return tubularSegments;
  }
  public void setTubularSegments(int tubularSegments){
    this.tubularSegments = tubularSegments;
    sendUpdate(TUBULARSEGMENTS, tubularSegments);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
