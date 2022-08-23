
// 1ms 
class Solution {
    public String reverseOnlyLetters(String s) {
        int s_pointer= 0;
        int e_pointer=s.length()-1;
        char ch [] = s.toCharArray();       // converted into character Array.
        while(s_pointer<e_pointer){
            if(!Character.isLetter(ch[s_pointer])){   // if not character then start increament ++;
                s_pointer++;
                continue;               // nothing continue forward.
            }
            if(!Character.isLetter(ch[e_pointer])){   // if not character then end decrement --;
                e_pointer--;
                continue;           // nothing continue forward.
            }
            // swap if character found. 
            char c = ch[s_pointer];
            ch[s_pointer] = ch[e_pointer];
            ch[e_pointer] = c;
            //  start++ end --; after above every process.
            s_pointer++;
            e_pointer--;
        }
        return new String(ch);
    }
}



// 1 ms 

class Solution {
    public String reverseOnlyLetters(String s) {
        int s_pointer= 0;
        int e_pointer=s.length()-1;
        char ch [] = s.toCharArray();       // converted into character Array.
        while(s_pointer<e_pointer){
            if(!Character.isLetter(ch[s_pointer])){   // if not character then start increament ++;
                s_pointer++;
                           // nothing continue forward.
            }
            else if(!Character.isLetter(ch[e_pointer])){   // if not character then end decrement --;
                e_pointer--;
                         // nothing continue forward.
            }
           else{
               
           // swap if character found. 
            char c = ch[s_pointer];
            ch[s_pointer] = ch[e_pointer];
            ch[e_pointer] = c;
            //  start++ end --; after above every process.
            s_pointer++;
            e_pointer--;
         } 
        }
        return new String(ch);
    }
}




// functional and external string check. 

class Solution {
    public String reverseOnlyLetters(String s) {
        int s_pointer= 0;
        int e_pointer=s.length()-1;
        char ch [] = s.toCharArray();       // converted into character Array.
        while(s_pointer<e_pointer){
          
            // if not character then forward pointer.
            while(s_pointer<e_pointer && !check(ch[s_pointer])) s_pointer++; 
            while(s_pointer<e_pointer && !check(ch[e_pointer])) e_pointer--;
            
            // swap.
            char c = ch[s_pointer];
            ch[s_pointer] = ch[e_pointer];
            ch[e_pointer] = c;
            
            // increment decrement pointer.
            s_pointer++;
            e_pointer--;
        }
        return String.valueOf(ch);
    }
    boolean check(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            return true;
        }
        return false;
    }
}



// functional approach production level.

class Solution {
    public String reverseOnlyLetters(String s) {
        int s_pointer= 0;
        int e_pointer=s.length()-1;
        char ch [] = s.toCharArray();       // converted into character Array.
        while(s_pointer<e_pointer){
          
            // if not character then forward pointer.
            while(s_pointer<e_pointer && !check(ch[s_pointer])) s_pointer++; 
            while(s_pointer<e_pointer && !check(ch[e_pointer])) e_pointer--;
            
            // swap.
            swap(ch,s_pointer,e_pointer);
            
            // increment decrement pointer.
            s_pointer++;
            e_pointer--;
        }
        return String.valueOf(ch);
    }
    boolean check(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            return true;
        }
        return false;
    }
    public void swap(char[] ch, int s_pointer,int e_pointer){
        char temp = ch[s_pointer];
        ch[s_pointer] = ch[e_pointer];
        ch[e_pointer] = temp;
    }
}


// full functional. 

class Solution {
    public String reverseOnlyLetters(String s) {
        int s_pointer= 0;
        int e_pointer=s.length()-1;
        char ch [] = s.toCharArray();       // converted into character Array.
        while(lessthen(s_pointer,e_pointer)){
          
            // if not character then forward pointer.
            while(lessthen(s_pointer,e_pointer) && !check(ch[s_pointer])) s_pointer++; 
            while(lessthen(s_pointer,e_pointer) && !check(ch[e_pointer])) e_pointer--;
            
            // swap.
            swap(ch,s_pointer,e_pointer);
            
            // increment decrement pointer.
            s_pointer++;
            e_pointer--;
        }
        return String.valueOf(ch);
    }
    boolean lessthen(int s,int e){
        return s<e;
    }
    boolean check(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            return true;
        }
        return false;
    }
    public void swap(char[] ch, int s_pointer,int e_pointer){
        char temp = ch[s_pointer];
        ch[s_pointer] = ch[e_pointer];
        ch[e_pointer] = temp;
    }
}






