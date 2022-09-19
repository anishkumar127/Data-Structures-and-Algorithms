class Solution 
{ 
    String firstRepChar(String s) 
    { 
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            
            if(map.get(s.charAt(i))>1){
                return ""+s.charAt(i);
            }
        }
        return "-1";
    }
}


/// set hash set way.
String firstRepChar(String s) 
    { 
        // code here
        Set<Character> set = new HashSet<>();
        
        char[] ch=s.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            if(!set.contains(ch[i]))
            {
                set.add(ch[i]);
            }
            else
            {
               return Character.toString(ch[i]);
            }
        }
        
        return "-1";
        
    }
    
    
    
    
    // old way 
    
    
         // code here
       HashMap<Character, Integer> map = new HashMap<> ();
       for(int i = 0; i < s.length(); i++){
           if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i), map.get(s.charAt(i))+1);
           } 
           if(map.containsValue(2)){
               String ans = "";
               ans += s.charAt(i);
               return ans;
           }
           else{
               map.put(s.charAt(i), 1);
           }
       }
       return "-1";
       
       
       
       
       // string method using string contians method.
       
       class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        String str="";
        for(int i=0; i<s.length(); i++)
        {
            if(str.contains(String.valueOf(s.charAt(i))))
            {
                str="";
                str+=s.charAt(i);
                return str;
            }
            else
            {
                str+=s.charAt(i);
            }
        }
        
        return "-1";
    }
} 

frquency. 26 char.
JAVA Solution without Hashmap

       int[] a = new int[26];
       for(int i=0; i<s.length(); i++)
       {
           char ch = s.charAt(i);
           a[ch-'a']++;
           if(a[ch-'a']>1) return ""+ch;
       }
       return "-1";
       
      
      
      // hashset 
      
       // code here
        HashSet <Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return (""+s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
        }
          return "-1";
          
           
Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. S contains only lowercase letters.

 

Example 1:

Input: S="geeksforgeeks"
Output: e
Explanation: 'e' repeats at third position.
 

Example 2:

Input: S="hellogeeks"
Output: l
Explanation: 'l' repeats at third position.
 

Example 3:

Input: S="abc"
Output: -1
Explanation: There is no repeated character.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function firstRepChar() which accepts a string S as input parameter and returns a string containing first repeated character in it. If there is no repeated character in the string S then return "-1".
 

Expected Time Complexity: O(|S|) 
Expected Auxiliary Space: O(1)
where |S| denotes length of string S.

