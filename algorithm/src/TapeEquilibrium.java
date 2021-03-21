import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TapeEquilibrium {

	public static int solution(int[] A) {

		int n = A.length;
		int totSum = 0;
		int leftSum = 0;
		int rightSum = 0;	
		//int minDiff = 0;
		
		int[] diff = new int[A.length - 1];

		/* 배열의 모든 합 구하기. */
		for(int i = 0 ; i < n ; i++){
			totSum = totSum + A[i];
		}
		
		System.out.println(totSum);
		
		for(int x = 1 ; x < n ; x++){
			leftSum = leftSum + A[x - 1];
			rightSum = totSum - leftSum;
			
			int tempAbs = Math.abs(leftSum - rightSum);
			
			diff[x-1] = tempAbs;
			//minDiff = Math.min(minDiff, Math.abs(leftSum - rightSum));
			//System.out.println(diff[x-1]);
			//System.out.println(tempAbs);
		}

		int minDiff = diff[0];
		
		for(int i = 0 ; i < diff.length ; i++){
			
			if (minDiff > diff[i]) {
				
				minDiff = diff[i];
			}
			//System.out.println(minDiff);
		}

		System.out.println(minDiff);
		
		return minDiff;
		
    }
	
	//private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int t = Integer.parseInt(scanner.nextLine().trim());
		int [] intArray = new int [] { 3, 1, 2, 4, 3, 6, 9, 10, 3, 2, 1, 3 };

        solution(intArray);
        
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
