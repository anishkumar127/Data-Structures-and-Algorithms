# [1636\. Sort Array by Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)

## Description

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [Sorting](https://leetcode.com/tag/sorting/)


Given an array of integers `nums`, sort the array in **increasing** order based on the frequency of the values. If multiple values have the same frequency, sort them in **decreasing** order.

Return the _sorted array_.

**Example 1:**

```
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
```

**Example 2:**

```
Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
```

**Example 3:**

```
Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
```

**Constraints:**

*   `1 <= nums.length <= 100`
*   `-100 <= nums[i] <= 100`


## Solution

Language: **Java**

```java
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int el:nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b)); // min-heap
    
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a).equals(map.get(b))?b.compareTo(a): map.get(a)-map.get(b)); // min-heap
        int output[] = new int [nums.length];
        int index =0;
        
        for(int val:nums){
            pq.add(val);
        }
        
        while(!pq.isEmpty()){
            output[index++] = pq.poll();
        }
        
        return output;
    }
}
```