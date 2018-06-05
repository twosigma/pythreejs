
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class ArrowHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "ArrowHelperModel";
  public static final String DIR = "dir";
  public static final String HEADLENGTH = "headLength";
  public static final String HEADWIDTH = "headWidth";
  public static final String HEX = "hex";
  public static final String LENGTH = "length";
  public static final String ORIGIN = "origin";
  public static final String TYPE = "type";

  private List dir = Arrays.asList(1, 0, 0);
  private double headLength;
  private double headWidth;
  private int hex;
  private double length = 1;
  private List origin = Arrays.asList(0, 0, 0);
  private String type = "ArrowHelper";

  public ArrowHelper() {
    super();
    openComm();
  }

    public ArrowHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.dir = (List) parameters.getOrDefault(DIR, (Serializable) this.dir);
      this.headLength = (double) parameters.getOrDefault(HEADLENGTH, (Serializable) this.headLength);
      this.headWidth = (double) parameters.getOrDefault(HEADWIDTH, (Serializable) this.headWidth);
      this.hex = (int) parameters.getOrDefault(HEX, (Serializable) this.hex);
      this.length = (double) parameters.getOrDefault(LENGTH, (Serializable) this.length);
      this.origin = (List) parameters.getOrDefault(ORIGIN, (Serializable) this.origin);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(DIR, (Serializable) dir);
    content.put(HEADLENGTH, (Serializable) headLength);
    content.put(HEADWIDTH, (Serializable) headWidth);
    content.put(HEX, (Serializable) hex);
    content.put(LENGTH, (Serializable) length);
    content.put(ORIGIN, (Serializable) origin);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public List getDir() {
    return dir;
  }
  public void setDir(List dir){
    this.dir = dir;
    sendUpdate(DIR, dir);
  }

  public double getHeadLength() {
    return headLength;
  }
  public void setHeadLength(double headLength){
    this.headLength = headLength;
    sendUpdate(HEADLENGTH, headLength);
  }

  public double getHeadWidth() {
    return headWidth;
  }
  public void setHeadWidth(double headWidth){
    this.headWidth = headWidth;
    sendUpdate(HEADWIDTH, headWidth);
  }

  public int getHex() {
    return hex;
  }
  public void setHex(int hex){
    this.hex = hex;
    sendUpdate(HEX, hex);
  }

  public double getLength() {
    return length;
  }
  public void setLength(double length){
    this.length = length;
    sendUpdate(LENGTH, length);
  }

  public List getOrigin() {
    return origin;
  }
  public void setOrigin(List origin){
    this.origin = origin;
    sendUpdate(ORIGIN, origin);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
