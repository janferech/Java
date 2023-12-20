/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.12.2023
 * @author Janferech
 */
public class MotorSchiff extends Schiff {
  
  // Anfang Attribute
  private double motorleistung;
  
  public MotorSchiff(String name, double tonnage, double motorleistung){
    super(name,tonnage);
    this.motorleistung = motorleistung;
    super.setSchiffTyp("Motorschiff");
  }
  // Ende Attribute
  
  // Anfang Methoden
  public double getMotorleistung() {
    return motorleistung;
  }

  public void setMotorleistung(double motorleistungNeu) {
    motorleistung = motorleistungNeu;
  }

  // Ende Methoden
} // end of MotorSchiff

