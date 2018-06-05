
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class SkeletonHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "SkeletonHelperModel";
  public static final String ROOT = "root";
  public static final String TYPE = "type";

  private Object3D root;
  private String type = "SkeletonHelper";

  public SkeletonHelper() {
    super();
    openComm();
  }

    public SkeletonHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.root = (Object3D) parameters.getOrDefault(ROOT, (Serializable) this.root);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ROOT, root == null ? null : "IPY_MODEL_" + root.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Object3D getRoot() {
    return root;
  }
  public void setRoot(Object3D root){
    this.root = root;
    sendUpdate(ROOT, root == null ? null : "IPY_MODEL_"+root.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
