class Solution {
    public String[] solution(String[] picture, int k) {
        
        String d = ".";
        String x = "x";
        
        for (int i=0; i<picture.length; i++) {
            picture[i] = picture[i].replace(d, d.repeat(k)).replace(x,x.repeat(k));
        }
        
        String[] answer = new String[picture.length*k];
        answer[0] = picture[0];
        
        int idx=0;
        for (int i=1; i<answer.length; i++) {
            if (i%k==0) {
                idx++;
            }
            answer[i] = picture[idx];
        }
        return answer;
    }
}