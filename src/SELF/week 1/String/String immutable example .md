import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      String s1 = "Anish";
      System.out.println(s1); //output:- Anish
      
      s1.concat("Kumar");
      
      System.out.println(s1); // Anish
      
      System.out.println(s1.concat("Kumar")); // AnishKumar
      
      String s2 = s1.concat("Kumar");
      
      System.out.println(s2); // AnishKumar
      
      // Creating new object instead of modifiying current object.
   
    String s1 = "Anish";
      System.out.println(s1.hashCode()); //output:- 63410449
      
      s1.concat("Kumar");
      
      System.out.println(s1.hashCode()); // 63410449
      
      System.out.println(s1.concat("Kumar").hashCode()); // -794482397
      
      String s2 = s1.concat("Kumar");
      
      System.out.println(s2.hashCode()); // -794482397
      
      System.out.println(s1.hashCode()); // 63410449
      
      // instead of modifiying current Object its creating new object.
      
      // over here we can see there are hashCode of current object and hashCode of newly created temporary object.
      
      // so we can see we not able to change or modifiy the string. so that's why its called sring immutable.
         
  }
}