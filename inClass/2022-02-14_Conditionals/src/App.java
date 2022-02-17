import java.util.Scanner;

/** Illustrates Conditional operator */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        char letter;
        letter = 'h';

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%c is a vowel\n", letter);
                break;
            case 'y':
                System.out.println("Sometimes y is a vowel");
                break;
            default:
                System.out.printf("%c is NOT vowel", letter);
        }

        // int dayNumber;
        // System.out.print("What day number is it? Monday = 1, Tuesday = 2, etc. ");
        // dayNumber = input.nextInt();

        // switch (dayNumber) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 0:
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.printf("%d is not a valid day number.\n", dayNumber);
        // }

        // // System.out.print("What is the temperature (F)? ");
        // // double temperature = input.nextDouble();
        // // String coat;

        // // if (temperature > 70) {
        // // coat = "You don't need a coat.";
        // // } else {
        // // coat = "You might need a coat";
        // // }

        // coat = (temperature > 70) ? "You don't need a coat." : "You might need a
        // coat.";

        // System.out.printf("%1.1f degrees. %s\n", temperature, coat);

        System.out.println("\nDone!");
    }
}
