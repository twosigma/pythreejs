
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class WebGLObjects extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "WebGLObjectsModel";


  public WebGLObjects() {
    super();
    openComm();
  }

    public WebGLObjects(LinkedHashMap<String, Serializable> parameters) {
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
