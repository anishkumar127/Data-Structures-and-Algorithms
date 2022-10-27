import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s= sc.next();
      
      if(s.length()<26){
        System.out.print("NO");
        return;
      }
      s= s.toLowerCase();
      HashMap<Character,Integer>map = new HashMap<>();
  
      for(int i=0; i<s.length(); i++){
       char ch = s.charAt(i);
       map.put(ch,map.getOrDefault(ch,0)+1);
      }
      if(map.size()==26) {
        System.out.print("YES");
      }
      else
      {System.out.print("NO");
      }
      // System.out.println(map);
  }
}




import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s= sc.next();
      
      if(s.length()<26){
        System.out.print("NO");
        return;
      }
      s= s.toLowerCase();
      HashMap<Character,Integer>map = new HashMap<>();
  
      for(int i=0; i<s.length(); i++){
       char ch = s.charAt(i);
       map.put(ch,map.getOrDefault(ch,0)+1);
      }
      if(map.size()==26) {
        System.out.print("YES");
      }
      else
      {System.out.print("NO");
      }
      // System.out.println(map);
  }
}



You are given a string containing English letters. Your task is to identify whether the given string is a pangram. Assume that the string contains a letter if this letter occurs in the string in either uppercase or lowercase.

A pangram is a sentence formed using every letter of a given alphabet at least once.

Input Format
Input the string consisting of uppercase and lowercase English letters.

Output Format
Output "YES" if the string is a pangram and "NO" otherwise.

Example
Sample Input 1

HowquickDaftjuMpingzEbraSvex
Sample Output 1

NO
Sample Input 2

cOdeOftHeDay
Sample Output 2

NO