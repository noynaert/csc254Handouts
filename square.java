public class square {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count++;
                System.out.printf("i: %d, j: %d count: %d\n", i, j, count);
            }
        }
    }
}
