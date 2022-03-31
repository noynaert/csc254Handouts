public class App {
    public static void main(String[] args) {
        String fileName;
        int numberOfLockers;
        String[] lockers;
        int n;

        if (args.length >= 2) {
            fileName = args[0];
            numberOfLockers = parseNumberOfLockers(args[1]);
        }
        System.out.println("Done!");
    }

    public static int parseNumberOfLockers(String arg) {
        int result; // 0 is the default number of lockers
        try {
            result = Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }
}
