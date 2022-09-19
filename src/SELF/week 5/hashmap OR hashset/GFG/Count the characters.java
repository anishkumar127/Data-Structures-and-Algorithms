
class Sol
{
    int getCount (String S, int N)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int count =0;
       char prev ='#';        
        for(char ch:S.toCharArray()){
            if(prev!=ch){
                 map.put(ch,map.getOrDefault(ch,0)+1);
            }
           prev = ch;
        }
        for(char val:map.keySet()){
            if(map.get(val)==N){
                count++;
            }
        }
        return count;
    }
    
}



int getCount (String s, int N)
    {
        // your code here
        int[] arr = new int[26];
        char prev = '#';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (prev != c) {
                arr[c - 'a']++;
            }
            prev = c;
        }
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                count++;
            }
        }
        return count;
    }
    
    
    
    
    Given a string S. Count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.

Example 1:

Input:
S = "abc", N = 1
Output: 3
Explanation: 'a', 'b' and 'c' all have 
1 occurrence.

â€‹Example 2:

Input: 
S = "geeksforgeeks", N = 2
Output: 4
Explanation: 'g', 'e', 'k' and 's' have
2 occurrences.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getCount() which takes the string S and an integer N as inputs and returns the count of the characters that have exactly N occurrences in the string. Note that the consecutive occurrences of a character have to be counted as 1.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
1<=N<=103
    