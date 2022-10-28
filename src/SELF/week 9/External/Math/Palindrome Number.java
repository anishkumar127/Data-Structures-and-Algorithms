
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solution accio = new Solution();
        accio.palindrome(n);
    }
}

class Solution
{
    public static void palindrome(int n)
    {
        // your code here
            
    int num =n;
    int reverse=0;
    while(num>0){
      int digit = num%10;
      reverse = reverse*10+digit; 
      num=num/10;
    }
    
    if(reverse==n){
      System.out.print("true");
    }else{
      System.out.print("false");
    }
    }
}




Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.

Input
The line inputs N.

Output
You need to print "true" if the number is palindrome otherwise "false" (without quotes).

Example 1
Input

5
Output

true 
Example 2
Input

121
Output

true 
Constraints:
1 <= N <= 9999