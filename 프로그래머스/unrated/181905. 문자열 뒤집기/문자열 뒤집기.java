class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String[] str = my_string.split("");
        String[] ch = new String[e-s+1];

        int idx=0;
        for (int i=s; i<=e; i++) {
            ch[idx++] = str[i];
        }
        
        int idx2 = ch.length-1;
        for (int i=s; i<=e; i++) {
            str[i] = ch[idx2--];
        }
        
        for (int i=0; i<str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}