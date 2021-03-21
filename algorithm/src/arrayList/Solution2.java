package arrayList;

import java.util.Arrays;

public class Solution2 {
    public int minPathSum(int[][] balloons) {

        int answer = 0;

        if (balloons.length == 0)
            return 0;
        Arrays.sort(balloons, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int end = Integer.MIN_VALUE;
        for (int [] interval: balloons) {
            if (interval[0] >= end) {
                end = interval[1];
                count += 1;
            }
        }

        answer = balloons.length - count;
        return answer;
    }

    public static void main(String[] args) {

        Solution2 solution = new Solution2();

        // int [] ages = {23, 61, 46};

        int [][] balloons = {{2,2}, {4,4}, {1,4},{-1, -4}};

        int response = solution.minPathSum(balloons);
        System.out.println(response);
    }
}
