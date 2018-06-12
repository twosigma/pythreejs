
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Preview extends RenderableWidget {

  public static final String _FLAT = "_flat";
  public static final String MODEL_NAME_VALUE = "PreviewModel";
  public static final String VIEW_NAME_VALUE = "PreviewView";
  public static final String _WIRE = "_wire";
  public static final String CHILD = "child";

  private boolean flat;
  private boolean wire;
  private ThreeWidget child;

  public Preview() {
    super();
    openComm();
  }

    public Preview(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.flat = (boolean) parameters.getOrDefault(_FLAT, (Serializable) this.flat);
      this.wire = (boolean) parameters.getOrDefault(_WIRE, (Serializable) this.wire);
      this.child = (ThreeWidget) parameters.getOrDefault(CHILD, (Serializable) this.child);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(_FLAT, (Serializable) flat);
    content.put(_WIRE, (Serializable) wire);
    content.put(CHILD, child == null ? null : "IPY_MODEL_" + child.getComm().getCommId());
    return content;
  }

  public boolean getFlat() {
    return flat;
  }
  public void setFlat(boolean flat){
    this.flat = flat;
    sendUpdate(_FLAT, flat);
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getViewNameValue(){
    return VIEW_NAME_VALUE;
  }

  public boolean getWire() {
    return wire;
  }
  public void setWire(boolean wire){
    this.wire = wire;
    sendUpdate(_WIRE, wire);
  }

  public ThreeWidget getChild() {
    return child;
  }
  public void setChild(ThreeWidget child){
    this.child = child;
    sendUpdate(CHILD, child == null ? null : "IPY_MODEL_"+child.getComm().getCommId());
  }

}
