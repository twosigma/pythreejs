
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class PointsMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "PointsMaterialModel";
  public static final String COLOR = "color";
  public static final String LIGHTS = "lights";
  public static final String MAP = "map";
  public static final String SIZE = "size";
  public static final String SIZEATTENUATION = "sizeAttenuation";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private boolean lights;
  private Texture map;
  private double size = 1;
  private boolean sizeAttenuation = true;
  private String type = "PointsMaterial";

  public PointsMaterial() {
    super();
    openComm();
  }

    public PointsMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.map = (Texture) parameters.getOrDefault(MAP, (Serializable) this.map);
      this.size = (double) parameters.getOrDefault(SIZE, (Serializable) this.size);
      this.sizeAttenuation = (boolean) parameters.getOrDefault(SIZEATTENUATION, (Serializable) this.sizeAttenuation);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(LIGHTS, (Serializable) lights);
    content.put(MAP, map == null ? null : "IPY_MODEL_" + map.getComm().getCommId());
    content.put(SIZE, (Serializable) size);
    content.put(SIZEATTENUATION, (Serializable) sizeAttenuation);
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

  public Texture getMap() {
    return map;
  }
  public void setMap(Texture map){
    this.map = map;
    sendUpdate(MAP, map == null ? null : "IPY_MODEL_"+map.getComm().getCommId());
  }

  public double getSize() {
    return size;
  }
  public void setSize(double size){
    this.size = size;
    sendUpdate(SIZE, size);
  }

  public boolean getSizeAttenuation() {
    return sizeAttenuation;
  }
  public void setSizeAttenuation(boolean sizeAttenuation){
    this.sizeAttenuation = sizeAttenuation;
    sendUpdate(SIZEATTENUATION, sizeAttenuation);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
