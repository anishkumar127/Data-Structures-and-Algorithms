import java.util.*;
/*
Deficient numbers occur more frequently than abundant numbers. In other words, 
the sum of the proper divisors of most numbers is less than the numbers
 themselves. 
21 yes expml = 21 , 1,3,7 =11<21;
6 no. 
*/
public class Main {
    public static void main(String[] args) {
     int n = 6;
     int sum =0;
     for(int i=1; i<n; i++)
     if(n%i==0)
     sum +=i ;
     if(sum<n)
     System.out.println("Yes");
     else
     System.out.println("No");
  }
}