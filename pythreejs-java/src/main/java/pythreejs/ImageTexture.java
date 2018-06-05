
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ImageTexture extends Texture {

  public static final String MODEL_NAME_VALUE = "ImageTextureModel";
  public static final String IMAGEURI = "imageUri";

  private String imageUri;

  public ImageTexture() {
    super();
    openComm();
  }

    public ImageTexture(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.imageUri = (String) parameters.getOrDefault(IMAGEURI, (Serializable) this.imageUri);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(IMAGEURI, (Serializable) imageUri);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getImageUri() {
    return imageUri;
  }
  public void setImageUri(String imageUri){
    this.imageUri = imageUri;
    sendUpdate(IMAGEURI, imageUri);
  }

}
