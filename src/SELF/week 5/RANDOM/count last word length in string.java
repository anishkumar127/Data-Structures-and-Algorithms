import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int count=0;
      for(int i=s.length()-1; i>=0; i--){
        if(s.charAt(i)==' '){
          break;
        }
        count++;
      }
      System.out.print(count);
	}
}

Problem Description

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, print 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",

print 5 as length("World") = 5.

Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.

Input Format The first line given is a string s.

Output Format Print a single integer denoting the length of the last word.

Example Input Input 1: Hello World

Input 2: God is great.

Example Output Output 1:

5

Output 1:

6

