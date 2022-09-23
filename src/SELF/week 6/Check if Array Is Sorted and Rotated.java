# [1752\. Check if Array Is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)

## Description

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/)


Given an array `nums`, return `true` _if the array was originally sorted in non-decreasing order, then rotated **some** number of positions (including zero)_. Otherwise, return `false`.

There may be **duplicates** in the original array.

**Note:** An array `A` rotated by `x` positions results in an array `B` of the same length such that `A[i] == B[(i+x) % A.length]`, where `%` is the modulo operation.

**Example 1:**

```
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
```

**Example 2:**

```
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
```

**Example 3:**

```
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
```

**Constraints:**

*   `1 <= nums.length <= 100`
*   `1 <= nums[i] <= 100`


## Solution

Language: **Java**

```java
class Solution {
    public boolean check(int[] nums) {
        int count=0;
       for(int i=0; i<nums.length; i++){
           if(nums[i]>nums[(i+1)%nums.length]){
               count++;
           }
            if(count>1){
            return false;
        }
       }
        return true;
    }
}
```


class Solution {
    public boolean check(int[] nums) {
        int count=0;
       for(int i=1; i<nums.length; i++){
          if(nums[i-1]>nums[i]){  // if 1st element greater than next element.
           count++;
          } 
       }
       if(nums[nums.length-1]>nums[0]){  // if last element greater than. first element. 
               count++;
           }
        return count>1?false:true;
    }
}