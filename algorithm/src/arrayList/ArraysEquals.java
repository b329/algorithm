package arrayList;

//How to Deep compare array contents?
//        As seen above, the Arrays.equals() works fine and compares arrays contents.
//        Now the questions, what if the arrays contain arrays inside them or some other references which refer to different object but have same values.
//        For example, see the following program.

import java.util.Arrays;

public class ArraysEquals {

//    How to Deep compare array contents?
//    As seen above, the Arrays.equals() works fine and compares arrays contents.
//    Now the questions, what if the arrays contain arrays inside them or some other references which refer to different object but have same values.
//    For example, see the following program.

    public static void main (String[] args)
    {

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");

        // inarr1 and inarr2 have same values
        int inarr1[] = {1, 2, 3};
        int inarr2[] = {1, 2, 3};

        Object[] arry1 = {inarr1};  // arr1 contains only one element
        Object[] arry2 = {inarr2};  // arr2 also contains only one element
        if (Arrays.deepEquals(arry1, arry2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

}
