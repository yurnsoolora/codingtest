class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[(end - start)+1];
        
        int cnt = start; 
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = cnt; 
            cnt++;
        }
        
        return answer;
        
    }
}