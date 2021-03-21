package hashSet;

import java.util.Arrays;

public class copyOfRange {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        copyOfRange solution1 = new copyOfRange();

        int[] array = { 1,5,2,6,3,7,4 };
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};


        int[] response = solution1.solution(array, commands);

        System.out.println(response);
    }
}

