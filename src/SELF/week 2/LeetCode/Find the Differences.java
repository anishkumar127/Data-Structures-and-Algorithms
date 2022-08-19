// bit manipulation XOR
/*
a^a = 0
1^1 = 0
0^0 = 0
1 ^0 = 1
0^1 = 1
*/


// hashmap approach.
/*
1. first we will store the frequency of each character of s String in hashmap.

key value
A   3   a is occurring 3 times.
B   1   b is occurring 1 times.
c   1

// s String stored in hashmap.
2. now we will iterate our string T and at each index we will found whether it is
present in hashmap or not, and if present whether its frequency is greater than o or not.


Tc O(n)   sc(26 String)  O(1)
 */

/* Sorting Approach
1. first we will sort the both the strings.
2. now iterate over our smaller string i.e. S.

if at any index we found that the value of both the string is difference then we will return T[index];

if in entire loop we didn't find the different value at particular index. then we will return the last value of T String.
TC O(nlogn) because Sorting and SC O(1);

 */

 /* XOR Approach  most optimal complexity is XOR
 
 we know that XOR of 2 same numbers is 0.
 example. 2 2 1 3 3  ans= 1;

Input: s = "abcd", t = "abcde"
Output: "e"

 char x = 0;
 in which   first S string Xor with x and then T string Xor with x;
 so  T and S xor . left return x.

// TC: O(n)  Sc O(1); 
 
  */


class Solution {
    public char findTheDifference(String s, String t) {
          char c = 0;
        for(char char_s:s.toCharArray()) c^=char_s;
        for(char char_t:t.toCharArray()) c^=char_t;
        return c;
        
    }
}   



// 14ms   hashmap.


class Solution {
    public char findTheDifference(String s, String t) {
      HashMap<Character,Integer>map = new HashMap<>();
        
        for(char s_char:s.toCharArray()){
            map.put(s_char, map.getOrDefault(s_char,0)+1); // if not then put otherwise present then increment with +1
        }
        
        for(char t_char:t.toCharArray()){
            if(map.containsKey(t_char) && map.get(t_char)==0 || !map.containsKey(t_char)){
                return t_char;
            }else{
                map.put(t_char,map.get(t_char)-1);
            }
        }
         return '!';
    }
   
}   



//

// Using Array

class Solution {
    public char findTheDifference(String s, String t) {
        int f[] = new int[26];
        for(char c : s.toCharArray())
            f[c - 'a']--;
        for(char c : t.toCharArray())
            f[c - 'a']++;
        int i = 0;
        for(; i < 26; i++)
            if(f[i] == 1) break;
        return (char)(i + 'a');
    }
}


// Using HashMap

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char c : t.toCharArray()){
            if(map.containsKey(c) && map.get(c) == 0 || !map.containsKey(c)) return c;
            else map.put(c, map.get(c) - 1);
        }
        return '!';
    }
}

// Using XOR one more way to solve it

class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(int i = 0; i < s.length(); i++){
            c ^= s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            c ^= t.charAt(i);
        }
        return c;
    }
}

/*

Algorithm explained
At first we convert the strings into arrays so we can sort them by their alphabetic order.
Then we compare each position of the sorted arrays until we find the differences and return the value of the index where they're different.
If there is no difference at all then its because the letter has been added to the end, so we just return the last char of t.

 */
class Solution {
    public char findTheDifference(String s, String t) {
      char[] schar=s.toCharArray();
      char[] tchar=t.toCharArray(); 
        
        Arrays.sort(schar);
        Arrays.sort(tchar);
        
        for(int i=0; i<schar.length; i++){
            if(schar[i]!=tchar[i]){return tchar[i];}
        }
        return tchar[tchar.length-1];
        
    }
}



