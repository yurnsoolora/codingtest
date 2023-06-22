import java.util.*; 

class Solution {
    public int[] solution(int[] array) {
        
        int[] ori = new int[array.length];
        
        for (int i=0; i<array.length; i++) { //배열복사
            ori[i] = array[i];
        }
        
        Arrays.sort(array); 
        
        int index = 0;
        for (int i=0; i<ori.length; i++) {
            if (array[array.length-1] == ori[i])
            index = i;
        }
        
        int[] answer = {array[array.length-1], index};
   
        return answer;
    }
}