# [49\. Group Anagrams](https://leetcode.com/problems/group-anagrams/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/), [String](https://leetcode.com/tag/string/), [Sorting](https://leetcode.com/tag/sorting/)


Given an array of strings `strs`, group **the anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

**Example 2:**

```
Input: strs = [""]
Output: [[""]]
```

**Example 3:**

```
Input: strs = ["a"]
Output: [["a"]]
```

**Constraints:**

*   1 <= strs.length <= 10<sup>4</sup>
*   `0 <= strs[i].length <= 100`
*   `strs[i]` consists of lowercase English letters.


## Solution

Language: **Java**

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // result 
        List<List<String>>ans = new ArrayList<>();
        
        // into hashmap. key will string. value will be list of string.
        HashMap<String,List<String>> map = new HashMap<>();
        
        // sort the string array.
        for(String s:strs){
            char[] arr = s.toCharArray(); // converted into character array.
            // sort it.
            Arrays.sort(arr);
            // convert again into string.
            String temp = new String(arr);
            
            // now work on hashmap.
            if(map.containsKey(temp)){
                // if contains then get that value.
                // and put into list.
                map.get(temp).add(s);
            }else{
                // if  not contains key.
                // then create key. and put value.
                // first create a array list for adding value into hashmap.
                
                ArrayList<String> list = new ArrayList<>();
                list.add(s);   // s is string array..
                map.put(temp,list);   // temp is sorted key. 
            }
        }
        // put hashmap value into answer array list.
        
        // there is two way to do this.
        // 1st way is 
        // for(String val:map.keySet()){    // getting key.
        //     ans.add(map.get(val));               // add that value into list.
        // }
        
        // 2nd way 
        for(List<String> val : map.values()){
            ans.add(val);
        }
        
        // returning the list.
        return ans;
    }
}
```