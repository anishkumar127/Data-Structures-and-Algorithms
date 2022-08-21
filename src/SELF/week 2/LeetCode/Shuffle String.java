


// 1ms 100% faster 

class Solution {
    /*
example: Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
shuffled[4] = s(c);
shuffled[5] = s(o);
shuffled[6] = s(d);
*/
    public String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];  // character array for storing shuffled string.
        
        for(int i=0; i<s.length(); i++){     // traverse on S string.
            shuffled[indices[i]] = s.charAt(i);  // put string s on position of indices array.. 
        }
        
        
        return String.valueOf(shuffled);    // converted character array to string.
    }
}



Algorithm

For each of the index found from indices array assign the character at i position from the string to the index position for the character array, chArray.
return the new String formed from the character array chArray

O(n) - Time and Space

class Solution {
     public String restoreString(String s, int[] indices) {
         char[] chArray = new char[indices.length];
         for (int i=0;i<indices.length;i++)
             chArray[indices[i]] = s.charAt(i);
         return new String(chArray);
     }
}

Cyclic Sort -O(n) Time , O(1) Space

The approach is to position the index found from the indices array at the correct location
loop through the elements of the indices array
continuously swap the characters at index and i and the index of the indices array
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chArray = s.toCharArray();
        int i = 0;
        while (i < indices.length){
            if(indices[i] != i){
                int index = indices[i];
                
				// swap characters
                char temp1 = c[index];
                chArray[index] = chArray[i];
                c[i] = temp1;
                
				// swap indexes
                int temp2 = indices[index];
                indices[index] = indices[i];
                indices[i] = temp2;
            }
            else
                i++;
        }   
        
        return new String(c);
    }
}


//     sArr[] - s.toCharArray(); faster to getting index.   s.charAt(i) method is slow.
// Creating a new array sArr[] and getting the values using index directly was faster than getting the values using charAt() method from string s;

public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            res[indices[i]] = sArr[i];
        }
        return String.copyValueOf(res);
    }



// string builder.

class Solution {
    public String restoreString(String s, int[] indices) {
        // Using StringBuilder beacuse Strings are immutable 
        StringBuilder newStr = new StringBuilder(s);
        for(int i = 0 ; i < indices.length; i++){
            // replacing characters by help of indices given 
            newStr.setCharAt(indices[i], s.charAt(i)); 
        }
        // while returning, we need to convert it to String type because here we need a String as return type but we have Stringbuilder which will not be accepted
        return newStr.toString();
    }
}



// strinng builder.

public String restoreString(String s, int[] indices) {
        StringBuilder str=new StringBuilder();//declare a string builder
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));//asssign some duplicate elements of size of string of your choice
        }
        int j=0;
        for(int i:indices){
            str.setCharAt(i,s.charAt(j++));//assign elements to stringBuilder
            //System.out.println(i+" "+s.charAt(i));
        }
        return str.toString();//return by converting it to string
    }

    

// theory part.

// Cyclic Sort approach is good. Just one thing - toCharArray() has a space complexity of O(n), so overall the space complexity of your cyclic sort solution is O(n) too (same as the earlier solution).

// I agree! And since Strings are immutable in Java, a good question to the interviewer could be whether converting the input String to charArray is considered as a parameter for O(n) space. If not, then it's O(1) because of the immutability concept.

