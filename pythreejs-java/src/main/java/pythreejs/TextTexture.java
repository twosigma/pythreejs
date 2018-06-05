
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class TextTexture extends Texture {

  public static final String MODEL_NAME_VALUE = "TextTextureModel";
  public static final String COLOR = "color";
  public static final String FONTFACE = "fontFace";
  public static final String SIZE = "size";
  public static final String SQUARETEXTURE = "squareTexture";
  public static final String STRING = "string";

  private String color = "white";
  private String fontFace = "Arial";
  private int size = 12;
  private boolean squareTexture = true;
  private String string;

  public TextTexture() {
    super();
    openComm();
  }

    public TextTexture(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.color = (String) parameters.getOrDefault(COLOR, (Serializable) this.color);
      this.fontFace = (String) parameters.getOrDefault(FONTFACE, (Serializable) this.fontFace);
      this.size = (int) parameters.getOrDefault(SIZE, (Serializable) this.size);
      this.squareTexture = (boolean) parameters.getOrDefault(SQUARETEXTURE, (Serializable) this.squareTexture);
      this.string = (String) parameters.getOrDefault(STRING, (Serializable) this.string);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(COLOR, (Serializable) color);
    content.put(FONTFACE, (Serializable) fontFace);
    content.put(SIZE, (Serializable) size);
    content.put(SQUARETEXTURE, (Serializable) squareTexture);
    content.put(STRING, (Serializable) string);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color){
    this.color = color;
    sendUpdate(COLOR, color);
  }

  public String getFontFace() {
    return fontFace;
  }
  public void setFontFace(String fontFace){
    this.fontFace = fontFace;
    sendUpdate(FONTFACE, fontFace);
  }

  public int getSize() {
    return size;
  }
  public void setSize(int size){
    this.size = size;
    sendUpdate(SIZE, size);
  }

  public boolean getSquareTexture() {
    return squareTexture;
  }
  public void setSquareTexture(boolean squareTexture){
    this.squareTexture = squareTexture;
    sendUpdate(SQUARETEXTURE, squareTexture);
  }

  public String getString() {
    return string;
  }
  public void setString(String string){
    this.string = string;
    sendUpdate(STRING, string);
  }

}
