import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);

        int hap=0;
        for (int i=0; i<d.length; i++) {
            hap += d[i];
            if (hap>budget) {
                answer = i;
                break;
            }
        }
        if (hap<=budget) {
            answer = d.length;
        }
        return answer;
    }
}