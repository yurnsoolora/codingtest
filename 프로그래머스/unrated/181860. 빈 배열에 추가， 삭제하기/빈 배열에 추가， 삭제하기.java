import java.util.*; 

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
       
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (flag[i] == true) {
                for (int j=0; j<arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            }
            else {
                for (int k=0; k<arr[i]; k++) {
                    list.remove(list.size() -1);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int l=0; l<list.size(); l++) {
            answer[l] = list.get(l);
        }
        return answer;
    }
}