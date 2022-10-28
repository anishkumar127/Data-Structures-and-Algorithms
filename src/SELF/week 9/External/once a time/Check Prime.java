

not able to do before a time. where i am not able to think about simple problem.
i was not able to do it. 
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
          Scanner sc  = new Scanner(System.in);
      int n  = sc.nextInt();
      if(n>=0){
        System.out.println("please input positive number");
     
        if(n%2==1){
          System.out.println("Prime");
        }else{
          System.out.println("Not Prime");
        }
      }
	}
}

// this is above question paste from net. and not able to did it.
// but today i did it this question. 








// did it today 10/28/2022

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
          Scanner sc  = new Scanner(System.in);
      int n  = sc.nextInt();
      // if(n>=0){
      //   System.out.println("please input positive number");
     
        if(n%2==1){
          System.out.println(n+" is a prime number");
        }else{
          System.out.println(n+" is not a prime number");
        }
      // }
	}
}











Write a program that inputs a positive integer N. It should then output a message indicating whether the number is a prime number or not.

Input Format
A single line containing the integer N

Output Format
Print a string, either "N is a prime number" or "N is not a prime number" (without quotes), depending on whether N is prime or not.

Example 1
Input

5
Output

5 is a prime number
Explanation

5 is only divisible by 5 and itself.

Example 2
Input

10
Output

10 is not a prime number
Explanation

1,2,5 & 10 are factors of 10.

Constraints
1 <= |n| <= 10^9