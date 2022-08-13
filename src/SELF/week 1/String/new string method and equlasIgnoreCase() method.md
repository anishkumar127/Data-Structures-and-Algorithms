import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // new String always create new object.
      // no matter value already present in heap memory area or not.
      // it will create in heap memory area.
      
      String s1 = new String("Anish");
      
      String s2 = new String("Anish");
      
      System.out.println(s1.hashCode()); // 63410449
      
      System.out.println(s2.hashCode()); //  63410449
      
      //   hashCode will be same if we even use new String method.
      
      // .equals method. it will check value. 
      
      System.out.println(s1.equals(s2)); // true.
      
      // == operator. it will compare address. 
      
      System.out.println(s1==s2); // false
      
      //  .equalsIgnoreCase
      // it will ignore smaller or capital it will check value.
      
      String s11 = "Anish";
      String s22 = "anish";
      
      System.out.println(s11.equalsIgnoreCase(s22)); // true.
  }
}

63410449
63410449
true
false
true

