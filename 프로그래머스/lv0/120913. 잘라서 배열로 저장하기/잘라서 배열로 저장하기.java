class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[len%n==0 ? len/n : len/n+1];
        
        int idx=0;
        for (int i=0; i<len; i+=n) {
            if (i<=len-n) {
                answer[idx++] = my_str.substring(i,i+n);
            } else {
                answer[idx++] = my_str.substring(i,len);
            }
        }
        return answer;
    }
}