import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      
      HashMap<Character,Integer>map = new HashMap<>();
      
      for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
      boolean isDouble = true;
      for(int val:map.values()){
        if(val!=2){
          isDouble=false;
          break;
        }
      }
      
      if(isDouble) System.out.print("YES");
      else System.out.print("NO");
  }
}

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
                String str = input.next();
                if(str.length()%2!=0){
                        System.out.println("NO");
                }else{
                boolean flag = true;
                for(int i=0; i<str.length()/2; i++){
                        if(str.charAt(i)!=str.charAt((str.length()/2)+i)){
                                System.out.println("NO");
                                flag =false;
                                break;
                        }
                }
                if(flag)
                        System.out.println("YES");        
                }
                
	}
}




You are given a string S. Your task is to find out whether the given string is a double string or not i.e., if it is some string written twice in a row.

For example, the strings "aa", "abcabc", "abab" and "baabaa" are double strings. But the strings "aaa", "abaaab" and "abcdabc" are not double string.

Input
The input contains the string S.

Output
Output a "YES" if the string is a double string and a "NO" otherwise.

Example
Input:
abcabc
Output:
YES
