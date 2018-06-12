
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class MeshBasicMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "MeshBasicMaterialModel";
  public static final String ALPHAMAP = "alphaMap";
  public static final String AOMAP = "aoMap";
  public static final String AOMAPINTENSITY = "aoMapIntensity";
  public static final String COLOR = "color";
  public static final String COMBINE = "combine";
  public static final String ENVMAP = "envMap";
  public static final String LIGHTMAP = "lightMap";
  public static final String LIGHTMAPINTENSITY = "lightMapIntensity";
  public static final String LIGHTS = "lights";
  public static final String MAP = "map";
  public static final String MORPHTARGETS = "morphTargets";
  public static final String REFLECTIVITY = "reflectivity";
  public static final String REFRACTIONRATIO = "refractionRatio";
  public static final String SKINNING = "skinning";
  public static final String SPECULARMAP = "specularMap";
  public static final String TYPE = "type";
  public static final String WIREFRAME = "wireframe";
  public static final String WIREFRAMELINECAP = "wireframeLinecap";
  public static final String WIREFRAMELINEJOIN = "wireframeLinejoin";
  public static final String WIREFRAMELINEWIDTH = "wireframeLinewidth";

  private Texture alphaMap;
  private Texture aoMap;
  private double aoMapIntensity = 1;
  private String color = "#ffffff";
  private Object combine = "MultiplyOperation";
  private CubeTexture envMap;
  private Texture lightMap;
  private double lightMapIntensity = 1;
  private boolean lights;
  private Texture map;
  private boolean morphTargets;
  private double reflectivity = 1;
  private double refractionRatio = 0.98;
  private boolean skinning;
  private Texture specularMap;
  private String type = "MeshBasicMaterial";
  private boolean wireframe;
  private String wireframeLinecap = "round";
  private String wireframeLinejoin = "round";
  private double wireframeLinewidth = 1;

  public MeshBasicMaterial() {
    super();
    openComm();
  }

    public MeshBasicMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.alphaMap = (Texture) parameters.getOrDefault(ALPHAMAP, (Serializable) this.alphaMap);
      this.aoMap = (Texture) parameters.getOrDefault(AOMAP, (Serializable) this.aoMap);
      this.aoMapIntensity = (double) parameters.getOrDefault(AOMAPINTENSITY, (Serializable) this.aoMapIntensity);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.combine = (Object) parameters.getOrDefault(COMBINE, (Serializable) this.combine);
      this.envMap = (CubeTexture) parameters.getOrDefault(ENVMAP, (Serializable) this.envMap);
      this.lightMap = (Texture) parameters.getOrDefault(LIGHTMAP, (Serializable) this.lightMap);
      this.lightMapIntensity = (double) parameters.getOrDefault(LIGHTMAPINTENSITY, (Serializable) this.lightMapIntensity);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.map = (Texture) parameters.getOrDefault(MAP, (Serializable) this.map);
      this.morphTargets = (boolean) parameters.getOrDefault(MORPHTARGETS, (Serializable) this.morphTargets);
      this.reflectivity = (double) parameters.getOrDefault(REFLECTIVITY, (Serializable) this.reflectivity);
      this.refractionRatio = (double) parameters.getOrDefault(REFRACTIONRATIO, (Serializable) this.refractionRatio);
      this.skinning = (boolean) parameters.getOrDefault(SKINNING, (Serializable) this.skinning);
      this.specularMap = (Texture) parameters.getOrDefault(SPECULARMAP, (Serializable) this.specularMap);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.wireframe = (boolean) parameters.getOrDefault(WIREFRAME, (Serializable) this.wireframe);
      this.wireframeLinecap = (String) parameters.getOrDefault(WIREFRAMELINECAP, (Serializable) this.wireframeLinecap);
      this.wireframeLinejoin = (String) parameters.getOrDefault(WIREFRAMELINEJOIN, (Serializable) this.wireframeLinejoin);
      this.wireframeLinewidth = (double) parameters.getOrDefault(WIREFRAMELINEWIDTH, (Serializable) this.wireframeLinewidth);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ALPHAMAP, alphaMap == null ? null : "IPY_MODEL_" + alphaMap.getComm().getCommId());
    content.put(AOMAP, aoMap == null ? null : "IPY_MODEL_" + aoMap.getComm().getCommId());
    content.put(AOMAPINTENSITY, (Serializable) aoMapIntensity);
    content.put(COLOR, (Serializable) color);
    content.put(COMBINE, (Serializable) combine);
    content.put(ENVMAP, envMap == null ? null : "IPY_MODEL_" + envMap.getComm().getCommId());
    content.put(LIGHTMAP, lightMap == null ? null : "IPY_MODEL_" + lightMap.getComm().getCommId());
    content.put(LIGHTMAPINTENSITY, (Serializable) lightMapIntensity);
    content.put(LIGHTS, (Serializable) lights);
    content.put(MAP, map == null ? null : "IPY_MODEL_" + map.getComm().getCommId());
    content.put(MORPHTARGETS, (Serializable) morphTargets);
    content.put(REFLECTIVITY, (Serializable) reflectivity);
    content.put(REFRACTIONRATIO, (Serializable) refractionRatio);
    content.put(SKINNING, (Serializable) skinning);
    content.put(SPECULARMAP, specularMap == null ? null : "IPY_MODEL_" + specularMap.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    content.put(WIREFRAME, (Serializable) wireframe);
    content.put(WIREFRAMELINECAP, (Serializable) wireframeLinecap);
    content.put(WIREFRAMELINEJOIN, (Serializable) wireframeLinejoin);
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

  public Texture getAoMap() {
    return aoMap;
  }
  public void setAoMap(Texture aoMap){
    this.aoMap = aoMap;
    sendUpdate(AOMAP, aoMap == null ? null : "IPY_MODEL_"+aoMap.getComm().getCommId());
  }

  public double getAoMapIntensity() {
    return aoMapIntensity;
  }
  public void setAoMapIntensity(double aoMapIntensity){
    this.aoMapIntensity = aoMapIntensity;
    sendUpdate(AOMAPINTENSITY, aoMapIntensity);
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
    sendUpdate(COLOR, color);
  }

  public Object getCombine() {
    return combine;
  }
  public void setCombine(Object combine){
    this.combine = combine;
    sendUpdate(COMBINE, combine);
  }

  public CubeTexture getEnvMap() {
    return envMap;
  }
  public void setEnvMap(CubeTexture envMap){
    this.envMap = envMap;
    sendUpdate(ENVMAP, envMap == null ? null : "IPY_MODEL_"+envMap.getComm().getCommId());
  }

  public Texture getLightMap() {
    return lightMap;
  }
  public void setLightMap(Texture lightMap){
    this.lightMap = lightMap;
    sendUpdate(LIGHTMAP, lightMap == null ? null : "IPY_MODEL_"+lightMap.getComm().getCommId());
  }

  public double getLightMapIntensity() {
    return lightMapIntensity;
  }
  public void setLightMapIntensity(double lightMapIntensity){
    this.lightMapIntensity = lightMapIntensity;
    sendUpdate(LIGHTMAPINTENSITY, lightMapIntensity);
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

  public double getReflectivity() {
    return reflectivity;
  }
  public void setReflectivity(double reflectivity){
    this.reflectivity = reflectivity;
    sendUpdate(REFLECTIVITY, reflectivity);
  }

  public double getRefractionRatio() {
    return refractionRatio;
  }
  public void setRefractionRatio(double refractionRatio){
    this.refractionRatio = refractionRatio;
    sendUpdate(REFRACTIONRATIO, refractionRatio);
  }

  public boolean getSkinning() {
    return skinning;
  }
  public void setSkinning(boolean skinning){
    this.skinning = skinning;
    sendUpdate(SKINNING, skinning);
  }

  public Texture getSpecularMap() {
    return specularMap;
  }
  public void setSpecularMap(Texture specularMap){
    this.specularMap = specularMap;
    sendUpdate(SPECULARMAP, specularMap == null ? null : "IPY_MODEL_"+specularMap.getComm().getCommId());
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

  public String getWireframeLinecap() {
    return wireframeLinecap;
  }
  public void setWireframeLinecap(String wireframeLinecap){
    this.wireframeLinecap = wireframeLinecap;
    sendUpdate(WIREFRAMELINECAP, wireframeLinecap);
  }

  public String getWireframeLinejoin() {
    return wireframeLinejoin;
  }
  public void setWireframeLinejoin(String wireframeLinejoin){
    this.wireframeLinejoin = wireframeLinejoin;
    sendUpdate(WIREFRAMELINEJOIN, wireframeLinejoin);
  }

  public double getWireframeLinewidth() {
    return wireframeLinewidth;
  }
  public void setWireframeLinewidth(double wireframeLinewidth){
    this.wireframeLinewidth = wireframeLinewidth;
    sendUpdate(WIREFRAMELINEWIDTH, wireframeLinewidth);
  }

}
