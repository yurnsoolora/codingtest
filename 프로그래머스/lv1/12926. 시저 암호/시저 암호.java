class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch==' ') {
                answer += ch;
                continue;
            }
    
            if (ch >='a' && ch <= 'z') { //소문자
                if (ch+n > 'z') {
                    answer += (char)(ch+n-26);
                }
                else {
                    answer += (char)(ch+n);
                }
            }
            else if (ch>='A' && ch<='Z') {
               if (ch+n > 'Z') {
                    answer += (char)(ch+n-26);
                }
                else {
                    answer += (char)(ch+n);
                }
            }
        }
        return answer;
    }
}