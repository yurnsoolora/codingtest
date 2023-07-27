class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] str = my_string.split("");
        String temp = "";
        
        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            while (s<e) {
                temp = str[s];
                str[s] = str[e]; 
                str[e] = temp;
                s++;
                e--;
            }
        }
        
        for (int i=0; i<str.length; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}