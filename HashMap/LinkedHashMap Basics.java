// linked Hash Map Basics

import java.util.LinkedHashMap;

public class HashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
            map.put(1,"one");
            map.put(2,"two");
            map.put(3,"three");
            map.put(4,"four");
            map.put(5,"five");

            System.out.print(map); //output:- {1=one, 2=two, 3=three, 4=four, 5=five}
// get() method. if not present return null. otherwise return value.
        System.out.println();

        System.out.print(map.get(1)); //output:- one

        System.out.println();

        // iteration. forEach Loop.

        for(Integer itrv : map.keySet()){
            System.out.print(itrv); //output:- 12345 key.
            System.out.print(map.get(itrv)+" "); //output:- value, - one two three four five
        }

        System.out.println();
     // duplicate key will override.  in the linkedHasMap also like the hashmap.

     // size(). print

     System.out.print(map.size()); //output:- 5

        System.out.println();

     //clear().method to clear empty the linkedHashMap.

//        map.clear();

        // isEmpty(); method return true false.

        System.out.print(map.isEmpty()); //output:- false;
        System.out.println();

        // values(); only show the values.
        System.out.print(map.values()); //output:- [one, two, three, four, five]

        System.out.println();

        // containsKey(). method return true false. is the key present in the map or not.
        // containsValue(); also return true false.
        System.out.print(map.containsKey(1)); //output: true

        System.out.println();

        System.out.print(map.containsValue("one")); //output:- true

        System.out.println();

        System.out.print(map.remove(1)); //output:- one , one will be deleted.

        System.out.println();
        System.out.print(map); //output:- {2=two, 3=three, 4=four, 5=five}

        System.out.println();

        System.out.print(map.remove(4,"four")); //output: true, it will remove the 4 and return the true.

        System.out.println();

        System.out.print(map); //output:- {2=two, 3=three, 5=five}
    }
}
