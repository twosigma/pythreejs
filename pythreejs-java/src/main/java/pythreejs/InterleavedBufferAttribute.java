
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class InterleavedBufferAttribute extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "InterleavedBufferAttributeModel";
  public static final String DATA = "data";
  public static final String ITEMSIZE = "itemSize";
  public static final String NORMALIZED = "normalized";
  public static final String OFFSET = "offset";

  private InterleavedBuffer data;
  private int itemSize;
  private boolean normalized = true;
  private int offset;

  public InterleavedBufferAttribute() {
    super();
    openComm();
  }

    public InterleavedBufferAttribute(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.data = (InterleavedBuffer) parameters.getOrDefault(DATA, (Serializable) this.data);
      this.itemSize = (int) parameters.getOrDefault(ITEMSIZE, (Serializable) this.itemSize);
      this.normalized = (boolean) parameters.getOrDefault(NORMALIZED, (Serializable) this.normalized);
      this.offset = (int) parameters.getOrDefault(OFFSET, (Serializable) this.offset);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DATA, data == null ? null : "IPY_MODEL_" + data.getComm().getCommId());
    content.put(ITEMSIZE, (Serializable) itemSize);
    content.put(NORMALIZED, (Serializable) normalized);
    content.put(OFFSET, (Serializable) offset);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public InterleavedBuffer getData() {
    return data;
  }
  public void setData(InterleavedBuffer data){
    this.data = data;
    sendUpdate(DATA, data == null ? null : "IPY_MODEL_"+data.getComm().getCommId());
  }

  public int getItemSize() {
    return itemSize;
  }
  public void setItemSize(int itemSize){
    this.itemSize = itemSize;
    sendUpdate(ITEMSIZE, itemSize);
  }

  public boolean getNormalized() {
    return normalized;
  }
  public void setNormalized(boolean normalized){
    this.normalized = normalized;
    sendUpdate(NORMALIZED, normalized);
  }

  public int getOffset() {
    return offset;
  }
  public void setOffset(int offset){
    this.offset = offset;
    sendUpdate(OFFSET, offset);
  }

}
