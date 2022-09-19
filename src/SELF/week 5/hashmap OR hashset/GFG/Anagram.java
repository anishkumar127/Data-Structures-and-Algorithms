nlogn 


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
       if(a.length() != b.length()) return false;  
       char[] s1 = a.toCharArray();
       char[] s2 = b.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
       return Arrays.equals(s1,s2);
        
    }
}



tc O(n);
sc O(n);


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
       if(a.length() != b.length()) return false; 
 
    HashMap<Character,Integer> map = new HashMap<>();
    
    for(int i=0; i<a.length(); i++){
        
        map.put(a.charAt(i), map.getOrDefault(a.charAt(i),0)+1);
    }
    
    for(int i=0; i<b.length(); i++){
        if(map.containsKey(b.charAt(i))){
            map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)-1);
        }
    }
      
      
      for(int x: map.values()){
          if(x!=0){
              return false;
          }
      }
      return true;
    }
}