class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        
        int row = arr.length; 
        int col = arr[0].length; 
        
        for (int i=0; i<row; i++) { 
            for (int j=0; j<col; j++) {
                if (arr[i][j] != arr[j][i]) { 
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }
}