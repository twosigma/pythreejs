package pythreejs;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Renderer extends RenderableWidget {

  public static final String MODEL_NAME_VALUE = "RendererModel";
  public static final String VIEW_NAME_VALUE = "RendererView";
  private static final String IPY_MODEL = "IPY_MODEL_";
  public static final String BACKGROUND = "background";
  public static final String BACKGROUND_OPACITY = "background_opacity";
  public static final String CAMERA = "camera";
  public static final String CONTROLS = "controls";
  public static final String SCENE = "scene";
  public static final String TYPE = "type";

  private String background = "black";
  private Double backgroundOpacity = null;;
  private Camera camera = null;
  private List<Controls> controls = new ArrayList<>();
  private Scene scene = null;
  private String type = "render";

  public Renderer(Camera camera, Scene scene, List<Controls> controls) {
    super();
    this.scene = scene;
    this.controls = controls;
    this.camera = camera;
    openComm();
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getViewNameValue(){
    return VIEW_NAME_VALUE;
  }

  @Override
  public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(SCENE, IPY_MODEL + this.scene.getComm().getCommId());
    content.put(CAMERA, IPY_MODEL + this.camera.getComm().getCommId());
    content.put(CONTROLS, controlsIds());
    content.put(TYPE, type);
    return content;
  }

  private Serializable controlsIds() {
    ArrayList<String> controlIds = new ArrayList<>();
    for (Controls control : controls) {
      controlIds.add(IPY_MODEL + control.getComm().getCommId());
    }
    return controlIds;
  }

  private Serializable toJson(Object obj) {
    return (Serializable) obj;
  }

  public String getBackground() {
    return background;
  }
  public void setBackground(String background){
    this.background = background;
    sendUpdate(BACKGROUND, background);
  }

  public Double getBackgroundOpacity() {
    return backgroundOpacity;
  }
  public void setBackgroundOpacity(Double backgroundOpacity){
    this.backgroundOpacity = backgroundOpacity;
    sendUpdate(BACKGROUND_OPACITY, backgroundOpacity);
  }

  public Camera getCamera() {
    return camera;
  }
  public void setCamera(Camera camera){
    this.camera = camera;
    sendUpdate(CAMERA, camera.getComm().getCommId());
  }

  public List<Controls> getControls() {
    return controls;
  }
  public void setControls(List<Controls> controls){
    this.controls = controls;
    sendUpdate(CONTROLS, controlsIds());
  }

  public Scene getScene() {
    return scene;
  }
  public void setScene(Scene scene){
    this.scene = scene;
    sendUpdate(SCENE, scene.getComm().getCommId());
  }

}
