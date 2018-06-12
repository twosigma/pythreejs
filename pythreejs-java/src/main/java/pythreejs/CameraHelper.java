
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class CameraHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "CameraHelperModel";
  public static final String CAMERA = "camera";
  public static final String TYPE = "type";

  private Camera camera;
  private String type = "CameraHelper";

  public CameraHelper() {
    super();
    openComm();
  }

    public CameraHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.camera = (Camera) parameters.getOrDefault(CAMERA, (Serializable) this.camera);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CAMERA, camera == null ? null : "IPY_MODEL_" + camera.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Camera getCamera() {
    return camera;
  }
  public void setCamera(Camera camera){
    this.camera = camera;
    sendUpdate(CAMERA, camera == null ? null : "IPY_MODEL_"+camera.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
