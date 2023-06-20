import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>(); 
        //배열의 길이를 지정해주기 귀찮을때 -> 냅다 arraylist 선언!

        for(int i=1; i<=n; i+=2){
              answer.add(i);
        }

        return answer;
    }
}