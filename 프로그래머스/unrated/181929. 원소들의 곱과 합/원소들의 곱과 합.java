class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gob = 1;
        int hap = 0;
        
        for (int i=0; i<num_list.length; i++) {
            gob = gob * num_list[i];
            hap = hap + num_list[i];
        
            if (gob > (hap*hap)) {
                answer = 0;
            }
            else if (gob < (hap*hap)) {
                answer = 1;
            }
        }
        return answer;
    }
}