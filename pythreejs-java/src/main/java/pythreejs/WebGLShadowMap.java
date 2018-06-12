
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class WebGLShadowMap extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "WebGLShadowMapModel";
  public static final String ENABLED = "enabled";
  public static final String TYPE = "type";

  private boolean enabled;
  private Object type = "PCFShadowMap";

  public WebGLShadowMap() {
    super();
    openComm();
  }

    public WebGLShadowMap(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.enabled = (boolean) parameters.getOrDefault(ENABLED, (Serializable) this.enabled);
      this.type = (Object) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ENABLED, (Serializable) enabled);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(boolean enabled){
    this.enabled = enabled;
    sendUpdate(ENABLED, enabled);
  }

  public Object getType() {
    return type;
  }
  public void setType(Object type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
