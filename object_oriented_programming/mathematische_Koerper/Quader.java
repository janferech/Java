                                     /**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.09.2023
 * @author Jan Trautwein
 */

public class Quader {
  
  // Anfang Attribute
  private double seiteA;
  private double seiteB;
  private double seiteC;
  // Ende Attribute
  
  // Anfang Methoden
  public double getSeiteA() {
    return seiteA;
  }
  public void setSeiteA(double seiteA){
    this.seiteA = seiteA;
    }
   public double getSeiteB() {
    return seiteB;
  }
  public void setSeiteB(double seiteB){
    this.seiteB = seiteB;
    }
  public double getSeiteC() {
    return seiteC;
  }
  public void setSeiteC(double seiteC){
    this.seiteC = seiteC;                  //this.seiteC = variable in der Klasse wird angesprochen
    }
  public double berechneOberflaeche(){
    return  2 * this.seiteA * this.seiteB + 2 * this.seiteA * this.seiteC + 2 * this.seiteB * this.seiteC;
    
    }
  public double berechneVolumen(){
    return this.seiteA * this.seiteB * this.seiteC;
    }
  // Ende Methoden
} // end of RechteckNeu
