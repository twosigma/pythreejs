
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class BufferGeometry extends BufferGeometryBase {



  public BufferGeometry() {
    super();
    openComm();
  }

  public BufferGeometry(LinkedHashMap parameters) {
    super(parameters);
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    return content;
  }

}
