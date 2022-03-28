import java.util.Scanner;

public class App {
    public static void main(String[] args){

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // double x = input.nextDouble();
        // System.out.print("Enter another number: ");
        // double y = input.nextDouble();
        double x = getNumber();
        double y = getNumber();

        System.out.printf("You entered %f and %f\n", x, y);
        double result = max(x, y);
        System.out.printf("The maximum was %f\n", result);
        double average = calculateAverage(x, y);
        double a = 7;
        result = max(-3, a);
        System.out.printf("The maximum was %f\n", result);

        printHeader("Done!");        
    }

    private static double calculateAverage(double x, double y) {
        return 0;
    }

    public static double getNumber() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double result = kbd.nextDouble();
        return result;
    }

    //scope  -- the parts of the program where an id is recognized.
    public static double max(double a, double b) {
        double result = a;
        String message = "Finding the maximum of " + a + " and " + b;
        printHeader(message);
        if (b > a) {
            result = b;
        }
        a = -99.999;
        return result;
    }

    public static void printHeader(String message) {
        System.out.println("------------------");
        System.out.println(message);
        System.out.println("------------------");

    }
}
//  call by value  -- Java only uses call by value
//  call by reference