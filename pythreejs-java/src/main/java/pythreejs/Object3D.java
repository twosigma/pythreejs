
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Object3D extends Object3DBase {



  public Object3D() {
    super();
  }

  public Object3D(LinkedHashMap<String, Serializable> content) {
    super(content);
  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    return content;
  }

}
