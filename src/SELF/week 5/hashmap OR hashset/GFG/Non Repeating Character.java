
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        
        int n = S.length();
        // creating map.
        HashMap<Character,Integer>map = new HashMap<>();
        
        // puting value inside hashamp.
        
        for(int i=0; i<n; i++){
            char every_ch= S.charAt(i);
            
            map.put(every_ch,map.getOrDefault(every_ch,0)+1);
        }
        
        // searching. first non repeated character into hashmap.
        
        for(int i=0; i<n; i++){
            if(map.get(S.charAt(i))==1){
                return S.charAt(i); // return that character which is first non repeated.
            }
        }
        
        return '$'; // if don't have anyting non repeated character then return $.
    }
}





Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
Your Task:
You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= N <= 103

