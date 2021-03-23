package arrayList;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution1 {
    public Serializable minPathSum(int[][] balloons) {

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

        /* 이건 바로 앞의 array 와 바로 뒤의 array 밖에 비교할 수 없네. */
        List<int[]> l = new ArrayList<int[]>(Arrays.asList(balloons));

        for(int k = 0 ;k < balloons.length-1;k++)
        {
            if(balloons[k][0] == balloons[k+1][0])
            {
                System.out.println("same value is present");
                l.remove(1);
                // int 롸 integer 의 차이는 무엇인가.
                array2 = l.toArray(new int[][]{});
            }
        }
        /* 이건 바로 앞의 array 와 바로 뒤의 array 밖에 비교할 수 없네. */
        /* Sample */
//        String[] strArray = {"eins", "zwei", "drei", "vier"};
//        Set<String> strSet = Arrays.stream(strArray).collect(Collectors.toSet());
//        System.out.println(strSet);
        /* Sample End */

        /* Set version */
//        Set<int[]> balloosSet = Arrays.stream(balloons).collect(Collectors.toSet());
//        System.out.println(balloosSet);
        /* Set version */
        HashSet<int[]> balloosHashSet = (HashSet<int[]>) Arrays.stream(balloons).collect(Collectors.toSet());

        // Supported in Java 8 and above
        balloosHashSet.stream().forEach((balloon) -> {
            System.out.println(Arrays.toString(balloon));
        });

        System.out.println("\n");

        // Supported in Java 8 and above
        balloosHashSet.stream().forEach(balloon -> System.out.println(Arrays.toString(balloon)));

        System.out.println("\n");

        //        Arrays.stream(balloons)
//                .map(Arrays::asList)
//                .distinct()
//                .forEach(row -> System.out.printf("%-3s%-7s%s\n", row.get(0), row.get(1), row.get(2)));

        // Supported in Java 8 and above
        balloosHashSet.stream().forEach(System.out::println);

        Set<int []> set = new HashSet<>();
        for (int i = 0; i < balloons.length; i++) {
            for (int j = 0; j < balloons[j].length; j++) {
                int num = balloons[i][j];
                if (set.contains(num)) {
                    return false;
                } else {
                    //set.add(num);
                }
            }
        }

        System.out.println("Name  ID  Dept ");
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[0].length;j++){

                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }

        /* 2D Array 를 1F Array 로 변환. */
        int[] array = Stream.of(balloons) //we start with a stream of objects Stream<int[]>
                .flatMapToInt(IntStream::of) //we I'll map each int[] to IntStream
                .toArray(); //we're now IntStream, just collect the ints to array.
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

        int [][] balloons = {{2,2}, {4,4}, {4,4}, {2,2}, {-1, -4}};

        int response = (int) solution.minPathSum(balloons);
        System.out.println(response);
    }
}
