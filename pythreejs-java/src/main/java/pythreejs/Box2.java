
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Box2 extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "Box2Model";
  public static final String MAX = "max";
  public static final String MIN = "min";

  private List max = Arrays.asList(0, 0);
  private List min = Arrays.asList(0, 0);

  public Box2() {
    super();
    openComm();
  }

    public Box2(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.max = (List) parameters.getOrDefault(MAX, (Serializable) this.max);
      this.min = (List) parameters.getOrDefault(MIN, (Serializable) this.min);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(MAX, (Serializable) max);
    content.put(MIN, (Serializable) min);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getMax() {
    return max;
  }
  public void setMax(List max){
    this.max = max;
    sendUpdate(MAX, max);
  }

  public List getMin() {
    return min;
  }
  public void setMin(List min){
    this.min = min;
    sendUpdate(MIN, min);
  }

}
