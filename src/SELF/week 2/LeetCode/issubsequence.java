// 2ms leetcode .

// Tc O(len(S+T))  Sc O(1)
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true; 
        if(s.length()>t.length()) return false; // abc if greater then t="ahbgdc" like t="ab"; return false.
        int FirstStringStart =0;
        int SecondStringStart =0; // it is starting point of second string.
        // two pointer approach.
        while(FirstStringStart < s.length() && SecondStringStart<t.length()){
            if(s.charAt(FirstStringStart)==t.charAt(SecondStringStart)){
                    FirstStringStart++; // if match start increased.
            }
                
                SecondStringStart++; // second string start always increase. always increase 
        }
        return (FirstStringStart==s.length());
    }
}


// best naming variables.
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true; 

        if(s.length()>t.length()) return false; // abc if greater then t="ahbgdc" like t="ab"; return false.

        int s_pointer =0;
        int t_pointer =0; // it is starting point of second string.
        // two pointer approach.
        while(s_pointer < s.length() && t_pointer<t.length()){

            if(s.charAt(s_pointer)==t.charAt(t_pointer)){
                    s_pointer++; // if match start increased.
            }
                
                t_pointer++; // second string start always increase. always increase 
        }
        return (s_pointer==s.length());
    }               
}


//1 ms

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(s.length()>t.length()) return false;
        int s_pointer=0;
        int t_pointer=0;
        while(s_pointer<s.length() && t_pointer<t.length()){
            if(s.charAt(s_pointer)==t.charAt(t_pointer)){
                s_pointer++;
                if(s_pointer==s.length()) return true;
            }
            t_pointer++;
        }
        
        return false;
    }
}


// edge cases.
if(s.length() > t.length()) return false;
if(s.length() == 0 && t.length() !=0 ) return true;
if(s.length() != 0 && t.length() ==0 ) return false;
if (s.length() == 0) return true;
if (t.length() == 0) return false;





// with all edge cases 92% faster 1ms

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        if(s.length() == 0 && t.length() !=0 ) return true;
        if(s.length() != 0 && t.length() ==0 ) return false;
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        int s_pointer=0;
        int t_pointer=0;
        while(s_pointer<s.length() && t_pointer<t.length()){
            if(s.charAt(s_pointer)==t.charAt(t_pointer)){
                s_pointer++;
                if(s_pointer==s.length()) return true;
            }
            t_pointer++;
        }
        
        return false;
    }
}





