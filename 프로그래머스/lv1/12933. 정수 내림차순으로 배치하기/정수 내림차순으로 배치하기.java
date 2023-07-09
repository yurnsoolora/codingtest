import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Integer> digits = new ArrayList<>();

        while (n != 0) {
            digits.add((int) (n % 10));
            n = n / 10;
        }

        Collections.sort(digits, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        String str = sb.toString();
        answer = Long.parseLong(str);
        return answer;
    }
}
