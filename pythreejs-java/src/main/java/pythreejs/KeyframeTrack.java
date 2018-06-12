
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class KeyframeTrack extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "KeyframeTrackModel";
  public static final String INTERPOLATION = "interpolation";
  public static final String NAME = "name";
  public static final String TIMES = "times";
  public static final String VALUES = "values";

  private Object interpolation = "InterpolateLinear";
  private String name;
  private Object times;
  private Object values;

  public KeyframeTrack() {
    super();
    openComm();
  }

    public KeyframeTrack(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.interpolation = (Object) parameters.getOrDefault(INTERPOLATION, (Serializable) this.interpolation);
      this.name = (String) parameters.getOrDefault(NAME, (Serializable) this.name);
      this.times = (Object) parameters.getOrDefault(TIMES, (Serializable) this.times);
      this.values = (Object) parameters.getOrDefault(VALUES, (Serializable) this.values);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(INTERPOLATION, (Serializable) interpolation);
    content.put(NAME, (Serializable) name);
    content.put(TIMES, (Serializable) times);
    content.put(VALUES, (Serializable) values);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Object getInterpolation() {
    return interpolation;
  }
  public void setInterpolation(Object interpolation){
    this.interpolation = interpolation;
    sendUpdate(INTERPOLATION, interpolation);
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public Object getTimes() {
    return times;
  }
  public void setTimes(Object times){
    this.times = times;
    sendUpdate(TIMES, times);
  }

  public Object getValues() {
    return values;
  }
  public void setValues(Object values){
    this.values = values;
    sendUpdate(VALUES, values);
  }

}
