
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class PlaneHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "PlaneHelperModel";
  public static final String COLOR = "color";
  public static final String PLANE = "plane";
  public static final String SIZE = "size";
  public static final String TYPE = "type";

  private String color = "yellow";
  private Plane plane;
  private double size = 1;
  private String type = "PlaneHelper";

  public PlaneHelper() {
    super();
    openComm();
  }

    public PlaneHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.plane = (Plane) parameters.getOrDefault(PLANE, (Serializable) this.plane);
      this.size = (double) parameters.getOrDefault(SIZE, (Serializable) this.size);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(PLANE, plane == null ? null : "IPY_MODEL_" + plane.getComm().getCommId());
    content.put(SIZE, (Serializable) size);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
    sendUpdate(COLOR, color);
  }

  public Plane getPlane() {
    return plane;
  }
  public void setPlane(Plane plane){
    this.plane = plane;
    sendUpdate(PLANE, plane == null ? null : "IPY_MODEL_"+plane.getComm().getCommId());
  }

  public double getSize() {
    return size;
  }
  public void setSize(double size){
    this.size = size;
    sendUpdate(SIZE, size);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
