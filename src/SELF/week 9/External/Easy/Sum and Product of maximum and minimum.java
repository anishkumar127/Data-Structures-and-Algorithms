import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            Solution ob = new Solution();
            long ans[] = ob.sumAndProduct(arr, n); 
            System.out.println(ans[0] + " " + ans[1]);           
        }
    }
}


class Solution{
     static long[] sumAndProduct(long arr[], long n){
        long num [] =new long[2];
           long min = Long.MAX_VALUE;
             long max = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
                min = Math.min(arr[i],min);
                max  = Math.max(arr[i],max);
        }
     num[0] = min+max;
             num[1] = min*max;

             return num;
             
    }
}



You are given an array A of N integers. You need to find the sum and product of the maximum and minimum value present in the array.

NOTE

You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line has the value of N.

The next line contains N space-separated integers of array A.

Output Format:
For each test case return an array of size two having the sum at first position and product at second.

Example 1:
Input:

1
4
1 2 3 2
Output:

4 3
Explanation:

Minimum value is 1 and maximum is 3. 1 + 3 = 4 and 1 * 3 = 3.

Example 2:
Input:

1
5
3 2 2 4 6
Output:

8 12
Explanation:

Minimum value is 2 and maximum is 6. 2 + 6 = 8 and 2 * 6 = 12.

Constraints:
1 <= T <= 10

1 <= N <= 10000

1<= A[i] <= 1000000