Converting ArrayList to Array in java



1.

String []dsf = new String[al.size()];
al.toArray(dsf);


2.

List<String> list=new ArrayList<String>();
list.add("sravan");
list.add("vasu");
list.add("raki");
String names[]=list.toArray(new String[list.size()])


3.

List<String> list=new ArrayList<String>();
list.add("sravan");
list.add("vasu");
list.add("raki"); 
String names[]=list.toArray(new String[0]);
if you see the last line (new String[0]), you don't have to give the size, there are time when we don't know the length of the list, so to start with giving it as 0 , the constructed array will resize.




4..


Java does not provide a straightforward solution for this. Lists being a collection of objects, if we need primitives out of it, we need to do it ourselves.

1. Use Stream API

int[] output = ans.stream().mapToInt(Integer::intValue).toArray();
2. Use Google Guava

int[] intArray = Ints.toArray(listOfIntegers);








//
Convert the Java List into Array

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList languages = new ArrayList<>();

    // Add elements in the list
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("ArrayList: " + languages);

    // Create a new array of String type
    String[] arr = new String[languages.size()];

    // Convert ArrayList into the string array
    languages.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {
      System.out.print(item+", ");
    }
  }
}



Example 2: Convert Java Array to List

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

    // create an array
    String[] array = {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(array));

    // convert array to list
    List languages= new ArrayList<>(Arrays.asList(array));

    System.out.println("List: " + languages);

  }
}






Example 1: Convert Array to Set


import java.util.*;

public class ArraySet {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " + set);
    }
}



Example 3: Convert Set to Array


import java.util.*;

public class SetArray {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        String[] array = new String[set.size()];
        set.toArray(array);

        System.out.println("Array: " + Arrays.toString(array));

    }
}


