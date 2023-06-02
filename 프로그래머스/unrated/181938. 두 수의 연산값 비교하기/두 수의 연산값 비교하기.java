class Solution {
    public int solution(int a, int b) {
        
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        
        String ab = aa+bb;
        
        int intab = Integer.parseInt(ab);
        
        int answer; 
        if (intab >= 2*a*b)
        {
            answer = intab;
        }
        else 
        {
            answer = 2*a*b;
        }
        return answer;
    }
}