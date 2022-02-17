import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Strings

        // char letter;
        // String word;
        // byte number;

        // letter = 'Z';
        // word = "A";
        // number = (byte)letter;

        // System.out.println(number);

        // System.out.printf("The number is %d %c  \n ", number, number);
        // System.out.printf("The number is %d %c  \n ", (int)letter, letter);
woz.
        String word = "   Hello   ";
        word = word.toUpperCase().trim();
        //word = word.trim();
        System.out.println(word);

        Scanner input = new Scanner(System.in);
        System.out.print("Please type a letter and hit the Enter key ");
        char letter;
        word = input.next();
        letter = word.charAt(0);

        System.out.print("Please type a another letter and hit the Enter key ");
        letter = input.next().toUpperCase().charAt(0);

        System.out.println("The letter is " + letter);

        System.out.println("\ndone!");
    }
}
