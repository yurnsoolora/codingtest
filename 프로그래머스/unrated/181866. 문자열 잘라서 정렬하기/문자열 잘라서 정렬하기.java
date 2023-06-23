import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        Arrays.sort(str);
        
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                answer[idx++] = str[i];
            }
        }
        
        return answer;
    }
}