
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class MeshDepthMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "MeshDepthMaterialModel";
  public static final String ALPHAMAP = "alphaMap";
  public static final String DISPLACEMENTBIAS = "displacementBias";
  public static final String DISPLACEMENTMAP = "displacementMap";
  public static final String DISPLACEMENTSCALE = "displacementScale";
  public static final String FOG = "fog";
  public static final String LIGHTS = "lights";
  public static final String MAP = "map";
  public static final String MORPHTARGETS = "morphTargets";
  public static final String SKINNING = "skinning";
  public static final String TYPE = "type";
  public static final String WIREFRAME = "wireframe";
  public static final String WIREFRAMELINEWIDTH = "wireframeLinewidth";

  private Texture alphaMap;
  private double displacementBias = 0;
  private Texture displacementMap;
  private double displacementScale = 1;
  private boolean fog;
  private boolean lights;
  private Texture map;
  private boolean morphTargets;
  private boolean skinning;
  private String type = "MeshDepthMaterial";
  private boolean wireframe;
  private double wireframeLinewidth = 1;

  public MeshDepthMaterial() {
    super();
    openComm();
  }

    public MeshDepthMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.alphaMap = (Texture) parameters.getOrDefault(ALPHAMAP, (Serializable) this.alphaMap);
      this.displacementBias = (double) parameters.getOrDefault(DISPLACEMENTBIAS, (Serializable) this.displacementBias);
      this.displacementMap = (Texture) parameters.getOrDefault(DISPLACEMENTMAP, (Serializable) this.displacementMap);
      this.displacementScale = (double) parameters.getOrDefault(DISPLACEMENTSCALE, (Serializable) this.displacementScale);
      this.fog = (boolean) parameters.getOrDefault(FOG, (Serializable) this.fog);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.map = (Texture) parameters.getOrDefault(MAP, (Serializable) this.map);
      this.morphTargets = (boolean) parameters.getOrDefault(MORPHTARGETS, (Serializable) this.morphTargets);
      this.skinning = (boolean) parameters.getOrDefault(SKINNING, (Serializable) this.skinning);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.wireframe = (boolean) parameters.getOrDefault(WIREFRAME, (Serializable) this.wireframe);
      this.wireframeLinewidth = (double) parameters.getOrDefault(WIREFRAMELINEWIDTH, (Serializable) this.wireframeLinewidth);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ALPHAMAP, alphaMap == null ? null : "IPY_MODEL_" + alphaMap.getComm().getCommId());
    content.put(DISPLACEMENTBIAS, (Serializable) displacementBias);
    content.put(DISPLACEMENTMAP, displacementMap == null ? null : "IPY_MODEL_" + displacementMap.getComm().getCommId());
    content.put(DISPLACEMENTSCALE, (Serializable) displacementScale);
    content.put(FOG, (Serializable) fog);
    content.put(LIGHTS, (Serializable) lights);
    content.put(MAP, map == null ? null : "IPY_MODEL_" + map.getComm().getCommId());
    content.put(MORPHTARGETS, (Serializable) morphTargets);
    content.put(SKINNING, (Serializable) skinning);
    content.put(TYPE, (Serializable) type);
    content.put(WIREFRAME, (Serializable) wireframe);
    content.put(WIREFRAMELINEWIDTH, (Serializable) wireframeLinewidth);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Texture getAlphaMap() {
    return alphaMap;
  }
  public void setAlphaMap(Texture alphaMap){
    this.alphaMap = alphaMap;
    sendUpdate(ALPHAMAP, alphaMap == null ? null : "IPY_MODEL_"+alphaMap.getComm().getCommId());
  }

  public double getDisplacementBias() {
    return displacementBias;
  }
  public void setDisplacementBias(double displacementBias){
    this.displacementBias = displacementBias;
    sendUpdate(DISPLACEMENTBIAS, displacementBias);
  }

  public Texture getDisplacementMap() {
    return displacementMap;
  }
  public void setDisplacementMap(Texture displacementMap){
    this.displacementMap = displacementMap;
    sendUpdate(DISPLACEMENTMAP, displacementMap == null ? null : "IPY_MODEL_"+displacementMap.getComm().getCommId());
  }

  public double getDisplacementScale() {
    return displacementScale;
  }
  public void setDisplacementScale(double displacementScale){
    this.displacementScale = displacementScale;
    sendUpdate(DISPLACEMENTSCALE, displacementScale);
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

  public boolean getMorphTargets() {
    return morphTargets;
  }
  public void setMorphTargets(boolean morphTargets){
    this.morphTargets = morphTargets;
    sendUpdate(MORPHTARGETS, morphTargets);
  }

  public boolean getSkinning() {
    return skinning;
  }
  public void setSkinning(boolean skinning){
    this.skinning = skinning;
    sendUpdate(SKINNING, skinning);
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
