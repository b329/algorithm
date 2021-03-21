// you can also use imports, for example:
import java.io.IOException;
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Task1 {
    public static int solution(String G) {
        // write your code in Java SE 8

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("R", 1);
        map.put("P", 2);
        map.put("S", 3);

        // int user = map.get(G);
        int user = 1;
        String[] ary = G.split("");
        List<String> items = new ArrayList<>();

        System.out.println(ary);
        int totalCount = 0;
        for (int i = 0; i < ary.length - 1; i++) {
            int computer = map.get(ary[i]) % 3;
            if(user %3 == computer) {
                totalCount = totalCount + 1;
            } else if(user == computer-1) {
                totalCount = totalCount + 2;;
            } else {
                totalCount = totalCount + 1;
            }
        }

        System.out.println(totalCount);
        return totalCount;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int t = Integer.parseInt(scanner.nextLine().trim());
        String s = new String("RSP");

        Task1.solution(s);

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
