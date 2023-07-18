class Solution {
    public int[] solution(int[] arr) {
        int len=0; 
        for (int i=0; i<=11; i++) {
            if (arr.length <= Math.pow(2,i)) {
                len = (int) Math.pow(2,i);
                break;
            }
        }
        int[] answer = new int[len];
        
        int idx = 0;
        for (int i=0; i<arr.length; i++) {
            answer[idx++] = arr[i];
        }
        return answer;
    }
}