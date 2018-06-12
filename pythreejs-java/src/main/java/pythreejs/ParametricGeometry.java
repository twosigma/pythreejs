
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ParametricGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "ParametricGeometryModel";
  public static final String FUNC = "func";
  public static final String SLICES = "slices";
  public static final String STACKS = "stacks";
  public static final String TYPE = "type";

  private String func = "function f(origu,origv) {\n" +
          "    // scale u and v to the ranges I want: [0, 2*pi]\n" +
          "    var u = 2*Math.PI*origu;\n" +
          "    var v = 2*Math.PI*origv;\n" +
          "    \n" +
          "    var x = Math.sin(u);\n" +
          "    var y = Math.cos(v);\n" +
          "    var z = Math.cos(u+v);\n" +
          "    \n" +
          "    return new THREE.Vector3(x,y,z)\n" +
          "}";
  private int slices = 3;
  private int stacks = 3;
  private String type = "ParametricGeometry";

  public ParametricGeometry() {
    super();
    openComm();
  }

    public ParametricGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.func = (String) parameters.getOrDefault(FUNC, (Serializable) this.func);
      this.slices = (int) parameters.getOrDefault(SLICES, (Serializable) this.slices);
      this.stacks = (int) parameters.getOrDefault(STACKS, (Serializable) this.stacks);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(FUNC, (Serializable) func);
    content.put(SLICES, (Serializable) slices);
    content.put(STACKS, (Serializable) stacks);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getFunc() {
    return func;
  }
  public void setFunc(String func){
    this.func = func;
    sendUpdate(FUNC, func);
  }

  public int getSlices() {
    return slices;
  }
  public void setSlices(int slices){
    this.slices = slices;
    sendUpdate(SLICES, slices);
  }

  public int getStacks() {
    return stacks;
  }
  public void setStacks(int stacks){
    this.stacks = stacks;
    sendUpdate(STACKS, stacks);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
