                                                                          /**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.09.2023
 * @author Jan Trautwein
 */

public class Kreis {
  
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
  public double berechneFlaeche(){
    return (radius * radius) * Math.PI;   
    }
  public double berechneUmfang(){
    return 2 * radius * Math.PI;
    }
  // Ende Methoden
} // end of RechteckNeu
