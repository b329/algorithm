
import java.util.Scanner;

public class minMax {


	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    	long sum = 0;
        long min = 1000000000;
        long max = 0;
        for (int i = 0; i < arr.length; i++ ) {	
        	sum = sum + arr[i];
        
			if (min > arr[i]) {
        		min = sum;
        	}

			if (max < arr[i]) {
				max = sum;
			}
        }
    	
        System.out.println((sum - max) + " " + (sum - min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
