package arrayList;

import java.util.*;

public class Solution1 {
    public int minPathSum(int[][] balloons) {

        int answer = 1;

        // count 결과 값 저장.
        if(balloons.length == 0) {
            return 0;
        }

        // Conversion of array to ArrayList
        // using Arrays.asList
        Arrays.stream(balloons)
                .map(Arrays::asList)
                .distinct()
                .forEach(row -> System.out.printf("%-3s%-7s%s\n", row.get(0), row.get(1), row.get(2)));

        // Arrays.sort(balloons, (a, b) -> a[1] - b[1]); // sort by end point


        int position = balloons[0][1];
        for(int i = 1; i < balloons.length; i++) {
            if(position >= balloons[i][0]) {    // overlap, shot at the same time
                continue;
            }
            answer++;
            position = balloons[i][1];
        }
        return answer;
    }

    public <T> List<T> twoDArrayToList(T[][] twoDArray) {
        List<T> list = new ArrayList<T>();
        for (T[] array : twoDArray) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }

    public static void main(String[] args) {

        Solution1 solution = new Solution1();

        // int [] ages = {23, 61, 46};

        int [][] balloons = {{2,2}, {4,4}, {4,4},{-1, -4}};

        int response = solution.minPathSum(balloons);
        System.out.println(response);
    }
}
