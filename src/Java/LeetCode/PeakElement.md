


```
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return  0;
        }
        int left = 0;
        int right= n-1;
        while(left<right){
            int mid = (left+right)/2; // middle element.
            
            if(nums[mid]>nums[mid+1]){ // if current element is greater then next.
                right = mid; // so current can be peak. 
            }else{
                left = mid+1; // if current elements is less then next. then
                // current can be right side.
            }
        }
        return left; // this is peak because of we moving only when next is greater.
    }
}
```



