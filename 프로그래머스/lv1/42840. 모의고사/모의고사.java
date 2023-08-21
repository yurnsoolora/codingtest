import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5}; //5개씩 반복
        int[] b = {2,1,2,3,2,4,2,5}; //8개씩 반복
        int[] c = {3,3,1,1,2,2,4,4,5,5}; //10개씩 반복
        int[] score = new int[3];

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == a[i%5]) score[0]++;
            if (answers[i] == b[i%8]) score[1]++;
            if (answers[i] == c[i%10]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1],score[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if (max == score[0])
            list.add(1);
        if (max == score[1])
            list.add(2);
        if (max == score[2])
            list.add(3);
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}