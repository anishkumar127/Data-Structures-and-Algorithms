
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
     System.out.print(isRepeated(s));
  }
  private static String isRepeated(String s){
     int n = s.length();
      HashMap<Character,Integer> map = new HashMap<>();
      
      for(int i=0; i<n; i++){
        char every_ch= s.charAt(i);
        map.put(every_ch,map.getOrDefault(every_ch,0)+1);
      }
      
      for(int i=0; i<n; i++){
        if(map.get(s.charAt(i))==1){
          return String.valueOf(s.charAt(i));
        }
      }
      return "-1";
    
  }
}



Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.

Example 1:

Input: S = hello Output: h Explanation: In the given string, the first character which is non-repeating is h, as it appears first and there is no other h in the string.

Example 2:

Input: S = zxvczbtxyzvy Output: c Explanation: In the given string, c is the character which is non-repeating.

Your Task:
You need to take string S as a parameter and output the character. If there is no non-repeating character then return -1 .

Constraints:
1 <= N <= 103

