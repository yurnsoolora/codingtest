import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        int i=1;
        while(i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            }
            else {
                if(arr[i] > list.get(list.size()-1)) {
                    list.add(arr[i]);
                    i++;
                }
                else {
                    list.remove(list.size()-1);
                }
            }
        }
        
        int[] stk = new int[list.size()];
        
        for (int j=0; j<list.size(); j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }
}
        