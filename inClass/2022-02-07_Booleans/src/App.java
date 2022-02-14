import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int peopleHome;
        boolean lightsOn;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many people are home? ");
        peopleHome = keyboard.nextInt();

        lightsOn = (peopleHome > 0);

        System.out.println("Lights are on? " + lightsOn);
        
    }
}
