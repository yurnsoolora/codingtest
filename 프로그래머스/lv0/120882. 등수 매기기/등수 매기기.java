class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        float[] avg = new float[len];
        
        for (int i=0; i<len; i++) {
            avg[i] = (float)((score[i][0] + score[i][1])/2.0);
        }
        
        int[] answer = new int[len];
        for (int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                if (avg[i] < avg[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}