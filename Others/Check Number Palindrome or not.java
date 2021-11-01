import java.util.*;
// number palindrome or not.
// 12121 . 121 . yes , 1234 no.
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
     int n = sc.nextInt();
      int c= n;
      int s=0;
      int r=0;
      while(n>0){
         r= n%10;
         s = (s*10)+r;
         n = n/10;
      }
      if(c==s){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    }
}