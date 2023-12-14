/**
  *
  * Loesung Aufgabe 1: Mitarbeiter - Angestellter
  * @author Michael Schlosser
  */

public class Mitarbeiter {
  // Anfang Attribute
  protected String firma;
  protected String nachName;
  protected double einkommen;
  // Ende Attribute
  
  public Mitarbeiter() {
    firma = "Friedrich-List OHG";
    einkommen = 0;
  }
  // Anfang Methoden
  public void kennung() {
    System.out.println("\tIch bin ein Mitarbeiter der " + firma + "." );
  }
  public void setName(String n){
    this.nachName = n;
  }
  public String getName(){
    return nachName;
  }
  public void abrechnung(){
    System.out.println("\tDas Einkommen betraegt : " + einkommen + " Euro." );
  }
  public double getEinkommen() {
    return einkommen;
  }

  public void setEinkommen(double einkommenNeu) {
    einkommen = einkommenNeu;
  }

  public String getFirma() {
    return firma;
  }

  public void setFirma(String firmaNeu) {
    firma = firmaNeu;
  }

  // Ende Methoden
}

