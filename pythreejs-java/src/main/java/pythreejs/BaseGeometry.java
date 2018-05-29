package pythreejs;


import java.io.Serializable;
import java.util.HashMap;

public abstract class BaseGeometry extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "BaseGeometryModel";
  public static final String NAME = "name";
  public static final String TYPE = "type";

  private String name = "";
  private String type = "BaseGeometry";

  public BaseGeometry() {
    super();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(TYPE, type);
    content.put(NAME, name);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
