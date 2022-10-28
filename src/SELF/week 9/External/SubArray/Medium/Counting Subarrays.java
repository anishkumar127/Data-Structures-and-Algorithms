import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

      int k = sc.nextInt();

      // sliding windows.
      
      int s=0;
      int e =0;
      int sum =arr[0];
      int count =0;
      while(s<n && e<n){
        if(sum<k){
            e++;
          if(e>=s){
            count+=e-s;
          }
          
          if(e<n){
            sum+=arr[e];
          }
         
        }else{
          sum = sum-arr[s];
          s++;
        }
      }

      System.out.print(count);
  }
}









import java.io.*;
import java.util.*;

class Solution {
	public static int solve(int[] arr, int k) {
  // your code goes here
int n = arr.length;
   
      int s=0;
      int e =0;
      int sum =arr[0];
      int count =0;
      while(s<n && e<n){
        if(sum<k){
            e++;
          if(e>=s){
            count+=e-s;
          }
          
          if(e<n){
            sum+=arr[e];
          }
         
        }else{
          sum = sum-arr[s];
          s++;
        }
      }
                return count;
        }        
}

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	    
    	int n = sc.nextInt();
    	int[] A = new int[n];
    	for(int i=0;i<n;i++)
        A[i] = sc.nextInt();
        int B = sc.nextInt();
        Solution Obj= new Solution();
        System.out.println(Obj.solve(A, B));
	
    }
}

brute force 
 static int countSubarray(int arr[],
                             int n, int k)
    {
        int count = 0;
 
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
 
                // If sum is less than
                // k then update sum and
                // increment count
                if (sum + arr[j] < k) {
                    sum = arr[j] + sum;
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
 


Given an array A of N non-negative numbers and you are also given non-negative number B.

You need to find the number of subarrays in A having sum less than B. We may assume that there is no overflow.

Input Format
First line contains N size of array.

Second line contains N elements of array A.

Third line contains integer B.

Output Format
Print an integer denoting the number of subarrays in A having sum less than B.

Example 1
Input

3 2 5 6 10

Output

4

Explanation

 The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
Example 2
Input

 5
 1 11 2 3 15
 10
Output

 4
Explanation

 The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}
Constraints
1 <= N <= 10000

1 <= A[i] <= 100

1 <= B <= 100000000