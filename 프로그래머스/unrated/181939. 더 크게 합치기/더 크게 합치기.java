class Solution {
    public int solution(int a, int b) {
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        
        String ab = aa+bb;
        String ba = bb+aa;
        
        int intab = Integer.parseInt(ab);
        int intba = Integer.parseInt(ba);
        
        int answer;
        
        if (intab >=intba) {
            answer = intab;
        }
        else {
            answer = intba;
        }
    return answer;
    }
}