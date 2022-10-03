Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

 

Example 1:

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
 

Example 2:

Input:
N = 4, K = 4
Arr = [100, 200, 300, 400]
Output:
1000
Explanation:
Arr1 + Arr2 + Arr3  
+ Arr4 =1000,
which is maximum.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function maximumSumSubarray() which takes the integer k, vector Arr with size N, containing the elements of the array and returns the maximum sum of a subarray of size K.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 


Constraints:
1<=N<=106
1<=K<=N




Brute Force Tc O(n*k) Sc O(1);


import java.util.*;

public class Main {
    public static void main(String[] args) {
     int arr[] = {2,1,5,1,3,2};
     int k =3;
     
     int maxSum=0;
     for(int i=0; i<arr.length-k; i++){
       int sum =0;
       for(int j=i; j<i+k; j++){
         sum+=arr[j];
       }
       maxSum = Math.max(maxSum,sum);
     }
     System.out.println(maxSum);
  }
}



optimal   Tc O(n) sc O(1);

import java.util.*;

public class Main {
    public static void main(String[] args) {
       int arr[] = {2,1,5,1,3,2};
       int k =3;
     
     int start =0;
     int sum =0;
     int maxSum=0;
     
     for(int end =0; end<arr.length; end++){
       sum+=arr[end];
       
       if(end>=k-1){
         maxSum = Math.max(maxSum,sum);
         sum = sum-arr[start];
         start++;
       }
     }
     
     System.out.println(maxSum);
  }
}


optimal.

class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int start =0;
         long sum =0;
         long maxSum =0;
         for(int end =0; end<Arr.size(); end++){
             sum+=Arr.get(end);
             
             if(end>=K-1){
                 maxSum = Math.max(sum,maxSum);
                 sum = sum-Arr.get(start);
                 start++;
             }
         }
         return maxSum;
    }
}



comments


class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       long sum = 0;
       long max = Integer.MIN_VALUE;
       int start =0;
       int end =0;  
       while(end<N){
           sum+=Arr.get(end);   // adding ending. not start.
           if(end-start+1<K){   // increasing end till not equal to K. first time for maintaing the window.
               end++;
           }else if(end-start+1==K){  // if windows maintained .
               max = Math.max(max,sum);  // add max to maxiumum sum.
               sum = sum-Arr.get(start);  // after adding max sum then decrease the start index element sum.
               start++;  // after decreasing start index element sum do start++; to move forward start.
               end++;    // after start move forward. do end move forward.  after doing this windows will be maintained.
           }
       }
        
        return max;   // end the end return max sum of size K.
    }
}



while loop


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       long sum = 0;
       long max = Integer.MIN_VALUE;
       int start =0;
       int end =0;
       
       while(end<N){
           sum+=Arr.get(end);
           
           if(end-start+1<K){
               end++;
           }else if(end-start+1==K){
               max = Math.max(max,sum);
               sum = sum-Arr.get(start);
               start++;
               end++;
           }
       }
        
        return max;
    }
}

