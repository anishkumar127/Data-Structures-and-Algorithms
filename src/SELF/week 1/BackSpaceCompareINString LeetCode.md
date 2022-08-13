
<!-- using stack  -->

package Try;

import java.util.Scanner;
import java.util.Stack;
//Tc :-  O(M + N) // m and n length of string s & t;
public class BackSpaceSCompareStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean x= build(s).equals(build(t));
//       String x =  build(s); // [f];
        System.out.print(x);
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
//        We can use String.valueOf(stack) to convert the stack of characters into String.
    }
}



<!-- using StringBuilder -->


package Try;
import java.util.*;
public class BackSpaceStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        String t = sc.next();
    boolean output = sb(s).equals(sb(t));
    System.out.print(output);
    }
    private static String sb(String s){
        StringBuilder sbr = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                sbr.append(ch);
            }else if(sbr.length()!=0){
                sbr.deleteCharAt(sbr.length()-1); // index.
            }
        }
        return sbr.toString();
    }
}



