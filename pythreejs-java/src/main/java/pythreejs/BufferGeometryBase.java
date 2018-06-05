
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class BufferGeometryBase extends BaseBufferGeometry {

  public static final String MAXINDEX = "MaxIndex";
  public static final String MODEL_NAME_VALUE = "BufferGeometryModel";
  public static final String _REF_GEOMETRY = "_ref_geometry";
  public static final String _STORE_REF = "_store_ref";
  public static final String ATTRIBUTES = "attributes";
  public static final String INDEX = "index";
  public static final String MORPHATTRIBUTES = "morphAttributes";
  public static final String TYPE = "type";

  private int maxIndex = 65535;
  private Widget refGeometry;
  private boolean storeRef;
  private Map<String, Serializable> attributes = new HashMap<String, Serializable>();
  private Widget index;
  private Map<String, Serializable> morphAttributes = new HashMap<String, Serializable>();
  private String type = "BufferGeometry";

  public BufferGeometryBase() {
    super();
  }

    public BufferGeometryBase(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.maxIndex = (int) parameters.getOrDefault(MAXINDEX, (Serializable) this.maxIndex);
      this.refGeometry = (Widget) parameters.getOrDefault(_REF_GEOMETRY, (Serializable) this.refGeometry);
      this.storeRef = (boolean) parameters.getOrDefault(_STORE_REF, (Serializable) this.storeRef);
      this.attributes = (Map<String, Serializable>) parameters.getOrDefault(ATTRIBUTES, (Serializable) this.attributes);
      this.index = (Widget) parameters.getOrDefault(INDEX, (Serializable) this.index);
      this.morphAttributes = (Map<String, Serializable>) parameters.getOrDefault(MORPHATTRIBUTES, (Serializable) this.morphAttributes);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(MAXINDEX, (Serializable) maxIndex);
    content.put(_REF_GEOMETRY, refGeometry == null ? null : "IPY_MODEL_" + refGeometry.getComm().getCommId());
    content.put(_STORE_REF, (Serializable) storeRef);
    content.put(ATTRIBUTES, (Serializable) attributes);
    content.put(INDEX, index == null ? null : "IPY_MODEL_" + index.getComm().getCommId());
    content.put(MORPHATTRIBUTES, (Serializable) morphAttributes);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public int getMaxIndex() {
    return maxIndex;
  }
  public void setMaxIndex(int maxIndex){
    this.maxIndex = maxIndex;
    sendUpdate(MAXINDEX, maxIndex);
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Widget getRefGeometry() {
    return refGeometry;
  }
  public void setRefGeometry(Widget refGeometry){
    this.refGeometry = refGeometry;
    sendUpdate(_REF_GEOMETRY, refGeometry == null ? null : "IPY_MODEL_"+refGeometry.getComm().getCommId());
  }

  public boolean getStoreRef() {
    return storeRef;
  }
  public void setStoreRef(boolean storeRef){
    this.storeRef = storeRef;
    sendUpdate(_STORE_REF, storeRef);
  }

  public Map<String, Serializable> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, Serializable> attributes){
    this.attributes = attributes;
    sendUpdate(ATTRIBUTES, attributes);
  }

  public Widget getIndex() {
    return index;
  }
  public void setIndex(Widget index){
    this.index = index;
    sendUpdate(INDEX, index == null ? null : "IPY_MODEL_"+index.getComm().getCommId());
  }

  public Map<String, Serializable> getMorphAttributes() {
    return morphAttributes;
  }
  public void setMorphAttributes(Map<String, Serializable> morphAttributes){
    this.morphAttributes = morphAttributes;
    sendUpdate(MORPHATTRIBUTES, morphAttributes);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
