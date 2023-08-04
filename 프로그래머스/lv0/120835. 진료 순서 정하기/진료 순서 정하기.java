import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        
        Map<Integer, Integer> map = new HashMap<>();
        //map선언

        for (int i = 0; i < len; i++) {
            map.put(emergency[i], i);
            //key:응급도
            //value:인덱스
        }

        Arrays.sort(emergency);
        //오름차순 정렬
        //3 24 76
        //0 2 1

        int rank = emergency.length;
        for (int i=0; i<len; i++) { //emergency배열 거꾸로 순회하면서
            answer[map.get(emergency[i])] = rank;
            rank--;
        }

        return answer;
    }
}