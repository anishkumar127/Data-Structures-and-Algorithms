# [409\. Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)

## Description

Difficulty: **Easy**  

Related Topics: [Hash Table](https://leetcode.com/tag/hash-table/), [String](https://leetcode.com/tag/string/), [Greedy](https://leetcode.com/tag/greedy/)


Given a string `s` which consists of lowercase or uppercase letters, return _the length of the **longest palindrome**_ that can be built with those letters.

Letters are **case sensitive**, for example, `"Aa"` is not considered a palindrome here.

**Example 1:**

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
```

**Example 2:**

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
```

**Constraints:**

*   `1 <= s.length <= 2000`
*   `s` consists of lowercase **and/or** uppercase English letters only.


## Solution

Language: **Java**

```java
class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
     int longer_length=0;
     boolean odd_Check= false;   
     for(char ch :s.toCharArray()){
         map.put(ch,map.getOrDefault(ch,0)+1);
     }
     
     // iterate over the hashmap value. is it even or odd check.
    for(int value : map.values()){
        if(value%2==0){
            longer_length+=value;
        }else{
            longer_length+=value-1;
            odd_Check = true;
        }
    }
        if(odd_Check) longer_length++; // odd
        
        return longer_length; // even 
        
    }
}
​
```


```
class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
     int longer_length=0;
     boolean odd_Check= false;   
        
        // character mapping using key and value pair. into hashamp. and frequency increasing.
    for(int i=0; i<s.length(); i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
    }
     
     // iterate over the hashmap value. is it even or odd check.
    for(int value : map.values()){
        if(value%2==0){
            longer_length+=value;
        }else{
            longer_length+=value-1;
            odd_Check = true;
        }
    }
        if(odd_Check) longer_length++; // odd
        
        return longer_length; // even 
        
    }
}

```