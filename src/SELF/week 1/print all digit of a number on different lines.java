import java.util.*;
/*
input 108
output:
8
0
1


\*/
public class Main {
    public static void main(String[] args) {
     int n = 108;
     int m = n;
     while(n!=0){
       int d = n%10;
       System.out.println(d);
       n = n /10;
     }
    // System.out.print(m); // 108
    // System.out.println();
    // System.out.print(n); // 0 
  }
}