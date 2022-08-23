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


// 1ms 100% faster solution. 
// convert to char Array and then sum it and first S string sum and T string subtract from sum. and then find difference and return as a character.
class Solution {
    public char findTheDifference(String s, String t) {
      int total = 0;
        
        for(int n: s.toCharArray()){
            total+=n;
        }
        for(int n: t.toCharArray()){
            total-=n;
        }
        return (char) Math.abs(total);
    }
   
}   

// 1ms 100% faster solution.

class Solution {
    public char findTheDifference(String s, String t) {
        
        int [] counts = new int [26];
        for(char ch:s.toCharArray()){
            counts[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            counts[ch-'a']--;
            
            if(counts[ch-'a']<0)
                return ch;
        }
        
        return '!';
    }
   
}   




// XOR
class Solution {
    public char findTheDifference(String s, String t) {
          char c = 0;
        for(char char_s:s.toCharArray()) c^=char_s;
        for(char char_t:t.toCharArray()) c^=char_t;
        return c;
        
    }
}   


/**

To get the sum of the ASCII values of all letters present in strings s and t and store them separately
And return the difference of the sums type-cast to char which will give the letter that was added extra (Because the difference would itself be an ASCII value)

// TC: O(n), SC: O(1)
 */
class Solution {
    public char findTheDifference(String s, String t) {
      int s_sum = 0;
      int t_sum =0;
      // do sum of string T & S.
       for(int i=0; i<s.length(); i++){
           s_sum+=s.charAt(i);
       }
    for(int i=0; i<t.length(); i++){
        t_sum +=t.charAt(i);
    }
        return (char) (t_sum-s_sum); // sum convert to character then we found what extra character present in string T.
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

   



/*


We need to use count of every char because this is what stays constant after permutation of the original string. As we know possible range of chars and it's small - only english lowercase letters which is 26 - we can use preallocated array that will keep count of every char. '
Scan the original string and increment count of every char. Index of the count can be calculated as "char - 'a'" which gives range [0...25].
Do the second scan of the t (processed) string, for each character decrement it's count from the array of counts. Three cases are possible:
char has only change place, count will be the same between two strings, at the end count array will have 0 for this char.
example is char "a" in s="aabd" and t="adbat", count will be 2 after scaning of s and 0 after scaning of t

one of existing characters has been added to t, in this case count array will have count_of_char, but t will have count_of_char + 1. if we decrement the count at the end we'll have -1 for this char.
example is char "a" in s="aabd" and t="adaba", count will be 2 after scaning of s and -1 after scaning of t

some character that was not present in original string has been added. in such case count array will have 0 for this char, and when we decrement the count at the end we'll have -1 for this char.
example is char "t" in s="aabd" and t="adabt", count will be 0 after scaning of s and -1 after scaning of t

It should be obvious at this point that the char that has been added will produce -1 during the scanning of t string. We need to check the count after every one character has been processed and return the character that caused this -1 count.

O(n) time - scan both string once, O(n) + O(n + 1) gives as O(n)
O(1) space - array is preallocated (with length 26) and thus does not depend on size of the input.

 */
public char findTheDifference(String s, String t) {
    int[] counts = new int[26];
    for (char ch : s.toCharArray()) {
        ++counts[ch-'a'];
    }
    for (char ch : t.toCharArray()) {
        --counts[ch - 'a'];
        if (counts[ch - 'a'] < 0)
            return ch;
    }
    return ' ';
}



// hashset

class Solution {
    public char findTheDifference(String s, String t) {
        
        
        Set<Character> set = new HashSet<>();
        for(char ch:(s+t).toCharArray()){
            if(!set.add(ch)){
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        Iterator<Character> iterator = set.iterator();
        return iterator.next();
    }
   
}   

/*

Length of t is equal to length to s + 1

initalize sum with the last char in t string so now we can loop over s and t with the same length and cover all letters

add to sum the different between current char in s with current char in t, so it will add 0 if they are equals

at the end we will have the wanted result in sum :D
 */

class Solution {
    public char findTheDifference(String s, String t) {
        int len = s.length();
        char sum = t.charAt(len);
        
        for(int i = 0 ; i < len ; i++) 
            sum += t.charAt(i) - s.charAt(i);
        
        return sum;
    }
}

