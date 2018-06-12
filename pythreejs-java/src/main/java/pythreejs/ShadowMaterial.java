
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ShadowMaterial extends ShaderMaterial {

  public static final String MODEL_NAME_VALUE = "ShadowMaterialModel";
  public static final String LIGHTS = "lights";
  public static final String TRANSPARENT = "transparent";
  public static final String TYPE = "type";

  private boolean lights = true;
  private boolean transparent = true;
  private String type = "ShadowMaterial";

  public ShadowMaterial() {
    super();
    openComm();
  }

    public ShadowMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.transparent = (boolean) parameters.getOrDefault(TRANSPARENT, (Serializable) this.transparent);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(LIGHTS, (Serializable) lights);
    content.put(TRANSPARENT, (Serializable) transparent);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getLights() {
    return lights;
  }
  public void setLights(boolean lights){
    this.lights = lights;
    sendUpdate(LIGHTS, lights);
  }

  public boolean getTransparent() {
    return transparent;
  }
  public void setTransparent(boolean transparent){
    this.transparent = transparent;
    sendUpdate(TRANSPARENT, transparent);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
