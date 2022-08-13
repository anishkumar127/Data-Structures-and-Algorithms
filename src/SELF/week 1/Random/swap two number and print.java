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

      int temp = a;
      a = b;
      b = temp;
      System.out.print(a+" "+b);
	}
}
