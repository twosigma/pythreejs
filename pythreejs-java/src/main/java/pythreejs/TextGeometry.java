
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class TextGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "TextGeometryModel";
  public static final String TYPE = "type";

  private String type = "TextGeometry";

  public TextGeometry() {
    super();
    openComm();
  }

    public TextGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
