import java.util.Scanner;

public class Solution2 {
        static boolean primenumber[] = new boolean[10000000];
        static boolean visited[] = new boolean[8];
        static int ans[] = new int[8];
        static int answer = 0;

        public static int solution (String numbers){
            isAvailable();
            for (int i = 1; i <= numbers.length(); i++) {
                depthFirstSearch(0, i, numbers);
            }
            return answer;
        }
        public static void depthFirstSearch ( int level, int end, String numbers){
            if (level == end) {
                int num = 0;
                for (int i = 0; i < end; i++) {
                    num *= 10;
                    num += ans[i];
                }

                if (!primenumber[num]) {
                    primenumber[num] = true;    // 중복방지
                    answer++;
                }
                return;
            }

            for (int i = 0; i < numbers.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    ans[level] = numbers.charAt(i) - '0';
                    depthFirstSearch(level + 1, end, numbers);
                    visited[i] = false;
                }
            }
        }
        public static void isAvailable () {
            primenumber[0] = true;
            primenumber[1] = true;
            for (int i = 2; i <= (9999999 / 2); i++) {
                for (int j = i + i; j <= 9999999; j += i) {
                    primenumber[j] = true;
                }
            }
        }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String number = in.next();
//        String month = in.next();
//        String day = in.next();
//        String year = in.next();
        //String dateStr = year+"-"+month+"-"+day;

//        Calendar calendar  = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

//        Date date = null;
//        try {
//            date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(month);
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        calendar.setTime(date);
//
//        int convertedMonth = calendar.get(Calendar.MONTH);

        Solution2 solution = new Solution2();
        int response = solution(number);

        System.out.println(response);

    }
}
