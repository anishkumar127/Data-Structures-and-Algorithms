Right Angle Triangle Stars
Given an integer n, print a right angled triangle full of stars with height and base equal to n.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain a right angled triangle filled with stars with height and base equal to n.

Example 1:

Input

3
Output:

*
**
***
Example 2:

Input

7
Output

*
**
***
****
*****
******
*******
Constraints
1 <= n <= 200




import java.util.*;
public class Main
{  
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       
        for (int i=1; i<=n; i++) 
        {   
              for (int k=1; k<=i; k++) 
            {   
                 System.out.print("*");
            }
            System.out.println("");
            
            }
    } 
}