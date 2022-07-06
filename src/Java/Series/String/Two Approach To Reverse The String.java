import java.util.*;
// Reverse the string in java.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // String name = "mahadev";
      String name = sc.nextLine();
      String rev="";
      for(int i=name.length()-1; i>=0; i--){
        rev +=name.charAt(i);
      }
      System.out.println(rev); 
    }
}



============================

2nd approach. 



import java.util.*;
// Reverse the string in java.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // String name = "mahadev";
      String name = sc.nextLine();
      
      for(int i=name.length()-1; i>=0; i--){
        System.out.print(name.charAt(i)); 
      }
      System.out.println();
      
    }
}



