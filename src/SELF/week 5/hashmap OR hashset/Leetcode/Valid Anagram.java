# [242\. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## Description

Difficulty: **Easy**  

Related Topics: [Hash Table](https://leetcode.com/tag/hash-table/), [String](https://leetcode.com/tag/string/), [Sorting](https://leetcode.com/tag/sorting/)


Given two strings `s` and `t`, return `true` _if_ `t` _is an anagram of_ `s`_, and_ `false` _otherwise_.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

```
Input: s = "anagram", t = "nagaram"
Output: true
```

**Example 2:**

```
Input: s = "rat", t = "car"
Output: false
```

**Constraints:**

*   1 <= s.length, t.length <= 5 * 10<sup>4</sup>
*   `s` and `t` consist of lowercase English letters.

**Follow up:** What if the inputs contain Unicode characters? How would you adapt your solution to such a case?


## Solution

Language: **Java**

```java
class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()) return false;
         
        
        HashMap<Character,Integer> map= new HashMap<>();
        
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); // duplicate value ++;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);  // duplicate value --;
        }
        
        // in the end hashmap value contains 0.
       
        for(int value:map.values()){
            if(value!=0){
                return false;
            }
        }
        return true;
    }
}
```