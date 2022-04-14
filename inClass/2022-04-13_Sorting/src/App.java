public class App {
    public static void main(String[] args) {
        double[] numbers = { 5., 6., -3., 12, 6., 8. };
        String s = "Peter Piper Picked a peck of pickled peppers She sells sea shells down by the sea shore";
        String[] words = s.split(" ");
        int n = numbers.length;
        int nWords = words.length;

        print(numbers, n);
        moveSmallestToTop(numbers, n);
        print(numbers, n);

        System.out.println("Done!");
    }
    
    public static void moveSmallestToTop(double[] numbers, int n) {
        int locationOfSmallestItemSoFar = 0;
        
        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[locationOfSmallestItemSoFar]) {
                locationOfSmallestItemSoFar = i;
            }

        }
        //
        double temp = numbers[locationOfSmallestItemSoFar];
        numbers[locationOfSmallestItemSoFar] = numbers[0];
        numbers[0] = temp;
    }


    private static void print(String[] words, int n) {
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] %s\n", i, words[i]);
        }

        System.out.println("----------------");
    }

    public static void print(double[] numbers, int n){
        System.out.println("----------------");
        for(int i = 0; i<n; i++){
            System.out.printf("[%d] %f\n", i, numbers[i]);
        }
        
        System.out.println("----------------");
        
    }
}
