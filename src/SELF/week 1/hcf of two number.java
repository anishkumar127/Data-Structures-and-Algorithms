import java.util.*;
import java.lang.*;
import java.io.*;
// input 75 90
// output 15.
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