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
      for(int i=n-1; i>=0; i--){
          for(int j=0; j<=i; j++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }
}
```

```java

class Solution {

    void printTriangle(int n) {
      while(n>0){
          String s ="* ";
          System.out.println(s.repeat(n));
          n--;
      }
    }
}

```
*inside loop also can be run n times just need to n-1*
```java
class Solution {

    void printTriangle(int n) {
      // code here
        for(int i=0; i<n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
```
**theory**
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek build a star pattern.

 

Example 1:

Input: 5

Output:
* * * * *
* * * * 
* * * 
* *  
* 

 

Your Task:

You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.

Constraints:

1<= N <= 20