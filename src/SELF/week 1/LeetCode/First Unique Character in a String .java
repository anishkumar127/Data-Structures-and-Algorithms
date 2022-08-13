import java.util.*;
// TC O(n) Sc O(n);
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
    int count[] = new int [256];
    
    // counting the frequency of character.
    for(int i=0; i<s.length(); i++){
      count[s.charAt(i)]++;
      // System.out.print(Arrays.toString(count));
    }
    int index = -1;
    
    // if frequency remaining same 1. then it will index=i; 
    for(int i=0; i<s.length(); i++){
      if(count[s.charAt(i)]==1){
        index  = i;
        break;
      }
    }
    System.out.print(index);
  }
}
/*
Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
*/