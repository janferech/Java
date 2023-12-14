import java.util.Random;
import java.util.Scanner;

public class Random_password {

    static int anzahlZeichen = 16;                              //static-wert �bergreifend gemacht
    static String kleinBuchstaben = "abcdefghijklmnopqrstuvwxyz";
    static String grossBuchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String zahlen = "0123456789";
    static String symbole = "[]{}*;/,._-\"";
  
    static Scanner sc = new Scanner(System.in);

    public static void eingabe() {
        
        System.out.print("Wie viele Zeichen soll dein Passwort haben? (Standardmaessig 16 Zeichen): ");
        anzahlZeichen = sc.nextInt();
        
    }

    public static String verarbeitung() {
        String gesamt = kleinBuchstaben + grossBuchstaben + zahlen + symbole;
        Random ran = new Random();
        char[] passwort = new char[anzahlZeichen];

        for (int i = 0; i < anzahlZeichen; i++) {
            int randomIndex = ran.nextInt(gesamt.length());
            passwort[i] = gesamt.charAt(randomIndex);
        }
        return new String(passwort);
    }

    public static void main(String[] args) {

        char loop = 'j';
    
        while (Character.toLowerCase(loop) == 'j') {
            eingabe();
            String passwortAusgabe = verarbeitung();       //Methode aufrufen + Passwort generieren lassen
            System.out.println("Generiertes Passwort: " + passwortAusgabe);

            System.out.print("\n\nMoechtest du ein weiteres Passwort generieren? (j/n): ");
            System.out.println();
            loop = sc.next().charAt(0);
        }
        sc.close();
    }
}
