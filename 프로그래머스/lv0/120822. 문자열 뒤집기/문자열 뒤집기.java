import java.util.*; 

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] arr = my_string.split("");
        String[] arr2 = new String[arr.length];
        
        int index=0;
        for (int i=arr.length-1; i>=0; i--) {
            arr2[index++] = arr[i];
        }
        
        for (int i=0; i<arr2.length; i++) {
            answer += arr2[i];
        }
        return answer;
    }
}