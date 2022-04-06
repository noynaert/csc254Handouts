public class App {
    public static void main(String[] args) {
        final int MAX = 5;
        int n = 0; //number of items in the array

        double[] nums = new double[MAX];
        nums[0] = -3.00;
        nums[1] = 2.14;
        nums[2] = -3.0;
        nums[3] = 99.9;
        n = 4;

        // double[] nums = { 3.14, 2.14, -3, 99.9 };
        // n = nums.length;

        print(nums, n);
        int locationOfSmallest = findSmallest(nums, n);
        System.out.printf("The smallest item is %f at index %d\n", nums[locationOfSmallest], locationOfSmallest);
        System.out.println("Done!");
    }

    //assume that there is at least one item in the array
    public static int findSmallest(double[] list, int n) {
        int location;
        double smallestSoFar;

        location = 0;
        smallestSoFar = list[0];

        for (int i = 1; i < n; i++) {
            if (list[i] <= smallestSoFar) {
                location = i;
                smallestSoFar = list[i];
            }
        }

        return location;
    }

    public static void print(double[] list, int n) {
        System.out.printf("---------------- %d\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] is %f\n", i, list[i]);
        }
        System.out.println("----------------");
    }
}
