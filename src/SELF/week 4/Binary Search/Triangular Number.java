1st method 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextInt();
      long low =1;
      long high = n;
      long ans =1;
      while(low<=high){
        long mid = (low+high)/2;
        if(mid*(mid+1)/2<=n){
          ans = mid;
          // go right 
          low = mid+1;
        }else {
          // go left
          high = mid-1;
        }
      }
      int res = 0;
      if(ans*(ans+1)/2==n){
        res=1;
      }
      System.out.print(res);
  }
}



 2nd method 
 
 import java.io.*;
import java.util.*;
 
public class Main{
  public static int isTriangular(int n){
    int l=1; 
    int r=15;
    while(l<=r){
      int mid=l+(r-l)/2;
      if(mid*(mid+1)/2 == n){
        return 1;
      }
 
      if(mid*(mid+1)/2<n){
        l=mid+1;
      }
      else{
        r=mid-1;
      }
    }
    return 0;
  }
 
 
 
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
 
    int n=sc.nextInt();
   System.out.println(isTriangular(n));
 
      
  }
}
 
 

// question


Given a number N.Check whether it is a triangular number or not.

Note: A number is termed as a triangular number if we can represent it in the form of a triangular grid of points such that the points form an equilateral triangle and each row contains as many points as the row number, i.e., the first row has one point, the second row has two points, the third row has three points and so on.
The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4).

Example 1:

Input: N=55 Output: 1 Explanation: 55 is a triangular number. It can be represented in 10 rows.

Example 2:

Input: N=56 Output: 0 Explanation: 56 is not a triangular number.

Your Task:
You need to take a number N as input parameter and returns 1 if it is a triangular number. Otherwise, it returns 0.

Constraints:
1<=N<=106