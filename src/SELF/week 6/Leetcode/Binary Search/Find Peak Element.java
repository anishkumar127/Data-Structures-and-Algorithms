# [162\. Find Peak Element](https://leetcode.com/problems/find-peak-element/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Binary Search](https://leetcode.com/tag/binary-search/)


A peak element is an element that is strictly greater than its neighbors.

Given a **0-indexed** integer array `nums`, find a peak element, and return its index. If the array contains multiple peaks, return the index to **any of the peaks**.

You may imagine that `nums[-1] = nums[n] = -∞`. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in `O(log n)` time.

**Example 1:**

```
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
```

**Example 2:**

```
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
```

**Constraints:**

*   `1 <= nums.length <= 1000`
*   -2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1
*   `nums[i] != nums[i + 1]` for all valid `i`.


## Solution

Language: **Java**

```java   tc O(n) Sc O(1);
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
     for(int i=0; i<nums.length; i++){
         if(i==0 && nums[0]>nums[1]) return 0;
         if(i==nums.length-1 && nums[i]>nums[i-1]) return nums.length-1;
         if(nums[i]>nums[i+1] && nums[i]>nums[i-1])return i;
     }
        return -1;
    }
}
```


logn optimal O(logn);



class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==nums.length-1 || nums[mid]>nums[mid+1])) return mid;
            else if(nums[mid]>nums[mid+1]){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return -1;  // return can also s or e if in while loop <= not only < 
    }
}