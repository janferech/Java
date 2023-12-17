/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15.12.2023
 * @author 
 */

public class Kurs {
  
  // Anfang Attribute
  private int stunden;
  private String bezeichnung;
  // Ende Attribute
  
  // Anfang Methoden
  
  public Kurs(String bezeichnung, int stunden){
    this.stunden = stunden;
    this.bezeichnung = bezeichnung;
    }
  
  public int getStunden() {
    return stunden;
  }

  public void setStunden(int stundenNeu) {
    stunden = stundenNeu;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnungNeu) {
    bezeichnung = bezeichnungNeu;
  }
  
  @Override
  public String toString() {
    
    return ("\t" + this.bezeichnung + " (" + this.stunden + " Stunden)\n");
  }

  // Ende Methoden
} // end of Kurs

