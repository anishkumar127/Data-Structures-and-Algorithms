# [128\. Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [Union Find](https://leetcode.com/tag/union-find/)


Given an unsorted array of integers `nums`, return _the length of the longest consecutive elements sequence._

You must write an algorithm that runs in `O(n)` time.

**Example 1:**

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
```

**Example 2:**

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

**Constraints:**

*   0 <= nums.length <= 10<sup>5</sup>
*   -10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>


## Solution

Language: **Java**

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        // true mark everthing.
        for(int value:nums){
            map.put(value,true);
        }
        
        // if previous smaller present then mark as false;
        for(int num:nums){
            if(map.containsKey(num-1)){
                map.put(num,false);
            }
        }
        
        // now iterate over map and check longeset consecutive sequence.
        
        int max =0;
        for(Integer key : map.keySet()){
            if(map.get(key)==true){
                max = Math.max(max,findLength(map,key));
            }
        }
        return max;
    }
    private static int findLength(HashMap<Integer,Boolean>map , int key){
        int ans =0;
        while(map.containsKey(key)){
            ans++;  // update answer like max variable.
            key++; // increase key to check present or not till end.
        }
        return ans;
    }
}
```