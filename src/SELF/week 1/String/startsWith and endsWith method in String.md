import java.util.*;

public class Main {
    public static void main(String[] args) {
     
     // startsWith() and endsWith(); // return boolean answer.
     String s1 = "Anish Kumar";
     
     boolean result = s1.startsWith("A");
     
     System.out.println(result);   // true. 
     
    
     String s2 = "Anish Kumar";
     
     boolean result1 = s2.startsWith("a");
     
     System.out.println(result1);  // false.
    // it is case-sensitive wo it will return false answer. 

    
    String s3 = "Anish Kumar";
    
    boolean result2 = s3.startsWith("Anis");
    
    System.out.println(result2);  // true.
    
    
    String s4 = "Anish Kumar";
    boolean result3  = s4.endsWith("r");
    System.out.println(result3);  // true.
    
   
   
    String s5 = "Anish Kumar";
    
    boolean result4 = s5.endsWith("Kumar");
    
    System.out.println(result4); // true.

    
    String s6 = "Anish Kumar";
    boolean result5 = s6.endsWith("");
    System.out.println(result5); // true.
    
    // if startsWith and endsWith  have "" then it always return true.
    // if startsWith and endsWith have space then it will also return true.
    
    // if string is null it will throw null pointer Exception.
    
    

  }
  
  
}

Output:

true
false
true
true
true
true

