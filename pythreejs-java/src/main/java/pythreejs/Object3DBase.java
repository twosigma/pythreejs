package pythreejs;


import java.io.Serializable;
import java.util.*;

public abstract class Object3DBase extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "Object3DModel";
  private static final String IPY_MODEL = "IPY_MODEL_";
  public static final String CASTSHADOW = "castShadow";
  public static final String CHILDREN = "children";
  public static final String FRUSTUMCULLED = "frustumCulled";
  public static final String MATRIX = "matrix";
  public static final String MATRIXAUTOUPDATE = "matrixAutoUpdate";
  public static final String MATRIXWORLD = "matrixWorld";
  public static final String MATRIXWORLDNEEDSUPDATE = "matrixWorldNeedsUpdate";
  public static final String MODELVIEWMATRIX = "modelViewMatrix";
  public static final String NAME = "name";
  public static final String NORMALMATRIX = "normalMatrix";
  public static final String POSITION = "position";
  public static final String QUATERNION = "quaternion";
  public static final String RECEIVESHADOW = "receiveShadow";
  public static final String RENDERORDER = "renderOrder";
  public static final String ROTATION = "rotation";
  public static final String SCALE = "scale";
  public static final String TYPE = "type";
  public static final String UP = "up";
  public static final String VISIBLE = "visible";


  private Boolean castShadow = null;
  private List<Object3DBase> children = new ArrayList<>();
  private Boolean frustumCulled = true;
  private List matrix = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private Boolean matrixAutoUpdate = true;
  private List matrixWorld = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private Boolean matrixWorldNeedsUpdate = null;
  private List modelViewMatrix = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private String name = null;
  private List normalMatrix = Arrays.asList(1, 0, 0, 0, 1, 0, 0, 0, 1);
  private List position = Arrays.asList(0, 0, 0);
  private List quaternion = Arrays.asList(0, 0, 0, 1);
  private Boolean receiveShadow = null;
  private Integer renderOrder = null;;
  private List rotation = Arrays.asList(0, 0, 0, "XYZ");
  private List scale = Arrays.asList(1, 1, 1);
  private String type = "Object3D";
  private List up = Arrays.asList(0, 1, 0);
  private Boolean visible = true;

  public Object3DBase() {
    super();
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CASTSHADOW, castShadow);
    content.put(CHILDREN, childrenIds());
    content.put(FRUSTUMCULLED, frustumCulled);
    content.put(MATRIX, (Serializable) matrix);
    content.put(MATRIXAUTOUPDATE, matrixAutoUpdate);
    content.put(MATRIXWORLD, (Serializable) matrixWorld);
    content.put(MATRIXWORLDNEEDSUPDATE, matrixWorldNeedsUpdate);
    content.put(MODELVIEWMATRIX, (Serializable) modelViewMatrix);
    content.put(NAME, name);
    content.put(NORMALMATRIX, (Serializable) normalMatrix);
    content.put(POSITION, (Serializable) position);
    content.put(QUATERNION, (Serializable) quaternion);
    content.put(RECEIVESHADOW, receiveShadow);
    content.put(RENDERORDER, renderOrder);
    content.put(ROTATION, (Serializable) rotation);
    content.put(SCALE, (Serializable) scale);
    content.put(TYPE, type);
    content.put(UP, (Serializable) up);
    content.put(VISIBLE, visible);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Boolean getCastShadow() {
    return castShadow;
  }
  public void setCastShadow(Boolean castShadow){
    this.castShadow = castShadow;
    sendUpdate(CASTSHADOW, castShadow);
  }

  public List getChildren() {
    return children;
  }

  private ArrayList<String> childrenIds() {
    ArrayList<String> childrenIds = new ArrayList<>();
    for (Object3DBase child : children) {
      childrenIds.add(IPY_MODEL + child.getComm().getCommId());
    }
    return childrenIds;
  }

  public void setChildren(List<Object3DBase> children){
    this.children = children;
    sendUpdate(CHILDREN, childrenIds());
  }

  public Boolean getFrustumCulled() {
    return frustumCulled;
  }
  public void setFrustumCulled(Boolean frustumCulled){
    this.frustumCulled = frustumCulled;
    sendUpdate(FRUSTUMCULLED, frustumCulled);
  }

  public List getMatrix() {
    return matrix;
  }
  public void setMatrix(List matrix){
    this.matrix = matrix;
    sendUpdate(MATRIX, matrix);
  }

  public Boolean getMatrixAutoUpdate() {
    return matrixAutoUpdate;
  }
  public void setMatrixAutoUpdate(Boolean matrixAutoUpdate){
    this.matrixAutoUpdate = matrixAutoUpdate;
    sendUpdate(MATRIXAUTOUPDATE, matrixAutoUpdate);
  }

  public List getMatrixWorld() {
    return matrixWorld;
  }
  public void setMatrixWorld(List matrixWorld){
    this.matrixWorld = matrixWorld;
    sendUpdate(MATRIXWORLD, matrixWorld);
  }

  public Boolean getMatrixWorldNeedsUpdate() {
    return matrixWorldNeedsUpdate;
  }
  public void setMatrixWorldNeedsUpdate(Boolean matrixWorldNeedsUpdate){
    this.matrixWorldNeedsUpdate = matrixWorldNeedsUpdate;
    sendUpdate(MATRIXWORLDNEEDSUPDATE, matrixWorldNeedsUpdate);
  }

  public List getModelViewMatrix() {
    return modelViewMatrix;
  }
  public void setModelViewMatrix(List modelViewMatrix){
    this.modelViewMatrix = modelViewMatrix;
    sendUpdate(MODELVIEWMATRIX, modelViewMatrix);
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
    sendUpdate(NAME, name);
  }

  public List getNormalMatrix() {
    return normalMatrix;
  }
  public void setNormalMatrix(List normalMatrix){
    this.normalMatrix = normalMatrix;
    sendUpdate(NORMALMATRIX, normalMatrix);
  }

  public List getPosition() {
    return position;
  }
  public void setPosition(List position){
    this.position = position;
    sendUpdate(POSITION, position);
  }

  public List getQuaternion() {
    return quaternion;
  }
  public void setQuaternion(List quaternion){
    this.quaternion = quaternion;
    sendUpdate(QUATERNION, quaternion);
  }

  public Boolean getReceiveShadow() {
    return receiveShadow;
  }
  public void setReceiveShadow(Boolean receiveShadow){
    this.receiveShadow = receiveShadow;
    sendUpdate(RECEIVESHADOW, receiveShadow);
  }

  public Integer getRenderOrder() {
    return renderOrder;
  }
  public void setRenderOrder(Integer renderOrder){
    this.renderOrder = renderOrder;
    sendUpdate(RENDERORDER, renderOrder);
  }

  public List getRotation() {
    return rotation;
  }
  public void setRotation(List rotation){
    this.rotation = rotation;
    sendUpdate(ROTATION, rotation);
  }

  public List getScale() {
    return scale;
  }
  public void setScale(List scale){
    this.scale = scale;
    sendUpdate(SCALE, scale);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public List getUp() {
    return up;
  }
  public void setUp(List up){
    this.up = up;
    sendUpdate(UP, up);
  }

  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible){
    this.visible = visible;
    sendUpdate(VISIBLE, visible);
  }

}
