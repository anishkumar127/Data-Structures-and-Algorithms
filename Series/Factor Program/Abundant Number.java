import java.util.*;
/*
 an imperfect number that is less than the sum of all its divisors (as 12)
 
18 is abundant because the sum of its proper divisors ( 1 + 2 + 3 + 6 + 9 )
 (1+2+3+6+9) (1+2+3+6+9) is greater than itself.

12 Yes.
15 No.
*/
public class Main {
    public static void main(String[] args) {
  int sum =0; 
  int n = 15;
  for(int i=1; i<n; i++){
    if(n%i ==0) 
       sum +=i;
  }
  if(sum>n) 
     System.out.println("Yes"); 
  else
     System.out.println("No");
  }
}