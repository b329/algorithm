package arrayList;

//Time Complexity: O(N2)
//        Auxiliary Space: O(N)
//
//        Efficient Approach: Use unordered_map for hashing. Count frequency of occurrence of each element and the elements with frequency more than 1 is printed. unordered_map is used as range of integers is not known. For Python, Use Dictionary to store number as key and it’s frequency as value. Dictionary can be used as range of integers is not known.
//
//        Below is the implementation of the above approach:

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesArraysEfficientApproach {
    // Function to find the Duplicates,
    // if duplicate occurs 2 times or
    // more than 2 times in
    // array so, it will print duplicate
    // value only once at output
    // Driver program
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        int n = arr.length;
        printDuplicates(arr, n);
    }
    // function to find and print duplicates
    private static void printDuplicates(int[] arr, int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            // if frequency is more than 1
            // print the element
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+ " ");
                dup = true;
            }
        }
        // no duplicates present
        if(!dup){
            System.out.println("-1");
        }
    }
}
