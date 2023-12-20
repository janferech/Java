/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.12.2023
 * @author Janferech
 */
public class SegelSchiff extends Schiff {
  private double segelFlaeche;
  // Ende Attribute
  public SegelSchiff(String name,double tonnage, double segelFlaeche){
    super(name,tonnage);
    this.segelFlaeche = segelFlaeche;
    super.setSchiffTyp("Segelschiff");
  }
  // Anfang Methoden
  public double getSegelFlaeche() {
    return segelFlaeche;
  }

  public void setSegelFlaeche(double segelFlaeche) {
    segelFlaeche = segelFlaeche;
  }

  // Ende Methoden
} // end of SegelSchiff

