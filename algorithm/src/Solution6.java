import java.util.Arrays;
import java.util.Scanner;

public class Solution6 {
    public int solution(int[] p) {
        // Initalising all element of array to 0.

        int answer = 0;
        Arrays.sort(p);
        for (int i = 1; i <p.length ; i++) {
            if(p[i] > p[i-1]){
                answer = answer + 1;
            }
        }

        return answer;

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

        Solution6 solution = new Solution6();

        //String[] completion = new String[] {"eden, kiki"};
        int[] L = { 103,101,103,103,101,102,100,100,101,104};
        int response = solution.solution(L);

        System.out.println(response);

    }
}
