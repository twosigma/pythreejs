
package pythreejs;

import com.twosigma.beakerx.widget.*;
import java.io.Serializable;
import java.util.*;

public class MeshPhysicalMaterial extends MeshStandardMaterial {

  public static final String MODEL_NAME_VALUE = "MeshPhysicalMaterialModel";
  public static final String CLEARCOAT = "clearCoat";
  public static final String CLEARCOATROUGHNESS = "clearCoatRoughness";
  public static final String DEFINES = "defines";
  public static final String REFLECTIVITY = "reflectivity";
  public static final String TYPE = "type";

  private double clearCoat = 0;
  private double clearCoatRoughness = 0;
  private Map<String, Serializable> defines = new HashMap<String, Serializable>();
  {
    defines.put("PHYSICAL", "");
  }
  private double reflectivity = 0.5;
  private String type = "MeshPhysicalMaterial";

  public MeshPhysicalMaterial() {
    super();
    openComm();
  }

    public MeshPhysicalMaterial(LinkedHashMap<String, Serializable> parameters) {
      super(parameters);
      this.clearCoat = (double) parameters.getOrDefault(CLEARCOAT, (Serializable) this.clearCoat);
      this.clearCoatRoughness = (double) parameters.getOrDefault(CLEARCOATROUGHNESS, (Serializable) this.clearCoatRoughness);
      this.defines = (Map<String, Serializable>) parameters.getOrDefault(DEFINES, (Serializable) this.defines);
      this.reflectivity = (double) parameters.getOrDefault(REFLECTIVITY, (Serializable) this.reflectivity);
      this.type = (String) parameters.getOrDefault(TYPE, (Serializable) this.type);
      openComm();
    }

  @Override
  public HashMap<String, Serializable> content (HashMap<String, Serializable> content) {
    super.content(content);
    content.put(CLEARCOAT, (Serializable) clearCoat);
    content.put(CLEARCOATROUGHNESS, (Serializable) clearCoatRoughness);
    content.put(DEFINES, (Serializable) defines);
    content.put(REFLECTIVITY, (Serializable) reflectivity);
    content.put(TYPE, (Serializable) type);
    return content;
  }

  public String getModelNameValue(){
    return MODEL_NAME_VALUE;
  }

  public double getClearCoat() {
    return clearCoat;
  }
  public void setClearCoat(double clearCoat){
    this.clearCoat = clearCoat;
    sendUpdate(CLEARCOAT, clearCoat);
  }

  public double getClearCoatRoughness() {
    return clearCoatRoughness;
  }
  public void setClearCoatRoughness(double clearCoatRoughness){
    this.clearCoatRoughness = clearCoatRoughness;
    sendUpdate(CLEARCOATROUGHNESS, clearCoatRoughness);
  }

  public Map<String, Serializable> getDefines() {
    return defines;
  }
  public void setDefines(Map<String, Serializable> defines){
    this.defines = defines;
    sendUpdate(DEFINES, defines);
  }

  public double getReflectivity() {
    return reflectivity;
  }
  public void setReflectivity(double reflectivity){
    this.reflectivity = reflectivity;
    sendUpdate(REFLECTIVITY, reflectivity);
  }

  public String getType() {
    return type;
  }
  public void setType(String type){
    this.type = type;
    sendUpdate(TYPE, type);
  }

}
