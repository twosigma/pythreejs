
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class PlaneGeometry extends BaseGeometry {

  public static final String MODEL_NAME_VALUE = "PlaneGeometryModel";
  public static final String HEIGHT = "height";
  public static final String HEIGHTSEGMENTS = "heightSegments";
  public static final String TYPE = "type";
  public static final String WIDTH = "width";
  public static final String WIDTHSEGMENTS = "widthSegments";

  private double height = 1;
  private int heightSegments = 1;
  private String type = "PlaneGeometry";
  private double width = 1;
  private int widthSegments = 1;

  public PlaneGeometry() {
    super();
    openComm();
  }

    public PlaneGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.height = (double) parameters.getOrDefault(HEIGHT, (Serializable) this.height);
      this.heightSegments = (int) parameters.getOrDefault(HEIGHTSEGMENTS, (Serializable) this.heightSegments);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      this.width = (double) parameters.getOrDefault(WIDTH, (Serializable) this.width);
      this.widthSegments = (int) parameters.getOrDefault(WIDTHSEGMENTS, (Serializable) this.widthSegments);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(HEIGHT, (Serializable) height);
    content.put(HEIGHTSEGMENTS, (Serializable) heightSegments);
    content.put(TYPE, (Serializable) type);
    content.put(WIDTH, (Serializable) width);
    content.put(WIDTHSEGMENTS, (Serializable) widthSegments);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getHeight() {
    return height;
  }
  public void setHeight(double height){
    this.height = height;
    sendUpdate(HEIGHT, height);
  }

  public int getHeightSegments() {
    return heightSegments;
  }
  public void setHeightSegments(int heightSegments){
    this.heightSegments = heightSegments;
    sendUpdate(HEIGHTSEGMENTS, heightSegments);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

  public double getWidth() {
    return width;
  }
  public void setWidth(double width){
    this.width = width;
    sendUpdate(WIDTH, width);
  }

  public int getWidthSegments() {
    return widthSegments;
  }
  public void setWidthSegments(int widthSegments){
    this.widthSegments = widthSegments;
    sendUpdate(WIDTHSEGMENTS, widthSegments);
  }

}
