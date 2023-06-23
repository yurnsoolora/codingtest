class Solution {
    public int[] solution(String myString) {
        
        String[] str = myString.split("");
        
        int count = 0;
        for (int i=0; i<str.length; i++) {
            if (str[i].equals("x")) {
                count++;
            }
        }
        
        int[] temp = new int[count];
        int[] answer = new int[count+1];
        
        int tempi=0;
        for (int i=0; i<str.length; i++) {
            if (str[i].equals("x")) {
                temp[tempi++] = i;
            }
        }
        
        int answeri = 1;
        for (int i=1; i<=answer.length-2; i++) {
            answer[0] = temp[0];
            answer[answeri++] = temp[i] - temp[i-1] -1;
            answer[answer.length-1] = str.length - temp[temp.length-1] -1;
        }
        
        return answer;
    }
}