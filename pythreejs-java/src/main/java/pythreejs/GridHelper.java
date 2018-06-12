
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class GridHelper extends Object3D {

  public static final String MODEL_NAME_VALUE = "GridHelperModel";
  public static final String COLORCENTERLINE = "colorCenterLine";
  public static final String COLORGRID = "colorGrid";
  public static final String DIVISIONS = "divisions";
  public static final String SIZE = "size";
  public static final String TYPE = "type";

  private String colorCenterLine = "0x444444";
  private String colorGrid = "0x888888";
  private int divisions = 10;
  private double size = 10;
  private String type = "GridHelper";

  public GridHelper() {
    super();
    openComm();
  }

    public GridHelper(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.colorCenterLine = (String) parameters.getOrDefault(COLORCENTERLINE, (Serializable) this.colorCenterLine);
      this.colorGrid = (String) parameters.getOrDefault(COLORGRID, (Serializable) this.colorGrid);
      this.divisions = (int) parameters.getOrDefault(DIVISIONS, (Serializable) this.divisions);
      this.size = (double) parameters.getOrDefault(SIZE, (Serializable) this.size);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLORCENTERLINE, (Serializable) colorCenterLine);
    content.put(COLORGRID, (Serializable) colorGrid);
    content.put(DIVISIONS, (Serializable) divisions);
    content.put(SIZE, (Serializable) size);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getColorCenterLine() {
    return colorCenterLine;
  }
  public void setColorCenterLine(String colorCenterLine){
    this.colorCenterLine = colorCenterLine;
    sendUpdate(COLORCENTERLINE, colorCenterLine);
  }

  public String getColorGrid() {
    return colorGrid;
  }
  public void setColorGrid(String colorGrid){
    this.colorGrid = colorGrid;
    sendUpdate(COLORGRID, colorGrid);
  }

  public int getDivisions() {
    return divisions;
  }
  public void setDivisions(int divisions){
    this.divisions = divisions;
    sendUpdate(DIVISIONS, divisions);
  }

  public double getSize() {
    return size;
  }
  public void setSize(double size){
    this.size = size;
    sendUpdate(SIZE, size);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
