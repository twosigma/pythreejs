
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Triangle extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "TriangleModel";
  public static final String A = "a";
  public static final String B = "b";
  public static final String C = "c";

  private List a = Arrays.asList(0, 0, 0);
  private List b = Arrays.asList(0, 0, 0);
  private List c = Arrays.asList(0, 0, 0);

  public Triangle() {
    super();
    openComm();
  }

    public Triangle(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.a = (List) parameters.getOrDefault(A, (Serializable) this.a);
      this.b = (List) parameters.getOrDefault(B, (Serializable) this.b);
      this.c = (List) parameters.getOrDefault(C, (Serializable) this.c);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(A, (Serializable) a);
    content.put(B, (Serializable) b);
    content.put(C, (Serializable) c);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getA() {
    return a;
  }
  public void setA(List a){
    this.a = a;
    sendUpdate(A, a);
  }

  public List getB() {
    return b;
  }
  public void setB(List b){
    this.b = b;
    sendUpdate(B, b);
  }

  public List getC() {
    return c;
  }
  public void setC(List c){
    this.c = c;
    sendUpdate(C, c);
  }

}
