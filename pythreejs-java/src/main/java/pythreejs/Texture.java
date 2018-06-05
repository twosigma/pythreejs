
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Texture extends ThreeWidget {

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

  private double anisotropy = 1;
  private Object encoding = "LinearEncoding";
  private boolean flipY = true;
  private Object format = "RGBAFormat";
  private boolean generateMipmaps = true;
  private Object magFilter = "LinearFilter";
  private Object mapping = "UVMapping";
  private Object minFilter = "LinearMipMapLinearFilter";
  private String name;
  private List offset = Arrays.asList(0, 0);
  private boolean premultiplyAlpha;
  private List repeat = Arrays.asList(1, 1);
  private double rotation = 0;
  private Object type = "UnsignedByteType";
  private int unpackAlignment = 4;
  private int version;
  private Object wrapS = "ClampToEdgeWrapping";
  private Object wrapT = "ClampToEdgeWrapping";

  public Texture() {
    super();
    openComm();
  }

    public Texture(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.anisotropy = (double) parameters.getOrDefault(ANISOTROPY, (Serializable) this.anisotropy);
      this.encoding = (Object) parameters.getOrDefault(ENCODING, (Serializable) this.encoding);
      this.flipY = (boolean) parameters.getOrDefault(FLIPY, (Serializable) this.flipY);
      this.format = (Object) parameters.getOrDefault(FORMAT, (Serializable) this.format);
      this.generateMipmaps = (boolean) parameters.getOrDefault(GENERATEMIPMAPS, (Serializable) this.generateMipmaps);
      this.magFilter = (Object) parameters.getOrDefault(MAGFILTER, (Serializable) this.magFilter);
      this.mapping = (Object) parameters.getOrDefault(MAPPING, (Serializable) this.mapping);
      this.minFilter = (Object) parameters.getOrDefault(MINFILTER, (Serializable) this.minFilter);
      this.name = (String) parameters.getOrDefault(NAME, (Serializable) this.name);
      this.offset = (List) parameters.getOrDefault(OFFSET, (Serializable) this.offset);
      this.premultiplyAlpha = (boolean) parameters.getOrDefault(PREMULTIPLYALPHA, (Serializable) this.premultiplyAlpha);
      this.repeat = (List) parameters.getOrDefault(REPEAT, (Serializable) this.repeat);
      this.rotation = (double) parameters.getOrDefault(ROTATION, (Serializable) this.rotation);
      this.type = (Object) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.unpackAlignment = (int) parameters.getOrDefault(UNPACKALIGNMENT, (Serializable) this.unpackAlignment);
      this.version = (int) parameters.getOrDefault(VERSION, (Serializable) this.version);
      this.wrapS = (Object) parameters.getOrDefault(WRAPS, (Serializable) this.wrapS);
      this.wrapT = (Object) parameters.getOrDefault(WRAPT, (Serializable) this.wrapT);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ANISOTROPY, (Serializable) anisotropy);
    content.put(ENCODING, (Serializable) encoding);
    content.put(FLIPY, (Serializable) flipY);
    content.put(FORMAT, (Serializable) format);
    content.put(GENERATEMIPMAPS, (Serializable) generateMipmaps);
    content.put(MAGFILTER, (Serializable) magFilter);
    content.put(MAPPING, (Serializable) mapping);
    content.put(MINFILTER, (Serializable) minFilter);
    content.put(NAME, (Serializable) name);
    content.put(OFFSET, (Serializable) offset);
    content.put(PREMULTIPLYALPHA, (Serializable) premultiplyAlpha);
    content.put(REPEAT, (Serializable) repeat);
    content.put(ROTATION, (Serializable) rotation);
    content.put(TYPE, (Serializable) type);
    content.put(UNPACKALIGNMENT, (Serializable) unpackAlignment);
    content.put(VERSION, (Serializable) version);
    content.put(WRAPS, (Serializable) wrapS);
    content.put(WRAPT, (Serializable) wrapT);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getAnisotropy() {
    return anisotropy;
  }
  public void setAnisotropy(double anisotropy){
    this.anisotropy = anisotropy;
    sendUpdate(ANISOTROPY, anisotropy);
  }

  public Object getEncoding() {
    return encoding;
  }
  public void setEncoding(Object encoding){
    this.encoding = encoding;
    sendUpdate(ENCODING, encoding);
  }

  public boolean getFlipY() {
    return flipY;
  }
  public void setFlipY(boolean flipY){
    this.flipY = flipY;
    sendUpdate(FLIPY, flipY);
  }

  public Object getFormat() {
    return format;
  }
  public void setFormat(Object format){
    this.format = format;
    sendUpdate(FORMAT, format);
  }

  public boolean getGenerateMipmaps() {
    return generateMipmaps;
  }
  public void setGenerateMipmaps(boolean generateMipmaps){
    this.generateMipmaps = generateMipmaps;
    sendUpdate(GENERATEMIPMAPS, generateMipmaps);
  }

  public Object getMagFilter() {
    return magFilter;
  }
  public void setMagFilter(Object magFilter){
    this.magFilter = magFilter;
    sendUpdate(MAGFILTER, magFilter);
  }

  public Object getMapping() {
    return mapping;
  }
  public void setMapping(Object mapping){
    this.mapping = mapping;
    sendUpdate(MAPPING, mapping);
  }

  public Object getMinFilter() {
    return minFilter;
  }
  public void setMinFilter(Object minFilter){
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

  public boolean getPremultiplyAlpha() {
    return premultiplyAlpha;
  }
  public void setPremultiplyAlpha(boolean premultiplyAlpha){
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

  public double getRotation() {
    return rotation;
  }
  public void setRotation(double rotation){
    this.rotation = rotation;
    sendUpdate(ROTATION, rotation);
  }

  public Object getType() {
    return type;
  }
  public void setType(Object type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public int getUnpackAlignment() {
    return unpackAlignment;
  }
  public void setUnpackAlignment(int unpackAlignment){
    this.unpackAlignment = unpackAlignment;
    sendUpdate(UNPACKALIGNMENT, unpackAlignment);
  }

  public int getVersion() {
    return version;
  }
  public void setVersion(int version){
    this.version = version;
    sendUpdate(VERSION, version);
  }

  public Object getWrapS() {
    return wrapS;
  }
  public void setWrapS(Object wrapS){
    this.wrapS = wrapS;
    sendUpdate(WRAPS, wrapS);
  }

  public Object getWrapT() {
    return wrapT;
  }
  public void setWrapT(Object wrapT){
    this.wrapT = wrapT;
    sendUpdate(WRAPT, wrapT);
  }

}
