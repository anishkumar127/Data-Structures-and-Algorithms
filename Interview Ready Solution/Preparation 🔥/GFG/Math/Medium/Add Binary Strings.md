-> good way but not work below code

```java

class Solution {
    String addBinary(String A, String B) {
        // code here
        int a = Integer.parseInt(A,2);
        int b = Integer.parseInt(B,2);
        int c = a+b;
        return Integer.toBinaryString(c);
        
    }
}

```


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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String addBinary(String A, String B) {
        // code here
      StringBuilder sb = new StringBuilder();
      int i = A.length()-1;
      int j = B.length()-1;
      int carry =0;
      while(i>=0 || j>=0){
          int a = i>=0 ? A.charAt(i)-'0':0;
          int b = j>=0 ? B.charAt(j)-'0':0;
       
          int total = a+b+carry;
          if(total==0){
              sb.append('0');
              carry=0;
          }else if(total==1){
              sb.append('1');
              carry=0;
          }else if(total==2){
              sb.append('0');
              carry =1;
          
          }else if(total==3){
              sb.append('1');
              carry=1;
          }
          
       i--;
       j--;
       
      }
      if(carry==1) {
          sb.append('1');
      }
      while(sb.charAt(sb.length()-1)=='0') sb.setLength(sb.length()-1);
      
      return sb.reverse().toString();
    }
}
```

```text
this question takes me 1 hours to debug and i did one silly mistake.
instead of A.length and B.length 
i did A.length and B.length both and it takes me 1 hours to debug. -_-# hell.
```


```text
to esme hum length() -1 se start krenge. we will get last index.

we will travrese till both i and j end then we will terminate loop . so that we will use OR operator.


now we will get integer from character using -'0' ; and then if i > 0; if index less then zero then we will use 0;

we will use carry variable and intitally it will be 0;  and we will use outside.

and we do total of  a + b + carry.

so sum case how much some can come ?

and one thing not we are doing binary sum.


if three a  b carry sum is 0. then carry will be 0.
0 + 0  + 0 = 0; carry = 0;

else if  total sum is coming 1. from
like 0 + 0 +1  or 1 + 0 + 0 or 0 +1 +0  so if from anything sum become 1.
then sum is add 1. and carry will be 0;


else if total sum 2.  then we will do 0 + 1 + 1 then we add 0; and carry 1.
0 + 1 + 1 = 2; then add sum 0; and carry 1.


else if total sum 3. 1 + 1 + 1 = 3. then add sum 1. and carry also will be 1.

there will be only 4 case.

and we will use StringBuilder because we do many time add. so string builder will be helpful.
if loop end and carry left 1. then we will also add this.

and in the and return the reverse. because adding from front.we are doing left to right. but actually it should be
right to left. so for this we will do reverse method.
and one more case if we have leading zero after reverse we will remove that leading zero.


```