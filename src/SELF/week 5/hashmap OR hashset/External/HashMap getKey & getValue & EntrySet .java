import java.util.*;

public class Main {
    public static void main(String[] args) {
      HashMap<String,Integer> map = new HashMap<>();
      
      // put operation TC O(1);
      map.put("USA",200);
      map.put("India",300);
      map.put("UK",175);
      map.put("China",350);
      
      
      // key Set .. for getting the key value in map.
      // return the key 
      // set type of String.
      // set contains only unique value.
      // storing key value into set.
      Set<String> keys = map.keySet();
      
      // forEach for only reading. not changening anything.
      for(String key :keys){
        System.out.print(key+" ");   // USA UK China India 
      }
      
    System.out.println();
    //  getting value from the map. 
    // making Collection not set because value can be duplicate.
    // Collection is Integer because our value is Integer type.
    
    Collection<Integer> values = map.values();
    
    for(Integer value:values){
      System.out.print(value+" "); // 200 175 350 300 
    }
    
    System.out.println();
    
    
    // EntrySet
    // EntrySet use for get key and value both.
    // use set because inside map key will be unique.
    
    Set<Map.Entry<String,Integer>> entries = map.entrySet();
    for(Map.Entry<String,Integer> entry:entries){
      System.out.print(entry.getKey()+" : "+entry.getValue()+" , "); // USA : 200 , UK : 175 , China : 350 , India : 300 , 
    }
    
    
  }
}