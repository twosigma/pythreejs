
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class AnimationClip extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "AnimationClipModel";
  public static final String DURATION = "duration";
  public static final String NAME = "name";
  public static final String TRACKS = "tracks";

  private double duration = -1;
  private String name;
  private List tracks = Arrays.asList();

  public AnimationClip() {
    super();
    openComm();
  }

    public AnimationClip(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.duration = (double) parameters.getOrDefault(DURATION, (Serializable) this.duration);
      this.name = (String) parameters.getOrDefault(NAME, (Serializable) this.name);
      this.tracks = (List) parameters.getOrDefault(TRACKS, (Serializable) this.tracks);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DURATION, (Serializable) duration);
    content.put(NAME, (Serializable) name);
    content.put(TRACKS, (Serializable) tracks);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getDuration() {
    return duration;
  }
  public void setDuration(double duration){
    this.duration = duration;
    sendUpdate(DURATION, duration);
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public List getTracks() {
    return tracks;
  }
  public void setTracks(List tracks){
    this.tracks = tracks;
    sendUpdate(TRACKS, tracks);
  }

}
