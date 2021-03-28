package arrayList;

//How to Deep compare array contents?
//        As seen above, the Arrays.equals() works fine and compares arrays contents.
//        Now the questions, what if the arrays contain arrays inside them or some other references which refer to different object but have same values.
//        For example, see the following program.

public class compareTwoArray {

    public static void main (String[] args)
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        if (arr1 == arr2) // Same as arr1.equals(arr2)
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

}
