import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>(); //arraylist선언
        
        for (int i=0; i<num_list.length; i+=n) {
            list.add(num_list[i]); //list에 차곡차곡 넣어주기
        }
        
        int[] answer = new int[list.size()]; //다시 arraylist -> int형 배열로 바꿔주고 ~
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); //배열에 하나하나 넣기 !!
        }
        
        return answer;
    }
}