
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class LineDashedMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "LineDashedMaterialModel";
  public static final String COLOR = "color";
  public static final String DASHSIZE = "dashSize";
  public static final String GAPSIZE = "gapSize";
  public static final String LIGHTS = "lights";
  public static final String LINEWIDTH = "linewidth";
  public static final String SCALE = "scale";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private double dashSize = 3;
  private double gapSize = 1;
  private boolean lights;
  private double linewidth = 1;
  private double scale = 1;
  private String type = "LineDashedMaterial";

  public LineDashedMaterial() {
    super();
    openComm();
  }

    public LineDashedMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.dashSize = (double) parameters.getOrDefault(DASHSIZE, (Serializable) this.dashSize);
      this.gapSize = (double) parameters.getOrDefault(GAPSIZE, (Serializable) this.gapSize);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.linewidth = (double) parameters.getOrDefault(LINEWIDTH, (Serializable) this.linewidth);
      this.scale = (double) parameters.getOrDefault(SCALE, (Serializable) this.scale);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(DASHSIZE, (Serializable) dashSize);
    content.put(GAPSIZE, (Serializable) gapSize);
    content.put(LIGHTS, (Serializable) lights);
    content.put(LINEWIDTH, (Serializable) linewidth);
    content.put(SCALE, (Serializable) scale);
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

  public double getDashSize() {
    return dashSize;
  }
  public void setDashSize(double dashSize){
    this.dashSize = dashSize;
    sendUpdate(DASHSIZE, dashSize);
  }

  public double getGapSize() {
    return gapSize;
  }
  public void setGapSize(double gapSize){
    this.gapSize = gapSize;
    sendUpdate(GAPSIZE, gapSize);
  }

  public boolean getLights() {
    return lights;
  }
  public void setLights(boolean lights){
    this.lights = lights;
    sendUpdate(LIGHTS, lights);
  }

  public double getLinewidth() {
    return linewidth;
  }
  public void setLinewidth(double linewidth){
    this.linewidth = linewidth;
    sendUpdate(LINEWIDTH, linewidth);
  }

  public double getScale() {
    return scale;
  }
  public void setScale(double scale){
    this.scale = scale;
    sendUpdate(SCALE, scale);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
