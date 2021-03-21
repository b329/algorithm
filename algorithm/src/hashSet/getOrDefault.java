package hashSet;

import java.util.HashMap;

public class getOrDefault {
    public HashMap<String, Integer> solution(String[] array) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String key : array) {
            System.out.println("key : " + key);
            System.out.println("value : " + hm.getOrDefault(key, 0) + 1);
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        System.out.println("결과 : " + hm); // 결과 : {A=2, B=1, C=1}

        return hm;
    }

    public static void main(String[] args) {
        getOrDefault solution1 = new getOrDefault();

        String[] array = { "A","B","C","A","B","C","A" };


        HashMap<String, Integer> response = solution1.solution(array);

        System.out.println(response);
    }
}

