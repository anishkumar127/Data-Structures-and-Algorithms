import java.util.*;
/*
Input: key = "the quick brown fox jumps over the lazy dog",
message = "vkbs bs t suepuv"
Output: "this is a secret"
*/
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String key = sc.nextLine();
     String message  = sc.nextLine();
     
     char[] map = new char [26];
     int i =0;
     
     for(char current_ch: key.toCharArray()){
       if(i<26 && current_ch!=' ' && map[current_ch-'a']==0){
         map[current_ch-'a'] = (char) (i+'a'); // i+'a' 'b' and convering to character. 97+1 = 98(b);
          i++; 
       }
     }
     
     String decode="";
     for(char current_ch :message.toCharArray()){
       decode+= (current_ch==' ' ? ' ':map[current_ch-'a']);
     }
     
     System.out.print(decode);
  }
}


    // 34 ms

    
class Solution {
    public String decodeMessage(String key, String message) {
      char[] map = new char[26];
        int i=0;  // iterator.
        for(char current_ch:key.toCharArray()){
            if(i<26  && current_ch!=' ' && map[current_ch-'a']==0){
                map[current_ch-'a']= (char) (i+'a'); // i+'a' 'b' and convering to character. 97+1 = 98(b);
                i++; // increament iterator. keep iterating.
            }
        }
        
        String decode = "";
        
        for(char current_ch:message.toCharArray()){
            decode += current_ch ==' '? ' ': map[current_ch-'a'];
        }
        
        return decode;
    }
    
}



// theory part.

/**
its easy with hashmap. 
1. like we create a character array of 26 size.
2. we define a iterator who will iterate over the 26 size character array. for track the position.
3. in forEach loop we convert String key to character array to easily iterate over the key.
4. if current i iterator is less then 26. and current_character is not equal to space ' '  and map of current_character is.
  0. 0 means it appear first time. its means its not in map array.
  then we put character on using type casting.
  and 
  5. we declare new string variable.
  and assign the string .
  6. assign the way like.  message convert to character array and 
  then loop it.
  7. and assigning in the decode string . if character(message) is space ' ' then we put space in decode.
  8. if character then we put character of map[ of current of (message)];

 */