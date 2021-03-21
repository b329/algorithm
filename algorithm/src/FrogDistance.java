import java.util.Arrays;

public class FrogDistance {
    private static int solve(int[] blocks) {
        int n = blocks.length;
        int[] arrayOne = new int[n], arrayTwo = new int[n];
        int result = 0;
        Arrays.fill(arrayOne, 1);
        Arrays.fill(arrayTwo, 1);
        for( int i=1; i<n; i++) {
            if(blocks[i] <= blocks[i-1])
                arrayOne[i] = arrayOne[i-1] + 1;
        }
        for( int i=n-2; i>=0; i--) {
            if(blocks[i] <= blocks[i+1])
                arrayTwo[i] = arrayTwo[i+1] + 1;
        }
        for( int i=0; i<n; i++) {
            result = Math.max(result, arrayOne[i] + arrayTwo[i] - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,6,8,5}, nums2 = {1,5,5,2,6}, nums3 = {1,1};
        System.out.println(solve(nums1));
        System.out.println(solve(nums2));
        System.out.println(solve(nums3));
    }

}
