import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
	 String s = sc.next();
	 
	 Stack<Character> st= new Stack<>();
	 
	 for(char ch:s.toCharArray()){
	   st.push(ch);
	 }
	 
	StringBuilder sb = new StringBuilder();
	
    while(!st.isEmpty()){
      sb.append(st.pop());
        }
	 System.out.print(sb.toString());
	}
}


You are given a string s, the task is to reverse the string using stack.

Input Format
line 1: contains a string s.

Output Format
Print a resulting string which is reverse of the original string.

Example 1
Input

abcd
Output

dcba
Constraints
1<=s.length()<=100

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)