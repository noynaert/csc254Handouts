public class App {
    public static void main(String[] args) {
        printLocker(5, "Lilly");
        printLocker(11, "Harold");

        String[] lockers = new String[50];
        int n = 3;
        lockers[0] = "Lilly";
        lockers[1] = "Harold";
        lockers[2] = "Aaron";
        printRoster(lockers, n);   //signature of print is the name of the function, plus the datatypes of the arguments.
        System.out.println("Done!");
    }
    
    private static void printRoster(String[] lockers, int numberOfLockers) {
        System.out.printf("----- Roster of Locker Users -----\n");
        for (int i = 0; i < numberOfLockers; i++) {
            printLocker(i, lockers[i]);  // signature of print is the name of the function, plus an int and String
        }
        double percent = 100.0 * numberOfLockers / lockers.length; 
        System.out.printf("----- %d of %d lockers were assigned (%1.0f%%)\n ------", numberOfLockers, lockers.length,
                percent);
        System.out.println("The percentage is " + percent + "%");
    }

    public static void printLocker(int number, String name) {
        System.out.printf("Locker %04d belongs to %s\n", number, name);
    }
}
