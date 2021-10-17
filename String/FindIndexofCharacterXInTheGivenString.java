import java.util.*;
// find Index of character x in the given String.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // String name = "mahadev";
      String name = sc.nextLine();
      char k = sc.next().charAt(0);
      for(int i=0; i<name.length(); i++){
        if(name.charAt(i)==k){
          System.out.println("Found on Index"+" "+i);
          return;
        }
       
      }   
    }
}
