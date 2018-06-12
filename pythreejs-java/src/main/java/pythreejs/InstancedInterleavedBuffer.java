
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class InstancedInterleavedBuffer extends InterleavedBuffer {

  public static final String MODEL_NAME_VALUE = "InstancedInterleavedBufferModel";
  public static final String MESHPERATTRIBUTE = "meshPerAttribute";

  private int meshPerAttribute = 1;

  public InstancedInterleavedBuffer() {
    super();
    openComm();
  }

    public InstancedInterleavedBuffer(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.meshPerAttribute = (int) parameters.getOrDefault(MESHPERATTRIBUTE, (Serializable) this.meshPerAttribute);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(MESHPERATTRIBUTE, (Serializable) meshPerAttribute);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public int getMeshPerAttribute() {
    return meshPerAttribute;
  }
  public void setMeshPerAttribute(int meshPerAttribute){
    this.meshPerAttribute = meshPerAttribute;
    sendUpdate(MESHPERATTRIBUTE, meshPerAttribute);
  }

}
