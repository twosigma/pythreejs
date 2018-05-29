package pythreejs;


import java.io.Serializable;
import java.util.*;

public abstract class Texture extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "TextureModel";
  public static final String ANISOTROPY = "anisotropy";
  public static final String ENCODING = "encoding";
  public static final String FLIPY = "flipY";
  public static final String FORMAT = "format";
  public static final String GENERATEMIPMAPS = "generateMipmaps";
  public static final String MAGFILTER = "magFilter";
  public static final String MAPPING = "mapping";
  public static final String MINFILTER = "minFilter";
  public static final String NAME = "name";
  public static final String OFFSET = "offset";
  public static final String PREMULTIPLYALPHA = "premultiplyAlpha";
  public static final String REPEAT = "repeat";
  public static final String ROTATION = "rotation";
  public static final String TYPE = "type";
  public static final String UNPACKALIGNMENT = "unpackAlignment";
  public static final String VERSION = "version";
  public static final String WRAPS = "wrapS";
  public static final String WRAPT = "wrapT";

  private Double anisotropy = null;;
  private String encoding = "LinearEncoding";
  private Boolean flipY = true;
  private String format = "RGBAFormat";
  private Boolean generateMipmaps = true;
  private String magFilter = "LinearFilter";
  private String mapping = "UVMapping";
  private String minFilter = "LinearMipMapLinearFilter";
  private String name = null;
  private List<Integer> offset = Arrays.asList(0, 0);
  private Boolean premultiplyAlpha = null;
  private List repeat = Arrays.asList(1, 1);
  private Double rotation = null;;
  private String type = "UnsignedByteType";
  private Integer unpackAlignment = null;;
  private Integer version = null;;
  private String wrapS = "ClampToEdgeWrapping";
  private String wrapT = "ClampToEdgeWrapping";

  public Texture() {
    super();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ANISOTROPY, anisotropy);
    content.put(ENCODING, encoding);
    content.put(FLIPY, flipY);
    content.put(FORMAT, format);
    content.put(GENERATEMIPMAPS, generateMipmaps);
    content.put(MAGFILTER, magFilter);
    content.put(MAPPING, mapping);
    content.put(MINFILTER, minFilter);
    content.put(NAME, name);
    content.put(OFFSET, (Serializable) offset);
    content.put(PREMULTIPLYALPHA, premultiplyAlpha);
    content.put(REPEAT, (Serializable) repeat);
    content.put(ROTATION, rotation);
    content.put(TYPE, true);
    content.put(UNPACKALIGNMENT, unpackAlignment);
    content.put(VERSION, version);
    content.put(WRAPS, wrapS);
    content.put(WRAPT, wrapT);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Double getAnisotropy() {
    return anisotropy;
  }
  public void setAnisotropy(Double anisotropy){
    this.anisotropy = anisotropy;
    sendUpdate(ANISOTROPY, anisotropy);
  }

  public String getEncoding() {
    return encoding;
  }
  public void setEncoding(String encoding){
    this.encoding = encoding;
    sendUpdate(ENCODING, encoding);
  }

  public Boolean getFlipY() {
    return flipY;
  }
  public void setFlipY(Boolean flipY){
    this.flipY = flipY;
    sendUpdate(FLIPY, flipY);
  }

  public String getFormat() {
    return format;
  }
  public void setFormat(String format){
    this.format = format;
    sendUpdate(FORMAT, format);
  }

  public Boolean getGenerateMipmaps() {
    return generateMipmaps;
  }
  public void setGenerateMipmaps(Boolean generateMipmaps){
    this.generateMipmaps = generateMipmaps;
    sendUpdate(GENERATEMIPMAPS, generateMipmaps);
  }

  public String getMagFilter() {
    return magFilter;
  }
  public void setMagFilter(String magFilter){
    this.magFilter = magFilter;
    sendUpdate(MAGFILTER, magFilter);
  }

  public String getMapping() {
    return mapping;
  }
  public void setMapping(String mapping){
    this.mapping = mapping;
    sendUpdate(MAPPING, mapping);
  }

  public String getMinFilter() {
    return minFilter;
  }
  public void setMinFilter(String minFilter){
    this.minFilter = minFilter;
    sendUpdate(MINFILTER, minFilter);
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public List getOffset() {
    return offset;
  }
  public void setOffset(List offset){
    this.offset = offset;
    sendUpdate(OFFSET, offset);
  }

  public Boolean getPremultiplyAlpha() {
    return premultiplyAlpha;
  }
  public void setPremultiplyAlpha(Boolean premultiplyAlpha){
    this.premultiplyAlpha = premultiplyAlpha;
    sendUpdate(PREMULTIPLYALPHA, premultiplyAlpha);
  }

  public List getRepeat() {
    return repeat;
  }
  public void setRepeat(List repeat){
    this.repeat = repeat;
    sendUpdate(REPEAT, repeat);
  }

  public Double getRotation() {
    return rotation;
  }
  public void setRotation(Double rotation){
    this.rotation = rotation;
    sendUpdate(ROTATION, rotation);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public Integer getUnpackAlignment() {
    return unpackAlignment;
  }
  public void setUnpackAlignment(Integer unpackAlignment){
    this.unpackAlignment = unpackAlignment;
    sendUpdate(UNPACKALIGNMENT, unpackAlignment);
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version){
    this.version = version;
    sendUpdate(VERSION, version);
  }

  public String getWrapS() {
    return wrapS;
  }
  public void setWrapS(String wrapS){
    this.wrapS = wrapS;
    sendUpdate(WRAPS, wrapS);
  }

  public String getWrapT() {
    return wrapT;
  }
  public void setWrapT(String wrapT){
    this.wrapT = wrapT;
    sendUpdate(WRAPT, wrapT);
  }

}
