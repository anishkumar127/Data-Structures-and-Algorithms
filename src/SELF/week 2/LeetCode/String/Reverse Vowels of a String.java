import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      sc.close();
      
    List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
    int start =0;
    int end = s.length()-1;
    
    // convert String to character array. 
    char[] ch = s.toCharArray();
    while(start<end){
      if(!list.contains(ch[start])){ // if not found vowels. start increase.
        start++;
      }
      if(!list.contains(ch[end])){ // if not found vowels. end decrease.
        end--;
      }
      
      if(list.contains(ch[start]) && list.contains(ch[end])){ // if found then swap both.
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
        start++;
        end--;
      }
    }
    // System.out.print(Arrays.toString(ch));
    for(char x:ch){
      System.out.print(x);
    }
  }
}


// 30 ms 

class Solution {
    public String reverseVowels(String s) {
    List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        int start =0; 
        int end = s.length()-1;
        
        // convert string to character array.
        char[] ch = s.toCharArray();
        
        while(start<end){
            if(!list.contains(ch[start])) start++; // if vowels not found start increase.
            if(!list.contains(ch[end])) end--; // if vowels not found end decrease.
            if(list.contains(ch[start])&& list.contains(ch[end])){ // if found then both swap.
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch); // return new string. 
    }
}


// Time:O(N)
// Space: constant( we are adding vowels to hashmap which is fix So in Big O notation it is constant)

// hashset 4ms

class Solution {
    public String reverseVowels(String s) {
    HashSet<Character> vowels = new HashSet<>();
        
        // PUSH TO HASHSET ALL VOWELS
        vowels.add('a'); vowels.add('A');
        vowels.add('e'); vowels.add('E');
    	vowels.add('i'); vowels.add('I');
	    vowels.add('o'); vowels.add('O');
	    vowels.add('u'); vowels.add('U');
        
        // Convert String to character Array.
        char[] ch = s.toCharArray();
        int start =0; 
        int end = s.length()-1;
        
        while(start<end){
            while(start<end && !vowels.contains(ch[start])) start++;
            while(start<end && !vowels.contains(ch[end])) end--;
            
            char temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
            // start++;
            // end--;
        }
        
        return new String(ch); // return new String.
        
    }
}


// hashset 11 ms 

class Solution {
    public String reverseVowels(String s) {
    HashSet<Character> vowels = new HashSet<>();
        
        // PUSH TO HASHSET ALL VOWELS
        vowels.add('a'); vowels.add('A');
        vowels.add('e'); vowels.add('E');
    	vowels.add('i'); vowels.add('I');
	    vowels.add('o'); vowels.add('O');
	    vowels.add('u'); vowels.add('U');
        
        // Convert String to character Array.
        char[] ch = s.toCharArray();
        int start =0; 
        int end = s.length()-1;
        
        while(start<end){
            
             if(!vowels.contains(ch[start])){ // if not found vowels. start increase.
                 start++;
                }
             if(!vowels.contains(ch[end])){ // if not found vowels. end decrease.
                 end--;
                }
      
            if(vowels.contains(ch[start])  && vowels.contains(ch[end])){ // if found then swap both.
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        
        return new String(ch); // return new String.
        
    }
}

// 9 - 15 ms hashset. 


class Solution {
    public String reverseVowels(String s) {
    HashSet<Character> vowels = new HashSet<>();
        
        // PUSH TO HASHSET ALL VOWELS
        vowels.add('a'); vowels.add('A');
        vowels.add('e'); vowels.add('E');
    	vowels.add('i'); vowels.add('I');
	    vowels.add('o'); vowels.add('O');
	    vowels.add('u'); vowels.add('U');
        
        // Convert String to character Array.
        char[] ch = s.toCharArray();
        int start =0; 
        int end = s.length()-1;
        
        while(start<end){
            
             if(start<end && !vowels.contains(ch[start])){ // if not found vowels. start increase.
             start++;
      }
      if(start<end && !vowels.contains(ch[end])){ // if not found vowels. end decrease.
        end--;
      }
      
      if(start<end && vowels.contains(ch[start]) && start<end && vowels.contains(ch[end])){ // if found then swap both.
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
        start++;
        end--;
      }
        }
        
        return new String(ch); // return new String.
        
    }
}


// functional  solution 

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length-1;
        
        while(left <= right) {
            if(isVowel(arr[left]) && isVowel(arr[right])) {
                swap(arr, left, right);
                left++; 
                right--;
            } else if(!isVowel(arr[left])) {
                left++;
            } else {
                right--;
            }
        }
                      
        return String.valueOf(arr);
    }
                      
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



// functional solution.

class Solution {
    public String reverseVowels(String s) {
        
        char[] ltrs = s.toCharArray();
        
        // two pointers
        int left = 0, right = s.length() - 1;
        while (left < right) {
            
            boolean leftV = isVowel(s.charAt(left)), rightV = isVowel(s.charAt(right));
            
            if (leftV && rightV)
                swap(ltrs, left, right);
            else if (leftV)
                left--;
            else if (rightV)
                right++;
            
            left++;
            right--;
        }
        
        return new String(ltrs);
    }
    
    public void swap(char[] ltrs, int left, int right) {
        char tmp = ltrs[left];
        ltrs[left] = ltrs[right];
        ltrs[right] = tmp;
    } 
    
    public boolean isVowel(char c) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        for (char vow : vowels)
            if (c == vow)
                return true;
        
        return false;
    }
}


// hashset 
class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() < 2) return s;
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        while(left < right){
            if(!vowels.contains(ch[left])) left++;
            else if(!vowels.contains(ch[right])) right--;
            else{ //(left < right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(ch);
    }
}
