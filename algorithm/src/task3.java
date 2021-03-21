

// you can also use imports, for example:
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class task3 {
    public int task3(int N, int K) {
        // write your code in Java SE 8
        int result = 0;

        while (N > 3 && K > 0) {
            if ( N % 2 == 0) {
                N  -= 1 ;
            } else {
                N = N / 2;
                K -= 1;
            }
            result += 1;
        }
        return result + N - 1;

    }


}

