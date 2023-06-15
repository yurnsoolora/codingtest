class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("B", "X");
        myString = myString.replace("A", "B");
        myString = myString.replace("X", "A");
    
        return myString.contains(pat) ? 1: 0;
    }
}