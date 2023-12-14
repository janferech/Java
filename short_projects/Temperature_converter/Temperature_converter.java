import java.util.*;
import java.text.*;

public class Temperature_converter {

    static double inputNumber;
    static int which_temperature;
    static String temperature_name;
    static double result;

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("##.##"); 

    public static void main(String[] args) {
        char loop_Main = 'y';
        
        do {
        input_temperature_and_number();
        result = converter(inputNumber);
        System.out.println("Result: " + df.format(result) + " " + temperature_name);

        System.out.println("\n\nWould you like to convert another number? (y/n)");
        loop_Main = sc.next().charAt(0);

        }while(loop_Main == 'Y' || loop_Main == 'y');
    }

    public static void input_temperature_and_number() {
        System.out.println("What is the celsius number you wish to convert?");
        inputNumber = sc.nextDouble();

        System.out.println("Which temperature scale would you like to use to convert Celsius to it:");
        System.out.println("0 = Kelvin (Example: 0 Kelvin = -273 Celsius)");
        System.out.println("1 = Fahrenheit (Example: 32 Fahrenheit = 0 Celsius)");
        which_temperature = sc.nextInt();
    }

    public static double converter(double i) {
        switch (which_temperature) {
            case 0:
                i = inputNumber + 273.15;
                temperature_name = "Kelvin";
                break;
            case 1:
                i = (inputNumber * 9 / 5) + 32;
                temperature_name = "Fahrenheit";
                break;
            default:
                System.out.println("Your Number could not get converted");
                break;
        }
        return i;
    }
}
