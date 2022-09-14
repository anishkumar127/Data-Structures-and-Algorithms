# [349\. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

## Description

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [Two Pointers](https://leetcode.com/tag/two-pointers/), [Binary Search](https://leetcode.com/tag/binary-search/), [Sorting](https://leetcode.com/tag/sorting/)


Given two integer arrays `nums1` and `nums2`, return _an array of their intersection_. Each element in the result must be **unique** and you may return the result in **any order**.

**Example 1:**

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
```

**Example 2:**

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
```

**Constraints:**

*   `1 <= nums1.length, nums2.length <= 1000`
*   `0 <= nums1[i], nums2[i] <= 1000`


## Solution

Language: **Java**

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
       
       
        
        // first array put into hashmap.
        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i],false);   // like example: 1:false , 2:false. bcz store only unique key so only 2 element into hashmap.
        }
        
        // in second array we put true into map where, second array contains first array element.
        
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){      // 2nd array contains key 2.
                map.put(nums2[i],true);     // so example: 1:false, 2:true
            }
        }
        
        // now use EntrySet to Get key and value.
        Set<Map.Entry<Integer,Boolean>> entries= map.entrySet();
        
        for(Map.Entry<Integer,Boolean>entry:entries){
            if(entry.getValue()){           // if we found entry.getValue()==true; then add that value key into arrayList.
                list.add(entry.getKey()); // we found 2:true. so add 2 into array list.
            }
          
        }
        
        // converting array list to array.
       int[] output= new int[list.size()];
        for(int i=0; i<list.size();i++){
            output[i] = list.get(i);
        }
        return output;      // returning the array.
    }
}
​
```