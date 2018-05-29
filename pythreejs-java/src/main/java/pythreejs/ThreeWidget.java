package pythreejs;


import java.io.Serializable;
import java.util.*;
import com.twosigma.beakerx.widget.*;

public abstract class ThreeWidget extends Widget implements Serializable{

  public static final String MODEL_MODULE_VALUE = "jupyter-threejs";
  public static final String MODEL_MODULE_VERSION_VALUE = "~1.0.0";

  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    return content;
  }

  public ThreeWidget() {
    super();
  }

  @Override
  public String getModelModuleVersion() {
    return MODEL_MODULE_VERSION_VALUE;
  }

  @Override
  public String getModelModuleValue() {
    return MODEL_MODULE_VALUE;
  }

  @Override
  protected void addValueChangeMsgCallback() {

  }

  boolean previevable() {
    return true;
  }

  @Override
  public void display() {
    if (previevable()) {
      new Preview(this).display();
    } else {
      this.display();
    }
  }

}
