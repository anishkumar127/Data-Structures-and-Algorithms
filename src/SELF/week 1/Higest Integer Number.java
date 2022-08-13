/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		
		if(a>b && a>c){
		  // max = a;
		  System.out.print(a);
		}
		else if(b>a && b>c){
		  // max = b;
		  System.out.print(b);
		}else if(c> a && c>b){
		  // max = c;
		  System.out.print(c);
		}
		// System.out.print
	}
}