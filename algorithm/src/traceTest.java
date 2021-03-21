
import java.util.Stack;

public class traceTest {
    static boolean solution(String s) {
        boolean answer = false;

        Stack<Character> a = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                a.push(s.charAt(i));
            }
            //answer를 false로 초기화 해놓고 바로 return을 해줘야 시간초과가 나지 않는다.
            else {
                if(a.isEmpty()) {
                    return answer;
                } else if(a.pop()!='(') {
                    return answer;
                }
            }
        }
        if(a.isEmpty()) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5,6}; //4,1,2,3 -> 3,4,1,2 -> 2,3,4,1 -> 1,2,3,4
        int[] arrB = {1,2,3,4,5,6};
        boolean answer = false;

        String A = "(()";

        System.out.println(solution(A));

    }


}
