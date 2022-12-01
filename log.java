

public class log {
    public static void main(String[] args){
        int n = 1000000;
        int result = n;
        int count = 0;
        while(result > 1){
            System.out.printf("Count is %d.  Result is %d\n", count, result);
            result = result / 2;
            count++;
        }
    }
}
