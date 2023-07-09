class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int y = x;
        int hap = 0;
        
        
        while (x != 0) {
            hap += x%10;
            x = x/10; 
        }
        
        if (y%hap == 0) answer = true;
        else answer = false;
        
        return answer;
    }
}