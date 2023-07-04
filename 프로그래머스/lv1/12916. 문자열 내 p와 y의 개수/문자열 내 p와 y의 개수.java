class Solution {
    boolean solution(String s) {

        return s.replaceAll("[^yY]", "").length() == s.replaceAll("[^pP]", "").length() ? true : false;
    }
}