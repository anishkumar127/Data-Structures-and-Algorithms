import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// hashmap basics. 
// import java.util.*;
public class Main {
    public static void main(String[] args) {
     HashMap<Integer,String>map = new HashMap<>();
     
     /*
     - Integer is the Key;
     - String is the Value; 
     */
     map.put(1,"anish");
     map.put(2,"kumar");
     map.put(3,"bishnoi");
     map.put(4,"raj");
     map.put(5,"anil");
    // map.put(1,"kumar"); duplicate- Override the value. output:- 1=kumar; 
  
     // put - insert the value in the map.
     System.out.print(map); // printing the hash map.
     // output:- {1=anish, 2=kumar, 3=bishnoi, 4=raj, 5=anil}

System.out.println();

// itrate using forEach Loop
for(Integer itrate : map.keySet()){
  System.out.print(itrate); 
  // output:- 12345; print the all the key. 
  
}

System.out.println();
  

// get() method. - take the key and return the vlaue of the key. 

System.out.print(map.get(1)); //output:- anish


System.out.println();

// itrate the key value. 

for(Integer itrate1 : map.keySet()){
  System.out.print(map.get(itrate1)+" "); //output:- value - anish kumar bishnoi raj anil
}


System.out.println();


// Iterator (interface); 
/*
hasNext() - return [ true ] boolean value, if its has more elements. 

next(); - return the next elements in the iteration. throws: NOSuchElementsExeption - if the iteration has no more elements.
*/

/*
entrySet();  - returns set view mapping 
*/

// using Iterator. 

Iterator<Map.Entry<Integer,String>> itrv = map.entrySet().iterator();

// check has more elements or not using while loop. 

while(itrv.hasNext()){
//  itrv.next(); // next() method call. 
Map.Entry<Integer,String> itrv1 = itrv.next();
System.out.print(itrv1); //output:- printing both key and value, - 1=anish2=kumar3=bishnoi4=raj5=anil

System.out.print(itrv1.getKey()+" "+itrv1.getValue()+" "); //output:- single line key and value printing. - 1 anish 2 kumar 3 bishnoi 4 raj 5 anil 

}


System.out.println();

// size() method for print the size of the map.

System.out.print(map.size()); // output:- 5


System.out.println();

// isEmpty(); check the empty or not. return true false.

System.out.print(map.isEmpty()); // output: false;

// clear(); method for clear the all value from the map. 

// map.clear(); 


System.out.println();

System.out.print(map.containsKey(1)); // output: true. containskey is 1 present in the map. 

System.out.println();

System.out.print(map.containsValue("anish")); //output: true; 

System.out.println();

System.out.print(map.remove(1)); //output: anish; anish removed 

System.out.println();

System.out.print(map); //output: after deleted key 1; -  {2=kumar, 3=bishnoi, 4=raj, 5=anil}


    }
}