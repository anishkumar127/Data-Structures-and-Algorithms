import java.util.*;
// using while loop with dry run Fibonacci Series. 
public class Main {
    public static void main(String[] args) {
     
     int c =0; 
     int a =0; 
     int b = 1;
     int range = 50;  // 9 times. 
     while(c<=range){
       c = a + b ; 
       System.out.print(c+" "); //1 2 3 5 8 13 21 34 55 
       a = b; 
       b = c ;
       /*
       a = b ; 0 1 ;  1 1 ; 
        b = c ;  1 0 ; 
        
        a = 1 b = 0 ; = +  1; 
        
        2nd times. 
        
        a = b ;  1 ; 1 1 ; 
        b = c ;  1 ; 1  
         a = 1  b = 1  = c  =  +2 ;
         
         erd times. 
         
         a= b ; 1 1  ; 1 1 ; 
         b = c ;  1 2 ; 2 2 ; 
         
         a= 1  b = 2 ; c = + 3; 
         
         4th times. 
         
         a = b ;  1 2 = 2 2 
         b = c ; 2  3 ;  3 3 
         a = 2  b = 3  c = +5 ; 
       */
     }
    }
}