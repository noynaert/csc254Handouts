public class App {
    public static void main(String[] args){
        //final String YEN = "¥";
        final String YEN = "\u00A5";
        int cents;
        int quarters;
        int remaining;

        cents = 89;  //TODO:  change to user input

        quarters = 1089/25;
        System.out.print("Quarters: "+ quarters);
        remaining = cents % 25;
        System.out.println("   Remaining: " + remaining);
        System.out.printf("%d Quarters (%d%s Remaining)\n", quarters, remaining, YEN);
        System.out.printf("%d Quarters (%d¥ Remaining)\n", quarters, remaining);



        System.out.println("\nDone!");
    }
}
