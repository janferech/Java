/**
  *
  * Klasse - Schueler mit ArrayList
  */
import java.util.ArrayList;

public class Klasse {


  // Anfang Attribute
  private String name = "BG12-DV";
  ArrayList<Schueler> meineSchueler;
  private Lehrer meinLehrer;
  // Ende Attribute

  public Klasse(){
    meineSchueler = new ArrayList<Schueler>();
    meinLehrer = new Lehrer(this.name, this.getMeinLehrer().getNamensKuerzel());
    
  }
  // Anfang Methoden
  
  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setMeineSchueler(ArrayList<Schueler> meineSchueler){
    this.meineSchueler = meineSchueler;
  }

  public ArrayList<Schueler> getMeineSchueler(){
    return this.meineSchueler;
  }
  public void neuenLehrerAnlegen(String name, String namensKuerzel){
    }
  
  public void neuerSchuelerHinzufuegen(String name){
    
      //this.meineSchueler.add(new Schueler(name));
    meineSchueler.add(new Schueler("Max Muster"));
    meineSchueler.add(new Schueler("Friedrich List"));
    meineSchueler.add(new Schueler("Tim Tester"));
    meineSchueler.add(new Schueler("Birgit Beispiel"));
    
    } // end of for

  public void ausgabeKlassenListe(){
    
    System.out.println("Klassenbezeichnung: " + this.getName());
    System.out.println("Tutor: " + this.getMeinLehrer() + " (" + this.getMeinLehrer().getNamensKuerzel() +  ")" );
    
    for (Schueler tempS : meineSchueler) {
      System.out.println("\t" + tempS.getName());
    } // end of for
    
  }
  
  public Lehrer getMeinLehrer() {
    return meinLehrer;
  }

  public void setMeinLehrer(Lehrer meinLehrerNeu) {
    meinLehrer = meinLehrerNeu;
  }

  // Ende Methoden
  
  }
  

