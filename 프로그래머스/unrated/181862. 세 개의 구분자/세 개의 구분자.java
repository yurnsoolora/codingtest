import java.util.*;

class Solution {
    public String[] solution(String myStr) {
       
        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        String[] str = myStr.split(" ");
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i=0; i<str.length; i++) {
            if (!str[i].equals("")) {
                list.add(str[i]);
            }
        }
        
        if (list.size() == 0) {
            list.add("EMPTY");
        }
        
        String[] answer = new String[list.size()];
        int idx=0;
        for (int i=0; i<list.size(); i++) {
            answer[idx++] = list.get(i);
        }
        return answer;
    }
}