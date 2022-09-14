import java.util.*;

public class Main {
    public static void main(String[] args) {  
    // Get max freque character.
    String str = "aabbaaabcdda";
    System.out.println(getMaxFreq(str));
  }
  private static char getMaxFreq(String str){
     HashMap<Character,Integer> map = new HashMap<>();
     
     for(int i=0; i<str.length(); i++){
       char ch =str.charAt(i);  // get character which on i index.
       
       if(map.containsKey(ch)){
         // if duplicate found.
         int oldValue = map.get(ch); // get old value.
         int newValue = oldValue+1;  // increament value with +1; and create new updated value.
         map.put(ch,newValue);        // put that key into map and update the value. key Override. and value also Override.
         
       }else{
         // if not containsKey, means no duplicate key then put into map.
         map.put(ch,1); // put character key and value 1.;
       }
     }
     
     // after map created and key and value set into map.
     // now work of finding the max Character.
     
     char maxChar = '\0';  // initially it will be null.
     int max = 0;
     
     // we will create Set and EnterySet. and EnterSet will be set. because map contains unique key. 
     
     // for getting key and value both we use EnterySet.
     
     Set<Map.Entry<Character,Integer>> entries = map.entrySet();
     
     // we set the key character and value Integer into set.
     
     for(Map.Entry<Character,Integer>entry:entries){
       if(entry.getValue()>max){
         max = entry.getValue();
         maxChar = entry.getKey();
       }
     }
     // we traverse over enter set. and check if value is greater then previous value of next value then put into max. 
     // and also put that Character into maxChar which have max value. 
     
     // reutrn maxCharacter.
     return maxChar;
  }
}