public class Arbeiter extends Mitarbeiter {
    protected double standart = 18;
    protected double durschnitt_Arbeitszeit = 140;

    public void kennungArbeiter(String arbeitsplatz) {
        super.firma = arbeitsplatz;
        System.out.println("\tIch bin ein Arbeiter der " + firma + "." );
    }

    public void setEinkommen() {
        super.einkommen = standart * durschnitt_Arbeitszeit;
    }

    public void setEinkommen(double geleisteteStunden) {
        super.einkommen = standart * geleisteteStunden;
    }

    public void setEinkommen(double geleisteteStunden, double stundenlohn) {
        super.einkommen = geleisteteStunden * stundenlohn;
    }
}
