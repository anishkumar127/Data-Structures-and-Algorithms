// 1ms hashmap 

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> map  = new HashMap<>();
        int largest =-1;
        for(int i=0; i<s.length(); i++){
            char current_ch= s.charAt(i);
            if(map.containsKey(current_ch)){          // if contains current key the find max.
                largest=Math.max(largest, i-map.get(current_ch)-1);
            }else{
                map.put(current_ch,i);      // if not contains then put into the hashmap.
            }
        }
        
        return largest;
    }
}





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

// tc O(n+n) = O(2n) = O(n);
import java.util.*;

public class Main {
    public static void main(String[] args) {
       String s="cabbac";
     int [] lastIndex = new int[26]; // 
     Arrays.fill(lastIndex,-1); // initialize to all 26 to -1;
     
     for(int i=0; i<s.length(); i++){
       // puting the lastindex of every character c a b c ; c last is 5 
       lastIndex[s.charAt(i)-'a']=i; //435-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1
     }
     
    // for(int x:lastIndex)System.out.print(x); 435-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1
    int largest=-1;
    for(int i=0; i<s.length(); i++){
      int current_ch =s.charAt(i)-'a'; // current character get. 
      // getting every character
      // System.out.print(current_ch+" "); // 2 0 1 1 0 2  a is 0; 1 is b 3 is c. z is 25.
      if(lastIndex[current_ch]!=-1 && lastIndex[current_ch]!=i){
        // lastIndex != -1;  and lastIndex not current index (i);
        // System.out.print(lastIndex[current_ch]);  // 5 4 3 
        largest = Math.max(largest,lastIndex[current_ch]-i-1); // 5-0-1 = 4 , 5-4-1= 0; 5-3-1=1;
      }
    System.out.print(largest); 
    }

  }
}



// theory part.


//  s = "aa" 0  between two a "" empty substring so 0;
// s="abca"  2  between two a bc ;
// s="cbzxy"  -1   no character twice in s. 
//  s = cabbac  4    
// so there should be duplicate. and inside duplicate if have character then count them and return.
// if have duplicate but no character then means empty"" substring.
// if no duplicate then return -1;
// also largest return. there may be many substring but return only largest.

