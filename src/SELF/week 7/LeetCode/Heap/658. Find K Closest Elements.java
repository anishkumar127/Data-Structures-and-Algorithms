# [658\. Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Two Pointers](https://leetcode.com/tag/two-pointers/), [Binary Search](https://leetcode.com/tag/binary-search/), [Sorting](https://leetcode.com/tag/sorting/), [Heap (Priority Queue)](https://leetcode.com/tag/heap-priority-queue/)


Given a **sorted** integer array `arr`, two integers `k` and `x`, return the `k` closest integers to `x` in the array. The result should also be sorted in ascending order.

An integer `a` is closer to `x` than an integer `b` if:

*   `|a - x| < |b - x|`, or
*   `|a - x| == |b - x|` and `a < b`

**Example 1:**

```
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
```

**Example 2:**

```
Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
```

**Constraints:**

*   `1 <= k <= arr.length`
*   1 <= arr.length <= 10<sup>4</sup>
*   `arr` is sorted in **ascending** order.
*   -10<sup>4</sup> <= arr[i], x <= 10<sup>4</sup>


## Solution

Language: **Java**

```java
class Solution {
    private class Pair implements Comparable<Pair>{
        int idx;
        int diff;
        Pair(int idx, int diff){
            this.idx = idx;
            this.diff = diff;
        }
        public int compareTo(Pair other){
            if(this.diff == other.diff) return other.idx - this.idx;
            else return other.diff - this.diff;
        }
    }
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(new Pair(i,Math.abs(nums[i]-x)));
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(nums[pq.poll().idx]);
            }
        Collections.sort(ans);
        return ans;
    }
}
​
```