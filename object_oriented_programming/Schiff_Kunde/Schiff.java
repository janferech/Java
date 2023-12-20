/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.12.2023
 * @author Janferech
 */
public class Schiff {
  
  // Anfang Attribute 
  
  private double tonnage;
  private String schiffTyp;
  private String name;
  public Schiff(String name,double tonnage){
    this.tonnage = tonnage;
    this.name = name;
    this.schiffTyp = "Schiff";
  }
  // Ende Attribute
  
  // Anfang Methoden
  public double getTonnage() {
    return tonnage;
  }
  
  public void setTonnage(double tonnage) {
    this.tonnage = tonnage;
  }
  
  public String getSchiffTyp() {
    return schiffTyp;
  }
  
  public void setSchiffTyp(String schiffTyp) {
    schiffTyp = schiffTyp;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  // Ende Methoden
} // end of Schiff

