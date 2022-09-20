//hashmap

class Solution
{
    public String reverseString(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
           String ans ="";
        for(int i=s.length()-1; i>=0; i--){
            char ch =  s.charAt(i);
            if(!map.containsKey(ch) && ch!=' '){
            map.put(ch,1);
            ans = ans+ ch;
            }
        }
        return ans;
    }
}




//using string  and array list

class Solution
{
   public String reverseString(String s)
   {
       //code here.
       ArrayList<Character> al = new ArrayList<>();
       String fina="";
       for(int i=s.length()-1;i>=0;i--){
           if(Character.isLetter(s.charAt(i))){
               if(!al.contains(s.charAt(i))){
               fina+=s.charAt(i);
               al.add(s.charAt(i));
           }
           }
       }
       return fina;
   }
}






class Solution{
   public String reverseString(String s) {
       //code here.
       ArrayList<Character> ar=new ArrayList<>();
       for(int i=s.length()-1; i>=0; i--){
           if(ar.contains(s.charAt(i))||s.charAt(i)==' '){
               continue;
           }
           ar.add(s.charAt(i));
       }
       StringBuilder str=new StringBuilder();
       for(int i=0; i<ar.size(); i++){
           str.append(ar.get(i));
       }
       return str.toString();

 

//second solution

 /* HashMap<Character,Integer> ar=new HashMap<>();
        StringBuilder str=new StringBuilder();
       for(int i=s.length()-1; i>=0; i--){
           if(ar.containsKey(s.charAt(i))||s.charAt(i)==' '){
               continue;
           }
           ar.put(s.charAt(i),i);
            str.append(s.charAt(i));
       }
       return str.toString();*/
   }
}





Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.

Example 1:

Input: S = "GEEKS FOR GEEKS"
Output: "SKEGROF"

Example 2:

Input: S = "I AM AWESOME"
Output: "EMOSWAI"


Your Task:
You don't need to read input or print anything. Your task is to complete the function reverseString() which takes a string S as input parameter and returns a modified string. 


Expected Time Complexity: O(|S|), where |S| denotes length of string.
Expected Auxiliary Space: O(1).

