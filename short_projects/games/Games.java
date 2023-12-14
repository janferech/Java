//import java.text.*;
import java.util.*;

public class Games{

    static int which_game;
    static int which_game_type_RPSF;
    static int item_pick;
    static boolean won = false;
    static String final_text;
    static char loop = 'y';
    
    static Random random_number_bot = new Random();

    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){

        
        System.out.println("****************************************");
        System.out.println("\t\tGames");
        System.out.println("****************************************\n");

        games.input_game();

        if(which_game == 1){
            games.pick_game_rules_rock_paper_scissors();
            games.rock_paper_scissors_rules_winning();  
            
        }else if(which_game == 2){   
            }else{
                System.out.println("No game found under the number of "+ which_game +" 1");
            }
    }

    public static void input_game(){

        System.out.println("\nWhich game would you like to play:\n\n1: Rock, papers, scissors\n2: Battleship");
            which_game = sc.nextInt();
    }

    public static void pick_game_rules_rock_paper_scissors(){
        System.out.println("\nWhich rules would you like to follow in Rock, papers, scissors?\n1: Rock, papers, scissors\n2: Rock, papers, scissors, fountain");
        which_game_type_RPSF = sc.nextInt();    
    }
    public static void rock_paper_scissors_rules_winning() {
        

        if (which_game_type_RPSF == 2) {
            System.out.println(
                "\nHow to win:\n" +
                "Rock wins against Scissors\n" +
                "Paper wins against Stone\n" +
                "Paper wins against fountain\n" +
                "Fountain wins against Rock\n" +
                "Fountain wins against Scissors\n" +
                "Scissors win against paper\n"
            );
        } else if(which_game_type_RPSF == 1){
            System.out.println(
                "\nHow to win:\n" +
                "Rock wins against Scissors\n" +
                "Paper wins against Stone\n" +
                "Scissors win against paper\n\n"
            );
        }

        String name = "";

        
        System.out.print("Your name: ");
        name = sc.next();
        
        
    do {
        
        int random_number_bot_pick = random_number_bot.nextInt(4) + 1;
        if (which_game_type_RPSF == 1){   
            System.out.println(
                "\nPick list for " + name + "\n" +
                "1) Rock\n" +
                "2) Paper\n" +
                "3) Scissors\n" + 
                "Press the number of your item to pick\n"
                );
                item_pick = sc.nextInt();
            
        }else if (which_game_type_RPSF == 2){
                 
            System.out.println(
                "\nPick list for " + name + "\n" +
                "1) Rock\n" +
                "2) Paper\n" +
                "3) Scissors\n" +
                "4) Fountain\n" + 
                "Press the number of your item to pick\n"
                );
                item_pick = sc.nextInt();
                  
            }
            if (item_pick == random_number_bot_pick) {
                won = true;
                final_text = "You both picked the same item, so it is a draw!";
            } else if ((item_pick == 1 && random_number_bot_pick == 3) || (item_pick == 3 && random_number_bot_pick == 1)) {
                won = true;
                final_text = "Rock won against scissors, because the rock broke the scissors!";
            } else if ((item_pick == 1 && random_number_bot_pick == 2) || (item_pick == 2 && random_number_bot_pick == 1)) {
                won = true;
                final_text = "Paper won against rock, because the paper was folded around the stone!";
            } else if ((item_pick == 1 && random_number_bot_pick == 4) || (item_pick == 4 && random_number_bot_pick == 1)) {
                won = true;
                final_text = "Fountain won against rock, because the rock fell into the fountain!";
            } else if ((item_pick == 2 && random_number_bot_pick == 3) || (item_pick == 3 && random_number_bot_pick == 2)) {
                won = true;
                final_text = "Scissors won against paper, because the scissors cut through it!";
            } else if ((item_pick == 2 && random_number_bot_pick == 4) || (item_pick == 4 && random_number_bot_pick == 2)) {
                won = true;
                final_text = "Paper won against fountain, because the paper covered the fountain!";
            } else if ((item_pick == 3 && random_number_bot_pick == 4) || (item_pick == 4 && random_number_bot_pick == 3)) {
                won = true;
                final_text = "Fountain won against scissors, because the scissors fell into the fountain!";
            }
            System.out.println(final_text);
            System.out.println("\nThe Bot generated number: " + random_number_bot_pick);


         System.out.println("Would you like to play another round? (Y/N)");
            loop = sc.next().charAt(0);

          } while (!won || loop == 'y' || loop == 'Y'); 
       
        
        
        
        
        
    }

}