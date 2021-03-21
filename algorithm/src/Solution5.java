import java.util.Scanner;

public class Solution5 {
    public int solution(int paramInteger) {

        int answer = 0;
        if ((paramInteger ^ 1) == 1) {
            return -1;
        }

        int aBound = paramInteger / 2;
        for (int a = 1; a < aBound; a++) {
            // Check whether b would be a whole number with this value of a.
            if ((a * paramInteger) % (a - paramInteger) == 0) {
                int b = (paramInteger * (2 * a - paramInteger)) / (2 * a - 2 * paramInteger);
                int c = paramInteger - a - b;

                answer = ((int)Math.pow(c, 2));
                break;
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

        Solution5 solution = new Solution5();

        Integer b = 12;
        //String[] completion = new String[] {"eden, kiki"};

        int response = solution.solution(b);

        System.out.println(response);

    }
}
