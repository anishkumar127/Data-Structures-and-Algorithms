# [137\. Single Number II](https://leetcode.com/problems/single-number-ii/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Bit Manipulation](https://leetcode.com/tag/bit-manipulation/)


Given an integer array `nums` where every element appears **three times** except for one, which appears **exactly once**. _Find the single element and return it_.

You must implement a solution with a linear runtime complexity and use only constant extra space.

**Example 1:**

```
Input: nums = [2,2,3,2]
Output: 3
```

**Example 2:**

```
Input: nums = [0,1,0,1,0,1,99]
Output: 99
```

**Constraints:**

*   1 <= nums.length <= 3 * 10<sup>4</sup>
*   -2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1
*   Each element in `nums` appears exactly **three times** except for one element which appears **once**.


## Solution

Language: **Java**

```java    hashmap Tc O(n) SC O(N);
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // for(int i=0; i<nums.)
        for(int val :nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        
        for(int el :map.keySet()){
            if(map.get(el)==1){
                return el;
            }
        }
        return -1;
    }
}
```