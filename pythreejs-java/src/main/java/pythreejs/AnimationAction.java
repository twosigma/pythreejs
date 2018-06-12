
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class AnimationAction extends AnimationActionBase {

  public static final String VIEW_MODULE_VALUE = "jupyter-threejs";
  public static final String VIEW_MODULE_VERSION_VALUE = "~1.0.0";
  public static final String VIEW_NAME_VALUE = "AnimationActionView";

  public AnimationAction() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    return content;
  }

  public String getViewModuleValue(){
    return VIEW_MODULE_VALUE;
  }

  public String getViewModuleVersionValue(){
    return VIEW_MODULE_VERSION_VALUE;
  }

  public String getViewNameValue(){
    return VIEW_NAME_VALUE;
  }

}
