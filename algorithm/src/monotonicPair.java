import java.io.IOException;

public class monotonicPair {

    public static int solution(int[] A) {


//

//        int[] top = new int[A.length];
//        int max = -Integer.MAX_VALUE;
//        for (int i=A.length-1; i>=0; i--) {
//            if (A[i] > max) max = A[i];
//            top[i] = max;
//        }
//
//        int best = 0;
//        int curMaxIndex = 0;
//        for (int i=0; i<A.length; i++) {
//            while(curMaxIndex < top.length && top[curMaxIndex] >= A[i])
//                curMaxIndex++;
//            if((curMaxIndex - 1 - i) > best)
//                best = curMaxIndex - 1 - i
//        }
//
//        return best;


        int[] top = new int[A.length];
        int max = -Integer.MAX_VALUE;
        for (int i=A.length-1; i>=0; i--) {
            if (A[i] > max) max = A[i];
            top[i] = max;
        }

        int result = 0;
        int curMaxIndex = 0;
        for (int i=0; i<A.length; i++) {
            while(curMaxIndex < top.length && top[curMaxIndex] >= A[i])
                curMaxIndex++;
            if((curMaxIndex - 1 - i) > result)
                result = curMaxIndex - 1 - i;
        }

        return result;


    }

    public static int find(int[] t, int min) {
        int s = 0;
        int e = t.length-1;

        if (t[e] >= min) return e;

        while (true) {
            int x = (s+e) / 2;
            if (x == t.length-1) return t.length-1;
            if (t[x] >= min && t[x+1] < min) return x;

            if (t[x] < min) e = x;
            else s = x;
        }
    }

    public static void main(String[] args) throws IOException {

        int A[]  =  new int[8];
        A[0] = 4;
        A[1] = 6;
        A[2] = 2;

        solution(A);
    }

}

