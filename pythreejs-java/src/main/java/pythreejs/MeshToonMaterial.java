
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class MeshToonMaterial extends MeshPhongMaterial {

  public static final String MODEL_NAME_VALUE = "MeshToonMaterialModel";
  public static final String GRADIENTMAP = "gradientMap";
  public static final String TYPE = "type";

  private Texture gradientMap;
  private String type = "MeshToonMaterial";

  public MeshToonMaterial() {
    super();
    openComm();
  }

    public MeshToonMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.gradientMap = (Texture) parameters.getOrDefault(GRADIENTMAP, (Serializable) this.gradientMap);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(GRADIENTMAP, gradientMap == null ? null : "IPY_MODEL_" + gradientMap.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Texture getGradientMap() {
    return gradientMap;
  }
  public void setGradientMap(Texture gradientMap){
    this.gradientMap = gradientMap;
    sendUpdate(GRADIENTMAP, gradientMap == null ? null : "IPY_MODEL_"+gradientMap.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
