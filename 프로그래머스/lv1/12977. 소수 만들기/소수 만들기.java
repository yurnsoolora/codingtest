import java.util.*; 

class Solution {
    public int solution(int[] nums) {
        int hap = 0;
        int num = 0;
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    hap = nums[i]+nums[j]+nums[k];
                    list.add(hap);
                }
            }
        }
        
        for (int i=0; i<list.size(); i++) {
            boolean flag = true;
            num = list.get(i);
            
            for (int j=2; j<=Math.sqrt(num); j++) {
                if (num%j == 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                answer++;
            }
        }

        return answer;
    }
}