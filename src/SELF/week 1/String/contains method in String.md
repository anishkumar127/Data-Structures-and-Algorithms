import java.util.*;

public class Main {
    public static void main(String[] args) {
      // contains() method
      // contains method return true or false. it return boolean
      // it is case-sensitive. capital and small letter matter in this.
      String s1 = "Anish Kumar";
      
      boolean result = s1.contains("sh");
      // it is finding sub-string also.
      System.out.println(result);
      
      String s2 = "Anish Kumar";
      
      boolean result1 = s2.contains("Sh");
      
      System.out.println(result1); // false
      
      String s3 = "Anish Kumar";
      
      boolean result2= s3.contains(" Kumar");
      // its also contains space as well. so return true.
  
      System.out.println(result2);   // true.
      
      
      // if string is null contains show null pointer Exception.
      
      String s4 = null;
      boolean result3 = s4.contains("sh");
      System.out.println(result3);  // null pointer Exception
  
      // contains(null); also throw null pointer Exception 
      
      
      
    }
}

Output:

true
false
true
null pointer Exception.
