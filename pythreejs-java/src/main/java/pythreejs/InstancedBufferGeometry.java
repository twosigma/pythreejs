
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class InstancedBufferGeometry extends BufferGeometry {

  public static final String MODEL_NAME_VALUE = "InstancedBufferGeometryModel";
  public static final String MAXINSTANCEDCOUNT = "maxInstancedCount";
  public static final String TYPE = "type";

  private int maxInstancedCount;
  private String type = "InstancedBufferGeometry";

  public InstancedBufferGeometry() {
    super();
    openComm();
  }

    public InstancedBufferGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.maxInstancedCount = (int) parameters.getOrDefault(MAXINSTANCEDCOUNT, (Serializable) this.maxInstancedCount);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(MAXINSTANCEDCOUNT, (Serializable) maxInstancedCount);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public int getMaxInstancedCount() {
    return maxInstancedCount;
  }
  public void setMaxInstancedCount(int maxInstancedCount){
    this.maxInstancedCount = maxInstancedCount;
    sendUpdate(MAXINSTANCEDCOUNT, maxInstancedCount);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
