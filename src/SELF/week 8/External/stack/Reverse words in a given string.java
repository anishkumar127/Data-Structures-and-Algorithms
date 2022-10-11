import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     
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
     
     System.out.println(ans);
  }
}


Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input: S = i.like.this.program.very.much Output: much.very.program.this.like.i Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i

Example 2:

Input: S = pqr.mno Output: mno.pqr Explanation: After reversing the whole string , the input string becomes mno.pqr

Your Task:
You need to take string S as input parameter and print a string containing the words in reversed order. Each word in the returning string should also be separated by "." dot

Constraints:
1 <= |S| <= 2000