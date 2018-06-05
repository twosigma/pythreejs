
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class MaterialAutogen extends ThreeWidget {

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

  private double alphaTest = 0;
  private Object blendDst = "OneMinusSrcAlphaFactor";
  private double blendDstAlpha = 0;
  private Object blendEquation = "AddEquation";
  private double blendEquationAlpha = 0;
  private Object blendSrc = "SrcAlphaFactor";
  private double blendSrcAlpha = 0;
  private Object blending = "NormalBlending";
  private boolean clipIntersection;
  private boolean clipShadows;
  private List clippingPlanes = Arrays.asList();
  private boolean colorWrite = true;
  private Map<String, Serializable> defines;
  private Object depthFunc = "LessEqualDepth";
  private boolean depthTest = true;
  private boolean depthWrite = true;
  private boolean dithering;
  private boolean flatShading;
  private boolean fog = true;
  private boolean lights = true;
  private String name;
  private double opacity = 1;
  private double overdraw = 0;
  private boolean polygonOffset;
  private double polygonOffsetFactor = 0;
  private double polygonOffsetUnits = 0;
  private String precision;
  private boolean premultipliedAlpha;
  private Object shadowSide;
  private Object side = "FrontSide";
  private boolean transparent;
  private String type = "Material";
  private Object vertexColors = "NoColors";
  private boolean visible = true;

  public MaterialAutogen() {
    super();
  }

    public MaterialAutogen(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.alphaTest = (double) parameters.getOrDefault(ALPHATEST, (Serializable) this.alphaTest);
      this.blendDst = (Object) parameters.getOrDefault(BLENDDST, (Serializable) this.blendDst);
      this.blendDstAlpha = (double) parameters.getOrDefault(BLENDDSTALPHA, (Serializable) this.blendDstAlpha);
      this.blendEquation = (Object) parameters.getOrDefault(BLENDEQUATION, (Serializable) this.blendEquation);
      this.blendEquationAlpha = (double) parameters.getOrDefault(BLENDEQUATIONALPHA, (Serializable) this.blendEquationAlpha);
      this.blendSrc = (Object) parameters.getOrDefault(BLENDSRC, (Serializable) this.blendSrc);
      this.blendSrcAlpha = (double) parameters.getOrDefault(BLENDSRCALPHA, (Serializable) this.blendSrcAlpha);
      this.blending = (Object) parameters.getOrDefault(BLENDING, (Serializable) this.blending);
      this.clipIntersection = (boolean) parameters.getOrDefault(CLIPINTERSECTION, (Serializable) this.clipIntersection);
      this.clipShadows = (boolean) parameters.getOrDefault(CLIPSHADOWS, (Serializable) this.clipShadows);
      this.clippingPlanes = (List) parameters.getOrDefault(CLIPPINGPLANES, (Serializable) this.clippingPlanes);
      this.colorWrite = (boolean) parameters.getOrDefault(COLORWRITE, (Serializable) this.colorWrite);
      this.defines = (Map<String, Serializable>) parameters.getOrDefault(DEFINES, (Serializable) this.defines);
      this.depthFunc = (Object) parameters.getOrDefault(DEPTHFUNC, (Serializable) this.depthFunc);
      this.depthTest = (boolean) parameters.getOrDefault(DEPTHTEST, (Serializable) this.depthTest);
      this.depthWrite = (boolean) parameters.getOrDefault(DEPTHWRITE, (Serializable) this.depthWrite);
      this.dithering = (boolean) parameters.getOrDefault(DITHERING, (Serializable) this.dithering);
      this.flatShading = (boolean) parameters.getOrDefault(FLATSHADING, (Serializable) this.flatShading);
      this.fog = (boolean) parameters.getOrDefault(FOG, (Serializable) this.fog);
      this.lights = (boolean) parameters.getOrDefault(LIGHTS, (Serializable) this.lights);
      this.name = (String) parameters.getOrDefault(NAME, (Serializable) this.name);
      this.opacity = (double) parameters.getOrDefault(OPACITY, (Serializable) this.opacity);
      this.overdraw = (double) parameters.getOrDefault(OVERDRAW, (Serializable) this.overdraw);
      this.polygonOffset = (boolean) parameters.getOrDefault(POLYGONOFFSET, (Serializable) this.polygonOffset);
      this.polygonOffsetFactor = (double) parameters.getOrDefault(POLYGONOFFSETFACTOR, (Serializable) this.polygonOffsetFactor);
      this.polygonOffsetUnits = (double) parameters.getOrDefault(POLYGONOFFSETUNITS, (Serializable) this.polygonOffsetUnits);
      this.precision = (String) parameters.getOrDefault(PRECISION, (Serializable) this.precision);
      this.premultipliedAlpha = (boolean) parameters.getOrDefault(PREMULTIPLIEDALPHA, (Serializable) this.premultipliedAlpha);
      this.shadowSide = (Object) parameters.getOrDefault(SHADOWSIDE, (Serializable) this.shadowSide);
      this.side = (Object) parameters.getOrDefault(SIDE, (Serializable) this.side);
      this.transparent = (boolean) parameters.getOrDefault(TRANSPARENT, (Serializable) this.transparent);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.vertexColors = (Object) parameters.getOrDefault(VERTEXCOLORS, (Serializable) this.vertexColors);
      this.visible = (boolean) parameters.getOrDefault(VISIBLE, (Serializable) this.visible);
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ALPHATEST, (Serializable) alphaTest);
    content.put(BLENDDST, (Serializable) blendDst);
    content.put(BLENDDSTALPHA, (Serializable) blendDstAlpha);
    content.put(BLENDEQUATION, (Serializable) blendEquation);
    content.put(BLENDEQUATIONALPHA, (Serializable) blendEquationAlpha);
    content.put(BLENDSRC, (Serializable) blendSrc);
    content.put(BLENDSRCALPHA, (Serializable) blendSrcAlpha);
    content.put(BLENDING, (Serializable) blending);
    content.put(CLIPINTERSECTION, (Serializable) clipIntersection);
    content.put(CLIPSHADOWS, (Serializable) clipShadows);
    content.put(CLIPPINGPLANES, (Serializable) clippingPlanes);
    content.put(COLORWRITE, (Serializable) colorWrite);
    content.put(DEFINES, (Serializable) defines);
    content.put(DEPTHFUNC, (Serializable) depthFunc);
    content.put(DEPTHTEST, (Serializable) depthTest);
    content.put(DEPTHWRITE, (Serializable) depthWrite);
    content.put(DITHERING, (Serializable) dithering);
    content.put(FLATSHADING, (Serializable) flatShading);
    content.put(FOG, (Serializable) fog);
    content.put(LIGHTS, (Serializable) lights);
    content.put(NAME, (Serializable) name);
    content.put(OPACITY, (Serializable) opacity);
    content.put(OVERDRAW, (Serializable) overdraw);
    content.put(POLYGONOFFSET, (Serializable) polygonOffset);
    content.put(POLYGONOFFSETFACTOR, (Serializable) polygonOffsetFactor);
    content.put(POLYGONOFFSETUNITS, (Serializable) polygonOffsetUnits);
    content.put(PRECISION, (Serializable) precision);
    content.put(PREMULTIPLIEDALPHA, (Serializable) premultipliedAlpha);
    content.put(SHADOWSIDE, (Serializable) shadowSide);
    content.put(SIDE, (Serializable) side);
    content.put(TRANSPARENT, (Serializable) transparent);
    content.put(TYPE, (Serializable) type);
    content.put(VERTEXCOLORS, (Serializable) vertexColors);
    content.put(VISIBLE, (Serializable) visible);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getAlphaTest() {
    return alphaTest;
  }
  public void setAlphaTest(double alphaTest){
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

  public double getBlendDstAlpha() {
    return blendDstAlpha;
  }
  public void setBlendDstAlpha(double blendDstAlpha){
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

  public double getBlendEquationAlpha() {
    return blendEquationAlpha;
  }
  public void setBlendEquationAlpha(double blendEquationAlpha){
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

  public double getBlendSrcAlpha() {
    return blendSrcAlpha;
  }
  public void setBlendSrcAlpha(double blendSrcAlpha){
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

  public boolean getClipIntersection() {
    return clipIntersection;
  }
  public void setClipIntersection(boolean clipIntersection){
    this.clipIntersection = clipIntersection;
    sendUpdate(CLIPINTERSECTION, clipIntersection);
  }

  public boolean getClipShadows() {
    return clipShadows;
  }
  public void setClipShadows(boolean clipShadows){
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

  public boolean getColorWrite() {
    return colorWrite;
  }
  public void setColorWrite(boolean colorWrite){
    this.colorWrite = colorWrite;
    sendUpdate(COLORWRITE, colorWrite);
  }

  public Map<String, Serializable> getDefines() {
    return defines;
  }
  public void setDefines(Map<String, Serializable> defines){
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

  public boolean getDepthTest() {
    return depthTest;
  }
  public void setDepthTest(boolean depthTest){
    this.depthTest = depthTest;
    sendUpdate(DEPTHTEST, depthTest);
  }

  public boolean getDepthWrite() {
    return depthWrite;
  }
  public void setDepthWrite(boolean depthWrite){
    this.depthWrite = depthWrite;
    sendUpdate(DEPTHWRITE, depthWrite);
  }

  public boolean getDithering() {
    return dithering;
  }
  public void setDithering(boolean dithering){
    this.dithering = dithering;
    sendUpdate(DITHERING, dithering);
  }

  public boolean getFlatShading() {
    return flatShading;
  }
  public void setFlatShading(boolean flatShading){
    this.flatShading = flatShading;
    sendUpdate(FLATSHADING, flatShading);
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

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public double getOpacity() {
    return opacity;
  }
  public void setOpacity(double opacity){
    this.opacity = opacity;
    sendUpdate(OPACITY, opacity);
  }

  public double getOverdraw() {
    return overdraw;
  }
  public void setOverdraw(double overdraw){
    this.overdraw = overdraw;
    sendUpdate(OVERDRAW, overdraw);
  }

  public boolean getPolygonOffset() {
    return polygonOffset;
  }
  public void setPolygonOffset(boolean polygonOffset){
    this.polygonOffset = polygonOffset;
    sendUpdate(POLYGONOFFSET, polygonOffset);
  }

  public double getPolygonOffsetFactor() {
    return polygonOffsetFactor;
  }
  public void setPolygonOffsetFactor(double polygonOffsetFactor){
    this.polygonOffsetFactor = polygonOffsetFactor;
    sendUpdate(POLYGONOFFSETFACTOR, polygonOffsetFactor);
  }

  public double getPolygonOffsetUnits() {
    return polygonOffsetUnits;
  }
  public void setPolygonOffsetUnits(double polygonOffsetUnits){
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

  public boolean getPremultipliedAlpha() {
    return premultipliedAlpha;
  }
  public void setPremultipliedAlpha(boolean premultipliedAlpha){
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

  public Object getVertexColors() {
    return vertexColors;
  }
  public void setVertexColors(Object vertexColors){
    this.vertexColors = vertexColors;
    sendUpdate(VERTEXCOLORS, vertexColors);
  }

  public boolean getVisible() {
    return visible;
  }
  public void setVisible(boolean visible){
    this.visible = visible;
    sendUpdate(VISIBLE, visible);
  }

}
