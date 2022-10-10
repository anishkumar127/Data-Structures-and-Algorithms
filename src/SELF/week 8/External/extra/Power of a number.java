import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int ans = 1;
        for(int i =0; i<t; i++){
            ans*=n;
        }
        System.out.println(ans);
	}
}






import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int ans =1;
          for(int i=1;i<=b;i++)
            { 
              ans = ans*a;
            }  
          System.out.print(ans);
        
      
	}
}

Given a number x and power n. The task is to write a program to find the power of a number using recursion.

Complete the given function.

Follow up:

Can you come up with an alogrithm that is less than O(n) time complexity?

Input Format
First line contains two integer x, number and n, power.

Output Format
Print the value of N to the power P.

Example 1
Input

2 5
Output:

32
Explanation:

2 to the power of 5 is 32.

Example 2
Input

100 0
Output:

1
Explanation:

100 to the power 0 is 1.

Constraints
0<=N<=10

0<=P<=8