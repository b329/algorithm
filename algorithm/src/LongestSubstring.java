import java.io.IOException;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String S) {

        int answer = 0;
        int sIndex = 0;
        int longestSIndex = 0;
        int eIndex = 0;
        int index = 0;
        int longestLength = Integer.MIN_VALUE;
        boolean foundUpperCase = false;

        while(index <= S.length()) {
            if (index == S.length() || Character.isDigit(S.charAt(index))) {
                if (foundUpperCase && index > sIndex && index - sIndex > longestLength) {
                    longestLength = index - sIndex;
                    eIndex = index;
                    longestSIndex = sIndex;
                }
                sIndex = index + 1;
                foundUpperCase = false;
            } else if (Character.isUpperCase(S.charAt(index))) {
                foundUpperCase = true;
            }
            index++;
        }

        answer = S.substring(longestSIndex, eIndex).length();

        if (S.substring(longestSIndex, eIndex).length() == 0)
            return -1;
        else
            return answer;

    }

    public static void main(String[] args) throws IOException {


        String s = "a0bb";
        lengthOfLongestSubstring( s );


    }


}

