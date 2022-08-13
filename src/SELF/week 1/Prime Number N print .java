import java.util.*;
/*
10
output 2 3 5 7
prime number print. factor of prime number. if factor 2. it self and 1 . that's mean its primte no.

*/
public class Main {
    public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int i,counter, j;
      // n= 10;
      
      for(j=2;j<=n;j++){
         counter=0;
         for(i=1;i<=j;i++){
            if(j%i==0){
               counter++;
            }
         }
         if(counter==2)
         System.out.print(j+" ");
      }
      
  }
}