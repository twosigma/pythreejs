
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Renderer extends RenderableWidget {

  public static final String MODEL_NAME_VALUE = "RendererModel";
  public static final String VIEW_NAME_VALUE = "RendererView";
  public static final String BACKGROUND = "background";
  public static final String BACKGROUND_OPACITY = "background_opacity";
  public static final String CAMERA = "camera";
  public static final String CONTROLS = "controls";
  public static final String SCENE = "scene";

  private String background = "black";
  private double backgroundOpacity = 1;
  private Camera camera;
  private List<Controls> controls = Arrays.asList();
  private Scene scene;

  public Renderer() {
    super();
    openComm();
  }

    public Renderer(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.background = (String) parameters.getOrDefault(BACKGROUND, (Serializable) this.background);
      this.backgroundOpacity = (double) parameters.getOrDefault(BACKGROUND_OPACITY, (Serializable) this.backgroundOpacity);
      this.camera = (Camera) parameters.getOrDefault(CAMERA, (Serializable) this.camera);
      this.controls = (List) parameters.getOrDefault(CONTROLS, (Serializable) this.controls);
      this.scene = (Scene) parameters.getOrDefault(SCENE, (Serializable) this.scene);
      openComm();
    }

  private ArrayList<String> controlsIds() {
    ArrayList<String> controlsIds = new ArrayList<>();
    for (Controls control : controls) {
      controlsIds.add("IPY_MODEL_" + control.getComm().getCommId());
    }
    return controlsIds;
  }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(BACKGROUND, (Serializable) background);
    content.put(BACKGROUND_OPACITY, (Serializable) backgroundOpacity);
    content.put(CAMERA, camera == null ? null : "IPY_MODEL_" + camera.getComm().getCommId());
    content.put(CONTROLS, controlsIds());
    content.put(SCENE, scene == null ? null : "IPY_MODEL_" + scene.getComm().getCommId());
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getViewNameValue(){
    return VIEW_NAME_VALUE;
  }

  public String getBackground() {
    return background;
  }
  public void setBackground(String background){
    this.background = background;
    sendUpdate(BACKGROUND, background);
  }

  public double getBackgroundOpacity() {
    return backgroundOpacity;
  }
  public void setBackgroundOpacity(double backgroundOpacity){
    this.backgroundOpacity = backgroundOpacity;
    sendUpdate(BACKGROUND_OPACITY, backgroundOpacity);
  }

  public Camera getCamera() {
    return camera;
  }
  public void setCamera(Camera camera){
    this.camera = camera;
    sendUpdate(CAMERA, camera == null ? null : "IPY_MODEL_"+camera.getComm().getCommId());
  }

  public List getControls() {
    return controls;
  }
  public void setControls(List controls){
    this.controls = controls;
    sendUpdate(CONTROLS, controlsIds());
  }

  public Scene getScene() {
    return scene;
  }
  public void setScene(Scene scene){
    this.scene = scene;
    sendUpdate(SCENE, scene == null ? null : "IPY_MODEL_"+scene.getComm().getCommId());
  }

}
