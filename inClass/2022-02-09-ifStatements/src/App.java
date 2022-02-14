import java.util.Scanner;

/**
 * Illustrates if statements
 * 
 * @author J. Evan Noynaert
 * @since  February, 2022
 */

public class App {

    // This is a comment

    public static void main(String[] args) throws Exception {

        boolean isEligible; //You can enlist in the army if you are at least 18 
                            //but not over 35.
        byte age;
        int collegeCredit;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        
        System.out.print("How old are you? ");
        age = keyboard.nextByte();
        System.out.print("How many hours of college credit do you have? ");
        collegeCredit = keyboard.nextInt();

        System.out.printf("You are %d years old and have %d college credits.\n\n", age, collegeCredit);

        //The bad way to code this
        if (age >= 18 && age <= 35) {
            isEligible = true;
        } else {
            isEligible = false;
        }

        // better way to do exactly the same thing.
        isEligible = (age >= 18 && age <= 35);

        //The bad way to code (bad for two reasons)
        // if (isEligible == true) 
        //     System.out.println("You may enlist");
        //  else 
        //      System.out.println("Sorry.  You are not eligible");
        //      System.out.println("You must be 18 through 35");
        

        if (isEligible) {
            System.out.println("You may enlist");
            if (collegeCredit >= 120) {
                System.out.println("\tYou may also apply to Officer Training School");
            } else {
                System.out.printf("\tIf you earn %d more hours of college credit, you could apply to OTS",
                        120 - collegeCredit);
            }
        } else {  //The person is not eligible
            System.out.println("Sorry.  You are not eligible");
            if (age < 18) {
                System.out.println("You must be at least 18 years old");
                System.out.printf("Please apply again in about %d years.\n", 18 - age);
            } else  if (age > 35) {
                System.out.println("The maximum age is 35.");
            }
        } 



        System.out.println("\ndone!");
    }
}

/*
This is a multiline comment
Another line
*/
