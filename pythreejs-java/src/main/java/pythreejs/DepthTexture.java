
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class DepthTexture extends Texture {

  public static final String MODEL_NAME_VALUE = "DepthTextureModel";
  public static final String FLIPY = "flipY";
  public static final String FORMAT = "format";
  public static final String GENERATEMIPMAPS = "generateMipmaps";
  public static final String HEIGHT = "height";
  public static final String MAGFILTER = "magFilter";
  public static final String MINFILTER = "minFilter";
  public static final String TYPE = "type";
  public static final String WIDTH = "width";

  private boolean flipY;
  private Object format = "DepthFormat";
  private boolean generateMipmaps;
  private int height;
  private Object magFilter = "NearestFilter";
  private Object minFilter = "NearestFilter";
  private Object type = "UnsignedShortType";
  private int width;

  public DepthTexture() {
    super();
    openComm();
  }

    public DepthTexture(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.flipY = (boolean) parameters.getOrDefault(FLIPY, (Serializable) this.flipY);
      this.format = (Object) parameters.getOrDefault(FORMAT, (Serializable) this.format);
      this.generateMipmaps = (boolean) parameters.getOrDefault(GENERATEMIPMAPS, (Serializable) this.generateMipmaps);
      this.height = (int) parameters.getOrDefault(HEIGHT, (Serializable) this.height);
      this.magFilter = (Object) parameters.getOrDefault(MAGFILTER, (Serializable) this.magFilter);
      this.minFilter = (Object) parameters.getOrDefault(MINFILTER, (Serializable) this.minFilter);
      this.type = (Object) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.width = (int) parameters.getOrDefault(WIDTH, (Serializable) this.width);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(FLIPY, (Serializable) flipY);
    content.put(FORMAT, (Serializable) format);
    content.put(GENERATEMIPMAPS, (Serializable) generateMipmaps);
    content.put(HEIGHT, (Serializable) height);
    content.put(MAGFILTER, (Serializable) magFilter);
    content.put(MINFILTER, (Serializable) minFilter);
    content.put(TYPE, (Serializable) type);
    content.put(WIDTH, (Serializable) width);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
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

  public int getHeight() {
    return height;
  }
  public void setHeight(int height){
    this.height = height;
    sendUpdate(HEIGHT, height);
  }

  public Object getMagFilter() {
    return magFilter;
  }
  public void setMagFilter(Object magFilter){
    this.magFilter = magFilter;
    sendUpdate(MAGFILTER, magFilter);
  }

  public Object getMinFilter() {
    return minFilter;
  }
  public void setMinFilter(Object minFilter){
    this.minFilter = minFilter;
    sendUpdate(MINFILTER, minFilter);
  }

  public Object getType() {
    return type;
  }
  public void setType(Object type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public int getWidth() {
    return width;
  }
  public void setWidth(int width){
    this.width = width;
    sendUpdate(WIDTH, width);
  }

}
