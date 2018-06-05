
package ipydatawidgets;

import com.twosigma.beakerx.widget.*;
import pythreejs.DataWidget;

import java.io.Serializable;
import java.util.*;

public class NDArrayWidget extends DataWidget {

  public static final String MODEL_NAME_VALUE = "NDArrayModel";
  public static final String ARRAY = "array";

  private Object array;

  public NDArrayWidget() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ARRAY, (Serializable) array);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Object getArray() {
    return array;
  }
  public void setArray(Object array){
    this.array = array;
    sendUpdate(ARRAY, array);
  }

}
