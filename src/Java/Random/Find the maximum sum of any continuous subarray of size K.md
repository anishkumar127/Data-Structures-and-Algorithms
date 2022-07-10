<!-- https://onecompiler.com/java/3y9cqqame -->

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
      int maxSum =0;
      for(int i=0; i<=arr.length-k; i++){
        int windowSum =0;
        for(int j=i; j<i+k; j++){
          windowSum= windowSum+arr[j];
        }
        maxSum = Math.max(maxSum,windowSum);
      }
      return maxSum;
  }
}
```
// Find the maximum sum of any continuous subarray of size K

// input: arr = 1 9 -1 -2 7 3 -1 2 k = 4

// output: [9 -1 -2 7] 13 


<!-- https://onecompiler.com/java/3y9crp2uw -->

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
      int maxSum =0;
      int windowSum=0;
      for(int i=0; i<=k; i++){
        windowSum = windowSum+ arr[i];
      }
      
        for(int end = k; end<arr.length; end++){
          windowSum= windowSum+arr[end] - arr[end-k];
           maxSum = Math.max(maxSum,windowSum);
        }
      }
      return maxSum;
  }
}
```
// Find the maximum sum of any continuous subarray of size K

// input: arr = 1 9 -1 -2 7 3 -1 2 k = 4

// output: [9 -1 -2 7] 13 

