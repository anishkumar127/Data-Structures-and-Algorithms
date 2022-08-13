import java.util.*;
// Output:

// s
// B
public class Main {
    public static void main(String[] args) {
    String name = "anishBishnoi";
    char max ='A'; 
    for(int i=0; i<name.length(); i++){
      if(name.charAt(i)>max){
        max = name.charAt(i);
      }
    }
    System.out.println(max);
    
    char min ='Z';
    for(int i=0; i<name.length(); i++){
      if(name.charAt(i)<min){
        min = name.charAt(i);
      }
    }
    System.out.println(min);
  }
}