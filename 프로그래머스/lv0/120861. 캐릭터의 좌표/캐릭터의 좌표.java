class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        for (int i=0; i<keyinput.length; i++) { 
            int x = answer[0];
            int y = answer[1];
            
            switch (keyinput[i]) {
                case "up" :
                   y += 1;
                    break;
                case "down" :
                    y -= 1;
                    break;
                case "left" :
                    x -= 1;
                    break;
                case "right" :
                    x += 1;
                    break;
            }
            
            if (Math.abs(x) <= board[0]/2) {
                 answer[0] = x;
            }
            if (Math.abs(y) <= board[1]/2) {
                answer[1] = y;
            }
        }
        return answer;
    }
}