`` single while loop     ``

```
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\P{Alnum}","");
        int start =0;
        int end  = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

```

``while loop `` 

```
import java.util.*;
/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
  // s = s.toLowerCase();
  s = s.replaceAll("\\P{Alnum}","").toLowerCase();
  int start =0;
  int e = s.length()-1;
  while(start<e){
    if(s.charAt(start)!=s.charAt(e)){
      System.out.print(false);
      break;
    }
    start++;
    e--;
  }
    System.out.print(true);
    sc.close();
    
  }
}
```

`` leet code ``

```
class Solution {
    public boolean isPalindrome(String s) {
      int left = 0;
        int right = s.length()-1;
        while(left<right){
            char c1 = s.charAt(left);
            char c2= s.charAt(right);
            
            if(!Character.isLetterOrDigit(c1)){
                left++;
            }
            else if (!Character.isLetterOrDigit(c2)){
                right --;
            }
            else {
                if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
```


``// using String Buffer``
```
import java.util.*;

// TC O(N) sc O(N);
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     
     s  = s.replaceAll("\\P{Alnum}","").toLowerCase();
     
     StringBuilder str = new StringBuilder();
     
     String rev = new StringBuffer(s).reverse().toString();
     System.out.print(s.equals(rev));
     
  }
}
```


// import java.io.*;

/*
isLetterOrDigit(char ch)

Parameters: The function accepts a single mandatory parameter ch which signifies the character 
to be tested.

Return value: This function returns a boolean value. The boolean value is true if the character is a 
letter or digit else it false
*/
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  
  int left  =0;
  int right = s.length()-1;
  while(left<right){
    char ch1 = s.charAt(left);
    char ch2 = s.charAt(right);
    // if ch1 is not valid then move forward.
    if(!Character.isLetterOrDigit(ch1)){
      left++;
    }
    // if ch2 is not valid move forward.
    else if(!Character.isLetterOrDigit(ch2)){
      right --;
    }
    
    // otherwise compare.
    
    else{
      if(Character.toLowerCase(ch1) !=Character.toLowerCase(ch2)){
        System.out.print(false);
        return;
      }
      left++;
      right--;
    }
  }
  
  System.out.print(true);
  }
}
```
/*

if you import Java.util.* this means that you import all the classes of the utility package in the program. * means all of the classes are import to this program.

if you import Java.io.* this means that you import all the classes of the input output package in the program.
*/





