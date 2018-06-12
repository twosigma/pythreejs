
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class FlyControls extends Controls {

  public static final String MODEL_NAME_VALUE = "FlyControlsModel";
  public static final String MOVEVECTOR = "moveVector";
  public static final String MOVEMENTSPEED = "movementSpeed";
  public static final String ROLLSPEED = "rollSpeed";
  public static final String ROTATIONVECTOR = "rotationVector";
  public static final String SYNCRATE = "syncRate";

  private List moveVector = Arrays.asList(0, 0, 0);
  private double movementSpeed = 1;
  private double rollSpeed = 0.05;
  private List rotationVector = Arrays.asList(0, 0, 0);
  private double syncRate = 1;

  public FlyControls() {
    super();
    openComm();
  }

    public FlyControls(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.moveVector = (List) parameters.getOrDefault(MOVEVECTOR, (Serializable) this.moveVector);
      this.movementSpeed = (double) parameters.getOrDefault(MOVEMENTSPEED, (Serializable) this.movementSpeed);
      this.rollSpeed = (double) parameters.getOrDefault(ROLLSPEED, (Serializable) this.rollSpeed);
      this.rotationVector = (List) parameters.getOrDefault(ROTATIONVECTOR, (Serializable) this.rotationVector);
      this.syncRate = (double) parameters.getOrDefault(SYNCRATE, (Serializable) this.syncRate);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(MOVEVECTOR, (Serializable) moveVector);
    content.put(MOVEMENTSPEED, (Serializable) movementSpeed);
    content.put(ROLLSPEED, (Serializable) rollSpeed);
    content.put(ROTATIONVECTOR, (Serializable) rotationVector);
    content.put(SYNCRATE, (Serializable) syncRate);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getMoveVector() {
    return moveVector;
  }
  public void setMoveVector(List moveVector){
    this.moveVector = moveVector;
    sendUpdate(MOVEVECTOR, moveVector);
  }

  public double getMovementSpeed() {
    return movementSpeed;
  }
  public void setMovementSpeed(double movementSpeed){
    this.movementSpeed = movementSpeed;
    sendUpdate(MOVEMENTSPEED, movementSpeed);
  }

  public double getRollSpeed() {
    return rollSpeed;
  }
  public void setRollSpeed(double rollSpeed){
    this.rollSpeed = rollSpeed;
    sendUpdate(ROLLSPEED, rollSpeed);
  }

  public List getRotationVector() {
    return rotationVector;
  }
  public void setRotationVector(List rotationVector){
    this.rotationVector = rotationVector;
    sendUpdate(ROTATIONVECTOR, rotationVector);
  }

  public double getSyncRate() {
    return syncRate;
  }
  public void setSyncRate(double syncRate){
    this.syncRate = syncRate;
    sendUpdate(SYNCRATE, syncRate);
  }

}
