// scanner

import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch='"';
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        
        for(int i=0; i<s.length(); i++){
          sb.append(s.charAt(i));
        }
        sb.append(ch);
        
        System.out.println(sb.toString());
  }
}



import java.util.Scanner;

class Solution {
    public static String addQuotationMarks(String s)
    {
        //Write your code here
             char ch='"';
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        
        for(int i=0; i<s.length(); i++){
          sb.append(s.charAt(i));
        }
        sb.append(ch);

            return sb.toString();
      
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution Obj = new Solution();
        System.out.println(Obj.addQuotationMarks(str));
    }
}



Given a string S, print it after adding quotation marks ("") towards both of its ends.

Input Format:
Input consists of a single line of string.

Output Format:
Return the edited string.

EXAMPLE 1
Input:

My name is Khan
Output::

"My name is Khan"
EXAMPLE 2
Input:

abcd efg
Output::

"abcd efg"
Constraints
0 <= |S| <= 1000