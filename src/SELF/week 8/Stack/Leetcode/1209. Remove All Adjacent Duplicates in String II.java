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



// optimal

class Solution {
    public String removeDuplicates(String s, int k) {
        
        // Pair Class =>  Character Frequency    ex. char d , int freq 1.   ->  d,1
        Stack<int[]> main = new Stack<>();  // pair class. using array.
        
        for(char ch:s.toCharArray()){
           
            // check main stack peek character equal to current character. then increase that char frequencuy.
            if(!main.isEmpty() && main.peek()[0]==ch){
                main.peek()[1]++;
                
                // otherwise push char and freq 1.
            }else{
                main.push(new int[] {ch,1});
            }
            
            // if any char frequency equal to k then pop that char.
            if(main.peek()[1]==k){
                main.pop();
            }
        }
        // store main stack value into string builder.
        StringBuilder sb = new StringBuilder();
        while(!main.isEmpty()){
           int[] top = main.pop();
            
            while(top[1]-->0){
                sb.append((char)top[0]);
            }
        }
        return sb.reverse().toString();
    }
}