import java.util.*;
// find character x in the given String.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // String name = "mahadev";
      String name = sc.nextLine();
      char k = sc.next().charAt(0);
      for(int i=0; i<name.length(); i++){
        
        if(name.charAt(i)==k){
          
       System.out.println("Character found in given String is:"+" "+name.charAt(i));
          return;
        }
       
      }  
      System.out.println("Chracter not found in given String is: "+k);
    }
}
