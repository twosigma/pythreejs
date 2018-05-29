package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

public abstract class Controls extends ThreeWidget {



  public static final String MODEL_NAME_VALUE = "ControlsModel";
  public static final String CONTROLLING = "controlling";
  private static final String IPY_MODEL = "IPY_MODEL_";

  private Object3D controlling = null;

  public Controls(Object3D controlling) {
    super();
    this.controlling = controlling;
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CONTROLLING, IPY_MODEL + this.controlling.getComm().getCommId());
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
    sendUpdate(CONTROLLING, IPY_MODEL + this.controlling.getComm().getCommId());
  }

}
