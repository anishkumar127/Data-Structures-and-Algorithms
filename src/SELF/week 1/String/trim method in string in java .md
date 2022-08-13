import java.util.*;

public class Main {
    public static void main(String[] args) {
   
   
   
   String s1 = "Anish Kumar";
   
   System.out.println(s1.trim());
   // remove white spaces from the starting and ending of the string.
   
   String s2 = "   Anish Kumar   ";
   
   System.out.println(s2.trim()); // Anish Kumar.
   // it will remove white space from starting and ending of the String.
   
   
   String s3 = "   Anish     Kumar";
   
   System.out.println(s3.trim()); // Anish   Kumar.
   
   // it will not trim space from the middle and inside the string.
   // it will remove the starting and ending of the string.
   
   
   
   // trim also reduce the length of the striing.
   
   String s4 = "  Anish Kumar   ";
   System.out.println(s4.length());  // 16
   
   String result = s4.trim();
   System.out.println(result.length());  // 11
   
   
   
  }
}


Anish Kumar
Anish Kumar
Anish     Kumar
16
11