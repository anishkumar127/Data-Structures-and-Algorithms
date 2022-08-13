import java.util.*;
/*
Output:

1st function 3
1st function 2
1st function 1
2nd function 1
2nd function 2
1st function 1
2nd function 1
2nd function 3
1st function 2
1st function 1
2nd function 1
2nd function 2
1st function 1
2nd function 1
*/
public class Main {
    public static void main(String[] args) {
    int n = 3;
    dualFuctionCalling(n);
  }
  private static void dualFuctionCalling(int n ){
    if(n==0) return;
    System.out.println("1st function "+n);
    dualFuctionCalling(n-1);
    System.out.println("2nd function "+n);
    dualFuctionCalling(n-1);
  }
}