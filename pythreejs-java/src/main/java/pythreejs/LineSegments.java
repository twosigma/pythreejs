
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class LineSegments extends Line {

  public static final String MODEL_NAME_VALUE = "LineSegmentsModel";
  public static final String TYPE = "type";

  private String type = "LineSegments";

  public LineSegments() {
    super();
    openComm();
  }

    public LineSegments(LinkedHashMap<String, Serializable> parameters) {
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
