 
 
under root x linear Search Time Complexity and space complexity O(1);
O(√ x); tc. 

class Solution {
    public int mySqrt(int x) {
        long  y =0;
        
        while(y*y<=x){
            y++;
        }
        return  (int)y-1;
    }
}




O(log2 √ x);  // O(log2 underRoot x);

// binary search

class Solution {
    public int mySqrt(int x) {        
        long start =0;
        long end = x;
        long ans =0;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid==x){
                return (int)mid; // if the 'mid' value ever gives the result, we simply return it.
            }else if(mid*mid<x){
                ans = mid;    //an extra pointer 'ans' is maintained to keep track of only lowest 'mid' value.
                start= mid+1; //if 'mid' value encounterted gives lower result, we simply discard all the values lower than mid.
               
            }else{
                end = mid-1;  //if 'mid' value encountered gives greater result, we simply discard all the values greater than mid. 
            }
        }
        return (int)ans;
    }
}


// binary search

class Solution {
    public int mySqrt(int x) {        
        
        int start =1;
        int end = x;
        int ans =0;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<=x/mid){
                start = mid+1;
                ans = mid;
            }else{
                end = mid-1;
            }
        }
        return ans;
        
    }
}



// rough 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int y = 0;
      while(y*y<=n){
        y++;
      }
      System.out.print(y-1);
  }
}

Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1