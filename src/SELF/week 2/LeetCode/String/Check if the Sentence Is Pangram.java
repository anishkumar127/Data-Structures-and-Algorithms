// 0ms 100 5 faster solution.


class Solution {
    public boolean checkIfPangram(String sentence) {
  
        if(sentence.length()<26 || sentence.length()==0){
            return false;
        }
        // indexof(a) , indexOf(b); present then loop keep going.
        //  if not present and indexOf return -1 then return false;
        for(char c ='a'; c<='z'; c++){
            if(sentence.indexOf(c)==-1){
                return false;
            }
        }
        return true;
    }
}


// which i was thinking. 
// Instead of iterating through sentence string, iterating through these 26 characters will be faster.

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;

        for(char c = 'a' ; c <= 'z'; c++){
            if(sentence.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}



import java.util.*;
/*
Complexity
Time O(n)
Space O(26)
*/
public class Main {
    public static void main(String[] args) {
      String s ="thequickbrownfoxjumpsoverthelazydog";
      if(s.length()<26){
        System.out.print(false);
        return;
      }
      
      int travelar = 0;
      while(travelar<26){
        if(s.indexOf((char)97+travelar)==-1){
          System.out.print(false);
          return;
        }
        travelar++;
      }
      System.out.print(true);
      return;
  }
}


// leetcode 0ms.

/*
This indexOf() Java String method returns the index within this string of the first occurrence of the specified character. It returns -1 if the character does not occur.

97+0 = a;
98+1 = b;
indexOf(a); if present return index else return -1;
// if == -1 means not present then return false.
*/
class Solution {
    public boolean checkIfPangram(String sentence) {
        int alphabet = 26;
        if(sentence.length()<alphabet){
            return false;
        }
        int traveler =0;
        
        while(traveler<alphabet){
            if(sentence.indexOf((char) 97 + traveler)==-1){
                return false;
            }
            traveler++;
        }
        return true;
    }
}


// scanner 
import java.util.*;

public class Main {
    public static void main(String[] args) {

String sentence="thequickbrownfoxjumpsoverthelazydog";
         int checker =0;
     int [] alphabet = new int[26];  // frequency count.
        for(int i=0; i<sentence.length(); i++){
            char every_ch = sentence.charAt(i);
            alphabet[every_ch-'a']++;  // duplicate frequency incrase if present frequency incrase to 1. if not present frequency will be 0;
            if(alphabet[every_ch-'a']==1){
              checker++;
              
            }
        }
        // for(int x:alphabet){
        //   System.out.print(x+" "); // print frequency
        // }
        System.out.print(checker==26); // true.
        // System.out.print(checker);  // 26.
  }
}



// leetcode 5ms 


class Solution {
    public boolean checkIfPangram(String sentence) {
    int alphabet_counter =0;
     int total_alphabet=26;
     int [] alphabet = new int[26]; // hashing array  storing the character frequency.
        for(int i=0; i<sentence.length(); i++){
            char every_ch = sentence.charAt(i);
            alphabet[every_ch-'a']++;  // increasement the frequency.
            if(alphabet[every_ch-'a']==1){  // if present character will be 1. else 0; 
                alphabet_counter++;         // counting.
            }
        }
        return alphabet_counter == total_alphabet;  // equal means total 26 english alphabet present. and its anagram.
    }
}


// functional production. code .

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans[] = new boolean[26];
        for(int i=0;i<26;i++){
            String letters = "abcdefghijklmnopqrstuvwxyz";
            char target = letters.charAt(i);
            ans[i] = pangram(sentence,target);
        }
        boolean pangram = check(ans);
        if(pangram == true){
           return true;
        }else{
           return false;
        }
    }
    static boolean pangram(String sentence,char target){
        int end = sentence.length();
        for(int i=0;i<end;i++){
            char check = sentence.charAt(i);
            if(check == target){
                return true;
            }
        }
        return false;
    }
    static boolean check(boolean ans[]){
        for(int i=0;i<26;i++){
            if(ans[i] == false){
               return false;
            }
        }
        return true;
    }
}



/**

Each character has an ascii value. We use (ch - 'a') to normalize the ascii value so that a -> 0, b -> 1, c -> 2, etc, etc. Then we use (ch - 'a') as an index into our alphabet boolean array. Here we set the index of (ch - 'a') to true to indicate that we have seen character ch.

At the end we iterate through all the booleans in our alphabet. If any of the booleans are false we did not see the char that corresponds to it. Return false. Else return true

**/

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        
        for (char ch : sentence.toCharArray()) {
            alphabet[ch - 'a'] = true;
        }
        
        for (boolean ch : alphabet) {
            if (ch == false) {
                return false;
            }
        }
        
        return true;
    }
}


// boolean 


class Solution {
    public boolean checkIfPangram(String sentence) {
   boolean [] visited = new boolean[26]; 
        
        for(int i=0; i<sentence.length(); i++){
            int every_ch = sentence.charAt(i)-'a';
            visited[every_ch]= true;
        }
        
        for(boolean x:visited){
            if(x==false) return false;
        }
        return true;
    }
}


//

public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(int i=1;i<=26;i++)
            if(sentence.indexOf((char)i+96)<0)
                return false;        
        return true;
    }


//

    Class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];
        
        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }
        
        //find any letter that not exist
        for(boolean existLetter : letters) {
            if(!existLetter) return false;
        }
        
        return true;
    }
}


// without extra space.

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length()<26 || sentence == null)
            return false;
        
        for(char i=97;i<=122;i++){
            if(!sentence.contains(String.valueOf(i)))
                return false;
        }
        return true;
}
}

// hashset

class Solution {
    public boolean checkIfPangram(String sentence) {
        // base condition
        if(sentence.length()<26)return false;
        // using HashSet to store the coming characters
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            char current = sentence.charAt(i);
            if(!set.contains(current)) set.add(current);
        }
        System.out.println(set.size());
        // if the size of the set is 26 then return true else return false
        return set.size() == 26 ? true:false;
    }
}

