import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        HashMap<String, String> map = new HashMap<>();
        String[] str = letter.split(" ");
        
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] alp = {"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x",
            "y", "z"};
        
        for (int i=0; i<mos.length; i++) {
            map.put(mos[i], alp[i]);
        }
        
        for (int i=0; i<str.length; i++) {
            answer += map.get(str[i]);
        }
        return answer;
    }
}