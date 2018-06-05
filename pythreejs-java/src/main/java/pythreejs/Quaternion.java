
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Quaternion extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "QuaternionModel";
  public static final String W = "w";
  public static final String X = "x";
  public static final String Y = "y";
  public static final String Z = "z";

  private double w = 1;
  private double x = 0;
  private double y = 0;
  private double z = 0;

  public Quaternion() {
    super();
    openComm();
  }

    public Quaternion(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.w = (double) parameters.getOrDefault(W, (Serializable) this.w);
      this.x = (double) parameters.getOrDefault(X, (Serializable) this.x);
      this.y = (double) parameters.getOrDefault(Y, (Serializable) this.y);
      this.z = (double) parameters.getOrDefault(Z, (Serializable) this.z);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(W, (Serializable) w);
    content.put(X, (Serializable) x);
    content.put(Y, (Serializable) y);
    content.put(Z, (Serializable) z);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getW() {
    return w;
  }
  public void setW(double w){
    this.w = w;
    sendUpdate(W, w);
  }

  public double getX() {
    return x;
  }
  public void setX(double x){
    this.x = x;
    sendUpdate(X, x);
  }

  public double getY() {
    return y;
  }
  public void setY(double y){
    this.y = y;
    sendUpdate(Y, y);
  }

  public double getZ() {
    return z;
  }
  public void setZ(double z){
    this.z = z;
    sendUpdate(Z, z);
  }

}
