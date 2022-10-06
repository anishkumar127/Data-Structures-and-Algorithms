// brute force TLE


class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> main = new Stack<>();
        for(char ch:s.toCharArray()){
            Stack<Character> temp_stack = new Stack<>();
            // push value into temp_stack.
            temp_stack.push(ch);
            
            // if main stack peek element is eqal to current value. then pop into main and push into temp_stack.
            
            while(!main.isEmpty() && main.peek()==ch){
                temp_stack.push(main.pop());
            }
            
            // if temp_stack size !=k then pop temP_stack element and push back into main stack.
            
            if(temp_stack.size()!=k){
                while(!temp_stack.isEmpty()){
                 main.push(temp_stack.pop());   
                }
            }
        }
        
        // store main stack value into string builder.
        StringBuilder sb = new StringBuilder();
        while(!main.isEmpty()){
            sb.append(main.pop());
        }
        return sb.reverse().toString();
    }
}