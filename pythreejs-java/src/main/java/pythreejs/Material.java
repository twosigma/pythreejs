package pythreejs;


import java.util.*;

public abstract class Material extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "MaterialModel";
  public static final String ALPHATEST = "alphaTest";
  public static final String BLENDDST = "blendDst";
  public static final String BLENDDSTALPHA = "blendDstAlpha";
  public static final String BLENDEQUATION = "blendEquation";
  public static final String BLENDEQUATIONALPHA = "blendEquationAlpha";
  public static final String BLENDSRC = "blendSrc";
  public static final String BLENDSRCALPHA = "blendSrcAlpha";
  public static final String BLENDING = "blending";
  public static final String CLIPINTERSECTION = "clipIntersection";
  public static final String CLIPSHADOWS = "clipShadows";
  public static final String CLIPPINGPLANES = "clippingPlanes";
  public static final String COLORWRITE = "colorWrite";
  public static final String DEFINES = "defines";
  public static final String DEPTHFUNC = "depthFunc";
  public static final String DEPTHTEST = "depthTest";
  public static final String DEPTHWRITE = "depthWrite";
  public static final String DITHERING = "dithering";
  public static final String FLATSHADING = "flatShading";
  public static final String FOG = "fog";
  public static final String LIGHTS = "lights";
  public static final String NAME = "name";
  public static final String OPACITY = "opacity";
  public static final String OVERDRAW = "overdraw";
  public static final String POLYGONOFFSET = "polygonOffset";
  public static final String POLYGONOFFSETFACTOR = "polygonOffsetFactor";
  public static final String POLYGONOFFSETUNITS = "polygonOffsetUnits";
  public static final String PRECISION = "precision";
  public static final String PREMULTIPLIEDALPHA = "premultipliedAlpha";
  public static final String SHADOWSIDE = "shadowSide";
  public static final String SIDE = "side";
  public static final String TRANSPARENT = "transparent";
  public static final String TYPE = "type";
  public static final String VERTEXCOLORS = "vertexColors";
  public static final String VISIBLE = "visible";

  private Double alphaTest = null;;
  private Object blendDst = "OneMinusSrcAlphaFactor";
  private Double blendDstAlpha = null;;
  private Object blendEquation = "AddEquation";
  private Double blendEquationAlpha = null;;
  private Object blendSrc = "SrcAlphaFactor";
  private Double blendSrcAlpha = null;;
  private Object blending = "NormalBlending";
  private Boolean clipIntersection = null;
  private Boolean clipShadows = null;
  private List clippingPlanes = new ArrayList<>();
  private Boolean colorWrite = true;
  private Object defines = null;
  private Object depthFunc = "LessEqualDepth";
  private Boolean depthTest = true;
  private Boolean depthWrite = true;
  private Boolean dithering = null;
  private Boolean flatShading = null;
  private Boolean fog = true;
  private Boolean lights = true;
  private String name = null;
  private Double opacity = null;;
  private Double overdraw = null;;
  private Boolean polygonOffset = null;
  private Double polygonOffsetFactor = null;;
  private Double polygonOffsetUnits = null;;
  private String precision = null;
  private Boolean premultipliedAlpha = null;
  private Object shadowSide = null;
  private Object side = "FrontSide";
  private Boolean transparent = null;
  private String type = "Material";
  private Object vertexColors = "NoColors";
  private Boolean visible = true;

  public Material() {
    super();
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Double getAlphaTest() {
    return alphaTest;
  }
  public void setAlphaTest(Double alphaTest){
    this.alphaTest = alphaTest;
    sendUpdate(ALPHATEST, alphaTest);
  }

  public Object getBlendDst() {
    return blendDst;
  }
  public void setBlendDst(Object blendDst){
    this.blendDst = blendDst;
    sendUpdate(BLENDDST, blendDst);
  }

  public Double getBlendDstAlpha() {
    return blendDstAlpha;
  }
  public void setBlendDstAlpha(Double blendDstAlpha){
    this.blendDstAlpha = blendDstAlpha;
    sendUpdate(BLENDDSTALPHA, blendDstAlpha);
  }

  public Object getBlendEquation() {
    return blendEquation;
  }
  public void setBlendEquation(Object blendEquation){
    this.blendEquation = blendEquation;
    sendUpdate(BLENDEQUATION, blendEquation);
  }

  public Double getBlendEquationAlpha() {
    return blendEquationAlpha;
  }
  public void setBlendEquationAlpha(Double blendEquationAlpha){
    this.blendEquationAlpha = blendEquationAlpha;
    sendUpdate(BLENDEQUATIONALPHA, blendEquationAlpha);
  }

  public Object getBlendSrc() {
    return blendSrc;
  }
  public void setBlendSrc(Object blendSrc){
    this.blendSrc = blendSrc;
    sendUpdate(BLENDSRC, blendSrc);
  }

  public Double getBlendSrcAlpha() {
    return blendSrcAlpha;
  }
  public void setBlendSrcAlpha(Double blendSrcAlpha){
    this.blendSrcAlpha = blendSrcAlpha;
    sendUpdate(BLENDSRCALPHA, blendSrcAlpha);
  }

  public Object getBlending() {
    return blending;
  }
  public void setBlending(Object blending){
    this.blending = blending;
    sendUpdate(BLENDING, blending);
  }

  public Boolean getClipIntersection() {
    return clipIntersection;
  }
  public void setClipIntersection(Boolean clipIntersection){
    this.clipIntersection = clipIntersection;
    sendUpdate(CLIPINTERSECTION, clipIntersection);
  }

  public Boolean getClipShadows() {
    return clipShadows;
  }
  public void setClipShadows(Boolean clipShadows){
    this.clipShadows = clipShadows;
    sendUpdate(CLIPSHADOWS, clipShadows);
  }

  public List getClippingPlanes() {
    return clippingPlanes;
  }
  public void setClippingPlanes(List clippingPlanes){
    this.clippingPlanes = clippingPlanes;
    sendUpdate(CLIPPINGPLANES, clippingPlanes);
  }

  public Boolean getColorWrite() {
    return colorWrite;
  }
  public void setColorWrite(Boolean colorWrite){
    this.colorWrite = colorWrite;
    sendUpdate(COLORWRITE, colorWrite);
  }

  public Object getDefines() {
    return defines;
  }
  public void setDefines(Object defines){
    this.defines = defines;
    sendUpdate(DEFINES, defines);
  }

  public Object getDepthFunc() {
    return depthFunc;
  }
  public void setDepthFunc(Object depthFunc){
    this.depthFunc = depthFunc;
    sendUpdate(DEPTHFUNC, depthFunc);
  }

  public Boolean getDepthTest() {
    return depthTest;
  }
  public void setDepthTest(Boolean depthTest){
    this.depthTest = depthTest;
    sendUpdate(DEPTHTEST, depthTest);
  }

  public Boolean getDepthWrite() {
    return depthWrite;
  }
  public void setDepthWrite(Boolean depthWrite){
    this.depthWrite = depthWrite;
    sendUpdate(DEPTHWRITE, depthWrite);
  }

  public Boolean getDithering() {
    return dithering;
  }
  public void setDithering(Boolean dithering){
    this.dithering = dithering;
    sendUpdate(DITHERING, dithering);
  }

  public Boolean getFlatShading() {
    return flatShading;
  }
  public void setFlatShading(Boolean flatShading){
    this.flatShading = flatShading;
    sendUpdate(FLATSHADING, flatShading);
  }

  public Boolean getFog() {
    return fog;
  }
  public void setFog(Boolean fog){
    this.fog = fog;
    sendUpdate(FOG, fog);
  }

  public Boolean getLights() {
    return lights;
  }
  public void setLights(Boolean lights){
    this.lights = lights;
    sendUpdate(LIGHTS, lights);
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public Double getOpacity() {
    return opacity;
  }
  public void setOpacity(Double opacity){
    this.opacity = opacity;
    sendUpdate(OPACITY, opacity);
  }

  public Double getOverdraw() {
    return overdraw;
  }
  public void setOverdraw(Double overdraw){
    this.overdraw = overdraw;
    sendUpdate(OVERDRAW, overdraw);
  }

  public Boolean getPolygonOffset() {
    return polygonOffset;
  }
  public void setPolygonOffset(Boolean polygonOffset){
    this.polygonOffset = polygonOffset;
    sendUpdate(POLYGONOFFSET, polygonOffset);
  }

  public Double getPolygonOffsetFactor() {
    return polygonOffsetFactor;
  }
  public void setPolygonOffsetFactor(Double polygonOffsetFactor){
    this.polygonOffsetFactor = polygonOffsetFactor;
    sendUpdate(POLYGONOFFSETFACTOR, polygonOffsetFactor);
  }

  public Double getPolygonOffsetUnits() {
    return polygonOffsetUnits;
  }
  public void setPolygonOffsetUnits(Double polygonOffsetUnits){
    this.polygonOffsetUnits = polygonOffsetUnits;
    sendUpdate(POLYGONOFFSETUNITS, polygonOffsetUnits);
  }

  public String getPrecision() {
    return precision;
  }
  public void setPrecision(String precision){
    this.precision = precision;
    sendUpdate(PRECISION, precision);
  }

  public Boolean getPremultipliedAlpha() {
    return premultipliedAlpha;
  }
  public void setPremultipliedAlpha(Boolean premultipliedAlpha){
    this.premultipliedAlpha = premultipliedAlpha;
    sendUpdate(PREMULTIPLIEDALPHA, premultipliedAlpha);
  }

  public Object getShadowSide() {
    return shadowSide;
  }
  public void setShadowSide(Object shadowSide){
    this.shadowSide = shadowSide;
    sendUpdate(SHADOWSIDE, shadowSide);
  }

  public Object getSide() {
    return side;
  }
  public void setSide(Object side){
    this.side = side;
    sendUpdate(SIDE, side);
  }

  public Boolean getTransparent() {
    return transparent;
  }
  public void setTransparent(Boolean transparent){
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

  public Object getVertexColors() {
    return vertexColors;
  }
  public void setVertexColors(Object vertexColors){
    this.vertexColors = vertexColors;
    sendUpdate(VERTEXCOLORS, vertexColors);
  }

  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible){
    this.visible = visible;
    sendUpdate(VISIBLE, visible);
  }

}
