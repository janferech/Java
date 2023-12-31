/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.12.2023
 * @author Janferech
 */
public class Kunde {
    private static int kundenstammNr = 1000;
    private int kundenNr;
    private String name;
    private Schiff[] meineSchiffe;

    public Kunde(){
        this.meineSchiffe = new Schiff[5];
        this.kundenNr = kundenstammNr;
        this.kundenstammNr++;

    }

    public int getKundenNr() {
        return kundenNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Schiff[] getMeineSchiffe() {
        return meineSchiffe;
    }

    public void setMeineSchiffe(Schiff[] meineSchiffe) {
        this.meineSchiffe = meineSchiffe;
    }

    public boolean neuesSchiffAnlegen(String name, double tonnage){
        for (int i = 0; i < meineSchiffe.length; i++) {
            if (meineSchiffe[i] == null) {
                meineSchiffe[i] = new Schiff(name, tonnage);
                return true;
            }
        }
        return false;
    }

    public boolean neuesMotorSchiffAnlegen(String name, double tonnage, double leistung) {
        for (int i = 0; i < meineSchiffe.length; i++) {
            if (meineSchiffe[i] == null) {
                meineSchiffe[i] = new MotorSchiff(name, tonnage, leistung);
                return true;
            }
        }
        return false;
    }

    public boolean neuesSegelSchiffAnlegen(String name, double tonnage, double segelflaeche) {
        for (int i = 0; i < meineSchiffe.length; i++) {
            if (meineSchiffe[i] == null) {
                meineSchiffe[i] = new SegelSchiff(name, tonnage, segelflaeche);
                return true;
            }
        }
        return false;
    }
}
