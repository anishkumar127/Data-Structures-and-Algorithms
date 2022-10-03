# [347\. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [Divide and Conquer](https://leetcode.com/tag/divide-and-conquer/), [Sorting](https://leetcode.com/tag/sorting/), [Heap (Priority Queue)](https://leetcode.com/tag/heap-priority-queue/), [Bucket Sort](https://leetcode.com/tag/bucket-sort/), [Counting](https://leetcode.com/tag/counting/), [Quickselect](https://leetcode.com/tag/quickselect/)


Given an integer array `nums` and an integer `k`, return _the_ `k` _most frequent elements_. You may return the answer in **any order**.

**Example 1:**

```
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
```

**Example 2:**

```
Input: nums = [1], k = 1
Output: [1]
```

**Constraints:**

*   1 <= nums.length <= 10<sup>5</sup>
*   -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
*   `k` is in the range `[1, the number of unique elements in the array]`.
*   It is **guaranteed** that the answer is **unique**.

**Follow up:** Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.


## Solution

Language: **Java**

```java
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int val: nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->map.get(o1)-map.get(o2));
        
        for(int num:map.keySet()){
           pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int output[] = new int[k];
        int index =0;
        while(!pq.isEmpty()){
            output[--k] = pq.poll();
        }
        
        return output;
    }
}
```