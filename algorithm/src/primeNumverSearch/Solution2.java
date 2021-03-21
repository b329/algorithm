package primeNumverSearch;

import java.util.HashMap;
import java.util.LinkedList;

class Solution2 {
    public int solution(String numbers) {
        //문자(숫자)를 키, 그 갯수를 밸류
        HashMap<String,Integer> hm = new HashMap<>();

        //숫자 조합만든다 -> 순열인가... 중복을 허용하지 않는 순열
        //queue를 만들것
        //queue에는 예비 순열들을 push
        //queue에서 꺼내면서 permutation queue에 push
        LinkedList<String> queue = new LinkedList<>();
        LinkedList<String> per = new LinkedList<>();

        for(int i=0; i<numbers.length(); i++) {
            String temp = numbers.substring(i,i+1);
            queue.add(temp);
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);
        }

        while(!queue.isEmpty()) {
            String info = queue.poll();
            per.add(info);

            for(int i=0; i<numbers.length(); i++) {
                String temp = numbers.substring(i, i+1);

                //info에 있는 temp개수 보다 numbers에 있는 temp개수가 작으면 더하면 되는거
                int a = 0;
                for(int j=0; j<info.length(); j++) {
                    String f = info.substring(j, j+1);
                    if(f.equals(temp)) a++;
                }

                if(a < hm.get(temp)) {
                    temp = info + temp;
                    queue.add(temp);
                }
            }
        }
        //동시에 뒤에 추가로 조합시킬수 있는 경우를 더해서 예비queue에 push



        //각각 소수인지 확인한다
        LinkedList<Integer> answers = new LinkedList<>();
        for(String temp : per) {
            Integer what = Integer.parseInt(temp);
            if(what == 1 || what == 0) continue;
            if(answers.contains(what)) continue;
            boolean pass = true;
            for(int i=2; i<what; i++) {
                if(what % i == 0) {
                    pass = false;
                    break;
                }
            }
            if(pass == true) {
                answers.add(what);
            }

        }
        //소수 갯수


        for(Integer a : answers) {
            System.out.println(a);
        }

        int answer = answers.size();
        return answer;
    }

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);

        Solution2 solution1 = new Solution2();

        //String[] completion = new String[] {"eden, kiki"};
        int N = 5;
        int number = 12;

        String numbers = "011";

        int response = solution1.solution(numbers);
        System.out.println(response);

    }

}

