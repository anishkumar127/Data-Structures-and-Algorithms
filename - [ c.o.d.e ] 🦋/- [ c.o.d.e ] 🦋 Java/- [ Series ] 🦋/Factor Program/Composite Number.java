import java.util.*;
/*
All the natural numbers which are not prime numbers are composite numbers as 
they can be divided by more than two numbers. For example, 6 is a composite 
number because it is divisible by 1, 2, 3 and even by 6.
6 yes 
7 No 
*/
public class Main {
    public static void main(String[] args) {
     int n = 7;
     int count=0;
     for(int i=1; i<=n; i++){
       if(n%i==0)
       count++;
     }
     if(count>3)
     System.out.println("Yes");
     else
     System.out.println("No");
  }
}