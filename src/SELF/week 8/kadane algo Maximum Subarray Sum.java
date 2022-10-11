import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int[] arr =new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      int max = Integer.MIN_VALUE;
      int sum =0;
        for(int el :arr){
            sum+=el;
            max = Math.max(sum,max);
            if(sum<0) sum = 0;
        }
      
      System.out.println(max);
  }
}



2nd way

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int[] arr =new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      int max = Integer.MIN_VALUE;
      int sum =0;
      int s =0;
      int e  = 0;
      while(e<n){
        sum+=arr[e];
        
         max = Math.max(sum,max);
         if(sum<0) sum =0;
         e++;
         s++;
      }
      
      System.out.println(max);
  }
}

Given an array, A of length N, your task is to find the contiguous subarray within A, which has the largest sum and, return the sum.

A subarray is the sequence of consecutive elements of the array.

For example, Consider the array [1, 2, 3, 4, 5]
[2, 3, 4] is one of the many subarrays of given array.
Input
The first line of each test case contains an integer n, the length of the array A.
The next line contains n integers.

Constraints:
1 <= N <= 10^5
-10^6 <= A[i] <= 10^6

Output
Output an integer representing the maximum possible sum of the contiguous subarray.

Example
Input:
5
1 2 3 4 -10
Output:
10
Explaination:
1+2+3+4=10