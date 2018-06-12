
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class BoxHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "BoxHelperModel";
  public static final String COLOR = "color";
  public static final String OBJECT = "object";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private Object3D object;
  private String type = "BoxHelper";

  public BoxHelper() {
    super();
    openComm();
  }

    public BoxHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.object = (Object3D) parameters.getOrDefault(OBJECT, (Serializable) this.object);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(OBJECT, object == null ? null : "IPY_MODEL_" + object.getComm().getCommId());
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

  public Object3D getObject() {
    return object;
  }
  public void setObject(Object3D object){
    this.object = object;
    sendUpdate(OBJECT, object == null ? null : "IPY_MODEL_"+object.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
