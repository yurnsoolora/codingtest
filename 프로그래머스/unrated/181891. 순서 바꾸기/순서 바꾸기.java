class Solution {
    public int[] solution(int[] num_list, int n) {
        int index=0;
        int[] answer = new int[num_list.length];
        
        for (int i=n; i<num_list.length; i++) {
            answer[index++] = num_list[i];
        }
        
        for (int i=0; i<n; i++) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}
    