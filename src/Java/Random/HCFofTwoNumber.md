What Is HCF?

HCF or Highest Common Factor is the greatest common divisor between two numbers.

For example:

Let there be two arbitrary numbers such as 75 and 90.

75 = 3 * 5 * 5

90 = 2 * 3 * 3 * 5

Common Divisor = 3 * 5 = 15

Here, the HCF of the three given numbers would be 15 since it divides every given number without leaving a fraction behind.



```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second  = sc.nextInt();
		
		int ans = Math.min(first,second); // minimum is 75; 
		
		while(ans>0){
		  if(first%ans ==0 && second%ans ==0){// here 75%15 ==0; and 90%15 ==0 so break loop
		    break; // if match break the loop.
		  }
		  ans--; // keep decreasing 75 until match the condition. in if statement.
		}
		System.out.print(ans); // printed 15 here.
	}
}
```