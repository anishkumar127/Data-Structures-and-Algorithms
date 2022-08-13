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
      int d = sc.nextInt();
      int count =0;
      while(n!=0){
        int rem = n%10;
        if(rem==d){
          count++;
        }
        n=n/10;
      }
      System.out.print(count);
	}
}