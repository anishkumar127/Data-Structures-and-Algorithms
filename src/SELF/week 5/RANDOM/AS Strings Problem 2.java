import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count =0;
      char ch [] =s.toCharArray();
      for(int i=0; i<ch.length; i++){
        count++;
      }
      System.out.print(count);
	}
}


AS Strings Problem 2
Write a program to find out how many characters are present in a string using a loop.

Approach: First find out the space and time complexity to get the approach for this question

Input Format

First line contains a string str
Output Format

Print count of characters in the str
Example

Input

"accioschool"
Output

11