public class Kunde {

  // Anfang Attribute
  private int kundenNr;
  private String kundenName; // Instanzvariable
  private Konto[] meineKonten; // Referenzvariable
  // Ende Attribute

  public Kunde(int kundenNr, String kundenName) {
    this.kundenNr = kundenNr;
    this.kundenName = kundenName;
    this.meineKonten = new Konto[3];
  }

  // Anfang Methoden
  public int getKundenNr() {
    return this.kundenNr;
  }

  public void setKundenNr(int kundenNr) {
    this.kundenNr = kundenNr;
  }

  public String getKundenName() {
    return this.kundenName;
  }

  public void setKundenName(String kundenName) {
    this.kundenName = kundenName;
  }
  public void setKonto(Konto meineKonten){
    //this.meineKonten = meineKonten;
  }

  public Konto[] getMeineKonten(){
    return this.meineKonten;
  }

  public boolean neuesKontoAnlegen(String kontoNr, String kontoTyp) { // wichtige methode --> arbeit
    for (int i = 0; i < this.meineKonten.length; i++) {
      if (this.meineKonten[i] == null) { // //NullPointerException verhindern
        this.meineKonten[i] = new Konto(kontoNr);
        this.meineKonten[i].setKontoTyp(kontoTyp);
        return true;
      }
    }
    return false;
  }

  public void kontenUebersicht() {
    System.out.println("\n\nKontenuebersicht");
    System.out.println(this.getKundenName() + " (Kundennummer: " + this.getKundenNr() + ") hat folgende Konten:");
    for (int i = 0; i < meineKonten.length; i++) {
      if (meineKonten[i] != null) { // NullPointerException verhindern
        System.out.println(
            (i + 1) + ". Konto: " + this.meineKonten[i].getKontoTyp() + " " + this.meineKonten[i].getKontoNr());
      }
    }
  }

  public double abfrageKontoStand(String kontoNr) {

    for (int i = 0; i < this.meineKonten.length; i++) {
      if (this.meineKonten[i] != null && this.meineKonten[i].getKontoNr().equals(kontoNr)) {
        return this.meineKonten[i].getKontoStand();
      }
    }
    return Double.NaN;
  }

  public boolean einzahlen(String kontoNr, double betrag) {
    for (int i = 0; i < this.meineKonten.length; i++) {
      if (this.meineKonten[i] != null && this.meineKonten[i].getKontoNr().equals(kontoNr)) {
        this.meineKonten[i].einzahlen(betrag);
        return true;
      }
    }
    return false;
  }

  public boolean auszahlen(String kontoNr, double betrag) {
    for (int i = 0; i < this.meineKonten.length; i++) {
      if (this.meineKonten[i] != null && this.meineKonten[i].getKontoNr().equals(kontoNr)) {
        this.meineKonten[i].auszahlen(betrag);
        return true;
      }
    }
    return false;
  }

  public boolean loescheKonto(String kontoNr) {
    for (int i = 0; i < this.meineKonten.length; i++) {
      if (this.meineKonten[i] != null && this.meineKonten[i].getKontoNr().equals(kontoNr)) {
        this.meineKonten[i] = null;
        return true;
      }
    }
    return false;
  }
  // Ende Methoden
}
