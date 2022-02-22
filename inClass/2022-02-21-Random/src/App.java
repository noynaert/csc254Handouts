public class App {
    public static void main(String[] args) throws Exception {
        double x = Math.random();
        String coin;
        int die;

        System.out.printf("A random number is %1.15f\n", x);

        if (x < 0.5) {
            coin = "Heads";
        } else {
            coin = "Tails";
        }
        System.out.println("The coin is " + coin);

        if (x < 1.0 / 6.0)
            die = 1;
        else if (x < 2.0 / 6.0)//.333333
            die = 2;
        else if (x < 3.0 / 6.0)//.5000000
            die = 3;
        else if (x < 4. / 6)
            die = 4;
        else if (x < 5/6.0)
            die = 5;
        else 
            die = 6;

        die = (int)Math.floor(x * 6) + 1;

        System.out.printf("The die shows %d\n", die);

        
        System.out.println("\nDone");
    }
}
