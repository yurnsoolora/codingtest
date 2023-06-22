class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("left")) {
             for (int i=0; i<numbers.length-1; i++) {
                 answer[answer.length-1] = numbers[0];
                 answer[i] = numbers[i+1];
             }
        }
        else {
            for (int i=1; i<numbers.length; i++) {
                answer[0] = numbers[numbers.length-1];
                answer[i] = numbers[i-1];
            }
        }
         return answer;
    }
}