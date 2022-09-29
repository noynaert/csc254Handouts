package chapter03;

import java.util.Scanner;

/**
 * Demonstrates using a boolean variable
 */
class LightsOn{
    public static void main(String[] args){
        int peopleHome = 0;
        boolean lightsOn = false;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many people are home? ");
        peopleHome = input.nextInt();
        lightsOn = peopleHome > 0;
        System.out.println("Lights on: "+lightsOn);
    }
}