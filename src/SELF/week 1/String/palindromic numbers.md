import java.util.*;
/*
Priyanshu has an integer N. He wants to know the numbers which are less than or equal to N 
and are palindrome. He is unable to find this on his own. Can you help him? Palindromic integers
are those integers that read the same backward or forwards.

Note: Order of numbers should be in the non-decreasing matter.

For Example: You are given ‘N’ as 23, so the output should be [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22], 
as all single-digit numbers are palindromic, and 11 and 22 are also a palindromic numbers.

Input Format: The only line of input contains an integer N.

Output Format: The only line of output contains space seprated integers which are palindrome.

Example 1: 23 Output: 1 2 3 4 5 6 7 8 9 11 22 Explanation: Refer to the problem statement for explanation.

Example 2: Input: 5 Output: 1 2 3 4 5 Explanation: All single-digit numbers are palindromic

Constraints: 1 <= N <= 10^5
*/
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=1; i<=n; i++){
        int sum =0;
     int t = i;
     while(t!=0){ 
         int rem = t%10;
         sum = (sum*10)+rem;
         t= t/10;
     } 
     if(i==sum){
      System.out.print(i+" ");
     }
     
    }
    // System.out.println();
    // // int rem =0;
    // int digit =0;
    // int sum =0;
    // int t = n;
    // while(n!=0){
    //     System.out.print(n);
    //     int rem = n%10;
    //     sum = (sum*10)+rem;
    //     // System.out.print(rem);
    //     n= n/10;
    // } 
    // if(t==sum){
    //   System.out.print("yes");
       
    // }
    // System.out.print(sum);
  }
}
