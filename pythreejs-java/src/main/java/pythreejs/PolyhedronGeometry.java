
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class PolyhedronGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "PolyhedronGeometryModel";
  public static final String DETAIL = "detail";
  public static final String FACES = "faces";
  public static final String INDICES = "indices";
  public static final String RADIUS = "radius";
  public static final String TYPE = "type";
  public static final String VERTICES = "vertices";

  private double detail = 0;
  private List faces = new ArrayList<>();
  private List indices = new ArrayList<>();
  private double radius = 1;
  private String type = "PolyhedronGeometry";
  private List vertices = new ArrayList<>();

  public PolyhedronGeometry() {
    super();
    openComm();
  }

    public PolyhedronGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.detail = (double) parameters.getOrDefault(DETAIL, (Serializable) this.detail);
      this.faces = (List) parameters.getOrDefault(FACES, (Serializable) this.faces);
      this.indices = (List) parameters.getOrDefault(INDICES, (Serializable) this.indices);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.vertices = (List) parameters.getOrDefault(VERTICES, (Serializable) this.vertices);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DETAIL, (Serializable) detail);
    content.put(FACES, (Serializable) faces);
    content.put(INDICES, (Serializable) indices);
    content.put(RADIUS, (Serializable) radius);
    content.put(TYPE, (Serializable) type);
    content.put(VERTICES, (Serializable) vertices);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getDetail() {
    return detail;
  }
  public void setDetail(double detail){
    this.detail = detail;
    sendUpdate(DETAIL, detail);
  }

  public List getFaces() {
    return faces;
  }
  public void setFaces(List faces){
    this.faces = faces;
    sendUpdate(FACES, faces);
  }

  public List getIndices() {
    return indices;
  }
  public void setIndices(List indices){
    this.indices = indices;
    sendUpdate(INDICES, indices);
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public List getVertices() {
    return vertices;
  }
  public void setVertices(List vertices){
    this.vertices = vertices;
    sendUpdate(VERTICES, vertices);
  }

}
