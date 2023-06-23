class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String[] temp = new String[intStrs.length];
        
        int index = 0;
        for (int i=0; i<intStrs.length; i++) {
            temp[index++] = intStrs[i].substring(s, s+l);
        }
        
        int count = 0;
        for (int i=0; i<temp.length; i++) {
            if (Integer.parseInt(temp[i]) > k) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int idx=0;
        for (int i=0; i<temp.length; i++) {
            if (Integer.parseInt(temp[i]) > k) {
                answer[idx++] = Integer.parseInt(temp[i]);
            }
        }
        
        return answer;
    }
}