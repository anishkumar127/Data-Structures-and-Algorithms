 346ms  worst run time complexity

    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch: s) stack.push(ch);
        
        for(int i=0; i<s.length; i++){
            System.out.print(s[i]= stack.pop());
        }
    }
}

