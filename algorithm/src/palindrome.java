public class palindrome {
    public static int find(String plain) {
        int answer = 0;
        for (answer = plain.length(); ; answer++) {
            boolean flag = true;
            for (int j = 0; j < plain.length(); j++) {
                if ((answer - j - 1) < plain.length() && plain.charAt(j) != plain.charAt(answer - j - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return answer;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5,6}; //4,1,2,3 -> 3,4,1,2 -> 2,3,4,1 -> 1,2,3,4
        int[] arrB = {1,2,3,4,5,6};
        boolean answer = false;

        String A = "qwerty";

        System.out.println(find(A));

    }
}
