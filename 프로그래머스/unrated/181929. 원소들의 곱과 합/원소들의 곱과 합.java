class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gob = 1;
        int hap = 0;
        
        for (int i=0; i<num_list.length; i++) {
            gob = gob * num_list[i];
            hap = hap + num_list[i];
        
        }
        answer = gob > (hap*hap) ? 0 : 1;
        return answer;
    }
}