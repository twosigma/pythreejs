
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class BoxBufferGeometry extends BaseBufferGeometry {

  public static final String MODEL_NAME_VALUE = "BoxBufferGeometryModel";
  public static final String DEPTH = "depth";
  public static final String DEPTHSEGMENTS = "depthSegments";
  public static final String HEIGHT = "height";
  public static final String HEIGHTSEGMENTS = "heightSegments";
  public static final String TYPE = "type";
  public static final String WIDTH = "width";
  public static final String WIDTHSEGMENTS = "widthSegments";

  private double depth = 1;
  private int depthSegments = 1;
  private double height = 1;
  private int heightSegments = 1;
  private String type = "BoxBufferGeometry";
  private double width = 1;
  private int widthSegments = 1;

  public BoxBufferGeometry() {
    super();
    openComm();
  }

    public BoxBufferGeometry(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.depth = (double) parameters.getOrDefault(DEPTH, (Serializable) this.depth);
      this.depthSegments = (int) parameters.getOrDefault(DEPTHSEGMENTS, (Serializable) this.depthSegments);
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
    content.put(DEPTH, (Serializable) depth);
    content.put(DEPTHSEGMENTS, (Serializable) depthSegments);
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

  public double getDepth() {
    return depth;
  }
  public void setDepth(double depth){
    this.depth = depth;
    sendUpdate(DEPTH, depth);
  }

  public int getDepthSegments() {
    return depthSegments;
  }
  public void setDepthSegments(int depthSegments){
    this.depthSegments = depthSegments;
    sendUpdate(DEPTHSEGMENTS, depthSegments);
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
