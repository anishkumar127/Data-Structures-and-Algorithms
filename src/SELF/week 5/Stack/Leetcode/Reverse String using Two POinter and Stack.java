class Solution {
    public void reverseString(char[] s) {
    // int start =0;
    //     int end = s.length-1;
    //     while(start<=end){
    //         char temp = s[start];
    //         s[start] =s[end];
    //         s[end] = temp;
    //         start++;
    //         end--;
        // }
        
        // using statck 
     Stack<Character> st = new Stack<>();
        
     for(char ch:s)st.push(ch);
        
     for(int i=0; i<s.length; i++){
         // System.out.print(st.pop());
         s[i]  = st.pop();
     }
    }
}