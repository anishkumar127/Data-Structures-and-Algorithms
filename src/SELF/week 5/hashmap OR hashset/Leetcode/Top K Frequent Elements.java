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
        int n = nums.length;
      HashMap<Integer,Integer> map = new HashMap<>();    
        
        for(int i=0; i<n; i++){
             int element = nums[i];
            // map.put(element, map.getOrDefault(element,0)+1);
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else{
                 map.put(element,1);
            }
        }
        // sort list from map.keyset() by map.get(num),
        ArrayList<Integer> list = new ArrayList( map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        
        // transfer results from list to int[];
        int output[] = new int[k];
        for(int i=0; i<k; i++){
            output[i] = list.get(i);
        }
        
        return output;
    }
}
```



class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // Handle null data and edge cases
        if (nums == null || nums.length == 0) return new ArrayList<>();
        
        // Using a map to keep track of count
        Map<Integer, Integer> map = new HashMap<>();
        // Using a list to only keep unique nums and to then sort them
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            // Add count to map
            map.put(num, map.getOrDefault(num, 0) + 1);
            // Add only unique nums to list
            if (!list.contains(num)) list.add(num);
        }
        
        // Sort list by greatest count to least
        Collections.sort(list, (Integer a, Integer b) -> map.get(b) - map.get(a));
        
        // Return a list containing only up to K elements
        return list.subList(0, k);
    }
}

