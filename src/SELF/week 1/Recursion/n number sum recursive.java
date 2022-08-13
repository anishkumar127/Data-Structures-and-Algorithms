import java.util.*;

public class Main {
    public static void main(String[] args) {
 
 int ans = Print(5);
 System.out.print(ans);
  }
  public static int Print(int n){
    // base case
  // if(n==0) return 1;  // output : 16;
  // if(n==1) return 0;   // output : 14 ; 
  // if(n==1) return 1;   // output : 15; 
  if(n==0) return 0;  // output : 15; 
   // faith / smaller subproblme
   int fait = Print(n-1);
   //work
   int ans = n + fait;
   
   return ans ;
    
  }
}