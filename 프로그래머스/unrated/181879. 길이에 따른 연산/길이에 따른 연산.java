class Solution {
    public int solution(int[] num_list) {
        int answer1 = 0;
        int answer2 = 1;
        int i=0;
        
        if (num_list.length >= 11) {
            for (i=0; i<num_list.length; i++) {
                answer1 += num_list[i];
            }
            return answer1;
        }
        else {
            for (i=0; i<num_list.length; i++) {
                answer2 *= num_list[i];
            }
            return answer2;
        }
        }
    }