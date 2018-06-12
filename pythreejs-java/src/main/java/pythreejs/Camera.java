
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Camera extends Object3D {

  public static final String MODEL_NAME_VALUE = "CameraModel";
  public static final String MATRIXWORLDINVERSE = "matrixWorldInverse";
  public static final String PROJECTIONMATRIX = "projectionMatrix";
  public static final String TYPE = "type";

  private List matrixWorldInverse = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private List projectionMatrix = Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
  private String type = "Camera";

  public Camera() {
    super();
    openComm();
  }

    public Camera(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.matrixWorldInverse = (List) parameters.getOrDefault(MATRIXWORLDINVERSE, (Serializable) this.matrixWorldInverse);
      this.projectionMatrix = (List) parameters.getOrDefault(PROJECTIONMATRIX, (Serializable) this.projectionMatrix);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(MATRIXWORLDINVERSE, (Serializable) matrixWorldInverse);
    content.put(PROJECTIONMATRIX, (Serializable) projectionMatrix);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getMatrixWorldInverse() {
    return matrixWorldInverse;
  }
  public void setMatrixWorldInverse(List matrixWorldInverse){
    this.matrixWorldInverse = matrixWorldInverse;
    sendUpdate(MATRIXWORLDINVERSE, matrixWorldInverse);
  }

  public List getProjectionMatrix() {
    return projectionMatrix;
  }
  public void setProjectionMatrix(List projectionMatrix){
    this.projectionMatrix = projectionMatrix;
    sendUpdate(PROJECTIONMATRIX, projectionMatrix);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
