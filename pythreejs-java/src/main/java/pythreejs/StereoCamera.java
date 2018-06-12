
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class StereoCamera extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "StereoCameraModel";
  public static final String ASPECT = "aspect";
  public static final String CAMERAL = "cameraL";
  public static final String CAMERAR = "cameraR";
  public static final String EYESEP = "eyeSep";

  private double aspect = 1;
  private PerspectiveCamera cameraL;
  private PerspectiveCamera cameraR;
  private double eyeSep = 0.064;

  public StereoCamera() {
    super();
    openComm();
  }

    public StereoCamera(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.aspect = (double) parameters.getOrDefault(ASPECT, (Serializable) this.aspect);
      this.cameraL = (PerspectiveCamera) parameters.getOrDefault(CAMERAL, (Serializable) this.cameraL);
      this.cameraR = (PerspectiveCamera) parameters.getOrDefault(CAMERAR, (Serializable) this.cameraR);
      this.eyeSep = (double) parameters.getOrDefault(EYESEP, (Serializable) this.eyeSep);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ASPECT, (Serializable) aspect);
    content.put(CAMERAL, cameraL == null ? null : "IPY_MODEL_" + cameraL.getComm().getCommId());
    content.put(CAMERAR, cameraR == null ? null : "IPY_MODEL_" + cameraR.getComm().getCommId());
    content.put(EYESEP, (Serializable) eyeSep);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getAspect() {
    return aspect;
  }
  public void setAspect(double aspect){
    this.aspect = aspect;
    sendUpdate(ASPECT, aspect);
  }

  public PerspectiveCamera getCameraL() {
    return cameraL;
  }
  public void setCameraL(PerspectiveCamera cameraL){
    this.cameraL = cameraL;
    sendUpdate(CAMERAL, cameraL == null ? null : "IPY_MODEL_"+cameraL.getComm().getCommId());
  }

  public PerspectiveCamera getCameraR() {
    return cameraR;
  }
  public void setCameraR(PerspectiveCamera cameraR){
    this.cameraR = cameraR;
    sendUpdate(CAMERAR, cameraR == null ? null : "IPY_MODEL_"+cameraR.getComm().getCommId());
  }

  public double getEyeSep() {
    return eyeSep;
  }
  public void setEyeSep(double eyeSep){
    this.eyeSep = eyeSep;
    sendUpdate(EYESEP, eyeSep);
  }

}
