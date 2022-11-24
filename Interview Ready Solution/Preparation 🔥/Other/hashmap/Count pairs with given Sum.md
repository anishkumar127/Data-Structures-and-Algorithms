```java
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        int k=sc.nextInt();

        Solution A=new Solution();
        int ans=A.countPairs(arr,n,k);

        System.out.println(ans);
    
    }
}


class Solution {
    int countPairs(int arr[], int n, int k)
    {
        // Your code here
	    
       Map<Integer,Integer> map = new HashMap<>();
      
      int count =0;
      
      for(int i=0; i<n; i++){
        int isPresent = k-arr[i];
        if(map.containsKey(isPresent)){
          count+= map.get(isPresent);
        }
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
        // Your code here
        return count;
        
    }
}

```