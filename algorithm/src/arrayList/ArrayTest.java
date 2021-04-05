package arrayList;

import java.util.Arrays;

public class ArrayTest {
    public static boolean circulation(int[] arrA,int[] arrB) {

        int first;
        boolean answer = false;

        for(int j =0; j<arrA.length; j++) {
            //배열 순회하기
            first = arrA[0];
            //한바퀴 돌때까지 순회
            for(int i=0; i<arrA.length-1; i++) {
                arrA[i] = arrA[i+1];
            }
            arrA[arrA.length-1] = first;
            //arrA랑 arrB랑 같아지면 break
            if(Arrays.equals(arrA, arrB)) {
                answer = true;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5,6}; //4,1,2,3 -> 3,4,1,2 -> 2,3,4,1 -> 1,2,3,4
        int[] arrB = {1,2,3,4,5,6};
        boolean answer = false;

        System.out.println(circulation(arrA,arrB));

    }
}
