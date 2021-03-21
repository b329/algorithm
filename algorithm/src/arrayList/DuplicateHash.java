package arrayList;

// { Driver Code Starts
//Initial Template for Java
/*
Check if a given array contains duplicate elements within k distance from each other

* A professor went to a party. Being an erudite person, he classified the party into two categories.
* He proposed that if all the persons in the party are wearing different colored robes,
* then that is a girl’s only party. If we even get one duplicate color,
* it must be a boy’s party. The colors of the robes are represented by positive integers.
* */

import java.util.*;
import java.lang.*;
import java.io.*;

class DupliacateHash {
    public static void main(String[] args) throws IOException {

        //int n = Integer.parseInt(br.readLine().trim());
        int n = 6;
        long a[] = new long[(int) (n)];
        // String inputLine[] = br.readLine().trim().split(" ");
        String inputLine[] = {"1", "3", "2", "4", "5", "1"};
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(inputLine[i]);
        }

        Compute obj = new Compute();
        System.out.println(obj.PartyType(a, n));

    }
}
// } Driver Code Ends


//User function Template for Java
class Compute {
    public static String PartyType(long[] a, int n) {

        // Create an empty hashset
        HashSet<Long> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return "BOYS";
            }

            // Add this item to hashset
            set.add(a[i]);

            // Remove the k+1 distant item
            if (i >= n)
                set.remove(a[i-n]);

        }
        return "GIRLS";
    }
}
