
// tc O(n^2);
import java.util.*;

public class Main {
    public static void main(String[] args) {
     String s="cabbac";
     
     int largest=-1;
     for(int i=0; i<s.length(); i++){
       for(int j=i+1; j<s.length(); j++){
         if(s.charAt(i)==s.charAt(j)){
           largest = Math.max(largest,j-i-1);
          // System.out.print(j); //3-a;
          // System.out.print(i); // 0-a; 
          // 3 - 0 -1 ;
          // 0 starting 0 based index o not count.
          // and also have to remove last duplicate also. 
          // for that -1;
          // j is 3 and i 0; and -1; 3-0-1=2; for abca; 
         }
       }
     }
     System.out.print(largest);
  }
}

/*
 String s="cabbac";
 j is 5 4 3 
 i is  0 1  2 
 
 so .  5-0-1 = 4
       5-1-1 = 3 
       5 - 2 -1 = 2 
       so largest is 4.

*/






// theory part.


//  s = "aa" 0  between two a "" empty substring so 0;
// s="abca"  2  between two a bc ;
// s="cbzxy"  -1   no character twice in s. 
//  s = cabbac  4    
// so there should be duplicate. and inside duplicate if have character then count them and return.
// if have duplicate but no character then means empty"" substring.
// if no duplicate then return -1;
// also largest return. there may be many substring but return only largest.

