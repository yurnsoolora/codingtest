public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] str = (String.valueOf(n)).split("");
        
        for (int i=0; i<str.length; i++) {
           answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}