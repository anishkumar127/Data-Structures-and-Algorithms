# [136\. Single Number](https://leetcode.com/problems/single-number/)

## Description

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Bit Manipulation](https://leetcode.com/tag/bit-manipulation/)


Given a **non-empty** array of integers `nums`, every element appears _twice_ except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

**Example 1:**

```
Input: nums = [2,2,1]
Output: 1
```

**Example 2:**

```
Input: nums = [4,1,2,1,2]
Output: 4
```

**Example 3:**

```
Input: nums = [1]
Output: 1
```

**Constraints:**

*   1 <= nums.length <= 3 * 10<sup>4</sup>
*   -3 * 10<sup>4</sup> <= nums[i] <= 3 * 10<sup>4</sup>
*   Each element in the array appears twice except for one element which appears only once.


## Solution

Language: **Java**

```java  xOR TC O(n) sc O(1);
class Solution {
    public int singleNumber(int[] nums) {
        int xor =0;
        for(int values : nums){
            xor = xor^values;
        }
        return xor;
    }
}
```


Approach 1 = Using HashSet ==> TC = O(n) SC=O(n)

class Solution {
	public int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			if(set.contains(i)) {
				set.remove(i);
			} else{
				set.add(i);
			}
		}

		for(int i:set) {
			return i;
		}
		return -1;
	}
}

Approach 2 = Using Sorting ==> TC: O(NlogN) SC: O(1)

class Solution {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; i+=2) {
			if(nums[i] != nums[i-1]) {
				return nums[i-1];
			}
		}
		return nums[nums.length-1];
	}
}

First Approach by using hashMap :-

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new<Integer, Integer> HashMap();
        
        for(int x : nums){
            if(hash.containsKey(x)){       //if hashmap contains 'element', then increase correspoding val
                int count = hash.get(x);
                hash.put(x, ++count);
            }
            else
                hash.put(x, 1);           //if hashmap does not contain  'element', then put it in hashmap
        }
        
        for(int x : hash.keySet()){       //Iterate through 'keys' of HashMap
            if(hash.get(x)==1)            //if 'value' for 'key' is '1', then return that 'key' element
                return x;
        }
        
        return -1;
    }
}
Time Complexity : O(nlogn) , as there is a for loop and inside for loop 'hash.containsKey'
Space Complexity : O(n) , as HashMap of size nearly 'n/2' is used.


Why is the time complexity of First Method (HashMap) O(nlogn)? Isn't containsKey in HashMap linear as well?

The time complexity of containsKey has changed in JDK-1.8, as others mentioned it is O(1) in ideal cases. However, in case of collisions where the keys are Comparable, bins storing collide elements aren't linear anymore after they exceed some threshold. In other word, TreeNodes will be used (similar to those in TreeMap) to store bins, (ie: a Red-Black tree structure) and this leaves us with an O(lgn) complexity in-case of collisions.

Please refer the link :- https://stackoverflow.com/a/34545978