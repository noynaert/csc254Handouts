package chapter03;

import java.util.Scanner;

/**
 * Demonstrates nested if statements
 */
public class NestedIf {
    public static void main(String[] args) {
        double temperature;
        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat is the temperature? ");
        temperature = input.nextDouble();
        System.out.print("\nIf the temperature is "+temperature+" I suggest that you ");

        if(temperature < 32.0){
            System.out.println("go ice skating.");
        }else if(temperature < 70.0){
            System.out.println("go hiking.");
        }else if(temperature < 85){
            System.out.println("go for a walk.");
        }else{
            System.out.println("go swimming.");
        }

        System.out.println("\nDone\n");
        input.close();
    }
}
