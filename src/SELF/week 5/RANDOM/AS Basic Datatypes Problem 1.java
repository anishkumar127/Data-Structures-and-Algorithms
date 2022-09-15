import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();

      int Op1 = x+y+z;
      int Op2 = x*y-z;
      System.out.println(Op1);
      System.out.println(Op2);
	}
}

AS Basic Datatypes Problem 1
Take user input of 3 integer numbers (x,y,z) to perform following operations using them.

Op1 = x+y+z

Op2 = x*y-z

Store the values of these operations in 2 different variables of integer type (Op1,Op2) and simply print them in the same order.

Time complexity: O(1) will be the time complexity because we only need to create 5 variables for this question- 3 variables to store values of x y z and 2 variables to store the operations Op1 and Op2. Hence every time a constant amount of time is required to execute code.

Space Complexity: Since we take the same amount of input/space to implement without using any extra spaces, we can say that the Space complexity will be O(1)

Input Format

First line contains input of x, y, z separated by a space
Output Format

First line contains Op1
Second line contains Op2 
Example

Input

2 3 4
Output

9
2