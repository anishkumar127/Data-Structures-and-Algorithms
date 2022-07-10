Reverse digits of a Number
Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
```

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = n;
      int sum =0;
      while(x>0){
         int t = x%10;
         sum = (sum*10)+t;
         x = x/10;
        }
        System.out.print(sum);
	}
}
```