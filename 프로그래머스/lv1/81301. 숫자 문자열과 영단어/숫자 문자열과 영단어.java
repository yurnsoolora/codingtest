class Solution {
public int solution(String s) {

    String[]  number = {"0","1","2","3","4","5","6","7","8","9"};
    //number 배열에 숫자 1~9까지 순서대로 넣기
    String[]  words = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
     //words 배열에 숫자 1~9까지 순서대로 넣기
        for (int i = 0 ; i <10 ; i++) {
            s = s.replace(words[i] , number[i]);
        }
        
        return Integer.parseInt(s);
    }
}