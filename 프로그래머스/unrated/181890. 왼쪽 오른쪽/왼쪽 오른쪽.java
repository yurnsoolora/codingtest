import java.util.*; 

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j=0; j<i; j++) {
                    list.add(str_list[j]);
                }
                break;
            }
            else if (str_list[i].equals("r")) {
                for (int k=i+1; k<str_list.length; k++) {
                    list.add(str_list[k]);
                }
                break; 
            }
        }
        
        String[] answer = new String[list.size()];
        for (int m=0; m<list.size(); m++) {
            answer[m] = list.get(m);
        }
        return answer;
    }
}