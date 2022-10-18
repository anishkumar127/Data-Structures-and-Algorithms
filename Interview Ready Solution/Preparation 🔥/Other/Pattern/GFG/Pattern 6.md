```java
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
       
      for(int i=n; i>=1; i--){
          for(int j=1; j<=i; j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }
    }
}

```
```java
class Solution {

    void printTriangle(int n) {
       
    for(int i=0; i<n; i++){
        int value = 1;
        for(int j=1; j<=n-i; j++){
            System.out.print(value+" ");
            value++;
        }
        System.out.println();
    }
    }
}

```

**theory part**


Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.

 

Example 1:

Input: 5

Output:
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1 

 

Your Task:

You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.

Constraints:

1<= N <= 20