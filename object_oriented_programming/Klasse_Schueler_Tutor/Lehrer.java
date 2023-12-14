
public class Lehrer{
  
  // Anfang Attribute
  private String namen;
  private String namensKuerzel;
  // Ende Attribute
  
  public Lehrer(String namen, String namensKuerzel){
    this.namen = namen;
    this.namensKuerzel = namensKuerzel;
    }
  
  public String getNamensKuerzel() {
    return this.namensKuerzel;
  }

  public void setNamensKuerzel(String namensKuerzelNeu) {
    this.namensKuerzel = namensKuerzelNeu;
  }

  public String getNamen() {
    return this.namen;
  }

  public void setNamen(String namenNeu) {
    this.namen = namenNeu;
  }

  // Ende Methoden
  }

