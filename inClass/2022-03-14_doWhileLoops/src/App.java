import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // int number;
        
        // number=0;
        // while(number < 10){
        //     System.out.printf("%d and %d\n", number, number * number);
        //     number++;
        // }

        // Scanner input = new Scanner(System.in);
        // do{
        //     System.out.print("Pick a number from 1 through 10 ");
        //     number = input.nextInt();
        // } while (number < 1 || number > 10);
        // System.out.println("You picked " + number);
        
        //flip a coin, and count the heads and tails
        //quit when we have 30 heads.
        int headCount = 0;
        int tailCount = 0;

        do{
            double pick = Math.random();
            if(pick < 0.5){
                System.out.println("Heads   " + pick);
                headCount++;
            }else{
                System.out.println("Tails    " + pick);
                tailCount++;
            }
        } while (headCount < 30);
        System.out.printf("There were %d heads and %d tails\n", headCount, tailCount);

        System.out.println('\u03c0');
        double π = 3.14159;
        π = Math.PI;

        System.out.println("Done!");


        /*
         * 
         * Get user to pick a number between 10 and 9 quintillion
         * 
         * circleCount = 0
         * for i= 0 up to n
         * x = Math.random()
         * y = Math.random()
         * calculate radius as x*x + y*y
         * if radius < 1.0, then increment circleCount
         * 
         * ratio is circleCount/n
         * π is ratio * 4
         * Print the ratio, pi, and how far off from pi we are.
         * 
         * difference is Math.abs(π - Math.PI)
         * 
         */
    }
}
