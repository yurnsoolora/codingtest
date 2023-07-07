class Solution {
    public String solution(int n) {
        String answer = "";
        String[] str = new String[n];
        
        for (int i=0; i<n; i++) {
            if (i%2==0) answer += str[i] = "수";
            else answer += str[i] = "박";
        }
        return answer;
    }
}