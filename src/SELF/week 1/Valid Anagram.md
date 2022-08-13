<!-- O(n)  -->

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      if(s == null || t==null & s.length()!=t.length()){
        System.out.print(false);
        return;
      }
      
      int[]count = new int[26];
    for(int i =0; i<s.length(); i++){
      count[s.charAt(i)-'a']++;  // index ++;
      count[t.charAt(i)-'a']--;  // index --
      // so count will remaining 0
    }
    
    for(int x:count){
      if(x!=0){
        System.out.print(false);
        return;
      }
    }
    System.out.print(true);
  }
}


<!-- O(n)  -->

import java.util.*;
/*

Input: s = "anagram", t = "nagaram"
Output: true*/
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      
      if(s==null || t==null || s.length()!=t.length()){
        System.out.print(false);
        return;
      }
    int[] alphabet = new int[26]; // hash array.
    
   for(int i=0; i<s.length(); i++){
     // increase count of that char found in s
     alphabet[s.charAt(i)-'a']++;
    // drecresing count of that char found in t.
     alphabet[t.charAt(i)-'a']--;
   }
      
      // every Character count must be zero.
      for(int i=0; i<alphabet.length; i++){
        if(alphabet[i]!=0){
          System.out.print(false);
          return;
        }
      }
      // for(int x:alphabet){
      //   if(x!=0){
      //     System.out.print(false);
      //     return;
      //   }
      // }
      System.out.print(true);
  }
}




<!-- sorting tc O(nlogn) sc O(n)  -->

import java.util.*;
// Input: s = "anagram", t = "nagaram"
// Output: true
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     String t = sc.next();
     if(s.length()!=t.length()){
       System.out.print("false");
       return;
     }
     char[] s1 = s.toCharArray();
     char[] s2= s.toCharArray();
     
     Arrays.sort(s1);
     Arrays.sort(s2);
     
   boolean ans = Arrays.equals(s1,s2);
   System.out.print(ans);
   
     
  }
}

