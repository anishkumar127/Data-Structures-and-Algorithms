
// 2ms  leetcode .



class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char current_ch = s.charAt(i);
            
            if(current_ch >='a' && current_ch<='z'){  // checking for if it is letter . do nothing just append to sb.
                sb.append(current_ch);           // its letter so append in sTring builder.
            }else{
                char ch = convert(current_ch,(int)s.charAt(i-1));  // i-1 means previous letter. converted to digit.
                sb.append(ch);  // appending to after converted digit to character.
            }
            
        }
        return sb.toString(); // converted string builder to String.
    }
    public static char convert(char ch , int ascii){  // taking character int and ascii int
         // (ch-'0') ch is character  converted to digit. using 0;  
        int digit = (ch-'0')+ascii;   // current_ch(ch-'0') is 1. + ascii value of a is 97. 1+97 = 98. 
        char character= (char)digit;  // converting digit to character 98 convert to character and it is b.
        return character;
    }
}





//
T/S: O(n)/O(n)

public String replaceDigits(String s) {
	var chars = s.toCharArray();
	
	for (var i = 1; i < chars.length; i += 2)
		chars[i] = (char) (chars[i - 1] + chars[i] - '0');
		
	return new String(chars);
}
This can be simplied to:

public String replaceDigits(String s) {
	var chars = s.toCharArray();
	
	for (var i = 1; i < chars.length; i += 2)
		chars[i] += chars[i - 1] - '0';
		
	return new String(chars);
}




// strinb builder asci value 

class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123){
                sb.append(s.charAt(i));
            } else { //will assume all other values will just be number
                char charToAppend = (char) (Character.getNumericValue(s.charAt(i)) + (int) s.charAt(i - 1));
                sb.append(charToAppend);
            }
        }    
        return sb.toString();
    }
}




class Solution {
    public String replaceDigits(String s) 
    {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                int val = Character.getNumericValue(c);
                int charValue = s.charAt(i-1);
                char next = Character.valueOf((char)(charValue + val));
                sb.append(next);
                    
            }
            else
            {
                sb.append(c);
            }
            
        }
        return sb.toString();
        
    }
}




Most solutions ignore case when given string like z1 or y9. In this case we should round over ascii table.

class Solution {
    public String replaceDigits(String s) {
	    // get chars from source string
        var chars = s.toCharArray();

        // iterate over each odd letter
        for (var i = 1; i < chars.length; i += 2)
		    // shift letter
            chars[i] = shift(chars[i - 1], chars[i] - '0');

        // build answer string
        return String.valueOf(chars);        
    }
    
    private static char shift(char ch, int n) {
	    // roll over ascii table
        return (char) ((ch - 'a' + n) % 26 + 'a');
    }    
}



// if on even position just add it to sb. 
// if on odd position. then change it 1 to character shift.

class Solution {
    public String replaceDigits(String s) {
      StringBuilder str = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(i%2 == 0) str.append(s.charAt(i)); 
			else str.append((char)(s.charAt(i-1)+(s.charAt(i)-'0')));
		}
		return str.toString();
    }
}























// theory part. 


/*
 S is 0 basex indexing. 
 character on even 
  digit on the odd position.
  
  c is character and x is digit.
  
  return character which plus x digit.
  
  ex: shift('a',5)='f'  and shift('x',0) ='x'.
   
   every odd index i,  replace the digit s[i] with shift(s[i-1], s[i])
   return s after replace all . 
   never exceed shift s[i-1],s[i]  to 'z';
   
   s = "a1c1e1"
   
   a+1 = b
   c+1 = d
   e+1  = e
   shift('a',1) = 'b';
   
   
   
   my idea don't know working or not.
   store in hashmap a to z elements.
   check 
   if( a present then iterative loop 1 times.  we got b; 
   c present iterate loop 3 time we got f.
   and then store them into string. 
   at last return. string.
   )
   

*/