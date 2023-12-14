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
    //keine Eingaben, sondern nur die Namen "Max Muster", "Friedrich-List", "Tim Tester", "Birgit Beispiel" einzeln an die Methode neuerSchuelerHinzufuegen der Klasse "Klasse" übergeben
    
        
  }
  
  
  public void ausgabe(){
    // hier wird nur die Klassenbezeichnung und der Tutor ausgegeben sowie die Methode "ausgabeSchuelerNamen" der Klasse "Klasse" aufgerufen 
    this.meineKlasse.ausgabeKlassenListe();
  }  
  
  
  
  public static void main(String [] args)   {
    Verwaltung vw = new Verwaltung();
    vw.eingabe();
    vw.ausgabe();
    
  }
}
