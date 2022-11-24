```java
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
         int s = 0;
        int e = 0;
        // int n = arr.length;
        int idx =0;
        // int [] bucket=new int[k];
        ArrayList<Integer> bucket = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        while(e<n){
            map.put(arr[e],map.getOrDefault(arr[e],0)+1);
            if(e-s+1<k){
            e++;
            }
            else if(e-s+1==k){
                // bucket[idx++] =map.size();
                bucket.add(map.size());
                map.put(arr[s],map.getOrDefault(arr[s],0)-1);
                if(map.get(arr[s]) <=0) map.remove(arr[s]);
                s++;
                e++;
            }
        }
		map.clear();
        return bucket;
    }
}


```

``hashset not work. because i we do like clear that elements. so case next time it will not add. and our hashset size become more small. so in that case we use map. wo if frequency become equal to 0 then its useless and we will remove it.``
