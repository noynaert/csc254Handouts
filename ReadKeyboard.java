//Illustrates reading from keyboard

import java.util.Scanner;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html

public class ReadKeyboard{
    public static void main(String[] args){
        int whole;
        double x;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        whole = keyboard.nextInt();
        System.out.println("Whole number is " + whole);

        System.out.print("Enter a double: ");
        x = keyboard.nextDouble();
        System.out.println("Double is "+x);

    }
}