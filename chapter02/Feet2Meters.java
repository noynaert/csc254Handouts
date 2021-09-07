package chapter02;

/**
 * This program converts feet to meters. 
 * 
 * The user is asked to type the distance in feet into the keyboard.
 * The program calculates the equivalent distance in meters
 * Output in feet and meters is printed.
 * 
 * @ Evan Noynaert
 * @ since September 2021
 */

import java.util.Scanner;

public class Feet2Meters {
    public static void main(String[] args) {
        final double FEET2METERS = .3048;
        double feet; // user input in feet
        double meters; // calculated distance in meters
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("\nHow many feet? ");
        feet = input.nextDouble();

        //Calculate the meters
        meters = feet * FEET2METERS;

        //Output
        System.out.println(feet+" feet is equivalent to approximately "+meters+" meters.\n");


    }

}
