// split method example. 1st.

import java.util.*;
// The split() method divides the string at the specified regex and returns an array of substrings.
// The java string split() method splits this string against given regular expression and returns a char array.

public class Main {
    public static void main(String[] args) {
    String text = "dog cat cat dog";

    // split string from space // and return Character array.
    String[] result = text.split(" ");

    System.out.println(Arrays.toString(result));
    for (String str : result) {
      System.out.print(str + " ");
    }

  }
}

// actual coding part start. 




import java.util.*;
/*
- leading or trailing spaces.
- A leading space is a space that is located before the first character (letter, number, punctuation mark) in a text entry field. A trailing space is a space that is located after the final character in a text entry field.
- A function is said to be bijective or bijection, if a function f: A → B satisfies both the injective (one-to-one function) and surjective function (onto function) properties. It means that every element “b” in the codomain B, there is exactly one element “a” in the domain A. such that f(a) = b.

// pattern length and string word length should be equal.

for example: 
pattern :"abba" =4;
s_word : "dog cat cat dog" = 4 word.  pattern and s_length both should be same. 


containsValue is  O(n).  It needs to iterate over all the values to find if the given argument is present.

*/
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pattern = sc.nextLine();
    String s = sc.nextLine();
    sc.close();
    
    String[] words = s.split(" "); // split from space and it will return char Array.
    if(words.length!=pattern.length()) return;
    HashMap<Character,String> map = new HashMap<>();
    
    for(int i=0; i<pattern.length(); i++){
      char current_char = pattern.charAt(i);
      if(map.containsKey(current_char)){  // map current key contains . and then  current_char not equal to current word. then false.
         if(!map.get(current_char).equals(words[i])){    // containsKey not equal to current 
          // return false; 
          System.out.print(false);
          return;
         }
        
      }else{
        if(map.containsValue(words[i])){    // 
          // return false; 
          System.out.print(false);
          return;
        }
        map.put(current_char,words[i]);
      }
    }
    System.out.print(true);
    
  }
}

// 0ms leetcode 

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length!=pattern.length()) return false;
        
        HashMap<Character,String>map = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char current_character = pattern.charAt(i);
            if(map.containsKey(current_character)){
                if(!map.get(current_character).equals(words[i])){ // if current_char not equals to current_word.false. 
                    return false;
                }
                
            }else{
                if(map.containsValue(words[i])) return false;
                map.put(current_character,words[i]);
            }
        }
        return true;
    }
}


// 1ms solution. containsValue(O(n)) runtime.

class Solution {
    public boolean wordPattern(String pattern, String s) {
         if (pattern == null || s == null) {
        return false;
    }
    char[] patterns = pattern.toCharArray();
    String[] words = s.split(" ");
    if (patterns.length != words.length) {
        return false;
    }
    Map<Character, String> map = new HashMap<Character, String>();
    for (int i=0; i<patterns.length; i++) {
        if (map.containsKey(patterns[i])) {
            if (!map.get(patterns[i]).equals(words[i])) {
                return false;
            }
        } else if (map.containsValue(words[i])) {
            return false;
        }
        map.put(patterns[i], words[i]);
    }
    return true;
    }
}


//
/*
Split str into array of string named strs

map a,b,c with string from strs.
a->dog
b->cat
c->fish

if a,b,c repeats then compare the string from map and string from strs, if it not equal return false.

else a,b,c is appearing first time, check if the string from strs is previously associated with any a,b,c , yes then return false, else map it.
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strs = s.split(" ");

        HashMap<Character,String> map = new HashMap<Character,String>();

        if(strs.length != pattern.length())
        {
            return false;
        }
        
        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(strs[i]))
                    return false;
            }
            else
            {
                if(map.containsValue(strs[i]))
                    return false;
                map.put(c,strs[i]);
            }
        }
        return true;
    }
}


Java Code:

class Solution {
    /*The question is same as isomorphic strings, but there it was two string and we had
    to map char to a char, but here we have to map a char to a string, So it is the same
    as that question, we create a map, iterate, and check if key i.e char in pattern[i] is
    present or not, if it is present then we check if the value of that key in map is
    same as the string in s[i], if not then return false, else continue, if the key is not
    present then before we map the key with value, we have to check if the value is already
    present in the map mapped by some other key, if so ten we return false, else we map
    the key ro the value and continue, then if iterated fully then return true*/
    public boolean wordPattern(String p, String s) {
        int n=p.length();
        String str[]=s.split(" ");
        int sSize=str.length;
        if(sSize!=n) return false;
        HashMap<Character,String> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(p.charAt(i))){
                if(!(hm.get(p.charAt(i)).equals(str[i]))) return false;
            }else{
                if(hm.containsValue(str[i])) return false;
                hm.put(p.charAt(i),str[i]);
            }
        }
        return true;
    }
}


// graphical explanation
// https://leetcode.com/problems/word-pattern/discuss/1695928/As-simple-explanation-as-you-want 