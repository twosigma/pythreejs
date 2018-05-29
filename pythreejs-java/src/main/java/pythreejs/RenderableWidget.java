package pythreejs;

import com.twosigma.beakerx.widget.DOMWidget;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class RenderableWidget extends DOMWidget {

    public static final String MODEL_MODULE_VALUE = "jupyter-threejs";
    public static final String VIEW_MODULE_VALUE = "jupyter-threejs";
    public static final String VIEW_MODULE_VERSION_VALUE = "~1.0.0";
    public static final String MODEL_MODULE_VERSION_VALUE = "~1.0.0";

    private static final String IPY_MODEL = "IPY_MODEL_";

    public static final String WIDTH = "_width";
    public static final String HEIGHT = "_height";
    public static final String ANTIALIAS = "_antialias";
    public static final String ALPHA = "_alpha";
    public static final String AUTOCLEAR = "autoClear";
    public static final String AUTOCLEARCOLOR = "autoClearColor";
    public static final String AUTOCLEARDEPTH = "autoClearDepth";
    public static final String AUTOCLEARSTENCIL = "autoClearStencil";
    private static final String CLIPPINGPLANES = "clippingPlanes";
    private static final String GAMMAFACTOR = "gammaFactor";
    private static final String GAMMAINPUT = "gammaInput";
    private static final String GAMMAOUTPUT = "gammaOutput";
    private static final String LOCALCLIPPINGENABLED = "localClippingEnabled";
    private static final String  MAXMORPHTARGETS = "maxMorphTargets";
    private static final String MAXMORPHNORMALS = "maxMorphNormals";
    private static final String PYHSICALLYCORRECTLIGHTS = "physicallyCorrectLights";
    private static final String SHADOWMAP = "shadowMap";
    private static final String SORTOBJECT = "sortObject";
    private static final String TONEMAPPING = "toneMapping";
    private static final String TONEMAPPINGEXPOSURE = "toneMappingExposure";
    private static final String TONEMAPPINGWHITEPOINT = "toneMappingWhitePoint";
    private static final String CLEARCOLOR = "clearColor";
    private static final String CLEAROPACITY = "clearOpacity";

    private Integer width = 200;
    private Integer height = 200;
    private boolean antialias = false;
    private boolean alpha = false;
    private boolean autoClear = true;
    private boolean autoClearColor = true;
    private boolean autoClearDepth = true;
    private boolean autoClearStencil = true;
    private ArrayList<Plane> clippingPlanes = new ArrayList();
    private double gammaFactor = 2.0;
    private boolean gammaInput = false;
    private boolean gammaOutput = false;
    private boolean localClippingEnabled = false;
    private Integer maxMorphTargets = 8;
    private Integer maxMorphNormals = 4;
    private boolean physicallyCorrectLights = false;
    private WebGlShadowMap shadowMap = new WebGlShadowMap();
    private boolean sortObject = true;
    private ToneMappings toneMapping = ToneMappings.LinearToneMapping;
    private double toneMappingExposure = 1.0;
    private double toneMappingWhitePoint = 1.0;
    private String clearColor = "#000000";
    private double clearOpacity = 1.0;

    @Override
    public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
        super.content(content);
        content.put(WIDTH, width);
        content.put(HEIGHT, height);
        content.put(ANTIALIAS, antialias);
        content.put(ALPHA, alpha);
        content.put(AUTOCLEAR, autoClear);
        content.put(AUTOCLEARCOLOR, autoClearColor);
        content.put(AUTOCLEARDEPTH, autoClearDepth);
        content.put(AUTOCLEARSTENCIL, autoClearStencil);
        content.put(CLIPPINGPLANES, clippingPlanes);
        content.put(GAMMAFACTOR, gammaFactor);
        content.put(GAMMAINPUT, gammaInput);
        content.put(GAMMAOUTPUT, gammaOutput);
        content.put(LOCALCLIPPINGENABLED, localClippingEnabled);
        content.put(MAXMORPHTARGETS, maxMorphTargets);
        content.put(MAXMORPHNORMALS, maxMorphNormals);
        content.put(PYHSICALLYCORRECTLIGHTS, physicallyCorrectLights);
        content.put(SHADOWMAP, IPY_MODEL + shadowMap.getComm().getCommId());
        content.put(SORTOBJECT, sortObject);
        content.put(TONEMAPPING, toneMapping);
        content.put(TONEMAPPINGEXPOSURE, toneMappingExposure);
        content.put(TONEMAPPINGWHITEPOINT, toneMappingWhitePoint);
        content.put(CLEARCOLOR, clippingPlanes);
        content.put(CLEAROPACITY, clearOpacity);
        return content;
    }

    @Override
    public String getModelModuleValue() {
        return MODEL_MODULE_VALUE;
    }

    @Override
    public String getViewModuleValue() {
        return VIEW_MODULE_VALUE;
    }

    @Override
    public String getModelModuleVersion() {
        return MODEL_MODULE_VERSION_VALUE;
    }

    @Override
    public String getViewModuleVersion() {
        return VIEW_MODULE_VERSION_VALUE;
    }

    @Override
    public void updateValue(Object o) {

    }

    @Override
    public String getModelNameValue() {
        return null;
    }

    @Override
    public String getViewNameValue() {
        return null;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
        super.sendUpdate(WIDTH, width);
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
        super.sendUpdate(HEIGHT, height);
    }

    public boolean getAntialias() {
        return antialias;
    }

    public void setAntialias(boolean antialias) {
        this.antialias = antialias;
        super.sendUpdate(ANTIALIAS, antialias);
    }

    public boolean getAlpha() {
        return alpha;
    }

    public void setAlpha(boolean alpha) {
        this.alpha = alpha;
        super.sendUpdate(ALPHA, alpha);
    }

    public boolean getAutoClear() {
        return autoClear;
    }

    public void setAutoClear(boolean autoClear) {
        this.autoClear = autoClear;
        super.sendUpdate(AUTOCLEAR, autoClear);
    }

    public boolean getAutoClearColor() {
        return autoClearColor;
    }

    public void setAutoClearColor(boolean autoClearColor) {
        this.autoClearColor = autoClearColor;
        super.sendUpdate(AUTOCLEARCOLOR, autoClearColor);
    }

    public boolean getAutoClearDepth() {
        return autoClearDepth;
    }

    public void setAutoClearDepth(boolean autoClearDepth) {
        this.autoClearDepth = autoClearDepth;
        super.sendUpdate(AUTOCLEARDEPTH, autoClearDepth);
    }

    public boolean getAutoClearStencil() {
        return autoClearStencil;
    }

    public void setAutoClearStencil(boolean autoClearStencil) {
        this.autoClearStencil = autoClearStencil;
        super.sendUpdate(AUTOCLEARSTENCIL, autoClearStencil);
    }

    public ArrayList<Plane> getClippingPlanes() {
        return clippingPlanes;
    }

    public void setClippingPlanes(ArrayList<Plane> clippingPlanes) {
        this.clippingPlanes = clippingPlanes;
        super.sendUpdate(CLIPPINGPLANES, clippingPlanes);
    }

    public double getGammaFactor() {
        return gammaFactor;
    }

    public void setGammaFactor(double gammaFactor) {
        this.gammaFactor = gammaFactor;
        super.sendUpdate(GAMMAFACTOR, gammaFactor);
    }

    public boolean getGammaInput() {
        return gammaInput;
    }

    public void setGammaInput(boolean gammaInput) {
        this.gammaInput = gammaInput;
        super.sendUpdate(GAMMAINPUT, gammaInput);
    }

    public boolean getGammaOutput() {
        return gammaOutput;
    }

    public void setGammaOutput(boolean gammaOutput) {
        this.gammaOutput = gammaOutput;
        super.sendUpdate(GAMMAOUTPUT, gammaOutput);
    }

    public boolean getLocalClippingEnabled() {
        return localClippingEnabled;
    }

    public void setLocalClippingEnabled(boolean localClippingEnabled) {
        this.localClippingEnabled = localClippingEnabled;
        super.sendUpdate(LOCALCLIPPINGENABLED, localClippingEnabled);
    }

    public Integer getMaxMorphTargets() {
        return maxMorphTargets;
    }

    public void setMaxMorphTargets(Integer maxMorphTargets) {
        this.maxMorphTargets = maxMorphTargets;
        super.sendUpdate(MAXMORPHTARGETS, maxMorphTargets);
    }

    public Integer getMaxMorphNormals() {
        return maxMorphNormals;
    }

    public void setMaxMorphNormals(Integer maxMorphNormals) {
        this.maxMorphNormals = maxMorphNormals;
        super.sendUpdate(MAXMORPHNORMALS, maxMorphNormals);
    }

    public boolean getPhysicallyCorrectLights() {
        return physicallyCorrectLights;
    }

    public void setPhysicallyCorrectLights(boolean physicallyCorrectLights) {
        this.physicallyCorrectLights = physicallyCorrectLights;
        super.sendUpdate(PYHSICALLYCORRECTLIGHTS, physicallyCorrectLights);
    }

    public WebGlShadowMap getShadowMap() {
        return shadowMap;
    }

    public void setShadowMap(WebGlShadowMap shadowMap) {
        this.shadowMap = shadowMap;
        super.sendUpdate(SHADOWMAP, IPY_MODEL + shadowMap.getComm().getCommId());
    }

    public boolean getSortObject() {
        return sortObject;
    }

    public void setSortObject(boolean sortObject) {
        this.sortObject = sortObject;
        super.sendUpdate(SORTOBJECT, sortObject);
    }

    public ToneMappings getToneMapping() {
        return toneMapping;
    }

    public void setToneMapping(ToneMappings toneMapping) {
        this.toneMapping = toneMapping;
        super.sendUpdate(TONEMAPPING, toneMapping);
    }

    public double getToneMappingExposure() {
        return toneMappingExposure;
    }

    public void setToneMappingExposure(double toneMappingExposure) {
        this.toneMappingExposure = toneMappingExposure;
        super.sendUpdate(TONEMAPPINGEXPOSURE, toneMappingExposure);
    }

    public double getToneMappingWhitePoint() {
        return toneMappingWhitePoint;
    }

    public void setToneMappingWhitePoint(double toneMappingWhitePoint) {
        this.toneMappingWhitePoint = toneMappingWhitePoint;
        super.sendUpdate(TONEMAPPINGWHITEPOINT, toneMappingWhitePoint);
    }

    public String getClearColor() {
        return clearColor;
    }

    public void setClearColor(String clearColor) {
        this.clearColor = clearColor;
        super.sendUpdate(CLEARCOLOR, clearColor);
    }

    public double getClearOpacity() {
        return clearOpacity;
    }

    public void setClearOpacity(double clearOpacity) {
        this.clearOpacity = clearOpacity;
        super.sendUpdate(CLEAROPACITY, clearOpacity);
    }
}