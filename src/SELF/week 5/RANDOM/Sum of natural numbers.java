import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
              
                
                /*Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int count =0;
                for(int i=1; i<=n; i++){
                        count+=i;
                }
                System.out.print(count);

                */

                
// 	}
        
// }
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.print(sum(n));
    
  }
  private static int sum(int n){
    if(n!=0) 
     return n + sum(n-1);
    else return n;
  }
}

Sum of natural numbers
Write a recursive program to find out the sum of all natural numbers till N. Take input of N from the user and make a recursive function that returns the sum of all the natural numbers upto N.

Input Format

Enter an integer N (N>0) denoting the upper bound/limit till which we have to find sum.
Output Format

Print the sum
Example

Input

5
Output

15