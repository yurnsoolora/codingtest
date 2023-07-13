import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length; j++) {
                if (i!=j && !list.contains(numbers[i]+numbers[j])) {
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        int index = 0;
        for (int i=0; i<list.size(); i++) {
            answer[index++] = list.get(i);
        }
        return answer;
    }
}