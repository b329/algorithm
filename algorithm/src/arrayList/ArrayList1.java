package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    public static void main(String[] args) {
        int n = 5;
        //int i = 1;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        for (int i = 1; i <= n; i++) {
            arr1.add(i);
        }
        System.out.println(arr1);

        arr1.remove(3);
        System.out.println(arr1);

        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i) + "");
        }
    }
}
