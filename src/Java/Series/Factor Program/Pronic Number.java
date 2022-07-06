import java.util.*;
/*
A pronic number is a number which is the product of two consecutive integers, 
that is, a number of the form n(n + 1). The first few pronic numbers 
are: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
 
 n(n+1)  eg 56 = 7*8 
 56 yes 
 46 no.
*/
public class Main {
    public static void main(String[] args) {
      int n = 46;
      int fact =0;
      for(int i=1; i<n; i++){
        if(n%i==0)
        if(i*(i+1)==n)
        fact = i;
      }
      if(fact!=0)
      System.out.println("Yes");
      else 
      System.out.println("No");
  }
}