Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, where n is the size of the array A and returns the length of the largest subarray with 0 sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 105
-1000 <= A[i] <= 1000, for each valid i




``optimal. tc O(nlogn); n is traversal, and logn is hashmap. sc O(n);``
```
class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum=0;
        int maxiy = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            
            if(sum==0) maxiy = i+1;  // if equal zero first element of array.
            
            if(map.get(sum)!=null){     //if map.get(sum) that's not null then 
                maxiy = Math.max(maxiy,i-map.get(sum));    // get i- that index.
            }else{
                map.put(sum,i);  // if null than put it into map.
            }
        }
        return maxiy;
    }
    
}
```




`` comments ``
```

class GfG
{
    int maxLen(int arr[], int n)
    {
       HashMap<Integer,Integer> map = new HashMap<>();
       
       int maxIndex = 0;
       int sum =0;
       for(int i=0; i<n; i++){
           sum+=arr[i];  // sum of subarray.
           
             // also there can be edge case. where sum ==0; so this also can be sub array.
              // so we just need to i+1 . because array index is start with 0.
              if(sum==0) maxIndex = i+1;
              
           if(map.containsKey(sum)){
               // if map contains sum before.
              // we need to find max index so. get previous sum index and update to our index.
            //   we don't overridden old sum index. we just get old sum index if it is greater than current index.
              // because there may be many subarray. but we need to max.
              
              maxIndex= Math.max(maxIndex,i-map.get(sum)); // we don't override old sum index. just get that index and compare was old 
              // sum index greater than current or not. if is it then store into max Index.
              
           }
           else{
               map.put(sum,i); // if map. don't have sum then put into map. with also put that arr sum index.
           }
       }
       return maxIndex;
    }
}
```