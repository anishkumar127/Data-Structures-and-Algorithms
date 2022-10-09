import java.util.*;

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String s = sc.next();
   
   HashMap<Character,Integer>map = new HashMap<>();
   
   for(char ch:s.toCharArray()){
     map.put(ch,map.getOrDefault(ch,0)+1);
   }
   
  // System.out.println(map);
  
  int x =0;
  int y =0;
  for(char ch:map.keySet()){
    int freq = map.get(ch);
    if((int)ch%2==0 && freq %2 ==0){
      x++;
    }else if((int)ch%2!=0 && freq%2!=0){
      x++;
    }
  }
  if((x+y)%2==0){
    System.out.println("EVEN");
  }else{
    System.out.println("ODD");
  }
  }
}



Given a string S of lowercase english characters, find out whether the summation of X and Y is even or odd, where X is the count of characters which occupy even positions in english alphabets ("a" occupies position 1 , "b" occupies position 2 and so on "z" occupies position 26) and have positive even frequency, and Y is the count of characters which occupy odd positions in english alphabets and have positive odd frequency. Note: Positive means greater than zero.

Input
First line contains single string denoting S

Output
Print "ODD" (Without quotes) if X + Y is odd Print "EVEN" (Without quotes) if X + Y is even

Constraints:
1 <= Length of String <= 100000

Sample Input:
abbbcc
Sample Output:
ODD