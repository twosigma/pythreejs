
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class BaseDataTexture extends Texture {

  public static final String MODEL_NAME_VALUE = "DataTextureModel";
  public static final String DATA = "data";
  public static final String FLIPY = "flipY";
  public static final String GENERATEMIPMAPS = "generateMipmaps";
  public static final String MAGFILTER = "magFilter";
  public static final String MINFILTER = "minFilter";

  private Object data;
  private boolean flipY;
  private boolean generateMipmaps;
  private Object magFilter = "NearestFilter";
  private Object minFilter = "NearestFilter";

  public BaseDataTexture() {
    super();
    openComm();
  }

    public BaseDataTexture(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.data = (Object) parameters.getOrDefault(DATA, (Serializable) this.data);
      this.flipY = (boolean) parameters.getOrDefault(FLIPY, (Serializable) this.flipY);
      this.generateMipmaps = (boolean) parameters.getOrDefault(GENERATEMIPMAPS, (Serializable) this.generateMipmaps);
      this.magFilter = (Object) parameters.getOrDefault(MAGFILTER, (Serializable) this.magFilter);
      this.minFilter = (Object) parameters.getOrDefault(MINFILTER, (Serializable) this.minFilter);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DATA, (Serializable) data);
    content.put(FLIPY, (Serializable) flipY);
    content.put(GENERATEMIPMAPS, (Serializable) generateMipmaps);
    content.put(MAGFILTER, (Serializable) magFilter);
    content.put(MINFILTER, (Serializable) minFilter);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Object getData() {
    return data;
  }
  public void setData(Object data){
    this.data = data;
    sendUpdate(DATA, data);
  }

  public boolean getFlipY() {
    return flipY;
  }
  public void setFlipY(boolean flipY){
    this.flipY = flipY;
    sendUpdate(FLIPY, flipY);
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

  public Object getMinFilter() {
    return minFilter;
  }
  public void setMinFilter(Object minFilter){
    this.minFilter = minFilter;
    sendUpdate(MINFILTER, minFilter);
  }

}
