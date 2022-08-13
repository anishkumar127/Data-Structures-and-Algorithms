import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    //   .equals()   ----> compare value.
    
    //   == operator ----> compare address/reference.
    
    String s1 = "Anish";
    
    String s2 = "Anish";
    
    // here we are using String Literals.
    // this will go to String Pool area. and point to same object. 
    // whenever we create string Literals so its not create  new object every time.
    
    System.out.println(s1.hashCode()); // 63410449
    System.out.println(s2.hashCode()); // 63410449
     // address s1 and s2 is same.
     // hashCode same. pointing to same object. String pool area.
     
     
    // .equals() method. 
    
    System.out.println(s1.equals(s2)); // true.
  
  //  == operator
    System.out.println(s1==s2);       // true.
   
    
    String s11 = "Anish";
    
    String s22 = "anish";
    // .equals(). 
    System.out.println(s11.equals(s22)); // false.
    // === operator
    System.out.println(s11==s22);       // false.
    
    
    
    
    
  }
}

Output:

63410449
63410449
true
true
false
false

