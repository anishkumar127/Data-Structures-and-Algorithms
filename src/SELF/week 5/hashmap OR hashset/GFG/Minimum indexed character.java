  // good approach
  
  class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String S, String patt){

        // you don't need to print anything
        String s="";
       for(int i=0;i<S.length();i++){
           if(patt.contains(""+S.charAt(i))){
              return ""+S.charAt(i);
           }
       }
        return "$";

    }
    
}
// hashmap.
  
  // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String S, String patt){

        // you don't need to print anything
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<patt.length(); i++ ){
            map.put(patt.charAt(i), map.getOrDefault(patt.charAt(i),0)+1);
        }
    
      for(int i=0; i<S.length(); i++){
          if(map.containsKey(S.charAt(i))){
             return  String.valueOf(S.charAt(i));  // one more method Character.toString(S.charAt(i));
          }
      }
      return "$";
    }
    
}
//

// hashset 

public static String printMinIndexChar(String S, String patt)
    {
        // Your code here
        // you don't need to print anything
        char c[]=S.toCharArray();
        char d[]=patt.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<d.length;i++)
        set.add(d[i]);
            
        for(int i=0;i<c.length;i++)
        {
            if(set.contains(c[i])==true)
            return String.valueOf(c[i]);
        }
        return "$";
    }
    
    
    
    // simple
    
           String s="";
       for(int i=0;i<S.length();i++){
           if(patt.contains(""+S.charAt(i))){
              return ""+S.charAt(i);
           }
       }
   return "$";
   

Given a string S and another string patt. Find the character in patt that is present at the minimum index in S.
 

Example 1:

Input: S = "zsyle", patt = "bjz"
Output: "z"
Example 2:

Input: S = "anskg", patt = "me"
Output: "$"
 

Your Task:
You don't need to read or print anything. Your task is to complete the function printMinIndexChar() which takes S and patt as input parameter and returns the character in patt that is present at the minimum index in S. If not possible returns "$".
 

Expected Time Complexity: O(max(|str|, |patt|))
Expected Auxilary Space: O(K) where K <= 26
Constraints:
1 ≤ |S|, |patt| ≤ 104



// weired way

 int min = Integer.MAX_VALUE;
      for(int i=0;i<p.length();i++)
      {
          int idx = s.indexOf(p.charAt(i));
          if(idx>=0 && idx<min)
          {
              min = idx;
          }
      }
      if(min ==Integer.MAX_VALUE)
      {
          return "$";
      }
      return s.charAt(min)+"";
      
      