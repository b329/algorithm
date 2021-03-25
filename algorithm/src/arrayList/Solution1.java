package arrayList;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
There are a number of spherical balloons spread in two-dimensional space.
For each balloon, provided input is the start and end coordinates of the horizontal diameter.
Since it's horizontal, y-coordinates don't matter and hence the x-coordinates of start and end of the diameter suffice.
Start is always smaller than end. There will be     at most 104 balloons.
An arrow can be shot up exactly vertically from different points along the x-axis.
A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend.
There is no limit to the number of arrows that can be shot.
An arrow once shot keeps travelling up infinitely.
The problem is to find the minimum number of arrows that must be shot to burst all balloons.
Example:
Input:
[[10,16], [2,8], [1,6], [7,12]]
Output:
2
Explanation:
One way is to shoot one arrow for example at x = 6 (bursting the balloons [2,8] and [1,6]) and another arrow at x = 11 (bursting
*/

/**
 * Approach: Greedy Algorithm (Use Sorting)
 * We know that eventually we have to shoot down every balloon,
 * so for each balloon there must be an arrow whose position is between balloon[0] and balloon[1].
 * Given that, we can sort the array of balloons by their ending position.
 * Then we make sure that while we take care of each balloon from the beginning, we can shoot as many following balloons as possible.
 *
 * So what position should we pick?
 * We should shoot as right as possible, because all balloons' end position is to the right of the current one.
 * Therefore the position should be currentBalloon[1], because we still need to shoot down the current one.
 *
 * This is exactly what should be done in the for loop:
 * check how many balloons I can shoot down with one shot aiming at the ending position of the current balloon. (balloon[0] <= arrowPos)
 * Then skip all these balloons and start again from the next one (or the leftmost remaining one) that needs another arrow.
 *
 * More details here: https://mp.weixin.qq.com/s/m-nnVCjyD9svTQq6Ll35Ug
 */

public class Solution1 {
    public Serializable minPathSum(Integer[][] balloons) {

        int answer = 1;

        int g = balloons[0].length;
        int[][] array2 = new int[10][g];

        // count 결과 값 저장.
        if(balloons.length == 0) {
            return 0;
        }

        for (int i=0; i < balloons.length; i++) {
            System.out.println(Arrays.toString(balloons[i]));
        }

        /** compare with distinct() **/
        List<List<Integer>> list =
                Arrays.stream(balloons).map(Arrays::asList).collect(Collectors.toList());
        System.out.println(list);

        List<List<Integer>> lists =
                Arrays.stream(balloons).map(Arrays::asList).distinct().collect(Collectors.toList());
        System.out.println(lists);

        /* 이건 바로 앞의 array 와 바로 뒤의 array 밖에 비교할 수 없네. */
        // List<Integer> l = new ArrayList<Integer>(Arrays.asList(balloons));

//        for(int k = 0 ;k < balloons.length-1;k++)
//        {
//            if(balloons[k][0] == balloons[k+1][0])
//            {
//                System.out.println("same value is present");
//                l.remove(1);
//                // int 롸 integer 의 차이는 무엇인가.
//                array2 = l.toArray(new int[][]{});
//            }
//        }
        /* 이건 바로 앞의 array 와 바로 뒤의 array 밖에 비교할 수 없네. */
        /* Sample */
//        String[] strArray = {"eins", "zwei", "drei", "vier"};
//        Set<String> strSet = Arrays.stream(strArray).collect(Collectors.toSet());
//        System.out.println(strSet);
        /* Sample End */

        /** line 80 까지 이렇게 하먄 안된다는 것을 알수 있다. **/
        // ArrayList with duplicate elements
//        ArrayList<int[]> arrayList = new ArrayList<int[]>(Arrays.asList(balloons));
//        System.out.println(Arrays.toString(arrayList.get(0)));
//        System.out.println(Arrays.toString(arrayList.stream().toArray()));
//        // List with duplicate elements
//        List<int[]> list = new ArrayList<int[]>(Arrays.asList(balloons));
//        System.out.println(Arrays.toString(list.toArray()));

//        List<int[]> listWithoutDuplicates = arrayList.stream().distinct().collect(Collectors.toList());
//        System.out.println(listWithoutDuplicates);

        /* Set version */
//        Set<int[]> balloosSet = Arrays.stream(balloons).collect(Collectors.toSet());
//        System.out.println(balloosSet);
        /* Set version */
//        HashSet<int[]> balloosHashSet = (HashSet<int[]>) Arrays.stream(balloons).collect(Collectors.toSet());
//
//        /* to remove duplicate elements */
//        HashSet<int[]> removedDuplicateHashSet = new HashSet<int[]>();
//
//        // Supported in Java 8 and above
//        balloosHashSet.stream().forEach((balloon) -> {
//            System.out.println(Arrays.toString(balloon));
//            //removedDuplicateHashSet.addAll(balloosHashSet);
//        });
//
//        removedDuplicateHashSet.addAll(balloosHashSet);
//
//        removedDuplicateHashSet.stream().forEach(balloon -> System.out.println(Arrays.toString(balloon)));

        //System.out.println(removedDuplicateHashSet);

        System.out.println("\n");
        /** line 46 부터 여기까지 이렇게 하먄 안된다는 것을 알수 있다. **/

        /**
         * Case 1 It is short, but need to covert the primitive type to reference type
         * (int to Integer) as needed for Arrays.asList();
         *
         * Integer[][] pattern = new Integer[][]{
         *         { 1, 1, 1, 1, 1, 1, 1 },
         *         { 1, 2, 0, 0, 0, 2, 1 },
         *         { 1, 0, 3, 0, 3, 0, 1 },
         *         { 1, 0, 0, 4, 0, 0, 1 },
         *         { 1, 0, 3, 0, 3, 0, 1 },
         *         { 1, 2, 0, 0, 0, 2, 1 },
         *         { 1, 1, 1, 1, 1, 1, 1 },
         * };
         * List<List<Integer>> lists = new ArrayList<>();
         * for (Integer[] ints : pattern) {
         *     lists.add(Arrays.asList(ints));
         * }
         * **/

        List<List<Integer>> lists2 = new ArrayList<>();
        for (Integer[] ints : balloons) {
            lists2.add(Arrays.asList(ints));
        }

        Set<List> balloonsSet = Arrays.stream(new List[]{lists}).collect(Collectors.toSet());
        // Supported in Java 8 and above
        balloonsSet.stream().forEach((balloon) -> {
            System.out.println(Arrays.toString(new List[]{balloon}));
            //removedDuplicateHashSet.addAll(balloosHashSet);
        });

        List<List<Integer>> lists1 =
                Arrays.stream(balloons).map(Arrays::asList).collect(Collectors.toList());

        /**
         * Case 2 If you don't want to covert the primitive type to reference type:
         * (int[][] pattern = new int[][] to Integer[][] pattern = new Integer[][])
         *
         * List<List<Integer>> lists = new ArrayList<>();
         * for (int[] ints : pattern) {
         *     List<Integer> list = new ArrayList<>();
         *     for (int i : ints) {
         *         list.add(i);
         *     }
         *     lists.add(list);
         * }
         * **/

        System.out.println("Name  ID  Dept ");
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[0].length;j++){

                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }

        /* 2D Array 를 1F Array 로 변환. */
//        int[] array = Stream.of(balloons) //we start with a stream of objects Stream<int[]>
//                .flatMapToInt(IntStream::of) //we I'll map each int[] to IntStream
//                .toArray(); //we're now IntStream, just collect the ints to array.
        /* 2D Array 를 1F Array 로 변환 끝. */


        for (int i = 0; i < balloons.length; i++) {
//            a.add(balloons[i][]);
            //b.add(balloons[i][]);
        }

        // Solution1 solutionArray = new Solution1();
        // solutionArray.twoDArrayToList(balloons);


        // Conversion of array to ArrayList
        // using Arrays.asList
//        Arrays.stream(balloons)
//                .map(Arrays::asList)
//                .distinct()
//                .forEach(row -> System.out.printf("%-3s%-7s%s\n", row.get(0), row.get(1), row.get(2)));

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

    public static void main(String[] args) {

        Solution1 solution = new Solution1();

        // int [] ages = {23, 61, 46};

        Integer [][] balloons = {{2,2}, {4,4}, {4,4}, {2,2}, {-1, -4}};

        int response = (int) solution.minPathSum(balloons);
        System.out.println(response);
    }
}
