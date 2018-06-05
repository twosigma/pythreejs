
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class LineBasicMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "LineBasicMaterialModel";
  public static final String COLOR = "color";
  public static final String LIGHTS = "lights";
  public static final String LINECAP = "linecap";
  public static final String LINEJOIN = "linejoin";
  public static final String LINEWIDTH = "linewidth";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private boolean lights;
  private String linecap = "round";
  private String linejoin = "round";
  private double linewidth = 1;
  private String type = "LineBasicMaterial";

  public LineBasicMaterial() {
    super();
    openComm();
  }

    public LineBasicMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.linecap = (String) parameters.getOrDefault(LINECAP, (Serializable) this.linecap);
      this.linejoin = (String) parameters.getOrDefault(LINEJOIN, (Serializable) this.linejoin);
      this.linewidth = (double) parameters.getOrDefault(LINEWIDTH, (Serializable) this.linewidth);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(LIGHTS, (Serializable) lights);
    content.put(LINECAP, (Serializable) linecap);
    content.put(LINEJOIN, (Serializable) linejoin);
    content.put(LINEWIDTH, (Serializable) linewidth);
    content.put(TYPE, (Serializable) type);
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

  public boolean getLights() {
    return lights;
  }
  public void setLights(boolean lights){
    this.lights = lights;
    sendUpdate(LIGHTS, lights);
  }

  public String getLinecap() {
    return linecap;
  }
  public void setLinecap(String linecap){
    this.linecap = linecap;
    sendUpdate(LINECAP, linecap);
  }

  public String getLinejoin() {
    return linejoin;
  }
  public void setLinejoin(String linejoin){
    this.linejoin = linejoin;
    sendUpdate(LINEJOIN, linejoin);
  }

  public double getLinewidth() {
    return linewidth;
  }
  public void setLinewidth(double linewidth){
    this.linewidth = linewidth;
    sendUpdate(LINEWIDTH, linewidth);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
