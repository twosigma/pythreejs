
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Line3 extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "Line3Model";
  public static final String END = "end";
  public static final String START = "start";

  private List end = Arrays.asList(0, 0, 0);
  private List start = Arrays.asList(0, 0, 0);

  public Line3() {
    super();
    openComm();
  }

    public Line3(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.end = (List) parameters.getOrDefault(END, (Serializable) this.end);
      this.start = (List) parameters.getOrDefault(START, (Serializable) this.start);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(END, (Serializable) end);
    content.put(START, (Serializable) start);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getEnd() {
    return end;
  }
  public void setEnd(List end){
    this.end = end;
    sendUpdate(END, end);
  }

  public List getStart() {
    return start;
  }
  public void setStart(List start){
    this.start = start;
    sendUpdate(START, start);
  }

}
