package hashSet;

import java.util.HashMap;

class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
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

