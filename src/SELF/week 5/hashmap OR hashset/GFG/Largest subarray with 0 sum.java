
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
