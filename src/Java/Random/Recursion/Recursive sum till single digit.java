import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 12345;
    int ans =   output(n);
    System.out.print(ans);
  }
  private static int  output(int n ){
    
    if(n<10){ // check 15<10 no then again 2nd round start. 2nd round 6<10 yes then return 6.
      return n ; // return 6.
    }
       int sum =0; // first round 15. 2nd round recursive call again. in 2nd round sum is 6.
       while(n>0){
          int rem = n%10;
        sum = sum+ rem;
        n = n/10;
        
       }
        
      return output(sum);

  }
}