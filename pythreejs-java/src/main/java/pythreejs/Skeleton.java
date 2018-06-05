
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Skeleton extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "SkeletonModel";
  public static final String BONES = "bones";

  private List bones = Arrays.asList();

  public Skeleton() {
    super();
    openComm();
  }

    public Skeleton(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.bones = (List) parameters.getOrDefault(BONES, (Serializable) this.bones);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(BONES, (Serializable) bones);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getBones() {
    return bones;
  }
  public void setBones(List bones){
    this.bones = bones;
    sendUpdate(BONES, bones);
  }

}
