public class App {
    public static void main(String[] args) {
        double[] numbers = { 5., 6., -3., 12, 6., 8. };
        String s = "Peter Piper Picked a peck of pickled peppers She sells sea shells down by the sea shore";
        String[] words = s.split(" ");
        int n = numbers.length;
        int nWords = words.length;

        print(numbers, n);
        sort(numbers, n);
        print(numbers, n);

        print(words, nWords);
        sort(words, nWords);
        print(words,nWords);

        System.out.println("Done!");
    }

    public static void sort(String[] numbers, int n) {
        int locationOfSmallestItemSoFar;
    
        for (int i = 0; i < (n - 1); i++) {
            locationOfSmallestItemSoFar = i;
            int oldTop = i;
            for (int j = (i + 1); j < n; j++) {
                if (numbers[j].compareToIgnoreCase( numbers[locationOfSmallestItemSoFar]) < 0) {
                    locationOfSmallestItemSoFar = j;
                }
            }
        
            // swap
            String temp = numbers[locationOfSmallestItemSoFar];
            numbers[locationOfSmallestItemSoFar] = numbers[oldTop];
            numbers[oldTop] = temp;
        }
    }

    private static void print(String[] words, int n) {
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] %s\n", i, words[i]);
        }

        System.out.println("----------------");
    }
    
    public static void sort(double[] numbers, int n) {
        int locationOfSmallestItemSoFar;

        for (int i = 0; i < (n - 1); i++) {
            locationOfSmallestItemSoFar = i;
            int oldTop = i;
            for (int j = (i + 1); j < n; j++) {
                if (numbers[j] < numbers[locationOfSmallestItemSoFar]) {
                    locationOfSmallestItemSoFar = j;
                }
            }

            // swap
            double temp = numbers[locationOfSmallestItemSoFar];
            numbers[locationOfSmallestItemSoFar] = numbers[oldTop];
            numbers[oldTop] = temp;
        }
    }

 
    public static void print(double[] numbers, int n) {
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] %f\n", i, numbers[i]);
        }

        System.out.println("----------------");

    }
}
