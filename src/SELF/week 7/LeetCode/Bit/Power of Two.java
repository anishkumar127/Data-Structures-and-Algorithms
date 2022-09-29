# [231\. Power of Two](https://leetcode.com/problems/power-of-two/)

## Description

Difficulty: **Easy**  

Related Topics: [Math](https://leetcode.com/tag/math/), [Bit Manipulation](https://leetcode.com/tag/bit-manipulation/), [Recursion](https://leetcode.com/tag/recursion/)


Given an integer `n`, return _`true` if it is a power of two. Otherwise, return `false`_.

An integer `n` is a power of two, if there exists an integer `x` such that n == 2<sup>x</sup>.

**Example 1:**

```
Input: n = 1
Output: true
Explanation: 20 = 1
```

**Example 2:**

```
Input: n = 16
Output: true
Explanation: 24 = 16
```

**Example 3:**

```
Input: n = 3
Output: false
```

**Constraints:**

*   -2<sup>31</sup> <= n <= 2<sup>31</sup> - 1

**Follow up:** Could you solve it without loops/recursion?

## Solution

Language: **Java**

```java   brute force.
class Solution {
    public boolean isPowerOfTwo(int n) {
     long i =1;
        while(i<n){
            i= i*2;
        }
        return i==n;
    }
}
```


bit right shift.

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
      int count =0;
        for(int i=0; i<32; i++){
            
             count += (n>>i)&1;
        }
        return count==1;
    }
}



optimal. tc O(1) sc O(1);

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
      if((n&(n-1))==0) return true;
    
        return false; 
    }
}