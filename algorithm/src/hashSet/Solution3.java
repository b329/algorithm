package hashSet;

public class Solution3 {
    public boolean solution(String[] phone_book)
    {
        boolean answer = true;
        for(int i = 0 ; i < phone_book.length; i++) {
            for(int j = 0 ; j < phone_book.length; j++) {
                if(phone_book[i].toString().length() < phone_book[j].toString().length()) {
                    if(phone_book[j].substring(0,phone_book[i].toString().length()).equals(phone_book[i])) {
                        answer = false;
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] completion = new String[] {"eden, kiki"};

        String response = solution1.solution(participant, completion);
        System.out.println(response);
    }
}

