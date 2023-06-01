// class Solution {
//     public String solution(String my_string, String overwrite_string, int s) 
//     {
//         StringBuilder sb = new StringBuilder(my_string);
        
//         for (int i=s; i<=overwrite_string.length(); i++) 
//         {
//             sb.setLength(0);
//             sb.append(overwrite_string);
//         }
        
//         String result = sb.toString();
//         return result;
//     }
// }

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] msArray = my_string.toCharArray();
        char[] osArray = overwrite_string.toCharArray();
        
       for (int i = s, j = 0; i < msArray.length && j < osArray.length; i++, j++) 
       {
    msArray[i] = osArray[j];
       }
        
        String result = new String(msArray);
        return result;
    }
}

