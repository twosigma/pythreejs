
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ImageBitmapLoader extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "ImageBitmapLoaderModel";


  public ImageBitmapLoader() {
    super();
    openComm();
  }

    public ImageBitmapLoader(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

}
