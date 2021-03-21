import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MaximumInteger {

    /**
     * @param N: an integer
     * @return: returns the maximum possible value obtained by inserting one '5' digit
     */
    public static int MaximumPossibleValue(int N) {
        // write your code here
        if (N == 0) {
            return 50;

        }
        Comparator<Integer> comparator = N > 0 ? Integer::compareTo : Collections.reverseOrder(Integer::compareTo);
        StringBuilder builder = new StringBuilder();
        if (N < 0) {
            builder.append('-');
        }
        String s = String.valueOf(Math.abs(N));
        boolean injected = false;
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (comparator.compare(5, digit) > 0 && !injected) {
                builder.append(5);
                builder.append(c);
                injected = true;
            } else {
                builder.append(c);
            }
        }
        if (!injected) {
            builder.append(5);
        }
        System.out.println(Integer.valueOf(builder.toString()));
        return Integer.valueOf(builder.toString());
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());
        //int [] intArray = new int [] { 3, 1, 2, 4, 3, 6, 9, 10, 3, 2, 1, 3 };

        MaximumInteger.MaximumPossibleValue(t);

//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = Integer.parseInt(scanner.nextLine().trim());
//
//            int result = handshakes(n);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }

        //bufferedWriter.close();

        // (1) create a java int array
//        int[] intArray = new int[3];
//
//        // (2) some time later ... assign elements to the array
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 3;
//
//        // (3) print our java int array
//        for (int i=0; i<intArray.length; i++)
//        {
//          System.out.println(intArray[i]);
//        }

//     // (1) define your java int array
//        int[] intArray = new int[] {4,5,6,7,8};
//
//        // (2) print the java int array
//        for (int i=0; i<intArray.length; i++)
//        {
//          System.out.println(intArray[i]);
//        }

    }
}
