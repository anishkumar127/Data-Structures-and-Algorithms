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
                   String s = sc.next();
                     int count =0;
                     for(int i=0; i<n; i++){
                       char ch = s.charAt(i);
                       if( ch>= 'A' && ch<='Z' || ch>='a' && ch<='z'){
                         count++;
                       }
                             }
                     System.out.println(count);
	}
}
Given a string of length n, count the number of alphabets in the string.

Example:

If your string is helloABC123, your output should be 8.

Input Format:

The first line of the input contains one integer n, denoting the size of the string s.

The second line of the input contains the string s.

Output Format:

Your code should output the number of alphabets in the string.

Example 1:

11
helloABC123
Output:

8
Example 2:

4
aBC1
Output:

3
Constraints:

1 <= n <= 2*10^5

