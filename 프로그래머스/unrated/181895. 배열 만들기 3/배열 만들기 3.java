import java.util.*; 

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        int start2 = intervals[1][0];
        int end2 = intervals[1][1];

        int[] arr1 = Arrays.copyOfRange(arr, start1, end1+1);
        int[] arr2 = Arrays.copyOfRange(arr, start2, end2+1);
        
        int[] answer = new int[arr1.length + arr2.length]; 
        
        int idx = 0;
        for (int i=0; i<arr1.length; i++) {
            answer[idx++] = arr1[i];
        }
        
         for (int i=0; i<arr2.length; i++) {
            answer[idx++] = arr2[i];
        }
        
        return answer;
    }
}