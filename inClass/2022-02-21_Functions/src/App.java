public class App {
    public static void main(String[] args) throws Exception {
        double x = 25;
        double y = 1.0 / 3.0;
        double z;

        z = Math.pow(x, y);
        System.out.printf("%f raised to the power %f is %f\n", x, y, z);
        System.out.println(2.924018 * 2.924018 * 2.924018);

        System.out.println(Math.log10(1000));
        System.out.println("\nROUNDING");
        
        x = 25.000006714746128;
        System.out.printf("%1.15f rounded off is %d\n", x, Math.round(x));

        x = Math.PI;
        System.out.printf("%1.15f rounded off is %1.3f\n", x, Math.round(x * 1000) / 1000.);
        
        System.out.printf("The floor of %1.15f  is %f\n", x, Math.floor(x));
        System.out.printf("The ceil of %1.15f is %f\n", x, Math.ceil(x));

        

        System.out.println("\nDone!");
    }
}
