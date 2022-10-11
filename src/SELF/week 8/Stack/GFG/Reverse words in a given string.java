
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        Stack<String> st = new Stack<>();
     
     String temp ="";
     for(int i=0; i<s.length(); i++){
       if(s.charAt(i)=='.'){
         if(temp.length()>0){
           st.push(temp);
         }
         temp ="";
       }else{
         temp = temp + s.charAt(i);
       }
     }
     
     String ans ="";
     ans = ans+temp;
     
     while(!st.isEmpty()){
       ans+="."+st.pop();
     }
     
     if(ans.length()!=0 && ans.charAt(0)=='.'){
       ans = ans.substring(1);
     }
     
    return ans;

    }
}