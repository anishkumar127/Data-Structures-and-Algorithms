import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      String s1 = "Anish";
      
      // chartAt() ; // method take index as a parameters.
      
      // it will return Character. and we will store in Character datatype variable.
      // 4th index is h.
      
      char ch = s1.charAt(4);
      System.out.println(ch);  // h 
      
      
      // if index greater then length. or index not present.
      // it will throw Exception.
      // it will throw String index out of range : 5 Exception.
      
      char ch1 = s1.charAt(5);
      System.out.println(ch1);  // String index out of range: 5
      
      
      //   space also consider as a index.
      
      String s2  = "Anish Kumar";
      char ch2 = s2.charAt(5);
      System.out.println(ch2); // space
      
      
      
  }
}

Output:

h

Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1515)
	at Main.main(Main.java:21)