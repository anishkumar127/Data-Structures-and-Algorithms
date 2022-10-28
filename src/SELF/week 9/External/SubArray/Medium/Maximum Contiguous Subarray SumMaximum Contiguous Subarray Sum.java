import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new  Scanner (System.in);
       int n = sc.nextInt();
      int arr[] =new int[n];
      for(int i =0 ;i <n;i++)
      {   
        arr[i] = sc.nextInt();
      }
      
     int sum=0;    

int max = Integer.MIN_VALUE;
  
      for(int i=0;i<n;i++){
        
        sum += arr[i];
        max = Math.max(max,sum);
              if(sum<0) sum=0;
        }

      System.out.println(max);
        
     
  }
}


Given an array, A of length N.

Your task is to find the contiguous subarray within A which has the largest sum.

Input Format:
The first line of each test case contains an integer n, the length of the array A.

The next line contains n integers.

Output Format:
Output an integer representing the maximum possible sum of the contiguous subarray.

Example 1:
Input:

5
1 2 3 4 -10
Output:

10
Explanation:

1 + 2 + 3 + 4 = 10

Example 2:
Input:

6
2 -1 0 1 2 1
Output:

5
Explanation:

The sum of the entire array i.e 5.

Constraints:
1 <= N <= 10^5

-10^6 <= A[i] <= 10^6