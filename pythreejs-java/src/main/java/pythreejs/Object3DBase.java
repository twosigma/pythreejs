package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Object3DBase extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "Object3DModel";
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

  private boolean castShadow;
  private List<Object3DBase> children = new ArrayList<>();
  private boolean frustumCulled = true;
  private List matrix = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private boolean matrixAutoUpdate = true;
  private List matrixWorld = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private boolean matrixWorldNeedsUpdate;
  private List modelViewMatrix = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private String name;
  private List normalMatrix = Arrays.asList(1, 0, 0, 0, 1, 0, 0, 0, 1);
  private List position = Arrays.asList(0, 0, 0);
  private List quaternion = Arrays.asList(0, 0, 0, 1);
  private boolean receiveShadow;
  private int renderOrder;
  private List rotation = Arrays.asList(0, 0, 0, "XYZ");
  private List scale = Arrays.asList(1, 1, 1);
  private String type = "Object3D";
  private List up = Arrays.asList(0, 1, 0);
  private boolean visible = true;

  public Object3DBase() {
    super();
  }

  public Object3DBase(LinkedHashMap parameters) {
    super(parameters);
    this.castShadow = (boolean) parameters.getOrDefault(CASTSHADOW, this.castShadow);
    this.children = (List<Object3DBase>) parameters.getOrDefault(CHILDREN, this.children);
    this.frustumCulled = (boolean) parameters.getOrDefault(FRUSTUMCULLED, (Serializable) this.frustumCulled);
    this.matrix = (List) parameters.getOrDefault(MATRIX, (Serializable) this.matrix);
    this.matrixAutoUpdate = (boolean) parameters.getOrDefault(MATRIXAUTOUPDATE, (Serializable) this.matrixAutoUpdate);
    this.matrixWorld = (List) parameters.getOrDefault(MATRIXWORLD, (Serializable) this.matrixWorld);
    this.matrixWorldNeedsUpdate = (boolean) parameters.getOrDefault(MATRIXWORLDNEEDSUPDATE, (Serializable) this.matrixWorldNeedsUpdate);
    this.modelViewMatrix = (List) parameters.getOrDefault(MODELVIEWMATRIX, (Serializable) this.modelViewMatrix);
    this.name = (String) parameters.getOrDefault(NAME, (Serializable) this.name);
    this.normalMatrix = (List) parameters.getOrDefault(NORMALMATRIX, (Serializable) this.normalMatrix);
    this.position = (List) parameters.getOrDefault(POSITION, (Serializable) this.position);
    this.quaternion = (List) parameters.getOrDefault(QUATERNION, (Serializable) this.quaternion);
    this.receiveShadow = (boolean) parameters.getOrDefault(RECEIVESHADOW, (Serializable) this.receiveShadow);
    this.renderOrder = (int) parameters.getOrDefault(RENDERORDER, (Serializable) this.renderOrder);
    this.rotation = (List) parameters.getOrDefault(ROTATION, (Serializable) this.rotation);
    this.scale = (List) parameters.getOrDefault(SCALE, (Serializable) this.scale);
    this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
    this.up = (List) parameters.getOrDefault(UP, (Serializable) this.up);
    this.visible = (boolean) parameters.getOrDefault(VISIBLE, (Serializable) this.visible);
  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CASTSHADOW, (Serializable) castShadow);
    content.put(CHILDREN, childrenIds());
    content.put(FRUSTUMCULLED, (Serializable) frustumCulled);
    content.put(MATRIX, (Serializable) matrix);
    content.put(MATRIXAUTOUPDATE, (Serializable) matrixAutoUpdate);
    content.put(MATRIXWORLD, (Serializable) matrixWorld);
    content.put(MATRIXWORLDNEEDSUPDATE, (Serializable) matrixWorldNeedsUpdate);
    content.put(MODELVIEWMATRIX, (Serializable) modelViewMatrix);
    content.put(NAME, (Serializable) name);
    content.put(NORMALMATRIX, (Serializable) normalMatrix);
    content.put(POSITION, (Serializable) position);
    content.put(QUATERNION, (Serializable) quaternion);
    content.put(RECEIVESHADOW, (Serializable) receiveShadow);
    content.put(RENDERORDER, (Serializable) renderOrder);
    content.put(ROTATION, (Serializable) rotation);
    content.put(SCALE, (Serializable) scale);
    content.put(TYPE, (Serializable) type);
    content.put(UP, (Serializable) up);
    content.put(VISIBLE, (Serializable) visible);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getCastShadow() {
    return castShadow;
  }
  public void setCastShadow(boolean castShadow){
    this.castShadow = castShadow;
    sendUpdate(CASTSHADOW, castShadow);
  }

  public List getChildren() {
    return children;
  }

  private ArrayList<String> childrenIds() {
    ArrayList<String> childrenIds = new ArrayList<>();
    for (Object3DBase child : children) {
      childrenIds.add("IPY_MODEL_" + child.getComm().getCommId());
    }
    return childrenIds;
  }

  public void setChildren(List<Object3DBase> children){
    this.children = children;
    sendUpdate(CHILDREN, childrenIds());
  }

  public boolean getFrustumCulled() {
    return frustumCulled;
  }
  public void setFrustumCulled(boolean frustumCulled){
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

  public boolean getMatrixAutoUpdate() {
    return matrixAutoUpdate;
  }
  public void setMatrixAutoUpdate(boolean matrixAutoUpdate){
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

  public boolean getMatrixWorldNeedsUpdate() {
    return matrixWorldNeedsUpdate;
  }
  public void setMatrixWorldNeedsUpdate(boolean matrixWorldNeedsUpdate){
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

  public boolean getReceiveShadow() {
    return receiveShadow;
  }
  public void setReceiveShadow(boolean receiveShadow){
    this.receiveShadow = receiveShadow;
    sendUpdate(RECEIVESHADOW, receiveShadow);
  }

  public int getRenderOrder() {
    return renderOrder;
  }
  public void setRenderOrder(int renderOrder){
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

  public boolean getVisible() {
    return visible;
  }
  public void setVisible(boolean visible){
    this.visible = visible;
    sendUpdate(VISIBLE, visible);
  }

}
