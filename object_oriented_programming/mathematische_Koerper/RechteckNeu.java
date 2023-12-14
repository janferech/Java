/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.09.2023
 * @author Jan Trautwein
 */

public class RechteckNeu {
  
  // Anfang Attribute
  private double seiteA;
  private double seiteB;
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
  public double berechneFlaeche(){
    return this.seiteA * this.seiteB;
    }
  
  //public void berechneFlaeche(double seiteA, double seiteB){  
  // this.seiteA = seiteA;                     Instanzvariablen werten des Parameters uebergeben
  // this.seiteB = seiteB
  // return this.seiteA * this.seiteB;
  // }
   
  public double berechneUmfang(){
    return 2 * (this.seiteA + this.seiteB);
    }
  
  //public void berechneUmfang(double seiteA, double seiteB){  
  // this.seiteA = seiteA;                     Instanzvariablen werten des Parameters übergeben
  // this.seiteB = seiteB
  // return  2 * (this.seiteA * this.seiteB);
  // } 
       
  // Ende Methoden
} // end of RechteckNeu
