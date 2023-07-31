import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (!list.contains(arr[i]) && list.size() < k) {
                list.add(arr[i]);
            }
        }
        
        if (list.size()<k) {
            int num = k-list.size();
            for (int i=1; i<=num; i++) {
                list.add(-1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}