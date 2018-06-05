
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class SkinnedMesh extends Mesh {

  public static final String MODEL_NAME_VALUE = "SkinnedMeshModel";
  public static final String BINDMATRIX = "bindMatrix";
  public static final String BINDMODE = "bindMode";
  public static final String SKELETON = "skeleton";
  public static final String TYPE = "type";

  private List bindMatrix = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private String bindMode = "attached";
  private Skeleton skeleton;
  private String type = "SkinnedMesh";

  public SkinnedMesh() {
    super();
    openComm();
  }

    public SkinnedMesh(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.bindMatrix = (List) parameters.getOrDefault(BINDMATRIX, (Serializable) this.bindMatrix);
      this.bindMode = (String) parameters.getOrDefault(BINDMODE, (Serializable) this.bindMode);
      this.skeleton = (Skeleton) parameters.getOrDefault(SKELETON, (Serializable) this.skeleton);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(BINDMATRIX, (Serializable) bindMatrix);
    content.put(BINDMODE, (Serializable) bindMode);
    content.put(SKELETON, skeleton == null ? null : "IPY_MODEL_" + skeleton.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getBindMatrix() {
    return bindMatrix;
  }
  public void setBindMatrix(List bindMatrix){
    this.bindMatrix = bindMatrix;
    sendUpdate(BINDMATRIX, bindMatrix);
  }

  public String getBindMode() {
    return bindMode;
  }
  public void setBindMode(String bindMode){
    this.bindMode = bindMode;
    sendUpdate(BINDMODE, bindMode);
  }

  public Skeleton getSkeleton() {
    return skeleton;
  }
  public void setSkeleton(Skeleton skeleton){
    this.skeleton = skeleton;
    sendUpdate(SKELETON, skeleton == null ? null : "IPY_MODEL_"+skeleton.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
