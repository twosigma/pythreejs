
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class CubeTexture extends Texture {

  public static final String MODEL_NAME_VALUE = "CubeTextureModel";
  public static final String IMAGES = "images";

  private List images = new ArrayList<>();

  public CubeTexture() {
    super();
    openComm();
  }

    public CubeTexture(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.images = (List) parameters.getOrDefault(IMAGES, (Serializable) this.images);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(IMAGES, (Serializable) images);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getImages() {
    return images;
  }
  public void setImages(List images){
    this.images = images;
    sendUpdate(IMAGES, images);
  }

}
