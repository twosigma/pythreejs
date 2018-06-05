
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class MeshNormalMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "MeshNormalMaterialModel";
  public static final String FOG = "fog";
  public static final String LIGHTS = "lights";
  public static final String MORPHTARGETS = "morphTargets";
  public static final String TYPE = "type";
  public static final String WIREFRAME = "wireframe";
  public static final String WIREFRAMELINEWIDTH = "wireframeLinewidth";

  private boolean fog;
  private boolean lights;
  private boolean morphTargets;
  private String type = "MeshNormalMaterial";
  private boolean wireframe;
  private double wireframeLinewidth = 1;

  public MeshNormalMaterial() {
    super();
    openComm();
  }

    public MeshNormalMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.fog = (boolean) parameters.getOrDefault(FOG, (Serializable) this.fog);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.morphTargets = (boolean) parameters.getOrDefault(MORPHTARGETS, (Serializable) this.morphTargets);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.wireframe = (boolean) parameters.getOrDefault(WIREFRAME, (Serializable) this.wireframe);
      this.wireframeLinewidth = (double) parameters.getOrDefault(WIREFRAMELINEWIDTH, (Serializable) this.wireframeLinewidth);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(FOG, (Serializable) fog);
    content.put(LIGHTS, (Serializable) lights);
    content.put(MORPHTARGETS, (Serializable) morphTargets);
    content.put(TYPE, (Serializable) type);
    content.put(WIREFRAME, (Serializable) wireframe);
    content.put(WIREFRAMELINEWIDTH, (Serializable) wireframeLinewidth);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
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

  public boolean getMorphTargets() {
    return morphTargets;
  }
  public void setMorphTargets(boolean morphTargets){
    this.morphTargets = morphTargets;
    sendUpdate(MORPHTARGETS, morphTargets);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public boolean getWireframe() {
    return wireframe;
  }
  public void setWireframe(boolean wireframe){
    this.wireframe = wireframe;
    sendUpdate(WIREFRAME, wireframe);
  }

  public double getWireframeLinewidth() {
    return wireframeLinewidth;
  }
  public void setWireframeLinewidth(double wireframeLinewidth){
    this.wireframeLinewidth = wireframeLinewidth;
    sendUpdate(WIREFRAMELINEWIDTH, wireframeLinewidth);
  }

}
