
/** Searching arrays */
public class App {
    public static void main(String[] args) {

        double[] numbers = { 5., 6., -3., 12, 6., 8. };
        String s = "Peter Piper Picked a peck of pickled peppers She sells sea shells down by the sea shore";
        String[] words = s.split(" ");
        
        int n = numbers.length;
        print(numbers, n);
        double target = 6.0;
        int location = search(numbers, target, n);
        if (location == -1) {
            System.out.println("The target was not found.");
        } else {
            System.out.println("The target was found at location " + location);
        }

        //////////////////////////////////
     
        int nWords = words.length;
        print(words, n);
        String magicWord = "pETER";
        print(words, nWords);
        location = search(words, magicWord, nWords);
        if (location == -1) {
            System.out.printf("I did not find the word\n");
        } else {
            System.out.printf("The word %s (%s) was found at location %d\n", magicWord, words[location], location);
        }


        
        System.out.println("Done!");
    }

    private static void print(String[] words, int n) {
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] %s\n", i, words[i]);
        }

        System.out.println("----------------");
    }

    public static int search(String[] words, String target, int n) {
        int foundAt = -1;
        boolean found = false;
        int i = 0;
        while (!found && i < n) {
            if (words[i].compareToIgnoreCase(target) == 0) {
                found = true;
                foundAt = i;
            }
            i++;
        }

        return foundAt;
    }

    /**
     * Returns the location where the number is found,
     * Or returns -1 if not found.
   
     */
    public static int search(double[] numbers, double target, int n) {
        int foundAt = -1;
        boolean found = false;
        int i = 0;
        while (!found && i < n) {
            if (numbers[i] == target) {
                found = true;
                foundAt = i;
            }
            i++;
        }

        return foundAt;
    }

    public static void print(double[] numbers, int n){
        System.out.println("----------------");
        for(int i = 0; i<n; i++){
            System.out.printf("[%d] %f\n", i, numbers[i]);
        }
        
        System.out.println("----------------");
        
    }
}
