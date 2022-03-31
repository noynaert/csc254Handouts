public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Args[0] is " + args[0]);
        // System.out.println("Args[1] is " + args[1]);
        // System.out.println("Done!");
        // System.out.printf("There are %d items in the args array\n", args.length);

        double x;
        x = 5;
        double[] numbers;
        numbers = new double[5];
        String[] names = new String[5];
        names[0] = "Fred";
        names[1] = "Barney";
        names[2] = "Wilma";

        int n = 3;

        // for (int i = 0; i < n; i++) {
        //     System.out.printf("[%d] is %s\n", i, names[i]);
        // }
        print(names, n);
        print("Hi, there");
    }

    public static void print(String[] people, int n) {  //signature is name of function plus the data types of the arguments
        System.out.printf("----- There are %d people.  The list may hold up to %d -----\n", n, people.length);

        //Print the people
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d is %s\n", i, people[i]);
        }

        //Print a footer
        System.out.println("-----------------------");
    }

    //method overloading
    public static void print(String message) {  //The signature is print plus string
        System.out.printf("The message is \"%s\"\n", message);
   }

}
