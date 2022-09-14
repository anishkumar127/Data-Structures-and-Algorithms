import java.util.*;

public class Main {
    public static void main(String[] args) {
      HashMap<String,Integer> map = new HashMap<>();
      
      // put operation TC O(1);
      map.put("USA",200);
      map.put("India",300);
      map.put("UK",175);
      map.put("China",350);
      System.out.print(map); // {USA=200, UK=175, China=350, India=300}
      
      System.out.println();
      map.put("Sweden",100);
      System.out.print(map); // {USA=200, Sweden=100, UK=175, China=350, India=300}

      System.out.println();
      map.put("India",325);
      System.out.print(map); // {USA=200, Sweden=100, UK=175, China=350, India=325}

      System.out.println();
        
        
        // get operation Tc O(1);
        
        System.out.println(map.get("India")); // 325
        System.out.println(map.get("RASA")); // null
 
      // remove operation TC O(1);
      
      System.out.println(map.remove("USA")); // 200.
      System.out.println(map);  // {Sweden=100, UK=175, China=350, India=325}

      // containsKey operation TC O(1);
      
      System.out.println(map.containsKey("India")); // true 
      System.out.println(map.containsKey("UAE"));   // false.
 
 
 
  }
}