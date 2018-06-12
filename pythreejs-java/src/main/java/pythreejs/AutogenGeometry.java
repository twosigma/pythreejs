
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class AutogenGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "GeometryModel";
  public static final String _REF_GEOMETRY = "_ref_geometry";
  public static final String _STORE_REF = "_store_ref";
  public static final String COLORS = "colors";
  public static final String FACEVERTEXUVS = "faceVertexUvs";
  public static final String FACES = "faces";
  public static final String LINEDISTANCES = "lineDistances";
  public static final String MORPHNORMALS = "morphNormals";
  public static final String MORPHTARGETS = "morphTargets";
  public static final String SKININDICES = "skinIndices";
  public static final String SKINWEIGHTS = "skinWeights";
  public static final String TYPE = "type";
  public static final String VERTICES = "vertices";

  private BaseGeometry refGeometry;
  private boolean storeRef;
  private List colors = Arrays.asList("#ffffff");
  private List faceVertexUvs = new ArrayList<>();
  private List faces = Arrays.asList();
  private List lineDistances = new ArrayList<>();
  private List morphNormals = new ArrayList<>();
  private List morphTargets = new ArrayList<>();
  private List skinIndices = Arrays.asList();
  private List skinWeights = Arrays.asList();
  private String type = "Geometry";
  private List vertices = Arrays.asList();

  public AutogenGeometry() {
    super();
    openComm();
  }

    public AutogenGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.refGeometry = (BaseGeometry) parameters.getOrDefault(_REF_GEOMETRY, (Serializable) this.refGeometry);
      this.storeRef = (boolean) parameters.getOrDefault(_STORE_REF, (Serializable) this.storeRef);
      this.colors = (List) parameters.getOrDefault(COLORS, (Serializable) this.colors);
      this.faceVertexUvs = (List) parameters.getOrDefault(FACEVERTEXUVS, (Serializable) this.faceVertexUvs);
      this.faces = (List) parameters.getOrDefault(FACES, (Serializable) this.faces);
      this.lineDistances = (List) parameters.getOrDefault(LINEDISTANCES, (Serializable) this.lineDistances);
      this.morphNormals = (List) parameters.getOrDefault(MORPHNORMALS, (Serializable) this.morphNormals);
      this.morphTargets = (List) parameters.getOrDefault(MORPHTARGETS, (Serializable) this.morphTargets);
      this.skinIndices = (List) parameters.getOrDefault(SKININDICES, (Serializable) this.skinIndices);
      this.skinWeights = (List) parameters.getOrDefault(SKINWEIGHTS, (Serializable) this.skinWeights);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.vertices = (List) parameters.getOrDefault(VERTICES, (Serializable) this.vertices);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(_REF_GEOMETRY, refGeometry == null ? null : "IPY_MODEL_" + refGeometry.getComm().getCommId());
    content.put(_STORE_REF, (Serializable) storeRef);
    content.put(COLORS, (Serializable) colors);
    content.put(FACEVERTEXUVS, (Serializable) faceVertexUvs);
    content.put(FACES, (Serializable) faces);
    content.put(LINEDISTANCES, (Serializable) lineDistances);
    content.put(MORPHNORMALS, (Serializable) morphNormals);
    content.put(MORPHTARGETS, (Serializable) morphTargets);
    content.put(SKININDICES, (Serializable) skinIndices);
    content.put(SKINWEIGHTS, (Serializable) skinWeights);
    content.put(TYPE, (Serializable) type);
    content.put(VERTICES, (Serializable) vertices);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public BaseGeometry getRefGeometry() {
    return refGeometry;
  }
  public void setRefGeometry(BaseGeometry refGeometry){
    this.refGeometry = refGeometry;
    sendUpdate(_REF_GEOMETRY, refGeometry == null ? null : "IPY_MODEL_"+refGeometry.getComm().getCommId());
  }

  public boolean getStoreRef() {
    return storeRef;
  }
  public void setStoreRef(boolean storeRef){
    this.storeRef = storeRef;
    sendUpdate(_STORE_REF, storeRef);
  }

  public List getColors() {
    return colors;
  }
  public void setColors(List colors){
    this.colors = colors;
    sendUpdate(COLORS, colors);
  }

  public List getFaceVertexUvs() {
    return faceVertexUvs;
  }
  public void setFaceVertexUvs(List faceVertexUvs){
    this.faceVertexUvs = faceVertexUvs;
    sendUpdate(FACEVERTEXUVS, faceVertexUvs);
  }

  public List getFaces() {
    return faces;
  }
  public void setFaces(List faces){
    this.faces = faces;
    sendUpdate(FACES, faces);
  }

  public List getLineDistances() {
    return lineDistances;
  }
  public void setLineDistances(List lineDistances){
    this.lineDistances = lineDistances;
    sendUpdate(LINEDISTANCES, lineDistances);
  }

  public List getMorphNormals() {
    return morphNormals;
  }
  public void setMorphNormals(List morphNormals){
    this.morphNormals = morphNormals;
    sendUpdate(MORPHNORMALS, morphNormals);
  }

  public List getMorphTargets() {
    return morphTargets;
  }
  public void setMorphTargets(List morphTargets){
    this.morphTargets = morphTargets;
    sendUpdate(MORPHTARGETS, morphTargets);
  }

  public List getSkinIndices() {
    return skinIndices;
  }
  public void setSkinIndices(List skinIndices){
    this.skinIndices = skinIndices;
    sendUpdate(SKININDICES, skinIndices);
  }

  public List getSkinWeights() {
    return skinWeights;
  }
  public void setSkinWeights(List skinWeights){
    this.skinWeights = skinWeights;
    sendUpdate(SKINWEIGHTS, skinWeights);
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
