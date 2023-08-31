import java.util.*; 

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int box = score.length/m;
        int rest = score.length%m;
        
        // | 1 1 2 | 2 2 2 | 4 4 4 | 4 4 4 
        // 13 -> 
        Arrays.sort(score);
        
        for (int i=score.length-m; i>=rest; i-=m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}