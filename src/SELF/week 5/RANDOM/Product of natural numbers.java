import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fact =1;
      for(int i=1; i<=n; i++){
        fact = fact*i;
      }
      System.out.print(fact);
	}
}



Write a recursive program to find the product of all the Natural numbers till N. Take input of N from the user and write a recursive function that returns the sum of all the Natural numbers until N.

Input Format

Enter an integer N (N>0)
Output Format

Print the product of all the Natural numbers between N and 1 (both included).
Example

Input

5
Output

120