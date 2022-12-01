import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            final int MAX =10;
            double[] numbers = new double[MAX];
            int n;

            n = readList(numbers, MAX);
            System.out.printf("I read %d doubles into the array\n", n);
            printList(numbers, n);

            System.out.println("\nWhat number are you looking for?");
            Scanner keyboard = new Scanner(System.in);
            double target = keyboard.nextDouble();
            int location = search(numbers,n,target);
            if(location == -1){
                System.out.printf("%f was not found in the list.\n",target);
            }else{
                System.out.printf("%f was found at location %d\n", target, location);
            }

        System.out.println("Done!");
    }

    /**
     *
     * @param numbers
     * @param target
     * @return Returns index where target is found, or returns -1 if target is not found
     */
    private static int search(double[] numbers, int n, double target) {
        int foundAt = -1;
        int i = 0;
        while(i < n && foundAt < 0){
            if(target == numbers[i]){
                foundAt = i;
            }
            i++;
        }

        return foundAt;
    }


    public static void selectionSort(double[] list, int n){
        for(int i = 0; i < n-1; i++ ){
            int locationOfSmallestSoFar = i;
            for(int j = i+1; j<n ;j++){
                if(list[j] < list[locationOfSmallestSoFar]){
                    locationOfSmallestSoFar = j;
                }
            }
            swap(list, i, locationOfSmallestSoFar);
        }
    }

           public static void swap(double[] list, int i, int j){
                double temp = list[i];
                list[i] = list[j];
                list[j] = temp;
           }

    public static void printList(double[] list, int n){
        System.out.printf("\n-=-=-= The list has %d items -=-=-=-\n", n);
        for(int i = 0; i<n; i++){
            System.out.printf("[%2d] %f\n", i, list[i]);
        }
    }
    public static int readList(double[] list, int max){
        int n = 0;

        try {
            Scanner input = new Scanner(new File("data.txt"));

            while (n < max && input.hasNextDouble()) {
                double number = input.nextDouble();
                list[n] = number;
                n++;
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }

        return n;
    }


}
