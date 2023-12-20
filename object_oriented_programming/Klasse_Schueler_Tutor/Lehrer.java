
public class Lehrer{
  
  // Anfang Attribute
  private String name;
  private String namensKuerzel;
  // Ende Attribute
  
  public Lehrer(){
    
    }
  
  public String getNamensKuerzel() {
    return this.namensKuerzel;
  }

  public void setNamensKuerzel(String namensKuerzelNeu) {
    this.namensKuerzel = namensKuerzelNeu;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String nameNeu) {
    this.name = nameNeu;
  }
  @Override   //Annotation = Metadaten im Quelltext -->Technischer Begriff zum Ueberschreiben
  public String toString(){ //toString() Objects Methode zum ausgeben eines Objekts
    return this.name + "(" + this.namensKuerzel + ")";
    } 
    
  // Ende Methoden
  }

