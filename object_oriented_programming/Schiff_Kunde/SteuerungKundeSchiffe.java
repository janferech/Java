import java.util.Scanner;

public class SteuerungKundeSchiffe {
    private Kunde[] meineKunden;

    public SteuerungKundeSchiffe() {
        meineKunden = new Kunde[5];
    }

    public void eingabeNeuenKundenAnlegen(){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < meineKunden.length; i++) {
            if (meineKunden[i] == null) {
                meineKunden[i] = new Kunde();
                System.out.print("Name des " + (i+1) + ". Kunden eingeben: ");
                meineKunden[i].setName(scn.nextLine());
                break;
            }
        }
    }

    public void eingabeNeuesSchiffAnlegen() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\n\nEingabe Kundennummer: ");
    int kundenNr = sc.nextInt();
    System.out.print("Eingabe Schiffstyp: (1: Motorschiff, 2: Segelschiff): ");
    int eingabe = sc.nextInt();
    
    for (int i = 0;i < this.meineKunden.length ;i++ ) {
       if (this.meineKunden[i] != null &&this.meineKunden[i].getKundenNr() == kundenNr ) {
        if (eingabe ==1){
          
        sc.nextLine(); 
        System.out.print("\nEingabe Schiffname: ");
        String name = sc.nextLine();
        System.out.print("\nEingabe Tonnage: ");
        double tonnage = sc.nextDouble();
        System.out.print("\nMotorleistung (in PS): ");
        double motorleistung = sc.nextDouble();

        this.meineKunden[i].neuesMotorSchiffAnlegen(name, tonnage, motorleistung);
             
    } else if (eingabe == 2) {
        sc.nextLine();
        System.out.print("\nEingabe Schiffname: ");
        String name = sc.nextLine();
        System.out.print("\nEingabe Tonnage: ");
        double tonnage = sc.nextDouble();
        System.out.print("\nEingabe Segelflaeche: ");
        double segelflaeche = sc.nextDouble();

          
        this.meineKunden[i].neuesSegelSchiffAnlegen(name, tonnage, segelflaeche);
          }  
        }
    } // end of for   
  }


    public void ausgabeKunden(){
        System.out.println("Ausgabe von Kunden: \n");
        for (int i = 0; i < meineKunden.length; i++) {
            if (meineKunden[i] != null) {
                System.out.println(meineKunden[i].getName() + ": " + meineKunden[i].getKundenNr());
            }
        }
    System.out.println();
    }

    public void ausgabeKundenMitIhrenSchiffen(){ //Relevant Arbeit 22.12
        for (int i = 0; i < meineKunden.length; i++) {
            if (meineKunden[i] != null) {
                System.out.println("Alle Schiffe von " + meineKunden[i].getName() + "(Kundennr: " + meineKunden[i].getKundenNr() + ") : ");
        
                for (int j = 0; j < meineKunden[i].getMeineSchiffe().length; j++) {
          
                    if (meineKunden[i].getMeineSchiffe()[j] != null) {
                       System.out.println((j+1) + ".\t Schiff: " + meineKunden[i].getMeineSchiffe()[j].getName() + "\n\t  Schiffstyp: " + meineKunden[i].getMeineSchiffe()[j].getSchiffTyp() +
                       "\n\t  Tonnage: " + meineKunden[i].getMeineSchiffe()[j].getTonnage());
            
                        if (this.meineKunden[i].getMeineSchiffe()[j].getClass().getName().equals("Motorschiff")) {
                           //Checks if the ship is a motorschiff
              
                           MotorSchiff tempMS = (MotorSchiff)this.meineKunden[i].getMeineSchiffe()[j];//sets tempMs as the current ship
                                                                                                      //because its a motorschiff =Ms
                           System.out.println( "\n\tMotorleistung" + tempMS.getMotorleistung() + " PS");
                        }

                        if (this.meineKunden[i].getMeineSchiffe()[j] instanceof SegelSchiff) {
                           //Checks if the ship is a segelschiff
              
                           SegelSchiff tempSF = (SegelSchiff)this.meineKunden[i].getMeineSchiffe()[j];  //sets tempSf as the current ship
                                                                                                        //because its a motorschiff =SF
                           System.out.println( "\n\tSegelflaeche" + tempSF.getSegelFlaeche() + " qm");  
                        }
                    }
                }
            }
        }
    }

    public void menue() {
        Scanner scn = new Scanner(System.in);
        
            System.out.println("Auswahlmenü:");
            System.out.println("Neuen Kunden anlegen:                        ---> 1");
            System.out.println("Neues Schiff anlegen:                        ---> 2");
            System.out.println("Alle Kunden mit KundenNr ausgeben:           ---> 3");
            System.out.println("Alle Kunden mit ihren Schiffen ausgeben:     ---> 4");
            System.out.println("Programm beenden:                            ---> 0");
            System.out.print("\nEingabe:");
            
            switch (scn.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    eingabeNeuenKundenAnlegen();
                    break;
                case 2:
                    eingabeNeuesSchiffAnlegen();
                    break;
                case 3:
                    ausgabeKunden();
                    break;
                case 4:
                    ausgabeKundenMitIhrenSchiffen();
                    break;
            }
    this.menue();  
        }
    

    public static void main(String[] args) {
        SteuerungKundeSchiffe s = new SteuerungKundeSchiffe();
        s.menue();
    }
}
