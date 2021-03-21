import java.util.Scanner;

public class CompleteSearch {

    public int answer;
    public boolean made[];

    public int solution(String numbers) {
        int n = numbers.length();
        boolean[] used = new boolean[n];
        made = new boolean[10000000 + 1];
        answer = 0;

        String s;
        int v;
        for (int i = 0; i < n; i++) {
            used[i] = false;
        }
        for (int i  = 0; i < 10000000 + 1; i++) {
            made[i] = false;
        }

        for (int i = 0; i < n; i++) {
            s = String.valueOf(numbers.charAt(i));
            v = Integer.parseInt(s);
            if (made[v] == false && isPrime(v)) {
                answer++;
                made[v]  = true;
            }

            if (v != 0) {
                used[i] = true;
                if (n > 1) find(1, n, s, used, numbers);
                used[i] = false;
            }
        }
        return answer;
    }

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        if (n == 2) return true;

        int sqrt = (int) Math.sqrt((double) n);
        for (int i = 2; i <= sqrt + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        made[n] = true;
        return true;
    }

    public void find(int k, int n, String number, boolean[] used, String numbers) {
        String s;
        int v;
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                s = number + String.valueOf(numbers.charAt(i));
                v = Integer.parseInt(s);
                if (made[v] == false && isPrime(v)) answer++;
                if (k + 1 < n) {
                    used[i] = true;
                    find(k + 1, n, s, used, numbers);
                    used[i] = false;
                }
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

        CompleteSearch solution = new CompleteSearch();

        //String[] completion = new String[] {"eden, kiki"};
        int[] L = { 103,101,103,103,101,102,100,100,101,104};

        String numbers = "011";
        int response = solution.solution(numbers);

        System.out.println(response);

    }
}
