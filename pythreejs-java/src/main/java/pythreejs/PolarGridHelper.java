
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class PolarGridHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "PolarGridHelperModel";
  public static final String CIRCLES = "circles";
  public static final String COLOR1 = "color1";
  public static final String COLOR2 = "color2";
  public static final String DIVISIONS = "divisions";
  public static final String RADIALS = "radials";
  public static final String RADIUS = "radius";
  public static final String TYPE = "type";

  private int circles = 8;
  private String color1 = "0x444444";
  private String color2 = "0x888888";
  private int divisions = 64;
  private int radials = 16;
  private int radius = 10;
  private String type = "PolarGridHelper";

  public PolarGridHelper() {
    super();
    openComm();
  }

    public PolarGridHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.circles = (int) parameters.getOrDefault(CIRCLES, (Serializable) this.circles);
      this.color1 = (String) parameters.getOrDefault(COLOR1, (Serializable) this.color1);
      this.color2 = (String) parameters.getOrDefault(COLOR2, (Serializable) this.color2);
      this.divisions = (int) parameters.getOrDefault(DIVISIONS, (Serializable) this.divisions);
      this.radials = (int) parameters.getOrDefault(RADIALS, (Serializable) this.radials);
      this.radius = (int) parameters.getOrDefault(RADIUS, (Serializable) this.radius);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CIRCLES, (Serializable) circles);
    content.put(COLOR1, (Serializable) color1);
    content.put(COLOR2, (Serializable) color2);
    content.put(DIVISIONS, (Serializable) divisions);
    content.put(RADIALS, (Serializable) radials);
    content.put(RADIUS, (Serializable) radius);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public int getCircles() {
    return circles;
  }
  public void setCircles(int circles){
    this.circles = circles;
    sendUpdate(CIRCLES, circles);
  }

  public String getColor1() {
    return color1;
  }
  public void setColor1(String color1){
    this.color1 = color1;
    sendUpdate(COLOR1, color1);
  }

  public String getColor2() {
    return color2;
  }
  public void setColor2(String color2){
    this.color2 = color2;
    sendUpdate(COLOR2, color2);
  }

  public int getDivisions() {
    return divisions;
  }
  public void setDivisions(int divisions){
    this.divisions = divisions;
    sendUpdate(DIVISIONS, divisions);
  }

  public int getRadials() {
    return radials;
  }
  public void setRadials(int radials){
    this.radials = radials;
    sendUpdate(RADIALS, radials);
  }

  public int getRadius() {
    return radius;
  }
  public void setRadius(int radius){
    this.radius = radius;
    sendUpdate(RADIUS, radius);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
