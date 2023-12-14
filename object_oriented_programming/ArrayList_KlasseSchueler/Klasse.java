/**
  *
  * Klasse - Schueler mit ArrayList
  */
import java.util.ArrayList;

public class Klasse {


  // Anfang Attribute
  private String name = "BG12-DV";
  ArrayList<Schueler> meineSchueler;
  private Lehrer meinTutor;
  // Ende Attribute

  public Klasse(){
    meineSchueler = new ArrayList<Schueler>(); 
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
    this.meinTutor = new Lehrer(name, namensKuerzel);
    }
  
  public void neuerSchuelerHinzufuegen(String name){
    
    this.meineSchueler.add(new Schueler(name));

    } // end of for

  public void ausgabeKlassenListe(){
    
    
    for (Schueler tempS : meineSchueler) {
      System.out.println("\t" + tempS.getName());
    } // end of for
    
  }
  public void setMeinTutor(Lehrer meinTutorNeu) {
    this.meinTutor = meinTutorNeu;
  }

  public Lehrer getMeinTutor() {
    return meinTutor;
  }

  // Ende Methoden

  }
  

