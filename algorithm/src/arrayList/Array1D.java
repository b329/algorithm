package arrayList;

import java.util.Scanner;

    	public class Array1D {

    	    public static void main(String[] args) {
    	    	 Scanner scan = new Scanner(System.in);
    	         int i = scan.nextInt();
    	         double d = scan.nextDouble();
    	         String s = scan.nextLine();
    	         
    	         if(scan.hasNextLine() || s.isEmpty()){
    	             s = scan.nextLine();
    	         }
    	        // Write your code here.

    	        System.out.println("String: " + s);
    	        System.out.println("Double: " + d);
    	        System.out.println("Int: " + i);
    	    }
    	}
