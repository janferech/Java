import java.util.*;

public class SteuerungFormen{
  
  private RechteckNeu rtn;   //Objekt/Instanz erstellen ---> Referenzattribute
  private Quader meinQuader;
  private Kreis meinKreis;
  private Kugel meineKugel;

  public void eingabe(){
    Scanner sc = new Scanner(System.in);
    
    rtn = new RechteckNeu();
    meinQuader = new Quader();
    meinKreis = new Kreis();
    meineKugel = new Kugel();
    
    System.out.println("Bitte geben Sie die Laenge der Seite A ein (Rechteck): ");
    rtn.setSeiteA(sc.nextDouble());
    
    System.out.println("Bitte geben Sie die Laenge der Seite B ein (Rechteck): ");
    rtn.setSeiteB(sc.nextDouble());
    
    System.out.println("Bitte geben Sie die L�ngen der Seite A des Quaders ein: ");     
    meinQuader.setSeiteA(sc.nextDouble());
    
    System.out.println("Bitte geben Sie die L�ngen der Seite B des Quaders ein: ");     
    meinQuader.setSeiteB(sc.nextDouble());
    
    System.out.println("Bitte geben Sie die L�ngen der Seite C des Quaders ein: ");     
    meinQuader.setSeiteC(sc.nextDouble());
    
    System.out.println("Bitte geben Sie den Radius des Kreises ein: ");
    meinKreis.setRadius(sc.nextDouble());
    
    System.out.println("Bitte geben Sie den Radius der Kugel ein: ");
    meineKugel.setRadius(sc.nextDouble());
                              
    sc.close();  
  }
  
  public void ausgabe(){
    
    System.out.println("Flaeche des Rechtecks: " + rtn.berechneFlaeche());
    System.out.println("Umfang des Rechtecks: " + rtn.berechneUmfang());
    
    System.out.println("Oberflaeche: " + meinQuader.berechneOberflaeche());
    System.out.println("Umfang des Quaders: " + meinQuader.berechneVolumen());
    
    System.out.println("Flaeche: " + meinKreis.berechneFlaeche());
    System.out.println("Umfang des Kreis: " + meinKreis.berechneUmfang());
    
    System.out.println("Flaeche: " + meineKugel.berechneOberflaeche());
    System.out.println("Umfang des Kreis: " + meineKugel.berechneVolumen());
    }
  
  public static void main(String [] args){
    
    SteuerungFormen strg = new SteuerungFormen();
    
    System.out.println();
    System.out.println("***************************Mathematische K�rper***************************");
    System.out.println("\n");
    strg.eingabe();
    strg.ausgabe();
    }
}

