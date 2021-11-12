import java.util.*;
// one number sum of previous number.
// 0 1 1 2 3 5 8 13 21 
public class Main {
     static int a = 0;
      static   int b = 1;
      static  int c = 0; // static variable . 
  
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Main ob = new Main(); // creating class object. 
    ob.Fncci(10); // 10 times. 
    }
 void Fncci(int i){
  
      if(i>=1){  
       c = a+b; //  sum 
       System.out.print(" "+c); // printing   1 2 3 5 8 13 21 34 55 89
       a = b; // 0  1 -> 1 1 
       b = c;  // 1 0 -> 0 0 
      /* 2nd time  loop 
      
      a = b  ; 1 1 =  1  1 
      b = c  ; 1 = 1  , 1 1 
      
       c= a+b  ;  2 = 1 + 1 ; 
       
       3rd time loop 
       
       a = b ; 1 1 ; 1  1
       b = c ; 1 2 ;  2 1 
       
       c= a + b ;  3 = 1+2;
       
       // 4th ; 
       1 2 ; 2 2 ;
       2 = 3 ; 3 3 ;
       c = a + b ;  5 = 2 + 3 ; = 5; 
       
       // b increacing 
       
       
      */
      Fncci(i-1);  // 10 -1 = 9, 9-1 = 8 ,2-1  = 1; 1 - 1 = 0 terminated. // dcreacing . 
        
      }
    }
}