
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class WebGLRenderer extends RenderableWidget {

  public static final String MODEL_NAME_VALUE = "WebGLRendererModel";
  public static final String VIEW_NAME_VALUE = "WebGLRendererView";


  public WebGLRenderer() {
    super();
  }

    public WebGLRenderer(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getViewNameValue(){
    return VIEW_NAME_VALUE;
  }

}
