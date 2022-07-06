import java.util.*;
/*
perfect number, a positive integer that is equal to the sum of its proper
 divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.
  Other perfect numbers are 28, 496, and 8,128. The discovery of such numbers 
  is lost in prehistory.
6 Yes 
7 No 

*/
public class Main {
    public static void main(String[] args) {
     int n = 6;
     int sum=0;
     for(int i=1; i<n; i++){
       if(n%i==0)
       sum+=i;
     }
     if(sum==n)
    System.out.println("Yes");
    else 
    System.out.println("No");
  }
}