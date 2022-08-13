import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    String s1 = "Anish";
    String result = s1.concat(" Kumar");
    
    // String is immutable so we creating new Object.
    
    System.out.println(result); // Anish Kumar
    
    // concat one string end of another string. 
    
    // we can also concat string using + operator.
    
    String result2 = s1+" Kumar";
    System.out.println(result2); // Anish Kumar
    
    // Difference between concat and + operator.
    
    String s2 = null;
    
    String result3 = s2+" Kumar";
    
    System.out.println(result3); // null Kumar
    
    // concat
    
    String result4 = s2.concat(" Kumar");
    
    System.out.println(result4);  // NullPointerException
    
    // if we use concat method we make sure string is not null.
    // if string is null me consider + operator because it add null.
    
    
    // concat string at the end of the string.
    
    // we cann't concat null at the add of the string if we use concat method. throw null pointer Exception.
    // we can add null at the end of the string if we use + operator.
    
    
    
  }
}


Anish Kumar
Anish Kumar
null Kumar

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "<local4>" is null
	at Main.main(Main.java:30)