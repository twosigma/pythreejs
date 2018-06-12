
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Picker extends Controls {

  public static final String MODEL_NAME_VALUE = "PickerModel";
  public static final String ALL = "all";
  public static final String DISTANCE = "distance";
  public static final String EVENT = "event";
  public static final String FACE = "face";
  public static final String FACEINDEX = "faceIndex";
  public static final String FACENORMAL = "faceNormal";
  public static final String FACEVERTICES = "faceVertices";
  public static final String INDICES = "indices";
  public static final String MODIFIERS = "modifiers";
  public static final String OBJECT = "object";
  public static final String PICKED = "picked";
  public static final String POINT = "point";
  public static final String UV = "uv";

  private boolean all;
  private double distance;
  private String event = "click";
  private List face = Arrays.asList(0, 0, 0);
  private int faceIndex;
  private List faceNormal = Arrays.asList(0, 0, 0);
  private List faceVertices = Arrays.asList();
  private List indices = new ArrayList<>();
  private List modifiers = new ArrayList<>();
  private Object3D object;
  private List picked = new ArrayList<>();
  private List point = Arrays.asList(0, 0, 0);
  private List uv = Arrays.asList(0, 0);

  public Picker() {
    super();
    openComm();
  }

    public Picker(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.all = (boolean) parameters.getOrDefault(ALL, (Serializable) this.all);
      this.distance = (double) parameters.getOrDefault(DISTANCE, (Serializable) this.distance);
      this.event = (String) parameters.getOrDefault(EVENT, (Serializable) this.event);
      this.face = (List) parameters.getOrDefault(FACE, (Serializable) this.face);
      this.faceIndex = (int) parameters.getOrDefault(FACEINDEX, (Serializable) this.faceIndex);
      this.faceNormal = (List) parameters.getOrDefault(FACENORMAL, (Serializable) this.faceNormal);
      this.faceVertices = (List) parameters.getOrDefault(FACEVERTICES, (Serializable) this.faceVertices);
      this.indices = (List) parameters.getOrDefault(INDICES, (Serializable) this.indices);
      this.modifiers = (List) parameters.getOrDefault(MODIFIERS, (Serializable) this.modifiers);
      this.object = (Object3D) parameters.getOrDefault(OBJECT, (Serializable) this.object);
      this.picked = (List) parameters.getOrDefault(PICKED, (Serializable) this.picked);
      this.point = (List) parameters.getOrDefault(POINT, (Serializable) this.point);
      this.uv = (List) parameters.getOrDefault(UV, (Serializable) this.uv);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(ALL, (Serializable) all);
    content.put(DISTANCE, (Serializable) distance);
    content.put(EVENT, (Serializable) event);
    content.put(FACE, (Serializable) face);
    content.put(FACEINDEX, (Serializable) faceIndex);
    content.put(FACENORMAL, (Serializable) faceNormal);
    content.put(FACEVERTICES, (Serializable) faceVertices);
    content.put(INDICES, (Serializable) indices);
    content.put(MODIFIERS, (Serializable) modifiers);
    content.put(OBJECT, object == null ? null : "IPY_MODEL_" + object.getComm().getCommId());
    content.put(PICKED, (Serializable) picked);
    content.put(POINT, (Serializable) point);
    content.put(UV, (Serializable) uv);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public boolean getAll() {
    return all;
  }
  public void setAll(boolean all){
    this.all = all;
    sendUpdate(ALL, all);
  }

  public double getDistance() {
    return distance;
  }
  public void setDistance(double distance){
    this.distance = distance;
    sendUpdate(DISTANCE, distance);
  }

  public String getEvent() {
    return event;
  }
  public void setEvent(String event){
    this.event = event;
    sendUpdate(EVENT, event);
  }

  public List getFace() {
    return face;
  }
  public void setFace(List face){
    this.face = face;
    sendUpdate(FACE, face);
  }

  public int getFaceIndex() {
    return faceIndex;
  }
  public void setFaceIndex(int faceIndex){
    this.faceIndex = faceIndex;
    sendUpdate(FACEINDEX, faceIndex);
  }

  public List getFaceNormal() {
    return faceNormal;
  }
  public void setFaceNormal(List faceNormal){
    this.faceNormal = faceNormal;
    sendUpdate(FACENORMAL, faceNormal);
  }

  public List getFaceVertices() {
    return faceVertices;
  }
  public void setFaceVertices(List faceVertices){
    this.faceVertices = faceVertices;
    sendUpdate(FACEVERTICES, faceVertices);
  }

  public List getIndices() {
    return indices;
  }
  public void setIndices(List indices){
    this.indices = indices;
    sendUpdate(INDICES, indices);
  }

  public List getModifiers() {
    return modifiers;
  }
  public void setModifiers(List modifiers){
    this.modifiers = modifiers;
    sendUpdate(MODIFIERS, modifiers);
  }

  public Object3D getObject() {
    return object;
  }
  public void setObject(Object3D object){
    this.object = object;
    sendUpdate(OBJECT, object == null ? null : "IPY_MODEL_"+object.getComm().getCommId());
  }

  public List getPicked() {
    return picked;
  }
  public void setPicked(List picked){
    this.picked = picked;
    sendUpdate(PICKED, picked);
  }

  public List getPoint() {
    return point;
  }
  public void setPoint(List point){
    this.point = point;
    sendUpdate(POINT, point);
  }

  public List getUv() {
    return uv;
  }
  public void setUv(List uv){
    this.uv = uv;
    sendUpdate(UV, uv);
  }

}
