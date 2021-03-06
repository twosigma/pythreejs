
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class AxesHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "AxesHelperModel";
  public static final String SIZE = "size";
  public static final String TYPE = "type";

  private double size = 1;
  private String type = "AxesHelper";

  public AxesHelper() {
    super();
    openComm();
  }

    public AxesHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.size = (double) parameters.getOrDefault(SIZE, (Serializable) this.size);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(SIZE, (Serializable) size);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
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
