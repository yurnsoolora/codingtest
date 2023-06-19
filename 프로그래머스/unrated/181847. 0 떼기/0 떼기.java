class Solution {
    public String solution(String n_str) {
        char[] ch = n_str.toCharArray();
        String answer = "";
        
        for (int i=0; i<ch.length; i++) {
            if (ch[i] == '0') ch[i] =' ';
            else break;
        }
        return new String(ch).replace(" ", "");
    }
}