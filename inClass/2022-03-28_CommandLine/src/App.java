public class App {
    public static void main(String[] args) throws Exception {

        System.out.printf("There are %d arguments.\n", args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.printf("[%d] is %s\n", i, args[i]);
        }
        
        String s = args[4];
        int number = Integer.parseInt(s);
        System.out.printf("%s as a string is %d as an integer\n", s, number);
        double x = Double.parseDouble(args[5]);
        System.out.printf("%s as a string and as a real number it is %f\n", args[5], x);

        System.out.println("Done!");
    }
}
