import java.util.Scanner;

public class Solution4 {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0) return 0;
        int min = prices[0];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            int money = prices[i] - min;
            if(money > max) {
                max = money;
                }
            if(prices[i] < min) {
                min = prices[i];
            }
        }

        return max;

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

        Solution4 solution = new Solution4();

        int[] prices = {3, 2, 4, 8, 7};
        //String[] completion = new String[] {"eden, kiki"};

        int response = solution.maxProfit(prices);

        System.out.println(response);

    }
}
