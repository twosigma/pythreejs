
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Controls extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "ControlsModel";
  public static final String CONTROLLING = "controlling";

  private Object3D controlling;

  public Controls() {
    super();
  }

    public Controls(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.controlling = (Object3D) parameters.getOrDefault(CONTROLLING, (Serializable) this.controlling);
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CONTROLLING, controlling == null ? null : "IPY_MODEL_" + controlling.getComm().getCommId());
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Object3D getControlling() {
    return controlling;
  }
  public void setControlling(Object3D controlling){
    this.controlling = controlling;
    sendUpdate(CONTROLLING, controlling == null ? null : "IPY_MODEL_"+controlling.getComm().getCommId());
  }

}
