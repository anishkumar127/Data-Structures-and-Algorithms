# [215\. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Divide and Conquer](https://leetcode.com/tag/divide-and-conquer/), [Sorting](https://leetcode.com/tag/sorting/), [Heap (Priority Queue)](https://leetcode.com/tag/heap-priority-queue/), [Quickselect](https://leetcode.com/tag/quickselect/)


Given an integer array `nums` and an integer `k`, return _the_ k<sup>th</sup> _largest element in the array_.

Note that it is the k<sup>th</sup> largest element in the sorted order, not the k<sup>th</sup> distinct element.

You must solve it in `O(n)` time complexity.

**Example 1:**

```
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
```

**Example 2:**

```
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
```

**Constraints:**

*   1 <= k <= nums.length <= 10<sup>5</sup>
*   -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>


## Solution

Language: **Java**

```java
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<nums.length; i++){
          pq.add(nums[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        return pq.peek();
    }
}
​
// 1 2 3 4 5 6 
// L -> 5
// S -> 2
```