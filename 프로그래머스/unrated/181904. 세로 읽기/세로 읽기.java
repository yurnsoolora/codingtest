class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] mstr = my_string.split("");
        String[][] str = new String[my_string.length()/m][m];
        
        int index = 0;
        for (int i=0; i<str.length; i++) {
            for (int j=0; j<str[0].length; j++) {
                str[i][j] = mstr[index++];
            }
        }
        
        for (int i=0; i<str.length; i++) {
            answer += str[i][c-1];
        }
        
        return answer;
    }
}