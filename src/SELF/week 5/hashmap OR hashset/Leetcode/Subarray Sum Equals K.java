# [560\. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [Prefix Sum](https://leetcode.com/tag/prefix-sum/)


Given an array of integers `nums` and an integer `k`, return _the total number of subarrays whose sum equals to_ `k`.

A subarray is a contiguous **non-empty** sequence of elements within an array.

**Example 1:**

```
Input: nums = [1,1,1], k = 2
Output: 2
```

**Example 2:**

```
Input: nums = [1,2,3], k = 3
Output: 2
```

**Constraints:**

*   1 <= nums.length <= 2 * 10<sup>4</sup>
*   `-1000 <= nums[i] <= 1000`
*   -10<sup>7</sup> <= k <= 10<sup>7</sup>


## Solution

Language: **Java**

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);  // key is 0 and value is 1. there can be case single array can be subarray. starting arr element is equal to k.
        int sum =0;
        int ans =0;
        for(int i=0; i<n; i++ ){
            sum+=nums[i];
            
            // find the key who. currentSum-k  if it contans in key. then our answer will be +1;
            int curr  = sum-k; 
            if(map.containsKey(curr)){
                ans+=map.get(curr);
            }
            
            // and here. if sum not present then put sum. if sum present then put value +1;
            
                // short code
                map.put(sum,map.getOrDefault(sum,0)+1);
            // if(!map.containsKey(sum)){  // if not contains key.
            //     map.put(sum,0);
            // }
            // // if containsKey
            // map.put(sum,map.get(sum)+1);
           
        }
        return ans; 
    }
}
​
​
```


/*
example

input.  4 1 6 2 1 1 1 9.

initial =0; sum.

0 , 4, 5, 11, 13, 14, 15 , 16, 25


map
key   0 4 
value 1 1
count

sum-k 

*/