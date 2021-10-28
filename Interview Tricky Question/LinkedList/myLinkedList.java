import java.util.LinkedList;

public class myLinkedList {

    /*
     * better insertion and better deletion we use LinkedList. 0 index called head
     * in LinkedList. LinkedList use previous reference and next reference.
     * 
     * array or arraylist we use shifting when inserted the element in array. it
     * will take more time. but linkedlist we can do easily using reference.
     * linkedlist use independed object.
     */
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>(); /// intitisial. value not accept linked list.
        n.add(10);
        n.add(20);
        System.out.println(n); // output: [10,20]

        n.addFirst(50);
        n.addLast(100);
        System.out.println(n); // output: [50,10,20,100]

        // size();

        for (int i = 0; i < n.size(); i++) {
            System.out.print(n.get(i) + " "); // output: 50 10 20 100
        }
        System.out.println();
        // indexing elements. adding elements on index.
        n.add(0, 55);
        System.out.println(n); // output: [55, 50, 10, 20, 100]

        // addAll();

        LinkedList<Integer> nn = new LinkedList<>();
        nn.add(11);
        nn.add(22);

        nn.addAll(n);

        System.out.println(nn); // output : [11, 22, 55, 50, 10, 20, 100] from index 0; add first

        n.addAll(nn);
        n.addAll(3, nn); // output: [55, 50, 10, 11, 22, 20, 100] ; from index 3;
        System.out.println(n); // output : [55, 50, 10, 20, 100, 11, 22] from index size()+1; ; add last.

        // indexOf // lastIndexOf
        /*
         * indexOf(55); index 0; indexOf(555); -1; lastIndexOf(55); if 2 index same
         * value then it will show index of last elements.
         */

        // set
        /* n.set(0,550) // output will be 0 index 550. */
    }
}
