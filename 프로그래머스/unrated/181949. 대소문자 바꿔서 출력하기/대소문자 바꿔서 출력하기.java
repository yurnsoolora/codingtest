import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //입력받은 문자열
        
        StringBuilder sb = new StringBuilder(a.length());
        
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) 
            {
            sb.append(Character.toLowerCase(c));
            } 
            else 
            {
            sb.append(Character.toUpperCase(c));
            }   
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
    