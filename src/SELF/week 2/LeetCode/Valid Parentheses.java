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



