import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class OddOccurrencesInArray {

	public static int[] solution(int[] A, int k) {

		int[] array = new int[A.length];
		
//		System.out.println(binaryGap);
//		return binaryGap;
		for (int i = 0; i < A.length; i++) {
			int tempIndex = (i + k) % A.length;
			array[tempIndex] = A[i];
		}
		
		System.out.println(array);
		return array;
        
    }
	
	//private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int t = Integer.parseInt(scanner.nextLine().trim());
		int [] intArray = new int [] { 2, 6, 3, 8 };

        solution(intArray, 5);
        
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
