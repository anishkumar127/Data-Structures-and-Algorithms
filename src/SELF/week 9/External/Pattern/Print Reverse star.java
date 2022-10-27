// not working

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // your code here
            Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  for(int  i=0; i<=n-1; i++){
      //space print 
      for(int x=0; x<=i; x++){
        System.out.print(" ");
      }
      for(int j=0; j<=n-1-i; j++){
        System.out.print("*"+" ");
      }
      System.out.println();
    }
    }
}



// working

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // your code here
            Scanner sc = new Scanner(System.in);
              int n = sc.nextInt();
                  for(int i=n; i>0; i--){
                        for(int j=n-i; j>0; j--){
                                System.out.print(" ");
                        }
                        for(int j=i; j>0; j--){
                                System.out.print("* ");
                        }
                        System.out.println();
                }
    }
}


You are given N representing the number of rows, you have to print the given star pattern.

Input Format:

First line of inout contains N, the number of rows for the pattern

Output Format:

You need to print the pattern.

Example 1:

Input

5

Output:

* * * * *
 * * * * 
  * * * 
   * * 
    *
Explanation:

For number of rows to be 5 we get this output.

Example 2:

Input

4

Output:

 * * * *
  * * *
   * *
    *
Explanation:

For number of rows to be 4 we get this output.

Constraints:

1<= A,B <= 100