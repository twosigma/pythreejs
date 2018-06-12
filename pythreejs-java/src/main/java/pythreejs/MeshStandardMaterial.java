
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class MeshStandardMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "MeshStandardMaterialModel";
  public static final String ALPHAMAP = "alphaMap";
  public static final String AOMAP = "aoMap";
  public static final String AOMAPINTENSITY = "aoMapIntensity";
  public static final String BUMPMAP = "bumpMap";
  public static final String BUMPSCALE = "bumpScale";
  public static final String COLOR = "color";
  public static final String DEFINES = "defines";
  public static final String DISPLACEMENTBIAS = "displacementBias";
  public static final String DISPLACEMENTMAP = "displacementMap";
  public static final String DISPLACEMENTSCALE = "displacementScale";
  public static final String EMISSIVE = "emissive";
  public static final String EMISSIVEINTENSITY = "emissiveIntensity";
  public static final String EMISSIVEMAP = "emissiveMap";
  public static final String ENVMAP = "envMap";
  public static final String ENVMAPINTENSITY = "envMapIntensity";
  public static final String LIGHTMAP = "lightMap";
  public static final String LIGHTMAPINTENSITY = "lightMapIntensity";
  public static final String MAP = "map";
  public static final String METALNESS = "metalness";
  public static final String METALNESSMAP = "metalnessMap";
  public static final String MORPHNORMALS = "morphNormals";
  public static final String MORPHTARGETS = "morphTargets";
  public static final String NORMALMAP = "normalMap";
  public static final String NORMALSCALE = "normalScale";
  public static final String REFRACTIONRATIO = "refractionRatio";
  public static final String ROUGHNESS = "roughness";
  public static final String ROUGHNESSMAP = "roughnessMap";
  public static final String SKINNING = "skinning";
  public static final String TYPE = "type";
  public static final String WIREFRAME = "wireframe";
  public static final String WIREFRAMELINECAP = "wireframeLinecap";
  public static final String WIREFRAMELINEJOIN = "wireframeLinejoin";
  public static final String WIREFRAMELINEWIDTH = "wireframeLinewidth";

  private Texture alphaMap;
  private Texture aoMap;
  private double aoMapIntensity = 1;
  private Texture bumpMap;
  private double bumpScale = 1;
  private String color = "#ffffff";
  private Map<String, Serializable> defines = new HashMap<String, Serializable>();
  {
    defines.put("STANDARD", null);
  }
  private double displacementBias = 0;
  private Texture displacementMap;
  private double displacementScale = 1;
  private String emissive = "#000000";
  private double emissiveIntensity = 1;
  private Texture emissiveMap;
  private CubeTexture envMap;
  private double envMapIntensity = 1;
  private Texture lightMap;
  private double lightMapIntensity = 1;
  private Texture map;
  private double metalness = 0.5;
  private Texture metalnessMap;
  private boolean morphNormals;
  private boolean morphTargets;
  private Texture normalMap;
  private List normalScale = Arrays.asList(1, 1);
  private double refractionRatio = 0.98;
  private double roughness = 0.5;
  private Texture roughnessMap;
  private boolean skinning;
  private String type = "MeshStandardMaterial";
  private boolean wireframe;
  private String wireframeLinecap = "round";
  private String wireframeLinejoin = "round";
  private double wireframeLinewidth = 1;

  public MeshStandardMaterial() {
    super();
  }

    public MeshStandardMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.alphaMap = (Texture) parameters.getOrDefault(ALPHAMAP, (Serializable) this.alphaMap);
      this.aoMap = (Texture) parameters.getOrDefault(AOMAP, (Serializable) this.aoMap);
      this.aoMapIntensity = (double) parameters.getOrDefault(AOMAPINTENSITY, (Serializable) this.aoMapIntensity);
      this.bumpMap = (Texture) parameters.getOrDefault(BUMPMAP, (Serializable) this.bumpMap);
      this.bumpScale = (double) parameters.getOrDefault(BUMPSCALE, (Serializable) this.bumpScale);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.defines = (Map<String, Serializable>) parameters.getOrDefault(DEFINES, (Serializable) this.defines);
      this.displacementBias = (double) parameters.getOrDefault(DISPLACEMENTBIAS, (Serializable) this.displacementBias);
      this.displacementMap = (Texture) parameters.getOrDefault(DISPLACEMENTMAP, (Serializable) this.displacementMap);
      this.displacementScale = (double) parameters.getOrDefault(DISPLACEMENTSCALE, (Serializable) this.displacementScale);
      this.emissive = (String) parameters.getOrDefault(EMISSIVE, (Serializable) this.emissive);
      this.emissiveIntensity = (double) parameters.getOrDefault(EMISSIVEINTENSITY, (Serializable) this.emissiveIntensity);
      this.emissiveMap = (Texture) parameters.getOrDefault(EMISSIVEMAP, (Serializable) this.emissiveMap);
      this.envMap = (CubeTexture) parameters.getOrDefault(ENVMAP, (Serializable) this.envMap);
      this.envMapIntensity = (double) parameters.getOrDefault(ENVMAPINTENSITY, (Serializable) this.envMapIntensity);
      this.lightMap = (Texture) parameters.getOrDefault(LIGHTMAP, (Serializable) this.lightMap);
      this.lightMapIntensity = (double) parameters.getOrDefault(LIGHTMAPINTENSITY, (Serializable) this.lightMapIntensity);
      this.map = (Texture) parameters.getOrDefault(MAP, (Serializable) this.map);
      this.metalness = (double) parameters.getOrDefault(METALNESS, (Serializable) this.metalness);
      this.metalnessMap = (Texture) parameters.getOrDefault(METALNESSMAP, (Serializable) this.metalnessMap);
      this.morphNormals = (boolean) parameters.getOrDefault(MORPHNORMALS, (Serializable) this.morphNormals);
      this.morphTargets = (boolean) parameters.getOrDefault(MORPHTARGETS, (Serializable) this.morphTargets);
      this.normalMap = (Texture) parameters.getOrDefault(NORMALMAP, (Serializable) this.normalMap);
      this.normalScale = (List) parameters.getOrDefault(NORMALSCALE, (Serializable) this.normalScale);
      this.refractionRatio = (double) parameters.getOrDefault(REFRACTIONRATIO, (Serializable) this.refractionRatio);
      this.roughness = (double) parameters.getOrDefault(ROUGHNESS, (Serializable) this.roughness);
      this.roughnessMap = (Texture) parameters.getOrDefault(ROUGHNESSMAP, (Serializable) this.roughnessMap);
      this.skinning = (boolean) parameters.getOrDefault(SKINNING, (Serializable) this.skinning);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.wireframe = (boolean) parameters.getOrDefault(WIREFRAME, (Serializable) this.wireframe);
      this.wireframeLinecap = (String) parameters.getOrDefault(WIREFRAMELINECAP, (Serializable) this.wireframeLinecap);
      this.wireframeLinejoin = (String) parameters.getOrDefault(WIREFRAMELINEJOIN, (Serializable) this.wireframeLinejoin);
      this.wireframeLinewidth = (double) parameters.getOrDefault(WIREFRAMELINEWIDTH, (Serializable) this.wireframeLinewidth);
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ALPHAMAP, alphaMap == null ? null : "IPY_MODEL_" + alphaMap.getComm().getCommId());
    content.put(AOMAP, aoMap == null ? null : "IPY_MODEL_" + aoMap.getComm().getCommId());
    content.put(AOMAPINTENSITY, (Serializable) aoMapIntensity);
    content.put(BUMPMAP, bumpMap == null ? null : "IPY_MODEL_" + bumpMap.getComm().getCommId());
    content.put(BUMPSCALE, (Serializable) bumpScale);
    content.put(COLOR, (Serializable) color);
    content.put(DEFINES, (Serializable) defines);
    content.put(DISPLACEMENTBIAS, (Serializable) displacementBias);
    content.put(DISPLACEMENTMAP, displacementMap == null ? null : "IPY_MODEL_" + displacementMap.getComm().getCommId());
    content.put(DISPLACEMENTSCALE, (Serializable) displacementScale);
    content.put(EMISSIVE, (Serializable) emissive);
    content.put(EMISSIVEINTENSITY, (Serializable) emissiveIntensity);
    content.put(EMISSIVEMAP, emissiveMap == null ? null : "IPY_MODEL_" + emissiveMap.getComm().getCommId());
    content.put(ENVMAP, envMap == null ? null : "IPY_MODEL_" + envMap.getComm().getCommId());
    content.put(ENVMAPINTENSITY, (Serializable) envMapIntensity);
    content.put(LIGHTMAP, lightMap == null ? null : "IPY_MODEL_" + lightMap.getComm().getCommId());
    content.put(LIGHTMAPINTENSITY, (Serializable) lightMapIntensity);
    content.put(MAP, map == null ? null : "IPY_MODEL_" + map.getComm().getCommId());
    content.put(METALNESS, (Serializable) metalness);
    content.put(METALNESSMAP, metalnessMap == null ? null : "IPY_MODEL_" + metalnessMap.getComm().getCommId());
    content.put(MORPHNORMALS, (Serializable) morphNormals);
    content.put(MORPHTARGETS, (Serializable) morphTargets);
    content.put(NORMALMAP, normalMap == null ? null : "IPY_MODEL_" + normalMap.getComm().getCommId());
    content.put(NORMALSCALE, (Serializable) normalScale);
    content.put(REFRACTIONRATIO, (Serializable) refractionRatio);
    content.put(ROUGHNESS, (Serializable) roughness);
    content.put(ROUGHNESSMAP, roughnessMap == null ? null : "IPY_MODEL_" + roughnessMap.getComm().getCommId());
    content.put(SKINNING, (Serializable) skinning);
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

  public Texture getBumpMap() {
    return bumpMap;
  }
  public void setBumpMap(Texture bumpMap){
    this.bumpMap = bumpMap;
    sendUpdate(BUMPMAP, bumpMap == null ? null : "IPY_MODEL_"+bumpMap.getComm().getCommId());
  }

  public double getBumpScale() {
    return bumpScale;
  }
  public void setBumpScale(double bumpScale){
    this.bumpScale = bumpScale;
    sendUpdate(BUMPSCALE, bumpScale);
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
    sendUpdate(COLOR, color);
  }

  public Map<String, Serializable> getDefines() {
    return defines;
  }
  public void setDefines(Map<String, Serializable> defines){
    this.defines = defines;
    sendUpdate(DEFINES, defines);
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

  public String getEmissive() {
    return emissive;
  }
  public void setEmissive(String emissive){
    this.emissive = emissive;
    sendUpdate(EMISSIVE, emissive);
  }

  public double getEmissiveIntensity() {
    return emissiveIntensity;
  }
  public void setEmissiveIntensity(double emissiveIntensity){
    this.emissiveIntensity = emissiveIntensity;
    sendUpdate(EMISSIVEINTENSITY, emissiveIntensity);
  }

  public Texture getEmissiveMap() {
    return emissiveMap;
  }
  public void setEmissiveMap(Texture emissiveMap){
    this.emissiveMap = emissiveMap;
    sendUpdate(EMISSIVEMAP, emissiveMap == null ? null : "IPY_MODEL_"+emissiveMap.getComm().getCommId());
  }

  public CubeTexture getEnvMap() {
    return envMap;
  }
  public void setEnvMap(CubeTexture envMap){
    this.envMap = envMap;
    sendUpdate(ENVMAP, envMap == null ? null : "IPY_MODEL_"+envMap.getComm().getCommId());
  }

  public double getEnvMapIntensity() {
    return envMapIntensity;
  }
  public void setEnvMapIntensity(double envMapIntensity){
    this.envMapIntensity = envMapIntensity;
    sendUpdate(ENVMAPINTENSITY, envMapIntensity);
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

  public Texture getMap() {
    return map;
  }
  public void setMap(Texture map){
    this.map = map;
    sendUpdate(MAP, map == null ? null : "IPY_MODEL_"+map.getComm().getCommId());
  }

  public double getMetalness() {
    return metalness;
  }
  public void setMetalness(double metalness){
    this.metalness = metalness;
    sendUpdate(METALNESS, metalness);
  }

  public Texture getMetalnessMap() {
    return metalnessMap;
  }
  public void setMetalnessMap(Texture metalnessMap){
    this.metalnessMap = metalnessMap;
    sendUpdate(METALNESSMAP, metalnessMap == null ? null : "IPY_MODEL_"+metalnessMap.getComm().getCommId());
  }

  public boolean getMorphNormals() {
    return morphNormals;
  }
  public void setMorphNormals(boolean morphNormals){
    this.morphNormals = morphNormals;
    sendUpdate(MORPHNORMALS, morphNormals);
  }

  public boolean getMorphTargets() {
    return morphTargets;
  }
  public void setMorphTargets(boolean morphTargets){
    this.morphTargets = morphTargets;
    sendUpdate(MORPHTARGETS, morphTargets);
  }

  public Texture getNormalMap() {
    return normalMap;
  }
  public void setNormalMap(Texture normalMap){
    this.normalMap = normalMap;
    sendUpdate(NORMALMAP, normalMap == null ? null : "IPY_MODEL_"+normalMap.getComm().getCommId());
  }

  public List getNormalScale() {
    return normalScale;
  }
  public void setNormalScale(List normalScale){
    this.normalScale = normalScale;
    sendUpdate(NORMALSCALE, normalScale);
  }

  public double getRefractionRatio() {
    return refractionRatio;
  }
  public void setRefractionRatio(double refractionRatio){
    this.refractionRatio = refractionRatio;
    sendUpdate(REFRACTIONRATIO, refractionRatio);
  }

  public double getRoughness() {
    return roughness;
  }
  public void setRoughness(double roughness){
    this.roughness = roughness;
    sendUpdate(ROUGHNESS, roughness);
  }

  public Texture getRoughnessMap() {
    return roughnessMap;
  }
  public void setRoughnessMap(Texture roughnessMap){
    this.roughnessMap = roughnessMap;
    sendUpdate(ROUGHNESSMAP, roughnessMap == null ? null : "IPY_MODEL_"+roughnessMap.getComm().getCommId());
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
