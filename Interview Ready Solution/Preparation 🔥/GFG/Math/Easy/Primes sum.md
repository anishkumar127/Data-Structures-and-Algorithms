```java
//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String isSumOfTwo(int N){
        // code here
        for(int i=2; i<=N/2; i++){
            if(prime(i) && prime(N-i)){
                return "Yes";
            }
        }
        return "No";
    }
    private static boolean prime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
}

```

Given a number N. Find if it can be expressed as sum of two prime numbers.

Example 1:

Input: N = 34
Output: "Yes" 
Explanation: 34 can be expressed as 
sum of two prime numbers.
Example 2:

Input: N = 23
Output: "No"
Explanation: 23 cannnot be expressed as
sum of two prime numbers. 

Your Task:  
You dont need to read input or print anything. Complete the function isSumOfTwo() which takes N as input parameter and returns "Yes" if can be expressed as sum of two prime numbers. else return "No".

Expected Time Complexity: O(N*sqrt(N))
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105