package arrayList;

public class Solution {
        public int solution(int[] ages) {
            int answer = 0;
            int[] nums = new int[10];

            for(int i =0; i< ages.length; i++) {
                do {
                    nums[ages[i] % 10]++;
                } while((ages[i] /= 10) > 0);

                for (int j = 0; j < nums.length; j++) {
                answer = (j == 6 || j == 9) ? Math.max(answer, (nums[6] + nums[9] + 1) / 2) : Math.max(answer, nums[j]);
                }
            }

            return answer;
        }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // int [] ages = {23, 61, 46};

        int [] ages = {44, 33, 69, 62};


        int response = solution.solution(ages);
        System.out.println(response);
    }
}
