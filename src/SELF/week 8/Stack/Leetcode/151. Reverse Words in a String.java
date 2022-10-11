# [151\. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

## Description

Difficulty: **Medium**  

Related Topics: [Two Pointers](https://leetcode.com/tag/two-pointers/), [String](https://leetcode.com/tag/string/)


Given an input string `s`, reverse the order of the **words**.

A **word** is defined as a sequence of non-space characters. The **words** in `s` will be separated by at least one space.

Return _a string of the words in reverse order concatenated by a single space._

**Note** that `s` may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

**Example 1:**

```
Input: s = "the sky is blue"
Output: "blue is sky the"
```

**Example 2:**

```
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
```

**Example 3:**

```
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
```

**Constraints:**

*   1 <= s.length <= 10<sup>4</sup>
*   `s` contains English letters (upper-case and lower-case), digits, and spaces `' '`.
*   There is **at least one** word in `s`.

**Follow-up:** If the string data type is mutable in your language, can you solve it **in-place** with `O(1)` extra space?


## Solution

Language: **Java**

```java
class Solution {
    public String reverseWords(String s) {
        
        Stack<String> helper_Stack = new Stack<>();
        
        String temp_String ="";
        
        String ans_String="";
        
        for(int i=0; i<s.length(); i++){
         if(s.charAt(i)==' '){
             if(temp_String.length()>0){    // if temp string not empty.
                 helper_Stack.push(temp_String);   // push into stack.
             }
             temp_String = "" ;  // if get space then empty the temp; before empty push into stack.
         }else{
             // if not get space then push character into temp string.
             temp_String += s.charAt(i);
         }
        }
        
        // temp string pointing to now ans put temp string data into new Answer. ;
        // we put data into ans because. something left on temp string also which is.
        // not pushed into stack. when reached to length so that left data pushing into ans variable. that data will be last data. 
      ans_String = ans_String+temp_String;
        
        while(!helper_Stack.isEmpty()){
            ans_String +=" "+ helper_Stack.pop();  // pop and add into answer. and while adding also adding the space. // there will be a case where we add space and no left data into answer before. answer string was empty and we added space so its become leading space string.
            // that case will be handle we using substring method. below code.
        }
             
        // check leading space. if leading space added then we cut that space.
        if(ans_String.length()!=0 && ans_String.charAt(0)==' '){
            ans_String = ans_String.substring(1); // skip leading space.
        }
        return ans_String;
    }
}
```