
public class Lehrer{
  
  // Anfang Attribute
  private String namen = "Schlosser";
  private String namensKuerzel = "SCLO";
  // Ende Attribute
  
  public Lehrer(String namen, String namensKuerzel){
    this.namen = namen;
    this.namensKuerzel = namensKuerzel;
    }
  
  public String getNamensKuerzel() {
    return this.namensKuerzel;
  }

  public void setNamensKuerzel(String namensKuerzelNeu) {
    namensKuerzel = namensKuerzelNeu;
  }

  public String getNamen() {
    return this.namen;
  }

  public void setNamen(String namenNeu) {
    namen = namenNeu;
  }

  // Ende Methoden
  }

