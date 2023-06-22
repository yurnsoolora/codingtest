class Solution {
    public String solution(int age) {
        String answer = "";
        
        String abcstr = "abcdefghijklmnopqrstuvwxyz";
        String[] abcarr = abcstr.split(""); 
        
        String agestr = String.valueOf(age);
        String[] agearr = agestr.split("");
        
        for (int i=0; i<agearr.length; i++) {
                answer += abcarr[Integer.valueOf(agearr[i])];
        }
        return answer;
    }
}