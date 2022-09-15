import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum =0;
      for(int i=1; i<=n; i++){
        sum+=i;
      }
      System.out.print(sum);
	}
}



Time complexity: O(N) will be the time complexity because we will have to make N iterations to execute the code.

Space Complexity: Since we take the same amount of input/space to implement, we can say that the Space complexity will be O(1)

Input Format

First line contains an integer N
Output Format

Print the sum in first line
Example

Input

10
Output

55