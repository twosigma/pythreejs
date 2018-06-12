
package pythreejs;

import com.twosigma.beakerx.widget.*;

import java.io.Serializable;
import java.util.*;

public class ThreeWidget extends Widget implements Serializable{

  public static final String MODEL_MODULE_VALUE = "jupyter-threejs";
  public static final String MODEL_MODULE_VERSION_VALUE = "~1.0.0";


  public ThreeWidget() {
    super();
  }

  public ThreeWidget(LinkedHashMap<String, Serializable> properties) {
    super();
  }

  @Override
  public String getModelNameValue() {
    return null;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    return content;
  }

  public String getModelModuleValue(){
    return MODEL_MODULE_VALUE;
  }

  @Override
  protected void addValueChangeMsgCallback() {

  }

  public String getModelModuleVersionValue(){
    return MODEL_MODULE_VERSION_VALUE;
  }

  boolean previevable() {
    return true;
  }

  @Override
  public void display() {
    LinkedHashMap<String, Serializable> previewParams = new LinkedHashMap<>();
    previewParams.put(Preview.CHILD, this);
    if (previevable()) {
      new Preview(previewParams).display();
    } else {
      this.display();
    }
  }

}
