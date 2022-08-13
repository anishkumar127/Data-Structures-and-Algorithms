import java.util.*;
import java.lang.*;
import java.io.*;
// input 12345
// output 54321
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = n;
      int r =0;
      int sum =0;
      while(x>0){
         int t = x%10;
         sum = (sum*10)+t;
         x = x/10;
        }
        System.out.print(sum);
	}
}