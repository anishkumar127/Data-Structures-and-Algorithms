import java.util.*;

public class Main {
    public static void main(String[] args) {
     String s = "hello";
     Stack<Character> stack = new Stack<>();
     
     for(char ch:s.toCharArray()) stack.push(ch);
     
     for(int i=0; i<s.length(); i++){
       System.out.print(stack.pop());
     }
     
  }
}