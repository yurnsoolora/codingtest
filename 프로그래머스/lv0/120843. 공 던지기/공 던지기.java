class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        int num = 2*k-2;
        
        if (num>len) {
            answer = numbers[num%len];
        }
        else {
            answer = numbers[num];
        }
        
        return answer;
    }
}