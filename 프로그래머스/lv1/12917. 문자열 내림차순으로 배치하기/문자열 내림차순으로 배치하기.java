import java.util.*; 

class Solution {
    public String solution(String s) {
        String answer = "";
        String lo = "";
        String up = "";
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                up += ch;
            }
            else {
                lo += ch;
            }
        }
        
        String[] lostr = lo.split("");
        String[] upstr = up.split("");
        
        Arrays.sort(lostr); 
        Arrays.sort(upstr);
        
        for (int i=lostr.length-1; i>=0; i--) {
            answer += lostr[i];
        }
        
         for (int i=upstr.length-1; i>=0; i--) {
            answer += upstr[i];
        }
        
        
        return answer;
    }
}