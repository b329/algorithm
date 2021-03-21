// you can also use imports, for example:
import java.io.IOException;
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class demoTask {
    public static int demoTask(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int min = 1;
        int cap = A.length;

        for (int i = 0; i < cap; i++) {
            if (A[i] == min) {
                min++;
            }
        }
        //min = ( min <= 0 ) ? 1:min; //this means: if (min <= 0 ){min =1}else{min = min} you can also do: if min <1 for better efficiency/less jumps
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int t = Integer.parseInt(scanner.nextLine().trim());

        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        demoTask(arr);

        // int[] intArray = new int[]{3, 1, 2, 4, 3, 6, 9, 10, 3, 2, 1, 3};


        scanner.close();

    }
}
