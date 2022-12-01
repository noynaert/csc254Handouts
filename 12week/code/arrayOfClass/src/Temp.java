public class Temp {



    private static int search(double[] numbers, int n, double target) {
    int foundAt = -1;
    int i = 0;
    while(i < n && foundAt < 0){
        if(target == numbers[i]){
            foundAt = i;
        }
        i++;
    }


/*
        public static void swap(double[] list, int i, int j){
            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        public static void selectionSort(double[] list, int n){
            for(int i = 0; i < n-1; i++ ){
                int locationOfSmallestSoFar = i;
                for(int j = i+1; j<n ;j++){
                    if(list[j] < list[locationOfSmallestSoFar]){
                        locationOfSmallestSoFar = j;
                    }
                }
             //   swap(list, i, locationOfSmallestSoFar);
            }
        }

*/















    return foundAt;
}




}
