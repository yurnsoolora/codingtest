class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean result=true;
        
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                result = (n>=m); 
            }
            else if (eq.equals("!")) {
                result = (n>m);
            }
        }
        else if (ineq.equals("<")) {
           if (eq.equals("=")) {
                result = (n<=m); 
            }
            else if (eq.equals("!")) {
                result = (n<m);
            }
        }
        
        if (result) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        
        return answer;          
    }
}