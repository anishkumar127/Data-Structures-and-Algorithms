import java.util.*;
public class Main 
{ 
    public static void main(String args[]) 
    { 
     Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int z=n,count=0,digit,sum=0,pro;
      
      
      while(z>0)
       {
           count =count + 1;
           z = z/10;
       }
       // System.out.println("Number of Digits:" + count);
       
     z=n;
     
     while(z>0)
     {
         digit = z%10;
         pro = 1;

         for(int i=1;i<=count;i++)
         {
             pro = pro*digit;
         }
     sum = sum + pro;
     z =z/10;
     }
     if(sum==n)
        System.out.println("1");
     else
        System.out.println("0");
     
     
    }
}

not all pass. above



all pass.


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
    	  int n = sc.nextInt();
        int arm  = 0;
        int reminder = 0;
        int temp =n; 
        while(n>0){ 
            reminder= n%10;  
            arm=(reminder*reminder*reminder)+arm;
            n=n/10;
        }
        if(temp==arm){
            System.out.print(1);
        }else{
            System.out.println(0);
        }
    }
}

Given a number N, you need to check whether the given number is Armstrong number or not. Now what is Armstrong number let us see below: A number is said to Armstrong if it is equal to sum of cube of its digits.

Input
The first line of input contains a single Integer N

Output
You need to print 1 if given number is armstrong else print 0

Constraints:
1 <= N <= 10^4

Sample Input:
150
Sample Output:
0
Explaination
(1)^3 + (5)^3 + (0)^3 != 150 so it is not and armstrong number
(1)^3 + (5)^3 + (0)^3 != 150 so it is not and armstrong number