class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pcnt = 0;
        int ycnt = 0;
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'P' || ch == 'p') {
                pcnt++;
            }
            else if (ch == 'Y' || ch == 'y') {
                ycnt++;
            }
        }

        return (pcnt==ycnt) ? true : false;
    }
}