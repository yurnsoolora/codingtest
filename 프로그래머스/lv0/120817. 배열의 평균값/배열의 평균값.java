class Solution {
    public double solution(int[] numbers) {
        int hap = 0;
        double answer = 0;
        for (int i=0; i<numbers.length; i++) {
            hap += numbers[i];
            answer = (double)hap/numbers.length;
        }
        return answer;
    }
}