class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if (ch =='a' || ch =='A') {
                ch ='A';
            }
            else {
                ch = Character.toLowerCase(ch);
            }
            answer += Character.toString(ch);
        }
        return answer;
    }
}