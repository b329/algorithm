package hashSet;

public class Solution4 {
    public boolean solution(String[] phone_book) {
            for(int i = 0; i < phone_book.length; i++) {
                for(int j = i+1; j < phone_book.length; j++) {
                    if(phone_book[i].startsWith(phone_book[j])) {return false;};
                    if(phone_book[j].startsWith(phone_book[i])) {return false;};
                }
            } return true;
        }

    public static void main(String[] args) {
        Solution4 solution1 = new Solution4();

        String[] phone_book = new String[] {"119", "976745454", "1196554534"};

        Boolean response = solution1.solution(phone_book);

        System.out.println(response);
    }
}

