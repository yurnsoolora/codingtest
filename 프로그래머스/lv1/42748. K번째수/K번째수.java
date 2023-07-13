import java.util.*; 

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int index = 0; 
        for (int i=0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];
            
            int[] newArray = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(newArray);
            answer[index++] = newArray[idx-1];
        }
        
        return answer;
    }
}