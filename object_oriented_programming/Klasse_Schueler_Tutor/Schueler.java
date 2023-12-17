/**
  *
  * Klasse - Schueler mit ArrayList
  */
import java.util.ArrayList;

public class Schueler {

  // Anfang Attribute
  private int schuelerNummer;
  private String name;
  private int schuelerstammNummer = 1000;
  private ArrayList<Kurs> meineKurse;
  // Ende Attribute

  public Schueler(String name){
    this.name = name;
    this.meineKurse = new ArrayList<Kurs>();
    this.schuelerNummer = schuelerstammNummer;
    this.schuelerNummer++;
  }
  
  // Anfang Methoden
  
  public  void neuenKursHinzufuegen(String name, int stunden){
    this.meineKurse.add(new Kurs(name, stunden));
    }
  
  public String ausgabeKurse(){
    String ausgabe = "";
    int i = 1;
    
    for (Kurs tempK : meineKurse) {
      ausgabe += ("\t" + i + tempK + "\n");
      i++;
    } // end of for
    
    return ausgabe;  
  }
  
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setSchuelerNummer(int schuelerNummer){
    this.schuelerNummer = schuelerNummer;
    }
  
  public int getSchuelerNummer(){
    return this.schuelerNummer;
    }
  
  public ArrayList<Kurs> getMeineKurse(){
    return this.meineKurse;
    }
  
  public void setMeineKurse(ArrayList<Kurs> meineKurse){
    this.meineKurse = meineKurse;
    }
  
  @Override
  public String toString(){
    return ("\t" + this.name + " (Schuelernummer: " + this.schuelerNummer + ")\n" + 
           this.meineKurse.toString() + "\n");
    }                                                                               
  // Ende Methoden
}

