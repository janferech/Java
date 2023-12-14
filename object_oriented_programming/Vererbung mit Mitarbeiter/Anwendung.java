/**
  *
  * Loesung Aufgabe 1: Mitarbeiter - Angestellter
  * @author Michael Schlosser
  */

public class Anwendung {
    public static void main(String[] args) {

        Arbeiter arb1 = new Arbeiter();
        Arbeiter arb2 = new Arbeiter();
        Arbeiter arb3 = new Arbeiter();

        AkkordArbeiter akkordArb1 = new AkkordArbeiter();

        System.out.println("\tArbeiter 1:");
        arb1.kennungArbeiter("Hans-Dampf KG");
        arb1.setEinkommen();
        arb1.abrechnung();
        System.out.println("\t-----------------------------------------------");

        System.out.println("\tArbeiter 2:");
        arb2.kennungArbeiter("Hans-Dampf KG");
        arb2.setEinkommen(80);
        arb2.abrechnung();
        System.out.println("\t-----------------------------------------------");

        System.out.println("\tArbeiter 3:");
        arb3.kennungArbeiter("Hans-Dampf KG");
        arb3.setEinkommen(120, 15);
        arb3.abrechnung();
        System.out.println("\t-----------------------------------------------");

        System.out.println("\tAkkordarbeiter 1:");
        akkordArb1.kennung("Hans-Dampf KG");
        akkordArb1.setEinkommen(500, 0.16, 10);
        akkordArb1.abrechnung();
        System.out.println("\t-----------------------------------------------");
    }
}
