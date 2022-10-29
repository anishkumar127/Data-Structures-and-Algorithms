import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        //Write code here and print output
                Scanner sc = new Scanner(System.in);
            String s = sc.next();

            if(isValid(s)){
                    System.out.print("1");
            }else{
                    System.out.print("0");
            }
    }
         public static boolean isValid(String s) {
      
        Stack<Character> st = new Stack<>();
        
        for(char ch:s.toCharArray()){
           if(ch=='(') st.push(')');
               else if( ch=='[')  st.push(']');
                   else if(ch=='{') st.push('}');
                    else if(st.isEmpty() || st.pop()!=ch) return false;
        }
        return st.isEmpty();
    }
}



Given an expression string s. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.

For example, the function should return true for exp = “[()]{}{()()}” and false for exp = “[(])”

Input Format
Line 1: contains a string s.

Output Format
Print "1" if the given string is balanced otherwise print "0" (without quotes).

Example 1
Input

{([])}
Output

1
Explanation

{ ( [ ] ) }, same designed brackets can form balaced pairs, with 0 number of unbalanced bracket.

Example 2
Input

()
Output

1
Explanation

(), same bracket can form balanced pairs, and here only 1 type of bracket is present and in balanced way.

Expected Time Complexity: O(|s.length()|)
Expected Space Complexity: O(|s.length()|)
Constraints
1<=s.length()<=1000