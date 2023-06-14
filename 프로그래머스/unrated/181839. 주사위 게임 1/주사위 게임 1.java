class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        boolean aa = (a%2!=0);
        boolean bb = (b%2!=0);
        
        if (aa && bb) answer = a*a + b*b;
        else if (aa || bb) answer = 2*(a+b);
        else answer= Math.abs(a-b);
        
        return answer;
    }
}