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
      int sum = 0;
     
      int temp =n;
      while(n>0){
        int rem = n%10;
        sum = sum+rem*rem*rem;
        n = n/10;
        
      }
      if(temp == sum ){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
      System.out.print(sum);
      
	}
}