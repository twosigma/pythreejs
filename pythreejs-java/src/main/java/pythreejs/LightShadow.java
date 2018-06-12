
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class LightShadow extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "LightShadowModel";
  public static final String BIAS = "bias";
  public static final String CAMERA = "camera";
  public static final String MAPSIZE = "mapSize";
  public static final String RADIUS = "radius";

  private double bias = 0;
  private Widget camera;
  private List mapSize = Arrays.asList(512, 512);
  private double radius = 1;

  public LightShadow() {
    super();
    openComm();
  }

    public LightShadow(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.bias = (double) parameters.getOrDefault(BIAS, (Serializable) this.bias);
      this.camera = (Widget) parameters.getOrDefault(CAMERA, (Serializable) this.camera);
      this.mapSize = (List) parameters.getOrDefault(MAPSIZE, (Serializable) this.mapSize);
      this.radius = (double) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(BIAS, (Serializable) bias);
    content.put(CAMERA, camera == null ? null : "IPY_MODEL_" + camera.getComm().getCommId());
    content.put(MAPSIZE, (Serializable) mapSize);
    content.put(RADIUS, (Serializable) radius);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getBias() {
    return bias;
  }
  public void setBias(double bias){
    this.bias = bias;
    sendUpdate(BIAS, bias);
  }

  public Widget getCamera() {
    return camera;
  }
  public void setCamera(Widget camera){
    this.camera = camera;
    sendUpdate(CAMERA, camera == null ? null : "IPY_MODEL_"+camera.getComm().getCommId());
  }

  public List getMapSize() {
    return mapSize;
  }
  public void setMapSize(List mapSize){
    this.mapSize = mapSize;
    sendUpdate(MAPSIZE, mapSize);
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

}
