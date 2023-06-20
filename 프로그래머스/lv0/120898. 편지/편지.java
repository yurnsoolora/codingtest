class Solution {
    public int solution(String message) {
        int count=0;
        int answer = 0;
        for (int i=0; i<message.length(); i++) {
            count++;
        }
        answer = count*2;
        return answer;
    }
}