class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] arr = new int[num_list.length];
        
        
        for (int i=0; i<num_list.length; i++) {
            int cnt=0;
            while (num_list[i] > 1) {
                if (num_list[i]%2==0) {
                    num_list[i] = num_list[i]/2;
                } else {
                    num_list[i] = (num_list[i]-1)/2;
                }
                cnt++;
            }
            arr[i] = cnt;
        }
        
        for (int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}