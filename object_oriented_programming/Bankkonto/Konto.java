
public class Konto {

  // Anfang Attribute
  private String kontoNr;
  private String kontoTyp;
  private double kontoStand;
  // Ende Attribute

  public Konto(String kontoNr) {
    this.kontoNr = kontoNr;
  }
  // Anfang Methoden

  public String getKontoTyp() {
    return kontoTyp;
  }

  public void setKontoTyp(String kontoTyp) {
    this.kontoTyp = kontoTyp;
  }

  public String getKontoNr() {
    return this.kontoNr;
  }

  public void setKontoNr(String kontoNr) {
    this.kontoNr = kontoNr;
  }

  public double getKontoStand() {
    return kontoStand;
  }

  public void setKontoStand(double kontoStand) {
    this.kontoStand = kontoStand;
  }

  public boolean auszahlen(double betrag) {
    if (this.kontoStand >= betrag) {
      System.out.println("Betrag erfolgreich ausgezahlt. ");
      this.kontoStand -= betrag;
      return true;
    } else {
      System.out.println("Betrag zu hoch, darf nicht hoeher als Kontostand sein!");
      return false;
    }
  }

  public void einzahlen(double betrag) {
    this.kontoStand += betrag;
    this.setKontoStand(kontoStand);
  }
}
