/**
 * This program converts feet to meters
 * 
 * @author J. Evan Noynaert
 * @since  January 2022
 */

public class App {
    public static void main(String[] args) {
        final double FEET2METERS = .3048;
        double feet = 300;

        double meters;

        meters = feet * FEET2METERS;

        System.out.println(feet + " feet is roughly " + meters + " meters.");
        
        
        System.out.println("\nDone!");
    }
}
