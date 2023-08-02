class Solution {
    public int solution(int[] array, int n) {
        int cha = 0;
        int min = Integer.MAX_VALUE;
        int answer = 0;
        
        for (int i=0; i<array.length; i++) {
            cha = Math.abs(n-array[i]);
            if (cha < min) {
                min = cha;
                answer = array[i];
            }
            else if (cha == min) {
                if (array[i] < answer) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}