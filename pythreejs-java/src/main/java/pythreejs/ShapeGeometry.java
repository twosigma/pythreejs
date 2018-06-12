
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ShapeGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "ShapeGeometryModel";
  public static final String CURVESEGMENTS = "curveSegments";
  public static final String MATERIAL = "material";
  public static final String SHAPES = "shapes";
  public static final String TYPE = "type";

  private int curveSegments = 12;
  private int material;
  private List shapes = Arrays.asList();
  private String type = "ShapeGeometry";

  public ShapeGeometry() {
    super();
    openComm();
  }

    public ShapeGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.curveSegments = (int) parameters.getOrDefault(CURVESEGMENTS, (Serializable) this.curveSegments);
      this.material = (int) parameters.getOrDefault(MATERIAL, (Serializable) this.material);
      this.shapes = (List) parameters.getOrDefault(SHAPES, (Serializable) this.shapes);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CURVESEGMENTS, (Serializable) curveSegments);
    content.put(MATERIAL, (Serializable) material);
    content.put(SHAPES, (Serializable) shapes);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public int getCurveSegments() {
    return curveSegments;
  }
  public void setCurveSegments(int curveSegments){
    this.curveSegments = curveSegments;
    sendUpdate(CURVESEGMENTS, curveSegments);
  }

  public int getMaterial() {
    return material;
  }
  public void setMaterial(int material){
    this.material = material;
    sendUpdate(MATERIAL, material);
  }

  public List getShapes() {
    return shapes;
  }
  public void setShapes(List shapes){
    this.shapes = shapes;
    sendUpdate(SHAPES, shapes);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
