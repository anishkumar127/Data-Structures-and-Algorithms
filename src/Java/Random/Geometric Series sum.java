5:07 PM 6/23/2022
import java.util.*;
/*\
Geometric Series sum
2-6+18-54.....n
input:
1  out 2 
2  output -4 

*/
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int sum =0;
     int n = sc.nextInt();
     for(int i=1, k=2;  i<=n; i++, k*=3){
       if(i%2==0){
         sum = sum-k;
       }else{
         sum = sum+k;
       }
     
     }
       System.out.print(sum);
  }
}