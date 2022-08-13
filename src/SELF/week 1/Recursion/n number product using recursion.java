import java.util.*;
// 120
public class Main {
    public static void main(String[] args) {
 
 int ans = Print(5);
 System.out.print(ans);
  }
  public static int Print(int n){
    // base case
   if(n==1) return 1;
   // faith / smaller subproblme
   int fait = Print(n-1);
   //work
   int ans = n * fait;
   
   return ans ;
    
  }
}