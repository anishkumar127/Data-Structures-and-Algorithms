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

                System.out.println(a+b);
                  System.out.println(a-b);
                  System.out.println(a*b);
                  System.out.println(a/b);
                  System.out.println(a%b);
	}
}


You are given two positive integers. Can you calculate the result of performing +,-,*,/,% operations on them?

Example:

If 'A' = 8 and 'B' = 3, then your program should output the result of the operations +,-,*,/,% in this order. Thus your output would be:

11
5
24
2
2
Input Format:

The first line of input contains two space separated integers 'A' and 'B'.

Output Format:

The first line of the output should contain the sum of A and B.

The second line of the output should contain the difference of A and B.

The third line of the output should contain the product of A and B.

The fourth line of the output should contain the quotient of A divided by B.

The fifth line of the output should contain the remainder of A divided by B.

Example 1:

8 3
Output:

11
5
24
2
2
Example 2:

10 2
Output:

12
8
20
5
0
Constraints:

1 <= A <= 10^3

1 <= B <= 10^3