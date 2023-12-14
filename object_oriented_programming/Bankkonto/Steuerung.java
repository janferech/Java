import java.util.Scanner;

public class Steuerung {
  // Anfang Attribute
  private Kunde meinKunde;
  // Ende Attribute

  public static void main(String[] args) {
    Steuerung st = new Steuerung();
    st.eingabeNeueKundenDaten();
    st.auswahlMenue();
  }

  // Anfang Methoden
  public void eingabeNeueKundenDaten() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nName des Kontoinhabers: ");
    String kundenName = sc.nextLine();
    System.out.print("Eingabe Kundennr: ");
    int kundenNr = sc.nextInt();
    this.meinKunde = new Kunde(kundenNr, kundenName);

  }

  public void eingabeNeuesKontoAnlegen() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\n\nKontoNr: ");
    String kontoNr = sc.next();
    System.out.print("Eingabe Kontotyp: ");
    String kontoTyp = sc.next();

    if (this.meinKunde.neuesKontoAnlegen(kontoNr, kontoTyp)) {
      System.out.println("\nKonto wurde angelegt");
    } else {
      System.out.println("Konto konnte nicht angelegt werden!");
    }
  }

  public void auswahlMenue() {
    Scanner sc = new Scanner(System.in);

    System.out.println("\n\nAuswahlmenü");
    System.out.println("Neues Konto eroeffnen:   ---> 1");
    System.out.println("Kontenuebersicht         ---> 2");
    System.out.println("Abfrage Kontostand       ---> 3");
    System.out.println("Einzahlung:              ---> 4");
    System.out.println("Auszahlung:              ---> 5");
    System.out.println("Konto loeschen:          ---> 6");
    System.out.println("Programmbeenden:         ---> 0");
    System.out.print("Auswahleingabe:\t\t");

    switch (sc.nextInt()) {
      case 1: {
        this.eingabeNeuesKontoAnlegen();
        break;
      }
      case 2: {
        this.meinKunde.kontenUebersicht();
        break;
      }
      case 3: {
        this.abfrageKontoStand();
        break;
      }
      case 4: {
        this.einzahlen();
        break;
      }
      case 5: {
        this.auszahlen();
        break;
      }
      case 6: {
        this.loescheKonto();
        break;
      }
      case 0: {
        return;
      }
    }

    this.auswahlMenue(); // recursion

  }

  public void abfrageKontoStand() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Eingabe Kontonummer: ");
    String kontoNr = sc.nextLine();
    System.out.println("Kontostand: " + this.meinKunde.abfrageKontoStand(kontoNr));
  }

  public void einzahlen() {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEingabe Kontonummer: ");
    String kontoNr = sc.nextLine();
    System.out.print("\nEingabe Betrag zum einzahlen: ");
    double betrag = sc.nextDouble();
    this.meinKunde.einzahlen(kontoNr, betrag);

  }

  public void auszahlen() {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEingabe Kontonummer: ");
    String kontoNr = sc.nextLine();
    System.out.print("\nEingabe Betrag zum auszahlen: ");
    double betrag = sc.nextDouble();
    this.meinKunde.auszahlen(kontoNr, betrag);

  }

  public void loescheKonto() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Eingabe der Kontonummer: ");
    if (this.meinKunde.loescheKonto(sc.nextLine())) {
      System.out.println("Konto wurde geloescht");
    } else {
      System.out.println("Konto wurde nicht geloescht");
    }
  }
}
