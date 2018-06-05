
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class RenderableWidget extends DOMWidget {

  public static final String _ALPHA = "_alpha";
  public static final String _ANTIALIAS = "_antialias";
  public static final String _HEIGHT = "_height";
  public static final String MODEL_MODULE_VALUE = "jupyter-threejs";
  public static final String MODEL_MODULE_VERSION_VALUE = "~1.0.0";
  public static final String VIEW_MODULE_VALUE = "jupyter-threejs";
  public static final String VIEW_MODULE_VERSION_VALUE = "~1.0.0";
  public static final String _WIDTH = "_width";
  public static final String AUTOCLEAR = "autoClear";
  public static final String AUTOCLEARCOLOR = "autoClearColor";
  public static final String AUTOCLEARDEPTH = "autoClearDepth";
  public static final String AUTOCLEARSTENCIL = "autoClearStencil";
  public static final String CLEARCOLOR = "clearColor";
  public static final String CLEAROPACITY = "clearOpacity";
  public static final String CLIPPINGPLANES = "clippingPlanes";
  public static final String GAMMAFACTOR = "gammaFactor";
  public static final String GAMMAINPUT = "gammaInput";
  public static final String GAMMAOUTPUT = "gammaOutput";
  public static final String LOCALCLIPPINGENABLED = "localClippingEnabled";
  public static final String MAXMORPHNORMALS = "maxMorphNormals";
  public static final String MAXMORPHTARGETS = "maxMorphTargets";
  public static final String PHYSICALLYCORRECTLIGHTS = "physicallyCorrectLights";
  public static final String SHADOWMAP = "shadowMap";
  public static final String SORTOBJECT = "sortObject";
  public static final String TONEMAPPING = "toneMapping";
  public static final String TONEMAPPINGEXPOSURE = "toneMappingExposure";
  public static final String TONEMAPPINGWHITEPOINT = "toneMappingWhitePoint";

  private boolean alpha;
  private boolean antialias;
  private int height = 200;
  private int width = 200;
  private boolean autoClear = true;
  private boolean autoClearColor = true;
  private boolean autoClearDepth = true;
  private boolean autoClearStencil = true;
  private String clearColor = "#000000";
  private double clearOpacity = 1;
  private List clippingPlanes = Arrays.asList();
  private double gammaFactor = 2;
  private boolean gammaInput;
  private boolean gammaOutput;
  private boolean localClippingEnabled;
  private int maxMorphNormals = 4;
  private int maxMorphTargets = 8;
  private boolean physicallyCorrectLights;
  private WebGLShadowMap shadowMap = new WebGLShadowMap();
  private boolean sortObject = true;
  private Object toneMapping = "LinearToneMapping";
  private double toneMappingExposure = 1;
  private double toneMappingWhitePoint = 1;

  public RenderableWidget() {
    super();
  }

  public RenderableWidget(LinkedHashMap<String, Serializable> parameters) {
    this.alpha = (boolean) parameters.getOrDefault(_ALPHA, (Serializable) this.alpha);
    this.antialias = (boolean) parameters.getOrDefault(_ANTIALIAS, (Serializable) this.antialias);
    this.height = (int) parameters.getOrDefault(_HEIGHT, (Serializable) this.height);
    this.width = (int) parameters.getOrDefault(_WIDTH, (Serializable) this.width);
    this.autoClear = (boolean) parameters.getOrDefault(AUTOCLEAR, (Serializable) this.autoClear);
    this.autoClearColor = (boolean) parameters.getOrDefault(AUTOCLEARCOLOR, (Serializable) this.autoClearColor);
    this.autoClearDepth = (boolean) parameters.getOrDefault(AUTOCLEARDEPTH, (Serializable) this.autoClearDepth);
    this.autoClearStencil = (boolean) parameters.getOrDefault(AUTOCLEARSTENCIL, (Serializable) this.autoClearStencil);
    this.clearColor = (String) parameters.getOrDefault(CLEARCOLOR, (Serializable) this.clearColor);
    this.clearOpacity = (double) parameters.getOrDefault(CLEAROPACITY, (Serializable) this.clearOpacity);
    this.clippingPlanes = (List) parameters.getOrDefault(CLIPPINGPLANES, (Serializable) this.clippingPlanes);
    this.gammaFactor = (double) parameters.getOrDefault(GAMMAFACTOR, (Serializable) this.gammaFactor);
    this.gammaInput = (boolean) parameters.getOrDefault(GAMMAINPUT, (Serializable) this.gammaInput);
    this.gammaOutput = (boolean) parameters.getOrDefault(GAMMAOUTPUT, (Serializable) this.gammaOutput);
    this.localClippingEnabled = (boolean) parameters.getOrDefault(LOCALCLIPPINGENABLED, (Serializable) this.localClippingEnabled);
    this.maxMorphNormals = (int) parameters.getOrDefault(MAXMORPHNORMALS, (Serializable) this.maxMorphNormals);
    this.maxMorphTargets = (int) parameters.getOrDefault(MAXMORPHTARGETS, (Serializable) this.maxMorphTargets);
    this.physicallyCorrectLights = (boolean) parameters.getOrDefault(PHYSICALLYCORRECTLIGHTS, (Serializable) this.physicallyCorrectLights);
    this.shadowMap = (WebGLShadowMap) parameters.getOrDefault(SHADOWMAP, (Serializable) this.shadowMap);
    this.sortObject = (boolean) parameters.getOrDefault(SORTOBJECT, (Serializable) this.sortObject);
    this.toneMapping = (Object) parameters.getOrDefault(TONEMAPPING, (Serializable) this.toneMapping);
    this.toneMappingExposure = (double) parameters.getOrDefault(TONEMAPPINGEXPOSURE, (Serializable) this.toneMappingExposure);
    this.toneMappingWhitePoint = (double) parameters.getOrDefault(TONEMAPPINGWHITEPOINT, (Serializable) this.toneMappingWhitePoint);
  }


  @Override
  public String getModelNameValue() {
    return null;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  @Override
  public void updateValue(Object o) {

  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(_ALPHA, (Serializable) alpha);
    content.put(_ANTIALIAS, (Serializable) antialias);
    content.put(_HEIGHT, (Serializable) height);
    content.put(_WIDTH, (Serializable) width);
    content.put(AUTOCLEAR, (Serializable) autoClear);
    content.put(AUTOCLEARCOLOR, (Serializable) autoClearColor);
    content.put(AUTOCLEARDEPTH, (Serializable) autoClearDepth);
    content.put(AUTOCLEARSTENCIL, (Serializable) autoClearStencil);
    content.put(CLEARCOLOR, (Serializable) clearColor);
    content.put(CLEAROPACITY, (Serializable) clearOpacity);
    content.put(CLIPPINGPLANES, (Serializable) clippingPlanes);
    content.put(GAMMAFACTOR, (Serializable) gammaFactor);
    content.put(GAMMAINPUT, (Serializable) gammaInput);
    content.put(GAMMAOUTPUT, (Serializable) gammaOutput);
    content.put(LOCALCLIPPINGENABLED, (Serializable) localClippingEnabled);
    content.put(MAXMORPHNORMALS, (Serializable) maxMorphNormals);
    content.put(MAXMORPHTARGETS, (Serializable) maxMorphTargets);
    content.put(PHYSICALLYCORRECTLIGHTS, (Serializable) physicallyCorrectLights);
    content.put(SHADOWMAP, "IPY_MODEL_" + shadowMap.getComm().getCommId());
    content.put(SORTOBJECT, (Serializable) sortObject);
    content.put(TONEMAPPING, (Serializable) toneMapping);
    content.put(TONEMAPPINGEXPOSURE, (Serializable) toneMappingExposure);
    content.put(TONEMAPPINGWHITEPOINT, (Serializable) toneMappingWhitePoint);
    return content;
  }

  public boolean getAlpha() {
    return alpha;
  }
  public void setAlpha(boolean alpha){
    this.alpha = alpha;
    sendUpdate(_ALPHA, alpha);
  }

  public boolean getAntialias() {
    return antialias;
  }
  public void setAntialias(boolean antialias){
    this.antialias = antialias;
    sendUpdate(_ANTIALIAS, antialias);
  }

  public int getHeight() {
    return height;
  }
  public void setHeight(int height){
    this.height = height;
    sendUpdate(_HEIGHT, height);
  }

  public String getModelModuleValue(){
    return MODEL_MODULE_VALUE;
  }

  public String getModelModuleVersionValue(){
    return MODEL_MODULE_VERSION_VALUE;
  }

  public String getViewModuleValue(){
    return VIEW_MODULE_VALUE;
  }

  public String getViewModuleVersionValue(){
    return VIEW_MODULE_VERSION_VALUE;
  }

  public int getWidth() {
    return width;
  }
  public void setWidth(int width){
    this.width = width;
    sendUpdate(_WIDTH, width);
  }

  public boolean getAutoClear() {
    return autoClear;
  }
  public void setAutoClear(boolean autoClear){
    this.autoClear = autoClear;
    sendUpdate(AUTOCLEAR, autoClear);
  }

  public boolean getAutoClearColor() {
    return autoClearColor;
  }
  public void setAutoClearColor(boolean autoClearColor){
    this.autoClearColor = autoClearColor;
    sendUpdate(AUTOCLEARCOLOR, autoClearColor);
  }

  public boolean getAutoClearDepth() {
    return autoClearDepth;
  }
  public void setAutoClearDepth(boolean autoClearDepth){
    this.autoClearDepth = autoClearDepth;
    sendUpdate(AUTOCLEARDEPTH, autoClearDepth);
  }

  public boolean getAutoClearStencil() {
    return autoClearStencil;
  }
  public void setAutoClearStencil(boolean autoClearStencil){
    this.autoClearStencil = autoClearStencil;
    sendUpdate(AUTOCLEARSTENCIL, autoClearStencil);
  }

  public String getClearColor() {
    return clearColor;
  }
  public void setClearColor(String clearColor){
    this.clearColor = clearColor;
    sendUpdate(CLEARCOLOR, clearColor);
  }

  public double getClearOpacity() {
    return clearOpacity;
  }
  public void setClearOpacity(double clearOpacity){
    this.clearOpacity = clearOpacity;
    sendUpdate(CLEAROPACITY, clearOpacity);
  }

  public List getClippingPlanes() {
    return clippingPlanes;
  }
  public void setClippingPlanes(List clippingPlanes){
    this.clippingPlanes = clippingPlanes;
    sendUpdate(CLIPPINGPLANES, clippingPlanes);
  }

  public double getGammaFactor() {
    return gammaFactor;
  }
  public void setGammaFactor(double gammaFactor){
    this.gammaFactor = gammaFactor;
    sendUpdate(GAMMAFACTOR, gammaFactor);
  }

  public boolean getGammaInput() {
    return gammaInput;
  }
  public void setGammaInput(boolean gammaInput){
    this.gammaInput = gammaInput;
    sendUpdate(GAMMAINPUT, gammaInput);
  }

  public boolean getGammaOutput() {
    return gammaOutput;
  }
  public void setGammaOutput(boolean gammaOutput){
    this.gammaOutput = gammaOutput;
    sendUpdate(GAMMAOUTPUT, gammaOutput);
  }

  public boolean getLocalClippingEnabled() {
    return localClippingEnabled;
  }
  public void setLocalClippingEnabled(boolean localClippingEnabled){
    this.localClippingEnabled = localClippingEnabled;
    sendUpdate(LOCALCLIPPINGENABLED, localClippingEnabled);
  }

  public int getMaxMorphNormals() {
    return maxMorphNormals;
  }
  public void setMaxMorphNormals(int maxMorphNormals){
    this.maxMorphNormals = maxMorphNormals;
    sendUpdate(MAXMORPHNORMALS, maxMorphNormals);
  }

  public int getMaxMorphTargets() {
    return maxMorphTargets;
  }
  public void setMaxMorphTargets(int maxMorphTargets){
    this.maxMorphTargets = maxMorphTargets;
    sendUpdate(MAXMORPHTARGETS, maxMorphTargets);
  }

  public boolean getPhysicallyCorrectLights() {
    return physicallyCorrectLights;
  }
  public void setPhysicallyCorrectLights(boolean physicallyCorrectLights){
    this.physicallyCorrectLights = physicallyCorrectLights;
    sendUpdate(PHYSICALLYCORRECTLIGHTS, physicallyCorrectLights);
  }

  public WebGLShadowMap getShadowMap() {
    return shadowMap;
  }
  public void setShadowMap(WebGLShadowMap shadowMap){
    this.shadowMap = shadowMap;
    sendUpdate(SHADOWMAP, "IPY_MODEL_"+shadowMap.getComm().getCommId());
  }

  public boolean getSortObject() {
    return sortObject;
  }
  public void setSortObject(boolean sortObject){
    this.sortObject = sortObject;
    sendUpdate(SORTOBJECT, sortObject);
  }

  public Object getToneMapping() {
    return toneMapping;
  }
  public void setToneMapping(Object toneMapping){
    this.toneMapping = toneMapping;
    sendUpdate(TONEMAPPING, toneMapping);
  }

  public double getToneMappingExposure() {
    return toneMappingExposure;
  }
  public void setToneMappingExposure(double toneMappingExposure){
    this.toneMappingExposure = toneMappingExposure;
    sendUpdate(TONEMAPPINGEXPOSURE, toneMappingExposure);
  }

  public double getToneMappingWhitePoint() {
    return toneMappingWhitePoint;
  }
  public void setToneMappingWhitePoint(double toneMappingWhitePoint){
    this.toneMappingWhitePoint = toneMappingWhitePoint;
    sendUpdate(TONEMAPPINGWHITEPOINT, toneMappingWhitePoint);
  }

}
