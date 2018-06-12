
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class CatmullRomCurve3 extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "CatmullRomCurve3Model";


  public CatmullRomCurve3() {
    super();
    openComm();
  }

    public CatmullRomCurve3(LinkedHashMap<String, Serializable> parameters) {
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
