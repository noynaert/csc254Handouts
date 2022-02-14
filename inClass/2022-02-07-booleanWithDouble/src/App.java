import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double temperature;
        boolean hasFever;
        boolean hasLowFever;
        boolean isOK;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your temperature (in Fahrenheit)? ");
        temperature = input.nextDouble();

        hasFever = (temperature > 101.4);
        hasLowFever = (temperature > 98.6 && temperature < 101.4);
        //hasLowFever = (temperature > 98.6 && < 101.4);
        isOK = !hasFever;

        System.out.println("Temperature is " + temperature);
        System.out.println("Has a fever: " + hasFever);
        System.out.println("Has a low fever: " + hasLowFever);
        System.out.println("Is healthy: " + isOK);


        System.out.println("\nDone!");
    }
}
