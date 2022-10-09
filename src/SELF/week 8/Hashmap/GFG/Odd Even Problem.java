
class Solution{
    static String oddEven(String S) {
      
      HashMap<Character,Integer>map = new HashMap<>();
      
      for(char ch:S.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
      }
      
      
      int x =0;
      int y =0;
      
      for(char ch:map.keySet()){
          int freq = map.get(ch);
          
          if((int)ch%2==0 && freq%2==0) x++;
          else if((int)ch%2!=0 && freq%2!=0)y++;
      }
      
      
      return (x+y)%2==0? "EVEN":"ODD";
    }
}


Given a string S of lowercase english characters, find out whether the summation of X and Y is even or odd, where X is the count of characters which occupy even positions in english alphabets and have positive even frequency, and Y is the count of characters which occupy odd positions in english alphabets and have positive odd frequency.
Note: Positive means greater than zero.

Example 1:

Input: S = "abbbcc"
Output: "ODD"
Explanation: X = 0 and Y = 1 so (X + Y) is 
ODD. 'a' occupies 1st place(odd) in english 
alphabets and its frequency is odd(1), 'b' 
occupies 2nd place(even) but its frequency 
is odd(3) so it doesn't get counted and 'c' 
occupies 3rd place(odd) but its frequency 
is even(2) so it also doesn't get counted.
Example 2:

Input: S = "nobitaa"
Output: "EVEN"
Explanation: X = 0 and Y = 2 so (X + Y) is
EVEN.
Your Task:  
You dont need to read input or print anything. Complete the function evenOdd() which takes S as input parameter and returns "EVEN"  if  X + Y is even, "ODD" otherwise.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1) 

Constraints:
1 ≤ |S| ≤ 1000