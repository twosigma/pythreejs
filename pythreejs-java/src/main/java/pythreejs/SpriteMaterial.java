
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class SpriteMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "SpriteMaterialModel";
  public static final String COLOR = "color";
  public static final String FOG = "fog";
  public static final String LIGHTS = "lights";
  public static final String MAP = "map";
  public static final String ROTATION = "rotation";
  public static final String TYPE = "type";

  private String color = "#ffffff";
  private boolean fog;
  private boolean lights;
  private Texture map;
  private double rotation = 0;
  private String type = "SpriteMaterial";

  public SpriteMaterial() {
    super();
    openComm();
  }

    public SpriteMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.fog = (boolean) parameters.getOrDefault(FOG, (Serializable) this.fog);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.map = (Texture) parameters.getOrDefault(MAP, (Serializable) this.map);
      this.rotation = (double) parameters.getOrDefault(ROTATION, (Serializable) this.rotation);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(FOG, (Serializable) fog);
    content.put(LIGHTS, (Serializable) lights);
    content.put(MAP, map == null ? null : "IPY_MODEL_" + map.getComm().getCommId());
    content.put(ROTATION, (Serializable) rotation);
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

  public boolean getFog() {
    return fog;
  }
  public void setFog(boolean fog){
    this.fog = fog;
    sendUpdate(FOG, fog);
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

  public double getRotation() {
    return rotation;
  }
  public void setRotation(double rotation){
    this.rotation = rotation;
    sendUpdate(ROTATION, rotation);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
