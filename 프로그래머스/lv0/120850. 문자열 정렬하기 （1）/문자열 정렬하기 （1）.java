import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();

        // 문자열에서 소문자 제거
        my_string = my_string.replaceAll("[a-z]", "");

        for (int i = 0; i < my_string.length(); i++) {
            list.add(Character.getNumericValue(my_string.charAt(i)));
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}