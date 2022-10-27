```java
//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
         if(s.length()<26){
       
        return false;
      }
      s= s.toLowerCase();
      HashMap<Character,Integer>map = new HashMap<>();
  
      for(int i=0; i<s.length(); i++){
       char ch = s.charAt(i);
       if(ch>='a' && ch<='z'){
           
       map.put(ch,map.getOrDefault(ch,0)+1);
       }
      }
      return (map.size()==26);
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends

```



```java
public static boolean checkPangram  (String str) {

        HashSet<Character> h = new HashSet<>();

        str = str.toLowerCase();

        for(int i = 0;i<str.length();i++){

                if(str.charAt(i)>='a' && str.charAt(i)<='z')

                    h.add(str.charAt(i));

        }

        if(h.size()==26)

            return true;

        return false;

    }

```


Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet (either lowercase or uppercase or both). For example, we say the letter A is present in the string if either 'a' is present or 'A' is present.

Example 1:

Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Explanation: In the given input, there
are all the letters of the English
alphabet. Hence, the output is 1.
Example 2:

Input:
S = sdfs
Output: 0
Explanation: In the given input, there
aren't all the letters present in the
English alphabet. Hence, the output
is 0.
Your Task:
 You need to complete the function checkPangram() that takes a string as a parameter and returns true if the string is a pangram, or else it returns false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).

Constraints:
1 ≤ |S| ≤ 104