package pythreejs;


import java.io.Serializable;
import java.util.*;
import com.twosigma.beakerx.widget.*;

public class AmbientLight extends Light {



  public static final String MODEL_NAME_VALUE = "AmbientLightModel";
  public static final String TYPE = "type";

  private String type = "AmbientLight";

  public AmbientLight() {
    super();
    openComm();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(TYPE, type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  @Override
  public String getViewNameValue() {
    return null;
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
