import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrList {

    // ArraysList is a class. so we have to create a object.
    public static void main(String[] args) {

        // array list // start
        ArrayList<String> fruits = new ArrayList<>(); // generic is String.

        fruits.add("Apple");
        // fruits.add(22); // not allowed
        System.out.print(fruits);
        // output [Apple];

        ArrayList<Integer> n = new ArrayList<>();
        n.add(20);
        n.add(21);
        // n.add("22"); // string not allowed.
        System.out.print(n); // output [20,21]
        System.out.println();

        // also we can do.
        // Something<String,Integer> s = new Something("hello",212);

        // end

        // LinkedList(); list // start

        List<String> fruits1 = new LinkedList<>();
        fruits1.add("apple1");
        fruits1.add("mango");

        fruits.addAll(fruits1); // add array list and linked list . both combine
        System.out.print(fruits); // output: [Apple, apple1, mango]
        System.out.println();

        // end

        // get ArrayLIst and LInked List // start

        System.out.print(fruits1.get(1)); // mango
        // System.out.print(fruits1.get(3)); will not work // mangoException
        // IndexOutOfBound

        // set in arraylist and linkedlist();

        fruits1.set(1, "banana");
        System.out.println(fruits1); // output: [apple1, banna]

        // remove
        fruits1.remove(1);
        System.out.println(fruits1); // output: [apple1]

        // clear

        fruits1.clear();
        System.out.println(fruits1); // output: [] //nothing all cleared

        // removeAll

        ArrayList toRemove = new ArrayList();
        toRemove.add("apple");
        toRemove.add("hello");
        fruits1.removeAll(toRemove); // [apple , mango];

        // size
        System.out.println(fruits1.size()); // output: 0

        // contains // is it on the list or not true false return

        System.out.println(fruits1.contains("HI")); // output: false
        // isEmpty // check list empty or not . return true or false.

        System.out.println(fruits1.isEmpty()); // output: true. because list is empty bcz we cleared already above the
                                               // code list.

        // convert list to array. toArray();
        // STring type array we will create.
        // we converted string list to array list.
        ArrayList<String> name = new ArrayList<>();
        name.add("anish");
        name.add("kumar");
        name.add("bishnoi");
        System.out.println(name); // output: [anish, kumar, bishnoi]
        String temp[] = new String[name.size()]; // array size. defining
        name.toArray(temp); // putting in temp
        for (String e : temp) { // forEach loop
            System.out.println(e);
            /*
             * output: anish
             *  kumar
             *  bishnoi
             */
        }

    }

}
