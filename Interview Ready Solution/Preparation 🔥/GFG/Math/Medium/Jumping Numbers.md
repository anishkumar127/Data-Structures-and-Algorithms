```java
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long jumpingNums(long X) {
        // code here
        Queue<Long> que = new LinkedList<>();
        for(long i=1; i<=9; i++){
            que.add(i);
        }
        long ans =0;
        while(!que.isEmpty()){
            long num = que.remove();
            if(num>X) continue;
            ans = Math.max(num,ans);
            int lastDigit = (int) num%10;
            if(lastDigit!=0){
                long first = num*10+(lastDigit-1);
                que.add(first);
            }
            if(lastDigit!=9){
                long second = num*10 + (lastDigit+1);
                que.add(second);
            }
        }
        return ans;
    }
};

```


Given a positive number X. Find the largest Jumping Number which is smaller than or equal to X. 
Jumping Number: A number is called Jumping Number if all adjacent digits in it differ by only 1. All single-digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796, 677 and 89098 are not.

 

Example 1:

Input:
X = 10
Output:
10
Explanation:
10 is the largest Jumping Number
possible for X = 10.
Example 2:

Input:
X = 50
Output:
45
Explanation:
45 is the largest Jumping Number
possible for X = 50.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function jumpingNums() which takes an Integer X as input and returns the largest Jumping Number less than or equal to X.

 

Expected Time Complexity: O(k), where k is no of jumping numbers
Expected Auxiliary Space: O(k), where k is no of jumping numbers

 

Constraints:
1 <= X <= 109