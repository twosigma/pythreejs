
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class Frustum extends ThreeWidget {

  public static final String MODEL_NAME_VALUE = "FrustumModel";
  public static final String P0 = "p0";
  public static final String P1 = "p1";
  public static final String P2 = "p2";
  public static final String P3 = "p3";
  public static final String P4 = "p4";
  public static final String P5 = "p5";

  private Plane p0;
  private Plane p1;
  private Plane p2;
  private Plane p3;
  private Plane p4;
  private Plane p5;

  public Frustum() {
    super();
    openComm();
  }

    public Frustum(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.p0 = (Plane) parameters.getOrDefault(P0, (Serializable) this.p0);
      this.p1 = (Plane) parameters.getOrDefault(P1, (Serializable) this.p1);
      this.p2 = (Plane) parameters.getOrDefault(P2, (Serializable) this.p2);
      this.p3 = (Plane) parameters.getOrDefault(P3, (Serializable) this.p3);
      this.p4 = (Plane) parameters.getOrDefault(P4, (Serializable) this.p4);
      this.p5 = (Plane) parameters.getOrDefault(P5, (Serializable) this.p5);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(P0, p0 == null ? null : "IPY_MODEL_" + p0.getComm().getCommId());
    content.put(P1, p1 == null ? null : "IPY_MODEL_" + p1.getComm().getCommId());
    content.put(P2, p2 == null ? null : "IPY_MODEL_" + p2.getComm().getCommId());
    content.put(P3, p3 == null ? null : "IPY_MODEL_" + p3.getComm().getCommId());
    content.put(P4, p4 == null ? null : "IPY_MODEL_" + p4.getComm().getCommId());
    content.put(P5, p5 == null ? null : "IPY_MODEL_" + p5.getComm().getCommId());
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public Plane getP0() {
    return p0;
  }
  public void setP0(Plane p0){
    this.p0 = p0;
    sendUpdate(P0, p0 == null ? null : "IPY_MODEL_"+p0.getComm().getCommId());
  }

  public Plane getP1() {
    return p1;
  }
  public void setP1(Plane p1){
    this.p1 = p1;
    sendUpdate(P1, p1 == null ? null : "IPY_MODEL_"+p1.getComm().getCommId());
  }

  public Plane getP2() {
    return p2;
  }
  public void setP2(Plane p2){
    this.p2 = p2;
    sendUpdate(P2, p2 == null ? null : "IPY_MODEL_"+p2.getComm().getCommId());
  }

  public Plane getP3() {
    return p3;
  }
  public void setP3(Plane p3){
    this.p3 = p3;
    sendUpdate(P3, p3 == null ? null : "IPY_MODEL_"+p3.getComm().getCommId());
  }

  public Plane getP4() {
    return p4;
  }
  public void setP4(Plane p4){
    this.p4 = p4;
    sendUpdate(P4, p4 == null ? null : "IPY_MODEL_"+p4.getComm().getCommId());
  }

  public Plane getP5() {
    return p5;
  }
  public void setP5(Plane p5){
    this.p5 = p5;
    sendUpdate(P5, p5 == null ? null : "IPY_MODEL_"+p5.getComm().getCommId());
  }

}
