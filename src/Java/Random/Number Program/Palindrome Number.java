import java.util.*;
// 121 yes 949943 no .
public class Main {
    public static void main(String[] args) {
          int n = 121;
          int m = n;
          int sum =0;
          while(n!=0){
          int d = n % 10;
          sum = sum* 10 + d;
          n = n/10;
          }
           if(sum == m )
           System.out.println("yes");
           else
           System.out.println("no");
  }
}