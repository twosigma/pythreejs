
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class BaseBufferAttribute extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "BufferAttributeModel";
  public static final String ARRAY = "array";
  public static final String DYNAMIC = "dynamic";
  public static final String NEEDSUPDATE = "needsUpdate";
  public static final String NORMALIZED = "normalized";
  public static final String VERSION = "version";

  private Object array;
  private boolean dynamic;
  private boolean needsUpdate;
  private boolean normalized = true;
  private int version = -1;

  public BaseBufferAttribute() {
    super();
    openComm();
  }

    public BaseBufferAttribute(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.array = (Object) parameters.getOrDefault(ARRAY, (Serializable) this.array);
      this.dynamic = (boolean) parameters.getOrDefault(DYNAMIC, (Serializable) this.dynamic);
      this.needsUpdate = (boolean) parameters.getOrDefault(NEEDSUPDATE, (Serializable) this.needsUpdate);
      this.normalized = (boolean) parameters.getOrDefault(NORMALIZED, (Serializable) this.normalized);
      this.version = (int) parameters.getOrDefault(VERSION, (Serializable) this.version);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ARRAY, (Serializable) array);
    content.put(DYNAMIC, (Serializable) dynamic);
    content.put(NEEDSUPDATE, (Serializable) needsUpdate);
    content.put(NORMALIZED, (Serializable) normalized);
    content.put(VERSION, (Serializable) version);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Object getArray() {
    return array;
  }
  public void setArray(Object array){
    this.array = array;
    sendUpdate(ARRAY, array);
  }

  public boolean getDynamic() {
    return dynamic;
  }
  public void setDynamic(boolean dynamic){
    this.dynamic = dynamic;
    sendUpdate(DYNAMIC, dynamic);
  }

  public boolean getNeedsUpdate() {
    return needsUpdate;
  }
  public void setNeedsUpdate(boolean needsUpdate){
    this.needsUpdate = needsUpdate;
    sendUpdate(NEEDSUPDATE, needsUpdate);
  }

  public boolean getNormalized() {
    return normalized;
  }
  public void setNormalized(boolean normalized){
    this.normalized = normalized;
    sendUpdate(NORMALIZED, normalized);
  }

  public int getVersion() {
    return version;
  }
  public void setVersion(int version){
    this.version = version;
    sendUpdate(VERSION, version);
  }

}
