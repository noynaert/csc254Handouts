/**
 * demonstrate for loops
 * 
 * 
 */


public class App {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) { // initialize; test; increment
            System.out.println("Something " + i);
        }
        // O(n)  Linear

        //The initialize clause happens one time before the loop starts.
        //The test happens before each "iteration" of the loop.  Must be a boolean expression
        //Increment happens after each iteration of the loop.

        // int i = 0;
        // while (i < n) {
        //     System.out.println("Same thing " + i);
        //     i++;
        // }

        /*
        0 * 6 = 0
        1 * 6 = 6
        2 * 6 = 12
        3 * 6 = 18
        4 * 6 = 24
        ...
        9 * 6 = 54 
        */

        n = 10;
        for (int j = 0; j < n; j++) {
            for (int i = j; i < n; i++) {
                int answer = 0;
                answer = i * j;
                System.out.printf("%d * %d = %d\n", i, j, answer);
            }
            System.out.println("=================================");
        }
        //System.out.println(answer);
        //scope of a variable.

        //Growth rate of "n squared"
        //  O(n^2)
        System.out.println("done!");
    }
    
    
    
}
