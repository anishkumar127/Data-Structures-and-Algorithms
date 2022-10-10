class Main 
{ 
    public static void main(String args[]) 
    {     
        
         
     for(int i=1;i<=10;i++)
       { 
         int count = 0;
            for(int j=1;j<=i;j++)
            {
             if(i%j==0)
               count = count + 1;
            }
        if(count==2)
        System.out.print(i+" ");
       }
    
     
    }
}



import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
       // int n = 10;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
   if(n==1){
     System.out.print(1);
   }
     for(int i =2; i<=n; i++){
      int count =0;
      for(int j=1; j<=n; j++){
        if(i%j==0){
          count++;
        }   
      }
       if(count ==0 || count ==1 || count>2){
continue;
       }else{
          System.out.print(i+" ");
        }
     }
	}
}

both not passed.

import java.util.*;
class Main 
{ 
    public static void main(String args[]) 
    {     
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
     for(int i=1;i<=n;i++)
       { 
         int count = 0;
            for(int j=1;j<=i;j++)
            {
             if(i%j==0)
               count = count + 1;
            }
        if(count==2)
        System.out.print(i+" ");
       }
    
     
    }
}

Print all Prime Numbers in range from 1 to N.
You will be given a number N.

You need to print all the prime numbers that are there in the range from 1 to N (both inclusive)

A prime number is a number which is only having 2 factors

ie. no. 1 and no. itself

For eg.
N ->10

Output will be 2 3 5 7

