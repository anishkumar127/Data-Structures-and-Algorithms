import java.util.*;
// input: ()[]{} : output: true.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      
      Stack<Character> stack = new Stack<>();
     
      // string Character process. 
      for(char c: s.toCharArray()){
        if(c=='(' || c=='[' || c =='{'){
          stack.add(c);
        }else{
          // ) if closing brackets comes but stack is empty then return false. 
          if(stack.isEmpty()){
            // return false;
             System.out.print("false");
             return;
          }
          // if closing ) brackets comes but opening brackets is not ( same then its false. different opening brackets.
          // stack top not opening brackets of that closing brackets then false.
          if(c==']' && stack.peek()!='[')  System.out.print("false"); //return false;
          if(c==')' && stack.peek()!='(')  System.out.print("false"); //return false;
          if(c=='}' && stack.peek()!='{')  System.out.print("false"); // return false;
          
          // pop when we find perfect match. starting and closing brackets. then pop it starting brackets.
          stack.pop();
        }
      }
      
      // if stack not empty that means its not valid parentheses. return false. if it is valid then return true. 
      // return stack.isEmpty(); 
       System.out.print(stack.isEmpty());
  }
}


/*
take care edge cases 
 input ] ()  //  starting is closing bracket. so its false.
 input [ ()  //  [  not closing so its also false. 
 
 Time Complexity : O(n);
 Space Complexity : O(n); // because using stack. 
 
 Stack :- FIFO: First In Last Out. 
 
  - in which we check when ) break comes we check in stack exists  ( starting brackets or not. 
  - if exists then we remove starting brackets (). then we assume that pair complete. 
  - we check closing ) brackets comes and no starting ( brackets that's means not valid parentheses. 
  

*/



// leetcode  1ms

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                if(c==']' && stack.peek()!='[') return false;
                if(c==')' && stack.peek()!='(') return false;
                if(c=='}' && stack.peek()!='{') return false;
                
                // all good then 
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}


// 2-3 ms 

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       for(int i =0; i<s.length(); i++){
           if(i==0 || stack.size()==0){
               stack.push(s.charAt(i));
               continue;
           }
           if(s.charAt(i)==')' && stack.peek()=='('|| s.charAt(i)==']' && stack.peek()=='['
              || s.charAt(i)=='}' && stack.peek()=='{')
           {
               stack.pop();
           }else{
               stack.push(s.charAt(i));
           }
       }
         return stack.size() == 0;
    }
   
}



// 7 ms  
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       for(int i =0; i<s.length(); i++){
           if(stack.empty()){
            stack.push(s.charAt(i));
           }else if(stack.peek() == '(' && s.charAt(i)==')'){
               stack.pop();
           }else if(stack.peek() == '{' && s.charAt(i)=='}'){
               stack.pop();
           }else if(stack.peek() == '[' && s.charAt(i)==']'){
               stack.pop();
           }else{
               stack.push(s.charAt(i));
           }
       }
        return stack.empty();
    }
   
}


// functional production ready.


public boolean isValid(String s) {

    Stack <Character> sk = new Stack<>();
    int n = s.length();
    
    for(int i=0; i<n ; i++){
        char x = s.charAt(i);
        
        if(isTrue(x)){
            sk.push(x);
        }
     
        else if(!sk.isEmpty() && isEndValid(x, sk.peek())){
            
            sk.pop();
        }
        else {
            return false;
        }
    }
    return sk.isEmpty();
    
}

static boolean isTrue(char ch){
    // check is char is isvalid brackets
    
    return (ch == '{' || ch == '(' || ch=='[');
    
}

static boolean isEndValid(char end, char start){
    
    // valid opening bracket for closing bracket
    
    return ((start == '{' && end == '}') ||
           (start == '(' && end == ')')||
           (start == '['  && end == ']'));
}

}



// using REGEX Tc O(n^2) 

public class Solution {
    public boolean isValid(String s) {
        int length;
    
        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while(length != s.length());
    
        return s.length() == 0;
    }
}


/**
 * Using Stack. Space Optimized solution with early exit conditions.
 *
 * Time Complexity: O(N)
 *
 * Space Complexity: O(N/2 + 1) = O(N)
 *
 * N = Length of input string.
 */
class Solution {
    public boolean isValid(String s) {
        // If the length is odd, return false
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        int sLen = s.length();
        if (sLen == 0) {
            return true;
        }

        // First Char cannot be closing bracket
        char firstChar = s.charAt(0);
        if (firstChar == ')' || firstChar == '}' || firstChar == ']') {
            return false;
        }
        // Last Char cannot be open bracket
        char lastChar = s.charAt(sLen - 1);
        if (lastChar == '(' || lastChar == '{' || lastChar == '[') {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < sLen; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }

            // Since there are more characters in stack than remaining characters in S, we
            // can early exit.
            if (stack.size() > sLen - i) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}


// hashmap with stack.


class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> mappings = new HashMap<Character,Character>(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Stack<Character> letters = new Stack<>();
		
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(mappings.containsKey(temp)){
                if(letters.isEmpty() || letters.pop() != mappings.get(temp)){
                    return false;
                }
            } else{
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }
}




// substring || indexOF

public boolean isValid(String s) {
            while (s.indexOf("{}") !=-1 || s.indexOf("[]") !=-1 || s.indexOf("()") !=-1 ){
        s=s.replace("()","");
        s=s.replace("[]","");
        s=s.replace("{}","");
        
    }
    return s.isEmpty();
}





public boolean isValid(String s) {
    Stack stack = new Stack<>();
    String left = "([{";
    String right = ")]}";

    for (char c : s.toCharArray()) {
        if (left.indexOf(c) > -1) {
            stack.push(c);   
        } else if (stack.empty() || left.indexOf((char) stack.pop()) != right.indexOf(c)) {
            return false;
        }
    }

    return stack.empty();
}



// string builder 

StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(')
                b.append(')');
            else if (c == '{')
                b.append('}');
            else if (c == '[')
                b.append(']');
            else if (b.length() == 0 || b.charAt(b.length() - 1) != c) {
                return false;
            } else b.replace(b.length() - 1, b.length(), "");

        }
        return b.length() == 0;



