class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = num + "";
        String[] arr = str.split("");
        String k2 = Integer.toString(k);
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i].equals(k2)) {
                answer = i+1;
                break;
            }
            else {
                answer = -1;
            }
        }
        return answer;
    }
}