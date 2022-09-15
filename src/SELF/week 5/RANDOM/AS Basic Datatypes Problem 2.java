import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int count =0;
      // int size= a+b+c;
      // int size=3;
      // while(size>=1){
      //   if(a<=-1 || b<=-1 || c<=-1){
      //     count=count+1;
      //   } 
  
      //   size--;
      // }
      if(a<=-1){
        count=count+1;
      }
      if(b<=-1){
        count = count+1;
      }
      if(c<=-1){
        count = count+1;
      }
      System.out.println(count);
	}
}




Take input of 3 integer variables from the user ( a,b,c ) and find out how many of them are negative numbers. After finding out the total count of negative numbers, print that count. If there are no negative numbers, count will be zero.

Approach:First find out the space and time complexity to get the approach for this question

Input Format

First line contains input of a, b, c separated by a space
Output Format

First line contains total count of negative numbers out of the three input numbers (a,b,c)
Example

Input

2 3 -10
Output

1