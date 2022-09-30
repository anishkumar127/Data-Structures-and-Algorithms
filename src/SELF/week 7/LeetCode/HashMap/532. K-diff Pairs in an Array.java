# [532\. K-diff Pairs in an Array](https://leetcode.com/problems/k-diff-pairs-in-an-array/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [Two Pointers](https://leetcode.com/tag/two-pointers/), [Binary Search](https://leetcode.com/tag/binary-search/), [Sorting](https://leetcode.com/tag/sorting/)


Given an array of integers `nums` and an integer `k`, return _the number of **unique** k-diff pairs in the array_.

A **k-diff** pair is an integer pair `(nums[i], nums[j])`, where the following are true:

*   `0 <= i, j < nums.length`
*   `i != j`
*   `nums[i] - nums[j] == k`

**Notice** that `|val|` denotes the absolute value of `val`.

**Example 1:**

```
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
```

**Example 2:**

```
Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
```

**Example 3:**

```
Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
```

**Constraints:**

*   1 <= nums.length <= 10<sup>4</sup>
*   -10<sup>7</sup> <= nums[i] <= 10<sup>7</sup>
*   0 <= k <= 10<sup>7</sup>


## Solution

Language: **Java**

```java Tc O(n) Sc O(n);
class Solution {
    public int findPairs(int[] nums, int k) {
     HashMap<Integer, Integer>map = new HashMap<>();
     int n = nums.length;
    int count=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int key: map.keySet()){
            if(k!=0){
                int isPresent = key+k;
                if(map.containsKey(isPresent)){
                    count++;
                }
            }else{
                if(map.get(key)>1){  // >=2  , this case when k==0; we just need to return frequency.
                    count++;
                }
            }
        }
        return count;
    }
}
```



brute Force

class Solution {
    public int findPairs(int[] nums, int k) {
        // Tc O(nlogn) Sc O(1);
        int n = nums.length;
        Arrays.sort(nums);
        int i=0;
        int j =1;
        int count=0;
        
        while(i<n && j<n){
            int diff = nums[j] - nums[i];
            if(diff==k){
                count++;
                i++;
                j++;
              while(j<n && nums[j]==nums[j-1]){
                    j++; // avoid duplicate.
                }
            } else if(diff>k){
                
                i++;
              
                if(j-i==0){
                  j++;
              }
                
            }else{
                j++;  // diff<k j++;
            }
            
        }
        return count;
    }
}
