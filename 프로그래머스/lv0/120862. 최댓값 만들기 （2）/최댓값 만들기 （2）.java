import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] temp = new int[numbers.length*(numbers.length-1)];
        
        int idx = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length; j++) {
                if (i!=j) {
                    temp[idx++] = numbers[i]*numbers[j];
                }
            }
        }
        Arrays.sort(temp);
        
        return temp[temp.length-1];
    }
}