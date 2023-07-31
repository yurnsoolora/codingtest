import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        int i=0;
        while (i<arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            }
            else {
                if (stk.get(stk.size()-1) == arr[i]) {
                    stk.remove(stk.size()-1);
                    i++;
                }
                else {
                    stk.add(arr[i]); 
                    i++;
                }
            }
        }
        
        int[] answer = new int[stk.size()];
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        
        for (int j=0; j<stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        return answer;
    }
}