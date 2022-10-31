```java
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{


    static Boolean isSubsetSum(int n, int arr[], int sum){
        // code here
     Boolean [][] dp = new Boolean[n][sum+1];
      
        return solve(arr,n-1,sum,dp);
    }
    static Boolean solve(int[]arr , int n , int sum, Boolean dp[][]){
        if(sum==0) return true;
         if(n<0||sum<0)
        {
            return false;
        }
        if(dp[n][sum]!=null) return dp[n][sum];
         
         boolean include = solve(arr,n-1,sum-arr[n],dp);
         boolean exclude = solve(arr,n-1,sum,dp);
         return dp[n][sum] = include||exclude;
      
    }
}
```


```java
class Solution{


    static Boolean isSubsetSum(int n, int arr[], int sum){
        // code here
     Boolean [][] dp = new Boolean[n][sum+1];
      
        return solve(arr,n-1,sum,dp);
    }
    static Boolean solve(int[]arr , int n , int sum, Boolean dp[][]){
        if(sum==0) return true;
         if(n<0||sum<0)
        {
            return false;
        }
        if(dp[n][sum]!=null) return dp[n][sum];
         
         boolean include = solve(arr,n-1,sum-arr[n],dp);
         boolean exclude = solve(arr,n-1,sum,dp);
         return dp[n][sum] = include||exclude;
      
    }
}
```
```java
Java Recursive Sol : TLE 

class Solution{
    static boolean solve(int i,int[] arr,int n,int remS){
        if(i>=n || remS<0) return false;
        if(remS==0) return true;
        return solve(i+1,arr,n,remS-arr[i]) || solve(i+1,arr,n,remS);//take or skip the element
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        return solve(0,arr,N,sum);
    }
}
Optimized DP sol:

class Solution{
   static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean[][] dp = new boolean[N+1][sum+1];
        dp[0][0] = true;
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=sum;j++){
                if(j==0) dp[i][j] = true;
                else if(j>=arr[i-1]){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];//i-1 to skip the duplicate values
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][sum];
    }
}

```


Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum. 


Example 1:

Input:
N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 9
Output: 1 
Explanation: Here there exists a subset with
sum = 9, 4+3+2 = 9.
Example 2:

Input:
N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 30
Output: 0 
Explanation: There is no subset with sum 30.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function isSubsetSum() which takes the array arr[], its size N and an integer sum as input parameters and returns boolean value true if there exists a subset with given sum and false otherwise.
The driver code itself prints 1, if returned value is true and prints 0 if returned value is false.
 

Expected Time Complexity: O(sum*N)
Expected Auxiliary Space: O(sum*N)
 

Constraints:
1 <= N <= 100
1<= arr[i] <= 100
1<= sum <= 105