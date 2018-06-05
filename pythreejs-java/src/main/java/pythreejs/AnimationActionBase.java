
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class AnimationActionBase extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "AnimationActionModel";
  public static final String CLAMPWHENFINISHED = "clampWhenFinished";
  public static final String CLIP = "clip";
  public static final String ENABLED = "enabled";
  public static final String LOCALROOT = "localRoot";
  public static final String LOOP = "loop";
  public static final String MIXER = "mixer";
  public static final String PAUSED = "paused";
  public static final String REPITITIONS = "repititions";
  public static final String TIME = "time";
  public static final String TIMESCALE = "timeScale";
  public static final String WEIGTH = "weigth";
  public static final String ZEROSLOPEATEND = "zeroSlopeAtEnd";
  public static final String ZEROSLOPEATSTART = "zeroSlopeAtStart";

  private boolean clampWhenFinished;
  private AnimationClip clip;
  private boolean enabled = true;
  private ThreeWidget localRoot;
  private Object loop = "LoopRepeat";
  private AnimationMixer mixer;
  private boolean paused;
  private int repititions = Integer.MAX_VALUE;
  private double time = 0;
  private double timeScale = 1;
  private double weigth = 1;
  private boolean zeroSlopeAtEnd = true;
  private boolean zeroSlopeAtStart = true;

  public AnimationActionBase() {
    super();
    openComm();
  }

    public AnimationActionBase(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.clampWhenFinished = (boolean) parameters.getOrDefault(CLAMPWHENFINISHED, (Serializable) this.clampWhenFinished);
      this.clip = (AnimationClip) parameters.getOrDefault(CLIP, (Serializable) this.clip);
      this.enabled = (boolean) parameters.getOrDefault(ENABLED, (Serializable) this.enabled);
      this.localRoot = (ThreeWidget) parameters.getOrDefault(LOCALROOT, (Serializable) this.localRoot);
      this.loop = (Object) parameters.getOrDefault(LOOP, (Serializable) this.loop);
      this.mixer = (AnimationMixer) parameters.getOrDefault(MIXER, (Serializable) this.mixer);
      this.paused = (boolean) parameters.getOrDefault(PAUSED, (Serializable) this.paused);
      this.repititions = (int) parameters.getOrDefault(REPITITIONS, (Serializable) this.repititions);
      this.time = (double) parameters.getOrDefault(TIME, (Serializable) this.time);
      this.timeScale = (double) parameters.getOrDefault(TIMESCALE, (Serializable) this.timeScale);
      this.weigth = (double) parameters.getOrDefault(WEIGTH, (Serializable) this.weigth);
      this.zeroSlopeAtEnd = (boolean) parameters.getOrDefault(ZEROSLOPEATEND, (Serializable) this.zeroSlopeAtEnd);
      this.zeroSlopeAtStart = (boolean) parameters.getOrDefault(ZEROSLOPEATSTART, (Serializable) this.zeroSlopeAtStart);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CLAMPWHENFINISHED, (Serializable) clampWhenFinished);
    content.put(CLIP, clip == null ? null : "IPY_MODEL_" + clip.getComm().getCommId());
    content.put(ENABLED, (Serializable) enabled);
    content.put(LOCALROOT, localRoot == null ? null : "IPY_MODEL_" + localRoot.getComm().getCommId());
    content.put(LOOP, (Serializable) loop);
    content.put(MIXER, mixer == null ? null : "IPY_MODEL_" + mixer.getComm().getCommId());
    content.put(PAUSED, (Serializable) paused);
    content.put(REPITITIONS, (Serializable) repititions);
    content.put(TIME, (Serializable) time);
    content.put(TIMESCALE, (Serializable) timeScale);
    content.put(WEIGTH, (Serializable) weigth);
    content.put(ZEROSLOPEATEND, (Serializable) zeroSlopeAtEnd);
    content.put(ZEROSLOPEATSTART, (Serializable) zeroSlopeAtStart);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getClampWhenFinished() {
    return clampWhenFinished;
  }
  public void setClampWhenFinished(boolean clampWhenFinished){
    this.clampWhenFinished = clampWhenFinished;
    sendUpdate(CLAMPWHENFINISHED, clampWhenFinished);
  }

  public AnimationClip getClip() {
    return clip;
  }
  public void setClip(AnimationClip clip){
    this.clip = clip;
    sendUpdate(CLIP, clip == null ? null : "IPY_MODEL_"+clip.getComm().getCommId());
  }

  public boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(boolean enabled){
    this.enabled = enabled;
    sendUpdate(ENABLED, enabled);
  }

  public ThreeWidget getLocalRoot() {
    return localRoot;
  }
  public void setLocalRoot(ThreeWidget localRoot){
    this.localRoot = localRoot;
    sendUpdate(LOCALROOT, localRoot == null ? null : "IPY_MODEL_"+localRoot.getComm().getCommId());
  }

  public Object getLoop() {
    return loop;
  }
  public void setLoop(Object loop){
    this.loop = loop;
    sendUpdate(LOOP, loop);
  }

  public AnimationMixer getMixer() {
    return mixer;
  }
  public void setMixer(AnimationMixer mixer){
    this.mixer = mixer;
    sendUpdate(MIXER, mixer == null ? null : "IPY_MODEL_"+mixer.getComm().getCommId());
  }

  public boolean getPaused() {
    return paused;
  }
  public void setPaused(boolean paused){
    this.paused = paused;
    sendUpdate(PAUSED, paused);
  }

  public int getRepititions() {
    return repititions;
  }
  public void setRepititions(int repititions){
    this.repititions = repititions;
    sendUpdate(REPITITIONS, repititions);
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

  public double getWeigth() {
    return weigth;
  }
  public void setWeigth(double weigth){
    this.weigth = weigth;
    sendUpdate(WEIGTH, weigth);
  }

  public boolean getZeroSlopeAtEnd() {
    return zeroSlopeAtEnd;
  }
  public void setZeroSlopeAtEnd(boolean zeroSlopeAtEnd){
    this.zeroSlopeAtEnd = zeroSlopeAtEnd;
    sendUpdate(ZEROSLOPEATEND, zeroSlopeAtEnd);
  }

  public boolean getZeroSlopeAtStart() {
    return zeroSlopeAtStart;
  }
  public void setZeroSlopeAtStart(boolean zeroSlopeAtStart){
    this.zeroSlopeAtStart = zeroSlopeAtStart;
    sendUpdate(ZEROSLOPEATSTART, zeroSlopeAtStart);
  }

}
