import java.util.*;
// input:    fly me   to   the moon  : output: 4
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      
      int count =0;
      // We are looking for the last word so let's go backward
      for(int i=s.length()-1; i>=0; i--){
          if(s.charAt(i)!=' '){ // a letter is found so count
               count++;
        }else{   // it's a white space instead
          if(count>0){
            break; //  Did we already started to count a word ? Yes so we found the last word
          }     
        }
      }
      System.out.print(count);
  }
}


// 0ms leetcode 

class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                count++;
            }else{
                if(count>0){
                    return count;
                }
               
            }
        }
        return count;
    }
}



// 1ms using trim and toCharArray method. 


class Solution {
    public int lengthOfLastWord(String s) {
      char[] ch = s.trim().toCharArray(); // trim space.
        int count=0;
        for(int i=ch.length-1; i>=0; i--){
            if(ch[i]!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}



