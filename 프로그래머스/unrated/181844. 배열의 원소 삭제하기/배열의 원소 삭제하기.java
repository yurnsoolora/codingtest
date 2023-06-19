import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
          for (int i=0; i<arr.length; i++) {
              boolean delete = false;
              
              for (int j=0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    delete = true;
                    break;
                }
            }
              if (!delete) {
                  list.add(arr[i]);
              }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}