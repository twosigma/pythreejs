
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class WireframeGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "WireframeGeometryModel";
  public static final String GEOMETRY = "geometry";
  public static final String TYPE = "type";

  private Widget geometry;
  private String type = "WireframeGeometry";

  public WireframeGeometry() {
    super();
    openComm();
  }

    public WireframeGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.geometry = (Widget) parameters.getOrDefault(GEOMETRY, (Serializable) this.geometry);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(GEOMETRY, geometry == null ? null : "IPY_MODEL_" + geometry.getComm().getCommId());
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Widget getGeometry() {
    return geometry;
  }
  public void setGeometry(Widget geometry){
    this.geometry = geometry;
    sendUpdate(GEOMETRY, geometry == null ? null : "IPY_MODEL_"+geometry.getComm().getCommId());
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
