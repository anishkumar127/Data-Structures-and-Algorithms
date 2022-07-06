import java.util.*;
// 3 is a prime no.
// prime no. devided by itself. 
// 0 1  not prime. 2 is prime and 7 3 is prime. 20 not prime. 
public class Main {
    public static void main(String[] args) {
      int n = 2;  // no. to be check. 
      
      // int m = n/2;  // divided by 2
      int flag = 0;
      if( n ==0 || n ==1){
        System.out.print("Not Prime NO."); // 0 and 1 not a prime no. 
      }else{
        for(int i = 2; i<n/2; i++){ 
          if(n %i ==0){
            System.out.print("not Prime No.");
            flag = 1; 
            break;
          }
        }
        if(flag==0){
          System.out.print("YES Prime NO.");
        }
      }
    }
}