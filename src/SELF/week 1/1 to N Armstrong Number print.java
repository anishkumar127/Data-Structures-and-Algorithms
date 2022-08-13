import java.util.*;
import java.lang.*;
import java.io.*;
/*
 
STDIN
1
 500

Output:

1
153
370
371
407
*/
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
      Scanner sc = new Scanner(System.in);
      // int n = sc.nextInt();
      // int first = sc.nextInt();
      // int end = sc.nextInt();
      
      // int sum =0; // if assign sum here. then it will not work;
      
      for(int i =1; i<=500; i++){
        int sum =0;
        int check =0;
        int rem = 0;
         check = i;
        
        while(check!=0){
          rem = check%10;
          sum = sum + ( (int) Math.pow(rem,3)); // sum+rem*rem*rem;
          check = check/10;
        }
      if(sum ==i){
        System.out.println(i);
      }
      // System.out.print(i);
      }
      
	}
}