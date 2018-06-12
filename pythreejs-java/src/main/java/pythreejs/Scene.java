
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Scene extends Object3D {

  public static final String MODEL_NAME_VALUE = "SceneModel";
  public static final String AUTOUPDATE = "autoUpdate";
  public static final String BACKGROUND = "background";
  public static final String FOG = "fog";
  public static final String OVERRIDEMATERIAL = "overrideMaterial";
  public static final String TYPE = "type";

  private boolean autoUpdate = true;
  private String background = "#ffffff";
  private Widget fog;
  private Material overrideMaterial;
  private String type = "Scene";

  public Scene() {
    super();
    openComm();
  }

    public Scene(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.autoUpdate = (boolean) parameters.getOrDefault(AUTOUPDATE, (Serializable) this.autoUpdate);
      this.background = (String) parameters.getOrDefault(BACKGROUND, (Serializable) this.background);
      this.fog = (Widget) parameters.getOrDefault(FOG, (Serializable) this.fog);
      this.overrideMaterial = (Material) parameters.getOrDefault(OVERRIDEMATERIAL, (Serializable) this.overrideMaterial);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(AUTOUPDATE, (Serializable) autoUpdate);
    content.put(BACKGROUND, (Serializable) background);
    content.put(FOG, fog == null ? null : "IPY_MODEL_" + fog.getComm().getCommId());
    content.put(OVERRIDEMATERIAL, overrideMaterial == null ? null : "IPY_MODEL_" + overrideMaterial.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getAutoUpdate() {
    return autoUpdate;
  }
  public void setAutoUpdate(boolean autoUpdate){
    this.autoUpdate = autoUpdate;
    sendUpdate(AUTOUPDATE, autoUpdate);
  }

  public String getBackground() {
    return background;
  }
  public void setBackground(String background){
    this.background = background;
    sendUpdate(BACKGROUND, background);
  }

  public Widget getFog() {
    return fog;
  }
  public void setFog(Widget fog){
    this.fog = fog;
    sendUpdate(FOG, fog == null ? null : "IPY_MODEL_"+fog.getComm().getCommId());
  }

  public Material getOverrideMaterial() {
    return overrideMaterial;
  }
  public void setOverrideMaterial(Material overrideMaterial){
    this.overrideMaterial = overrideMaterial;
    sendUpdate(OVERRIDEMATERIAL, overrideMaterial == null ? null : "IPY_MODEL_"+overrideMaterial.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
