import java.io.IOException;
import java.util.Scanner;

public class BinaryGap {

	public static int gap(int number) {

		int binaryGap = 0;
		String binaryString = Integer.toBinaryString(number);
		char[] characters = binaryString.toCharArray();
		
		int j = 0;
		Character c;
		for (int i = 0; i < characters.length; i++) {
			c = characters[i];
			
			if (c.equals('0')) {
				j = j + 1;
			}
			
			if (c.equals('1')) {
				if ( j > binaryGap) {
					binaryGap = j;
				}
				
				j = 0;
			
			}

		}
		System.out.println(binaryGap);
		return binaryGap;
        
    }
	
	//private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        gap(t);
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
