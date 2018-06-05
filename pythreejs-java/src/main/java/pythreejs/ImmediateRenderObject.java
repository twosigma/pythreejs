
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ImmediateRenderObject extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "ImmediateRenderObjectModel";


  public ImmediateRenderObject() {
    super();
    openComm();
  }

    public ImmediateRenderObject(LinkedHashMap<String, Serializable> parameters) {
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
