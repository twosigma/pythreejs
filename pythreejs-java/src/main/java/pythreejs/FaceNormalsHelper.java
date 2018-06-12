
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class FaceNormalsHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "FaceNormalsHelperModel";
  public static final String COLOR = "color";
  public static final String LINEWIDTH = "linewidth";
  public static final String OBJECT = "object";
  public static final String SIZE = "size";
  public static final String TYPE = "type";

  private String color = "0xffff00";
  private double linewidth = 1;
  private Object3D object;
  private double size = 1;
  private String type = "FaceNormalsHelper";

  public FaceNormalsHelper() {
    super();
    openComm();
  }

    public FaceNormalsHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.linewidth = (double) parameters.getOrDefault(LINEWIDTH, (Serializable) this.linewidth);
      this.object = (Object3D) parameters.getOrDefault(OBJECT, (Serializable) this.object);
      this.size = (double) parameters.getOrDefault(SIZE, (Serializable) this.size);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(LINEWIDTH, (Serializable) linewidth);
    content.put(OBJECT, object == null ? null : "IPY_MODEL_" + object.getComm().getCommId());
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

  public double getLinewidth() {
    return linewidth;
  }
  public void setLinewidth(double linewidth){
    this.linewidth = linewidth;
    sendUpdate(LINEWIDTH, linewidth);
  }

  public Object3D getObject() {
    return object;
  }
  public void setObject(Object3D object){
    this.object = object;
    sendUpdate(OBJECT, object == null ? null : "IPY_MODEL_"+object.getComm().getCommId());
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
