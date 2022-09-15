import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      fact(n);
	}
  private static void fact(int n){

    if(n<1) return ;

    System.out.println("AccioSchool");
    fact(n-1);
  
  }
}








Write a recursive program to print the word AccioSchool N times. Take input of N from the user and create a recursive function to print the above mentioned word N times.

Input Format

Enter an integer N (N>0)
Output Format

Print the word "anish" N number of times, each time in the next line.
Example

Input

5
Output

anish
anish
anish
anish
anish