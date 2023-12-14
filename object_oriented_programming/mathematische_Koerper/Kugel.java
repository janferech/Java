                                                                                                                        /**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.09.2023
 * @author Jan Trautwein
 */

public class Kugel {
  
  // Anfang Attribute
  private double radius;
  // Ende Attribute
  
  // Anfang Methoden
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
    }
  public double berechneOberflaeche(){
    return (4 * Math.PI * (this.radius * this.radius));   
    }
  public double berechneVolumen(){
    double radius_3 = this.radius * this.radius * this.radius;
    return (4 * Math.PI * radius_3)/3;
    }
  // Ende Methoden
} // end of RechteckNeu
