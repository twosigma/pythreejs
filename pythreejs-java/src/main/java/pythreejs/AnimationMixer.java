
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class AnimationMixer extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "AnimationMixerModel";
  public static final String ROOTOBJECT = "rootObject";
  public static final String TIME = "time";
  public static final String TIMESCALE = "timeScale";

  private ThreeWidget rootObject;
  private double time = 0;
  private double timeScale = 1;

  public AnimationMixer() {
    super();
    openComm();
  }

    public AnimationMixer(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.rootObject = (ThreeWidget) parameters.getOrDefault(ROOTOBJECT, (Serializable) this.rootObject);
      this.time = (double) parameters.getOrDefault(TIME, (Serializable) this.time);
      this.timeScale = (double) parameters.getOrDefault(TIMESCALE, (Serializable) this.timeScale);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ROOTOBJECT, rootObject == null ? null : "IPY_MODEL_" + rootObject.getComm().getCommId());
    content.put(TIME, (Serializable) time);
    content.put(TIMESCALE, (Serializable) timeScale);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public ThreeWidget getRootObject() {
    return rootObject;
  }
  public void setRootObject(ThreeWidget rootObject){
    this.rootObject = rootObject;
    sendUpdate(ROOTOBJECT, rootObject == null ? null : "IPY_MODEL_"+rootObject.getComm().getCommId());
  }

  public double getTime() {
    return time;
  }
  public void setTime(double time){
    this.time = time;
    sendUpdate(TIME, time);
  }

  public double getTimeScale() {
    return timeScale;
  }
  public void setTimeScale(double timeScale){
    this.timeScale = timeScale;
    sendUpdate(TIMESCALE, timeScale);
  }

}
