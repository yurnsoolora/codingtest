class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] str = phone_number.split("");
        
        for (int i=0; i<str.length; i++) {
            if (i <= str.length-5) {
                answer += "*";
            }
            else {
                answer += str[i];
            }
        }
        
        return answer;
    }
}