
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class FogExp2 extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "FogExp2Model";
  public static final String COLOR = "color";
  public static final String DENSITY = "density";
  public static final String NAME = "name";

  private String color = "white";
  private double density = 0.00025;
  private String name;

  public FogExp2() {
    super();
    openComm();
  }

    public FogExp2(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.density = (double) parameters.getOrDefault(DENSITY, (Serializable) this.density);
      this.name = (String) parameters.getOrDefault(NAME, (Serializable) this.name);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(DENSITY, (Serializable) density);
    content.put(NAME, (Serializable) name);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
    sendUpdate(COLOR, color);
  }

  public double getDensity() {
    return density;
  }
  public void setDensity(double density){
    this.density = density;
    sendUpdate(DENSITY, density);
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

}
