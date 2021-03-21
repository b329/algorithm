
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


 
class Result {

    /*
     * Complete the 'protectionTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY startingPos
     *  2. INTEGER_ARRAY speed
     */

    public static int protectionTime(List<Integer> startingPos, List<Integer> speed) {
    // Write your code here
    	
    	int a = 0;
    	int b = 0;

    	int Interval = 0;
    	int Interval2 = 0;
    	
    	List<Integer> intervals = new ArrayList<>();  	
    	
    	/* 나누어 떨어지는 값 */
    	for (int i=0; i < startingPos.size(); i++ ) {
    		
    		a = (startingPos.get(i) / speed.get(i)); 
    		b = (startingPos.get(i) % speed.get(i));
    		
    		if ( a > 0 && b == 0) {
    			Interval = a;
    		}
    	}
    	
    	/* 나눈 나머지가 있는 값 */
    	for (int i=0; i < startingPos.size(); i++ ) {
    		
    		a = (startingPos.get(i) / speed.get(i)); 
    		b = (startingPos.get(i) % speed.get(i));
    		
    		if ( a > 0 && b > 0) {
    			intervals.add(a);
    		}
    		
    	}
    	
    	Interval2 = Collections.max(intervals);
    	
    	if (Interval <= 1 && Interval2 <= 1) {
    		Interval = Interval + Interval2;
    	} else if (Interval > 1 && Interval2 > 1 && (Interval2 > Interval)){
    		Interval = Interval2;
    	}
    	
		return Interval;

    }

}

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("output.txt")));

        int startingPosCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> startingPos = new ArrayList<>();

        for (int i = 0; i < startingPosCount; i++) {
            int startingPosItem = Integer.parseInt(bufferedReader.readLine().trim());
            startingPos.add(startingPosItem);
        }

        int speedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> speed = new ArrayList<>();

        for (int i = 0; i < speedCount; i++) {
            int speedItem = Integer.parseInt(bufferedReader.readLine().trim());
            speed.add(speedItem);
        }

        int result = Result.protectionTime(startingPos, speed);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
