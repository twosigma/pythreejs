
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class TubeGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "TubeGeometryModel";
  public static final String CLOSE = "close";
  public static final String PATH = "path";
  public static final String RADIUS = "radius";
  public static final String RADIUSSEGMENTS = "radiusSegments";
  public static final String SEGMENTS = "segments";
  public static final String TYPE = "type";

  private boolean close;
  private Curve path;
  private double radius = 1;
  private int radiusSegments = 8;
  private int segments = 64;
  private String type = "TubeGeometry";

  public TubeGeometry() {
    super();
    openComm();
  }

    public TubeGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.close = (boolean) parameters.getOrDefault(CLOSE, (Serializable) this.close);
      this.path = (Curve) parameters.getOrDefault(PATH, (Serializable) this.path);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.radiusSegments = (int) parameters.getOrDefault(RADIUSSEGMENTS, (Serializable) this.radiusSegments);
      this.segments = (int) parameters.getOrDefault(SEGMENTS, (Serializable) this.segments);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CLOSE, (Serializable) close);
    content.put(PATH, path == null ? null : "IPY_MODEL_" + path.getComm().getCommId());
    content.put(RADIUS, (Serializable) radius);
    content.put(RADIUSSEGMENTS, (Serializable) radiusSegments);
    content.put(SEGMENTS, (Serializable) segments);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getClose() {
    return close;
  }
  public void setClose(boolean close){
    this.close = close;
    sendUpdate(CLOSE, close);
  }

  public Curve getPath() {
    return path;
  }
  public void setPath(Curve path){
    this.path = path;
    sendUpdate(PATH, path == null ? null : "IPY_MODEL_"+path.getComm().getCommId());
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

  public int getRadiusSegments() {
    return radiusSegments;
  }
  public void setRadiusSegments(int radiusSegments){
    this.radiusSegments = radiusSegments;
    sendUpdate(RADIUSSEGMENTS, radiusSegments);
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
