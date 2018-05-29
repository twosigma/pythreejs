package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

public class MeshLambertMaterial extends Material {

  public static final String MODEL_NAME_VALUE = "MeshLambertMaterialModel";
  public static final String ALPHAMAP = "alphaMap";
  public static final String AOMAP = "aoMap";
  public static final String AOMAPINTENSITY = "aoMapIntensity";
  public static final String COLOR = "color";
  public static final String COMBINE = "combine";
  public static final String EMISSIVE = "emissive";
  public static final String EMISSIVEINTENSITY = "emissiveIntensity";
  public static final String EMISSIVEMAP = "emissiveMap";
  public static final String ENVMAP = "envMap";
  public static final String LIGHTMAP = "lightMap";
  public static final String LIGHTMAPINTENSITY = "lightMapIntensity";
  public static final String MAP = "map";
  public static final String MORPHNORMALS = "morphNormals";
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

  private Serializable alphaMap = null;
  private Serializable aoMap = null;
  private Double aoMapIntensity = 1.0;;
  private String color = "#ffffff";
  private Serializable combine = "MultiplyOperation";
  private String emissive = "#000000";
  private Double emissiveIntensity = 1.0;;
  private Serializable emissiveMap = null;
  private Serializable envMap = new CubeTexture();
  private Serializable lightMap = null;
  private Double lightMapIntensity = 1.0;;
  private Serializable map = null;
  private Boolean morphNormals = false;
  private Boolean morphTargets = false;
  private Double reflectivity = 1.0;
  private Double refractionRatio = 0.98;
  private Boolean skinning = false;
  private Serializable specularMap = null;
  private String type = "MeshLambertMaterial";
  private Boolean wireframe = false;
  private String wireframeLinecap = "round";
  private String wireframeLinejoin = "round";
  private Double wireframeLinewidth = 1.0;;

  public MeshLambertMaterial() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ALPHAMAP, alphaMap);
    content.put(AOMAP, aoMap);
    content.put(AOMAPINTENSITY, aoMapIntensity);
    content.put(COLOR, color);
    content.put(COMBINE, combine);
    content.put(EMISSIVE, emissive);
    content.put(EMISSIVEMAP, emissiveMap);
    content.put(ENVMAP, envMap);
    content.put(LIGHTMAP, lightMap);
    content.put(LIGHTMAPINTENSITY, lightMapIntensity);
    content.put(MAP, map);
    content.put(MORPHNORMALS, morphNormals);
    content.put(MORPHTARGETS, morphTargets);
    content.put(REFLECTIVITY, reflectivity);
    content.put(REFRACTIONRATIO, refractionRatio);
    content.put(SKINNING, skinning);
    content.put(SPECULARMAP, specularMap);
    content.put(TYPE, type);
    content.put(WIREFRAME, wireframe);;
    content.put(WIREFRAMELINECAP, wireframeLinecap);
    content.put(WIREFRAMELINEJOIN, wireframeLinejoin);
    content.put(WIREFRAMELINEWIDTH, wireframeLinewidth);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  public Serializable getAlphaMap() {
    return alphaMap;
  }
  public void setAlphaMap(Serializable alphaMap){
    this.alphaMap = alphaMap;
    sendUpdate(ALPHAMAP, alphaMap);
  }

  public Serializable getAoMap() {
    return aoMap;
  }
  public void setAoMap(Serializable aoMap){
    this.aoMap = aoMap;
    sendUpdate(AOMAP, aoMap);
  }

  public Double getAoMapIntensity() {
    return aoMapIntensity;
  }
  public void setAoMapIntensity(Double aoMapIntensity){
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

  public Serializable getCombine() {
    return combine;
  }
  public void setCombine(Serializable combine){
    this.combine = combine;
    sendUpdate(COMBINE, combine);
  }

  public String getEmissive() {
    return emissive;
  }
  public void setEmissive(String emissive){
    this.emissive = emissive;
    sendUpdate(EMISSIVE, emissive);
  }

  public Double getEmissiveIntensity() {
    return emissiveIntensity;
  }
  public void setEmissiveIntensity(Double emissiveIntensity){
    this.emissiveIntensity = emissiveIntensity;
    sendUpdate(EMISSIVEINTENSITY, emissiveIntensity);
  }

  public Serializable getEmissiveMap() {
    return emissiveMap;
  }
  public void setEmissiveMap(Serializable emissiveMap){
    this.emissiveMap = emissiveMap;
    sendUpdate(EMISSIVEMAP, emissiveMap);
  }

  public Serializable getEnvMap() {
    return envMap;
  }
  public void setEnvMap(Serializable envMap){
    this.envMap = envMap;
    sendUpdate(ENVMAP, envMap);
  }

  public Serializable getLightMap() {
    return lightMap;
  }
  public void setLightMap(Serializable lightMap){
    this.lightMap = lightMap;
    sendUpdate(LIGHTMAP, lightMap);
  }

  public Double getLightMapIntensity() {
    return lightMapIntensity;
  }
  public void setLightMapIntensity(Double lightMapIntensity){
    this.lightMapIntensity = lightMapIntensity;
    sendUpdate(LIGHTMAPINTENSITY, lightMapIntensity);
  }

  public Serializable getMap() {
    return map;
  }
  public void setMap(Serializable map){
    this.map = map;
    sendUpdate(MAP, map);
  }

  public Boolean getMorphNormals() {
    return morphNormals;
  }
  public void setMorphNormals(Boolean morphNormals){
    this.morphNormals = morphNormals;
    sendUpdate(MORPHNORMALS, morphNormals);
  }

  public Boolean getMorphTargets() {
    return morphTargets;
  }
  public void setMorphTargets(Boolean morphTargets){
    this.morphTargets = morphTargets;
    sendUpdate(MORPHTARGETS, morphTargets);
  }

  public Double getReflectivity() {
    return reflectivity;
  }
  public void setReflectivity(Double reflectivity){
    this.reflectivity = reflectivity;
    sendUpdate(REFLECTIVITY, reflectivity);
  }

  public Double getRefractionRatio() {
    return refractionRatio;
  }
  public void setRefractionRatio(Double refractionRatio){
    this.refractionRatio = refractionRatio;
    sendUpdate(REFRACTIONRATIO, refractionRatio);
  }

  public Boolean getSkinning() {
    return skinning;
  }
  public void setSkinning(Boolean skinning){
    this.skinning = skinning;
    sendUpdate(SKINNING, skinning);
  }

  public Serializable getSpecularMap() {
    return specularMap;
  }
  public void setSpecularMap(Serializable specularMap){
    this.specularMap = specularMap;
    sendUpdate(SPECULARMAP, specularMap);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public Boolean getWireframe() {
    return wireframe;
  }
  public void setWireframe(Boolean wireframe){
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

  public Double getWireframeLinewidth() {
    return wireframeLinewidth;
  }
  public void setWireframeLinewidth(Double wireframeLinewidth){
    this.wireframeLinewidth = wireframeLinewidth;
    sendUpdate(WIREFRAMELINEWIDTH, wireframeLinewidth);
  }

}
