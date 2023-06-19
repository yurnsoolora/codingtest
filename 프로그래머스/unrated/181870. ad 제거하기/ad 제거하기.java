class Solution {
    public String[] solution(String[] strArr) {
        int len = 0;
        int index = 0;
       
        for (int i=0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) len++; 
        }
        
        String[] answer = new String[len];
        
        for (int i=0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer[index++] = strArr[i];
            }
        }
        return answer;
    }
}