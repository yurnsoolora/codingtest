class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        
        for (int n=i; n<=j; n++) {
            str += String.valueOf(n);
        }
        
        String temp = str.replace(String.valueOf(k), "");
        answer = str.length() - temp.length();
        
        return answer;
    }
}