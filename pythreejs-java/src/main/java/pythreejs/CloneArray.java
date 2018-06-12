
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class CloneArray extends Object3D {

  public static final String MODEL_NAME_VALUE = "CloneArrayModel";
  public static final String MERGE = "merge";
  public static final String ORIGINAL = "original";
  public static final String POSITIONS = "positions";
  public static final String TYPE = "type";

  private boolean merge;
  private Object3D original;
  private List positions = Arrays.asList();
  private String type = "CloneArray";

  public CloneArray() {
    super();
    openComm();
  }

    public CloneArray(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.merge = (boolean) parameters.getOrDefault(MERGE, (Serializable) this.merge);
      this.original = (Object3D) parameters.getOrDefault(ORIGINAL, (Serializable) this.original);
      this.positions = (List) parameters.getOrDefault(POSITIONS, (Serializable) this.positions);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(MERGE, (Serializable) merge);
    content.put(ORIGINAL, original == null ? null : "IPY_MODEL_" + original.getComm().getCommId());
    content.put(POSITIONS, (Serializable) positions);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getMerge() {
    return merge;
  }
  public void setMerge(boolean merge){
    this.merge = merge;
    sendUpdate(MERGE, merge);
  }

  public Object3D getOriginal() {
    return original;
  }
  public void setOriginal(Object3D original){
    this.original = original;
    sendUpdate(ORIGINAL, original == null ? null : "IPY_MODEL_"+original.getComm().getCommId());
  }

  public List getPositions() {
    return positions;
  }
  public void setPositions(List positions){
    this.positions = positions;
    sendUpdate(POSITIONS, positions);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
