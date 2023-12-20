/**
  *
  * Klasse - Schueler mit ArrayList
  */
import java.util.ArrayList;

public class Klasse {


  // Anfang Attribute
  private String name;
  private ArrayList<Schueler> meineSchueler;
  private Lehrer meinTutor;
  // Ende Attribute

  public Klasse(){
    this.meineSchueler = new ArrayList<Schueler>();
    this.meinTutor = new Lehrer(); 
  }
  // Anfang Methoden
  
  public String getName() {
    return name;
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
    //this.meinTutor = new Lehrer(name, namensKuerzel);
    }
  
  public void neuerSchuelerHinzufuegen(String name){
    
    this.meineSchueler.add(new Schueler(name));

    } // end of for

  public String ausgabeSchuelerNamen(){
    String ausgabe = "";
    
    int i =0;
    for (Schueler tempSchueler : meineSchueler) {
      i++;
      ausgabe += ("\t" + i + ". " + tempSchueler.getName() + "\n");
    } // end of for
    
    return ausgabe;
  }
  public String ausgabeSchuelerMitKursen(){
    String ausgabe = "";
    
    int i = 0;
    for (Schueler tempSchueler: this.meineSchueler) {
      i++;
      ausgabe += ("\t" + i + ". " + tempSchueler.toString() + tempSchueler.ausgabeKurse());
    } // end of for
    return ausgabe;
  }
  
  public void setMeinTutor(Lehrer meinTutorNeu) {
    this.meinTutor = meinTutorNeu;
  }

  public Lehrer getMeinTutor() {
    return meinTutor;
  }
  // Ende Methoden

  }
  

