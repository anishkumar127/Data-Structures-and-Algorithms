// HashSet Basics and Union , intersection , difference operation.
import java.util.HashSet;
/*
*  set Doesn't contain duplicate elements.
*  set -
*   1. union  - contain all set in the set.
* 1,2 U 1 ,2 = 1,2
* 1,2 U 1,2,3 = 1,2,3
*
*   2. Intersection - common both set. value.
*  1,2 uU 1 2 = 1 ,2
* 1 ,2 uU 2,3 = 2
* 1,2 uU 3,4 = 0
*
*   3. Difference - s1 minus s2 , contain all elements s1 only. not s2.
*
*  * * * * *  *  * *
*
*   Set Interface -
*  no contain duplicate elements. at most one null elements.
*
*   HashSet -
*  its the class.
* do override the methods who present in set.
* hashtable stores.
* best -performing implementation.  no guarantees concerning the order of iteration.
*
* */
public class HashSetUse {
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

    System.out.print(set);  // order of iteration not guranteed . it will print random order.
        //output:- [four, one, two, three, five]
        System.out.println();
        //size(). method.
        System.out.print(set.size()); //output:- 5

        System.out.println();
        //duplicate check.
        set.add("one");
        System.out.print("after adding duplicate "+set); // no duplicate elements will be present in the set.

        System.out.println();

        // contains check present or not elements. return true and false.
              System.out.print(set.contains("one")); //output:- true

        System.out.println();
        //containsAll();

        HashSet<String> secondSet = new HashSet<>();
        secondSet.add("one");
        secondSet.add("two");
//
        System.out.print(set.containsAll(secondSet)); //output:- true. because secondSet contains the elements of one ,two who present in the set1.
        // so it will return the true. if there seven ten then it will be false.

        System.out.println();

    // iterate using forEach loop.
        for(String str : set){
            System.out.print(str+" "); //output:- four one two three five
        }
        System.out.println();

 // remove method.

        set.remove("two"); //removing two from the set
        System.out.print(set.remove("five")); //output:- true. it will remove five
        System.out.println();
        System.out.print(set); //output:- [four, one, three]

        System.out.println();
// clear();

//        set.clear(); // it will clear all the elements. it will make set empty.

        // isEmpty(); return true false, and check set is empty or not.

        System.out.print(set.isEmpty()); // output:- false

        System.out.println();
        // operation union , intersection, difference.

    // making two set.

        HashSet<String> listOfBooks = new HashSet<>();

        listOfBooks.add("book 1");
        listOfBooks.add("book 2");
        listOfBooks.add("book 3");
        listOfBooks.add("book 4");
        listOfBooks.add("book 5");

        HashSet<String> listOfTechBook = new HashSet<>();

        listOfTechBook.add("book 1");
        listOfTechBook.add("book 2");
        listOfTechBook.add("book 6");
        listOfTechBook.add("book 7");
        listOfTechBook.add("book 8");

        System.out.println("SET 1: "+listOfBooks); //output:- SET 1: [book 2, book 1, book 5, book 4, book 3]
        System.out.println("SET 2 :"+listOfTechBook); //output:- SET 2 :[book 2, book 1, book 6, book 8, book 7]


        // perform union operation on the set.
// addAll() method.
       listOfBooks.addAll(listOfTechBook); // union operation.
       System.out.print("Union SET "+listOfBooks); //output:- Union SET [book 2, book 1, book 6, book 5, book 4, book 3, book 8, book 7]

        System.out.println();

        // intersection -> retainAll() method
       listOfBooks.retainAll(listOfTechBook); // intersection operation.
       System.out.print("Intersection SET "+listOfBooks); //output:- Intersection SET [book 2, book 1]

        System.out.println();

        // difference -> removeAll() method

        listOfBooks.removeAll(listOfTechBook);
        System.out.print("Difference SET "+listOfBooks); //output:- Difference SET [book 5, book 4, book 3]


    }
}
