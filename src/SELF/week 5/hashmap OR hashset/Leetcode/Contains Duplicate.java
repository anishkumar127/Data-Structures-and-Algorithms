





# [217\. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

## Description

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [Sorting](https://leetcode.com/tag/sorting/)


Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

**Example 1:**

```
Input: nums = [1,2,3,1]
Output: true
```

**Example 2:**

```
Input: nums = [1,2,3,4]
Output: false
```

**Example 3:**

```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

**Constraints:**

*   1 <= nums.length <= 10<sup>5</sup>
*   -10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>


## Solution			``Tc O(nlogn) Space Complexity: O(Space used by sorting algorithm)``
Language: **Java**

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);
        
    for(int i=0; i<nums.length-1; i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
    }
        return false;
    }
}
```



// Tc O(N) space O(N);  
```

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set =  new HashSet<>();
            
     for(int i=0; i<nums.length; i++){
         if(set.contains(nums[i])){
             return true;           // if contains duplicate return true;
         }
         set.add(nums[i]);           // if not contains duplicate put value into hashset until array has value.
     }
        return false;           // if not contains and loop reached till n length return false;
    }
}

```


// some improvement into memory and runtime.


```
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set =  new HashSet<>();
        
        for(int element:nums){
            if(!set.add(element)){ // if we found the similar value which is already present in set, then no need to add simply return true;
            // as it mean's the one of the same value is already over there
                return true;
            }
        }
        return false;
    }
}

```