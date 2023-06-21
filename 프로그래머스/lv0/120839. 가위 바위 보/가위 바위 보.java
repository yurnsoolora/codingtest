class Solution {
    public String solution(String rsp) {
        String a = "";
        String answer = "";
        
        a = rsp.replace("2","X").replace("0","Y").replace("5","Z");
        answer = a.replace("X", "0").replace("Y", "5").replace("Z","2");
        
        return answer;
    }
}