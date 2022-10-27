import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String s1 = sc.next();
      String s2 = sc.next();
    
StringBuilder sb = new StringBuilder();

    
    for(int i=0; i<s1.length() || i<s2.length(); i++){
      if(i<s1.length()){
        sb.append(s1.charAt(i));
      }
      if(i<s2.length()){
        sb.append(s2.charAt(i));
      }
    }
    System.out.println(sb.toString());
    }
}


Given two strings s1 and s2 as input, the task is to merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end.

NOTE: Add the whole string if other string is empty.

Input
line 1: contains string s1.

line 2:contains string s2.

Output
Print a resulting string obtained by merging s1 and s2 alternatively starting with s1.

Constraints
1<=s1.length(),s2.length()<=10^3

Expected Time Complexity: O(|s1|+|s2|)

Expected Space Complexity: O(1)

Sample Input
abc
def
Sample Output
adbecf