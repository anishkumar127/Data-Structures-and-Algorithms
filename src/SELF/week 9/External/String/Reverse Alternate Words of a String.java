import java.io.*;
import java.util.*;

class Solution {
    public String reverseAlternateWords(String s) {
        // write code here
              String arr[] = s.split(" ");
     
     for(int i=0; i<arr.length; i++){
       if(i%2==0){
         
         StringBuilder sb = new StringBuilder();
         String x = arr[i];
         sb.append(x).reverse();
         arr[i] = sb.toString();
         
       }
     }
     
    StringBuilder sb = new StringBuilder();
    for(String x:arr)sb.append(x).append(" ");
      return sb.toString().trim();
    }
}

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            Solution Obj = new Solution();
            System.out.println(Obj.reverseAlternateWords(s));
    }
}





import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     
     String arr[] = s.split(" ");
     
     for(int i=0; i<arr.length; i++){
       if(i%2==0){
         
         StringBuilder sb = new StringBuilder();
         String x = arr[i];
         sb.append(x).reverse();
         arr[i] = sb.toString();
         
       }
     }
     
    StringBuilder sb = new StringBuilder();
    for(String x:arr)sb.append(x).append(" ");
    System.out.println(sb.toString().trim());
 

  }
}


/*

nput:

my name is xyz
Output::

ym name si xyz
*/




import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
                String str = input.nextLine();
                String []arr = str.split(" ");
                String ans ="";
                for(int i=0; i<arr.length; i++){
                        if(i%2==0){
                        ans+=reverse(arr[i])+" ";
                        
                        }else{
                                ans+=arr[i]+" ";
                        }
                }
                System.out.println(ans);
	}
        public static String reverse(String str){
                String ans = "";
                for(int i=str.length()-1; i>=0; i--){
                        ans+=str.charAt(i);
                }
                return ans;
        }
}










You are given a sentence as a string. You are required to reverse the words of that sentence alternatively starting from the first word.

Input Format:
Input consists of 1 line of string s.

Output Format:
Print the string after modifying it i.e. reversing the words alternatively.

Example 1
Input:

my name is xyz
Output::

ym name si xyz
Explanation:

This is the modified string as we reverse the words "my" and "is".

Example 2
Input:

abc
Output::

cba
Explanation:

We reverse the only word "abc".

Constraints:
1 <= s.length <= 100