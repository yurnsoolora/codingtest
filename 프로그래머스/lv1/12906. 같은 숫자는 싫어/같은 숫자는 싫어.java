import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Arraylist 선언
        
        int value = -1; //중복을 비교할 value 변수 선언 (초기값은 임의의수)
        for(int i=0; i<arr.length; i++) { //arr배열 돌면서
            if(arr[i] != value) { //arr의 원소가 value와 같지 않다면
                list.add(arr[i]); // list에 원소 넣어줌
                value = arr[i]; //value를 방금 넣은 원소값으로 바꿔주기
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}