import java.util.*;


public class Length_converter{

static double meter;
static int which_length;
static double temp_result;

    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {

        length_converter.input();
        length_converter.meters_to_which_length(meter);


    System.out.println(meters_to_which_length(meter));
    }


    public static void input(){

        System.out.println("Längenmaß: \n1: feet\n2: yard");
        which_length = sc.nextInt();

        System.out.println("Meter:");
        meter = sc.nextDouble();

    }

    public static double meters_to_which_length(double meter){

        if(which_length == 1){
            temp_result = meter * 3.2808;
            return temp_result;
        } else if(which_length == 2){
            temp_result = meter * 1.0936132983377;
            return temp_result;
        }else{ 
            System.out.println("Die Zahl kann nur 1 oder 2 sein!");
        }
        return 0;
    }
}

