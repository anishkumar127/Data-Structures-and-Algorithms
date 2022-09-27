# [136\. Single Number](https://leetcode.com/problems/single-number/)

## Description

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Bit Manipulation](https://leetcode.com/tag/bit-manipulation/)


Given a **non-empty** array of integers `nums`, every element appears _twice_ except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

**Example 1:**

```
Input: nums = [2,2,1]
Output: 1
```

**Example 2:**

```
Input: nums = [4,1,2,1,2]
Output: 4
```

**Example 3:**

```
Input: nums = [1]
Output: 1
```

**Constraints:**

*   1 <= nums.length <= 3 * 10<sup>4</sup>
*   -3 * 10<sup>4</sup> <= nums[i] <= 3 * 10<sup>4</sup>
*   Each element in the array appears twice except for one element which appears only once.


## Solution

Language: **Java**

```java
class Solution {
    public int singleNumber(int[] nums) {
        int xor =0;
        for(int values : nums){
            xor = xor^values;
        }
        return xor;
    }
}
```