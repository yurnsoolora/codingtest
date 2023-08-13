import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<attendance.length; i++) {
            if (attendance[i] == true) {
                map.put(rank[i], i);
            }
        }
        for (int i=0; i<attendance.length; i++) {
            if (attendance[i] == true) {
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        
        int gob = 10000;
        for (int i=0; i<3; i++) {
            answer += gob*(map.get(list.get(i)));
            gob = gob/100;
        }
        return answer;
    }
}