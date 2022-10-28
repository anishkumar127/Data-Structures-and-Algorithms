import java.io.*;
import java.util.*;

class Solution{
        
   public static boolean backspaceCompare(String S, String T) {
                 return build(S).equals(build(T));
//       String x =  build(s); // [f];
    }
    private static String build(String t){
        Stack<Character> ans = new Stack<>();
        for(char ch: t.toCharArray()){
            if(ch!='#'){
                ans.push(ch);
            }else if(!ans.isEmpty()){
                ans.pop();
            }
        }
        return String.valueOf(ans); // returning [f];

    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
                Solution Obj  = new Solution();
		System.out.print(Obj.backspaceCompare(s,t));
	}
}




Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Input Format
First line of input contains a string s.

Second line of input contains a string t.

Output Format
You need to print the true or false depending on whether two strings will be equal or not.

Example 1
Input

ab#c
ad#c
Output:

true
Explanation:

Both s and t become "ac".

Example 2
Input

ab##
c#d#
Output:

true
Explanation:

Both s and t become "".

Constraints
1 <= s.length, t.length <= 200

s and t only contain lowercase letters and '#' characters.