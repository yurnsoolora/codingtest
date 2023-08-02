import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        for (int i=0; i<before.length(); i++) {
            list.add(String.valueOf(before.charAt(i)));
        }
        
        for (int i=0; i<after.length(); i++) {
            if (list.contains(String.valueOf(after.charAt(i)))) {
                list.remove(String.valueOf(after.charAt(i)));
            }
        }
        
        if (list.size() == 0) {
            answer = 1;
        }
        return answer;
    }
}