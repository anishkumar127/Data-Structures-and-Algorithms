# [451\. Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/)

## Description

Difficulty: **Medium**  

Related Topics: [Hash Table](https://leetcode.com/tag/hash-table/), [String](https://leetcode.com/tag/string/), [Sorting](https://leetcode.com/tag/sorting/), [Heap (Priority Queue)](https://leetcode.com/tag/heap-priority-queue/), [Bucket Sort](https://leetcode.com/tag/bucket-sort/), [Counting](https://leetcode.com/tag/counting/)


Given a string `s`, sort it in **decreasing order** based on the **frequency** of the characters. The **frequency** of a character is the number of times it appears in the string.

Return _the sorted string_. If there are multiple answers, return _any of them_.

**Example 1:**

```
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
```

**Example 2:**

```
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
```

**Example 3:**

```
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
```

**Constraints:**

*   1 <= s.length <= 5 * 10<sup>5</sup>
*   `s` consists of uppercase and lowercase English letters and digits.


## Solution

Language: **Java**

```java
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
      PriorityQueue <Character> pq = new PriorityQueue((a,b) -> map.get(b) - map.get(a));
​
        for(char val:map.keySet()){
            pq.offer(val);
        }
        
        StringBuilder sb = new StringBuilder();       
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }       
        return sb.toString();
        
    }
}
```