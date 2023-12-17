/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 01.11.2023
 * @author 
 */
  
public class AkkordArbeiter extends Arbeiter {
    public void kennung(String arbeitsplatz) {
        super.firma = arbeitsplatz;
        System.out.println("\tIch bin ein Akkordarbeiter der " + firma + "." );
    }                                    

    public void setEinkommen(int produzierteMenge, double minutenFakt, double vorgabeZeit) {
        super.einkommen = produzierteMenge * minutenFakt * vorgabeZeit;
    }
}
  // Anfang Methoden
  // Ende Methoden
 // end of Akkordarbeiter

