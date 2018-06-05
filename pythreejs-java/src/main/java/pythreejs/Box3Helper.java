
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Box3Helper extends Object3D {

  public static final String MODEL_NAME_VALUE = "Box3HelperModel";
  public static final String BOX = "box";
  public static final String COLOR = "color";
  public static final String TYPE = "type";

  private Box3 box;
  private String color = "yellow";
  private String type = "Box3Helper";

  public Box3Helper() {
    super();
    openComm();
  }

    public Box3Helper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.box = (Box3) parameters.getOrDefault(BOX, (Serializable) this.box);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(BOX, box == null ? null : "IPY_MODEL_" + box.getComm().getCommId());
    content.put(COLOR, (Serializable) color);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Box3 getBox() {
    return box;
  }
  public void setBox(Box3 box){
    this.box = box;
    sendUpdate(BOX, box == null ? null : "IPY_MODEL_"+box.getComm().getCommId());
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
    sendUpdate(COLOR, color);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
