package binarySearch;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BinaryGap3 {

	public static int solution(int N) {

		N >>>= Integer.numberOfTrailingZeros(N);
		
		int binaryGap = 0;
		while ((N & (N + 1)) !=  0) {
			N |= N >>> 1;
			binaryGap++;
		}
		
		System.out.println(binaryGap);
		return binaryGap;
        
    }
	
	//private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        solution(t);
        
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = Integer.parseInt(scanner.nextLine().trim());
//
//            int result = handshakes(n);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }

        //bufferedWriter.close();
    }
	
	
}
