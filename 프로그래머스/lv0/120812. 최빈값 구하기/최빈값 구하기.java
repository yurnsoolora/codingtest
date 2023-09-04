class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;        
        int[] count = new int[1000];
        
        for (int i=0; i<array.length; i++) {
            count[array[i]]++;
            
            if (max<count[array[i]]) {
                max = count[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0; // 여러 개인 지
        for(int j = 0; j < 1000; j++) {
            if(max == count[j]) temp++;
            if(temp > 1) answer = -1;
        }
        
        return answer;
    }
}