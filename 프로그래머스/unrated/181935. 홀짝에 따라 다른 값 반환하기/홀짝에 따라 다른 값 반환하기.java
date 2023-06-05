class Solution {
    public int solution(int n) {
        int answer = 0;
        int i;
        
        if (n%2!=0) 
        {
            for (i=1; i<=n; i+=2) 
            {
                answer +=i;
            }
        }
            
        else {
            for (i=0; i<=n; i+=2) 
            {
                answer +=i*i;
            }
        } 
        return answer;
    }
}