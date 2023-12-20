/**
  *
  * Klasse - Schueler mit ArrayList
  */
import java.util.ArrayList;

public class Verwaltung {
  
  private Klasse meineKlasse;
  
  public Verwaltung(){
    
    this.meineKlasse = new Klasse();
      
  }
    
  public void eingabe(){
    //keine Eingaben, sondern nur die Namen "Max Muster", "Friedrich-List", "Tim Tester", "Birgit Beispiel" einzeln an die Methode neuerSchuelerHinzufuegen der Klasse "Klasse" uebergeben
    this.meineKlasse.setName("BG12-DV");
    this.meineKlasse.getMeinTutor().setName("Schlosser");
    this.meineKlasse.getMeinTutor().setNamensKuerzel("SCLO");
    
    this.meineKlasse.neuerSchuelerHinzufuegen("Max Muster");
    this.meineKlasse.neuerSchuelerHinzufuegen("Friedrich-List");
    this.meineKlasse.neuerSchuelerHinzufuegen("Tim Tester");
    this.meineKlasse.neuerSchuelerHinzufuegen("Ben Beispiel");
    //Wird noch verbessert, Projektleiter moechte es so
        
  }
  
  
  public void ausgabe(){
    // hier wird nur die Klassenbezeichnung und der Tutor ausgegeben sowie die Methode "ausgabeSchuelerNamen" der Klasse "Klasse" aufgerufen 
    System.out.println("\n\n\n\n\t*****************************************");
    System.out.println("\t                  Klassenliste");
    System.out.println("\t*****************************************");
    
    System.out.println("\tKlassenbezeichnung: " + this.meineKlasse.getName());
    System.out.println("\tTutor: " + this.meineKlasse.getMeinTutor().toString()); //geht auch ohne toString() zu erwaehnen, wird automatisch genommen
                                                                                  //behebt den Fehler von der Speicherplatz bezeichnung
    System.out.println("\n\tAlle Schueler der Klasse: ");
    System.out.println(this.meineKlasse.ausgabeSchuelerNamen());
    
    System.out.println("\n\n\n\n\t*****************************************");
    System.out.println("\t                  Alle Schueler und Ihre Kurse");
    System.out.println("\t*****************************************");
    System.out.println(this.meineKlasse.ausgabeSchuelerMitKursen());
    
  }  
  
  public void automatischeEingabe(){
      meineKlasse.setName("BG12-DV");
      meineKlasse.getMeinTutor().setNamensKuerzel("sclo");  //Zeile darf nicht ver?ndert werden!
      meineKlasse.getMeinTutor().setName("Schlosser");
  
      meineKlasse.neuerSchuelerHinzufuegen("Max Muster");
      meineKlasse.neuerSchuelerHinzufuegen("Friedrich List");
      meineKlasse.neuerSchuelerHinzufuegen("Tim Tester");
      meineKlasse.neuerSchuelerHinzufuegen("Birgit Beispiel");
  
  
      for(Schueler temp: meineKlasse.getMeineSchueler()){
      temp.neuenKursHinzufuegen("LK PI: Objektorientierte Softwareentwickelung", 6);
      }
  
  
      meineKlasse.getMeineSchueler().get(0).neuenKursHinzufuegen("GK IT: Betriebssysteme", 3);
      meineKlasse.getMeineSchueler().get(0).neuenKursHinzufuegen("GK Englisch: The Challenge of Individualism", 3);
      meineKlasse.getMeineSchueler().get(1).neuenKursHinzufuegen("GK Sport: Fussball", 2);    
      meineKlasse.getMeineSchueler().get(1).neuenKursHinzufuegen("GK Englisch: The Challenge of Individualism", 3);
  
      meineKlasse.getMeineSchueler().get(2).neuenKursHinzufuegen("GK IT: Betriebssysteme", 3);
    }
  
  public static void main(String [] args)   {
    Verwaltung vw = new Verwaltung();
    vw.automatischeEingabe();
    vw.ausgabe();
    
  }
}
