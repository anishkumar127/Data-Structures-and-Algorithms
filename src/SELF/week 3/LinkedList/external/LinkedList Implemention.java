package LinkedList.Course;
/*
10 2k  20 3k 30 4k 40 5k 50 null
1k     2k    3k    4k     5k

int 10 20 30 40 50.   // this is int type data.
1k 2k Node type of class type store address. Next.  // this is node type class which have two property. data and next.

temp.data = 10.  // temp data is 10. its int type.
temp.next = 2k.  // temp.next is storing the address of next node.
temp.next.data=20.  // here we can check temp.next address what value is stored. wo we can check next value is temp is 20.


- we have to know starting node. and we have to store first node.
- when we get first node starting node, then we know all the node.
- 1k store .  1k is Node type.
- so Node  head= 1k.   head is variable name.

- create inner class. and create private class. so that only that class access not outsider can't access the class.
- we don't create outside the class. because client class can access and make object of or new this.
- so we don't create default.
- only that class access so we create inside the linkedlist class.

- - we use tail. if we use tail then most of operation become O(1). time complexity.
- - we use also use size. get size of linked list node.
**/
public class LinkedListImplementation {

    private class Node {     // private because client class not able to new it class.
        int data;
        Node next;
    }

    private Node head;      // make private, because client class can't access or make it new and change it.
    private Node tail;
    private int size;


    public void display() {

        Node current_node = head;
        while (current_node != null) {
            System.out.print(current_node.data + " -> ");
            current_node = current_node.next;
        }
        System.out.print("null");


/*  --  theory part to traverse linked list. print linked list. --

 this.head; because i intensially want to this head. this.head means class head. i don't want parameter head.
  if we do only head then its not create problem if only one head.
  if there are many head then it will create problem.

Node temp = 1k
     temp = head;
      temp = 1k.
      sout (temp.data); get temp data.
      temp = temp.next is equal to when we do i++; in for loop. its similar to for loop. we just increament.
      2k = 1k.next.  2k = 2k.
     - creating the loop we do condition until head or temp pointing to null.
      - we use temp because we don't want to change our head.
* */
    }

    // add last.
    public void addLast(int item) {
        // create a new node.
        Node newNode = new Node();   // creating empty new node.
        newNode.data = item;             // put data into newNode.
        newNode.next = null;              // pointing to next null of newNode.

        // attach.
        if (size >= 1) {
            tail.next = newNode;
        }
        // summary object updation. this will update 2 way if size 0 or size 1 or >.
        if (size == 0) {
            // adding first time Node.
            head = newNode;
            tail = newNode;
            size++;
        } else {          // if size not 0;
            tail = newNode;     // tail pointing to new node.
            size++;
        }
/*
heap -   summary object.
 - head = null  null because class.
 - tail = null
 - size = 0;  // because of integer.

stack.
its store address. 1k , 2k memory address. and 2k address pointing to heap.


addlast(10);  if head and tail both null. then put
10 store in node class. create node class 10.

// new Node creation.
10k  data =0 ; next = null default value  Node nn = new Node();
nn.data = 10;
10k   data=10; next =null;

summary object. update.
- because before head and tail both pointing to null.
then we put 10 on it.
so we need to update our summary object. in heap memory.

head will pointing to starting pointing to LL 10. tail also pointing to this.
when LL is null. empty or size 0. so we said point to head nn and tail also to nn.
and size also ++;
head = 10;
tail = 10;
size = 1;

its logic ok when add only 1 node.
if we want add more node then..
head = 10k
tail = 10k
size =1k   // summary object.

do again add last. 20.
create new node. 20,null; we have to create new node. because after that this node we put head.next.

// attach to older node.
left hand side return when we store value return left hand side.
Node nn = new Node(20); return to left hand side.

update tail.
tail.next = nn;
tail.next = 20;

so we also update the tail. now tail should be point to 20k. summary object updation.
tail== nn; tail store nn;
size updated ++;
summary object updation important .

if we have 1 node then we do tail.next if do when size 0 then we do. null.next its will throw null pointer exception.

* */
    }


    // add first
    public void addFirst(int item) {
        // create new node.
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;
        // attach
        if (size >= 1) {            // 10k point to head. then 20 point to head. then 30k point to head.
            newNode.next = head;
        }
        // summary object update.
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            head = newNode;
            size++;
        }

    /*
head =null
tail =null
size = 0;

if size 0
head= 10k
tail  = 10k
size = 1;

   attach ->  we just need to 20k next is 10k. like 20k next point to head.

   - create new node.
   - attach if(size>=1) newNode.next  = head;
   - summary object update.
   if(size>=1)
   h=nn;   -> head point to newNode. but we don't update tail node. tail will be tail node. we just update head.
   size++;
   else size=0;
   head =nn;
   tail =nn;
   size++;
    * */
    }


    // get first
    public int getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("LL is empty!");
        }
        return head.data;

        /*
         *  get the first element of node. if not then print ll is empty.
         *  throw new exception use for throw the exception.
         *  is become danger function.
         * */
    }


    // getLast
    public int getLast() throws Exception {
        if (size == 0) {
            throw new Exception("LL is empty!");
        }
        return tail.data;
        /*
         tail.data; because i know tail point to last element of node.
         and if node is impty then throw exception.
         we have to use size==0 exception if we dont use this.
         then it will throw null pointer exception.
         because tail.data = null;  if size 0;
         if we use tail then get tail Time complexity is O(1);
         if we don't use tail then we have to traverse and
         the TC will be O(n);

         */

    }


    // get At
    public int getAt(int idx) throws Exception {

        if (size == 0) {
            throw new Exception("LL is empty!");
        }
        if (idx < 0 || idx >= size) {
            throw new Exception("Invalid Index");
        }

        Node current_node = head;
        for (int i = 1; i <= idx; i++) {   // break loop when i reached equal to idx. and after that that idx point and we return it.
            current_node = current_node.next;
        }
        return current_node.data;   // pointing to that idx which i wanted. so return this.

       /*
    - we given particular index.
    index - 10
    index 1 = 20;
    if index > size exception throw. because index we are searching not present in LL.
        if index <0 assume idx we want in -1 minus that will be the wrong.
        if idx> then will be the error. or == also will be the error.
        idx starting 0 to n
        and and size is 4;
        and idx we getting 4. but 4 not present because index start from 0 1 2 3
         so it will be wrong.


     */
    }


    private Node getNodeAt(int idx) throws Exception {
        if (size == 0) {
            throw new Exception("LL is Empty!");
        }
        if (idx < 0 || idx >= size) {
            throw new Exception("Invalid Index");
        }
        Node current_node = head;
        for (int i = 1; i <= idx; i++) {
            current_node = current_node.next;
        }
        return current_node;
    /*
    get at return the idx. and idx data.
    but get Node at return the entire node .
    idx 2 means return 30 40k

    function should be private. because its returning node.
    if we use public client get address of node.

        // this only use linked list other function only. can't use in client class.
     */
    }

    // add node at idx.
    public void addAt(int item, int idx) throws Exception {

        if (idx < 0 || idx > size) throw new Exception("Invalid Index");
        if (idx == 0) {
            addFirst(item);
        } else if (idx == size) {
            addLast(item);
        } else {
            // create new node.
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;

            // attach.
            Node previous_node = getNodeAt(idx - 1);
            Node next_node = previous_node.next;   //getNodeAt(idx); // current index. OR previous_node.next

            previous_node.next = newNode;
            newNode.next = next_node;

            // summary object update. // we inserting at middle so no head effect no tail effect.
            size++;

        }

    /*

    // we use function getNode at. we get node. getNodeAt function return complete node.

    if  we want to insert at node 3.
    then we get first node 2.
    idx 3 want to insert.
    so getNodeAt(idx-1); we get 2.

    ex. setting the address.
    nm1 = getNodeAt(idx-1); // idx 2 get.
    nb1 = nm1.next ; we also get this using getNodeAt(idx); we don't do idx+1; only getNodeAt(idx) we do.
    nm1.next = newNode;
    newNode.next = np1;

   insert 60d
   nm1 = 2;  30d
   np1(3) =  2.next  ;  40d
   now we set. nm1(2).next = 60d;
   60d.next = np1(3);

   so first get previous index.
   then get currentold index.
   both address get. store in variable.
   then first .next is new node.
   new node next. is currentold node idx.


   if size is 3. and indxing is 0 1 2
   if user said put index 3. then means user want to add last.
   we throw exception when index is greater then size. idx>size throw exception.
   size equal means add last.
   if idx < 0 throw exception.

   if idx 0; then add first.

   Tc worst case O(n); getNOdeAt function using loop.

     */
    }

    // remove first.
    public int removeFirst() throws Exception {

        if(size==0) throw new Exception("LL is empty!");

        // store head. which will be going to remove.
        int removed = this.head.data;
        if(this.size==1){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }else{
            this.head = this.head.next;
            this.size--;
        }
        return removed;

    /*
    remove first  return the value.
  - -   Time complexity will be O(1);

   head.next will become new head. then first will removed.
   and we also need to return removed head.
   so we capture this head.   int removed = head.data; ->10;
   20k new head.
   head = head.next 20k will become new head.

   tail will not change. because we only removed first.

   if we have only node we do removed first.
   head pointing to 10k and tail also pointing to 10k because of one node.

   in this size --; because we remove node.
   if size ==1  then my head become null and tail become null.
   size become =0;

    exception if size is 0 and we do remove first then t should throw exception.

     */

}

//      removed last. Tc O(n);
    public int removeLast() throws Exception{

         if(size==0){
             throw new Exception("LL is empty!");
         }
         int removed = tail.data;  // captured.

        // summary object updation.

        if(size==1){
            head=null;
            tail =null;
            size =0;
        }else{
            Node previous_node= getNodeAt(size-2);
            tail = previous_node;  // now tail is previous node.
            tail.next= null;       // and tail next now null. wo last node removed.
            size--;
        }
        return removed;
    /*
     removed tail node.
     so size will be  size--;
     or we store  tail.data which are going to remove. we capture it. which we need to return.

     head not change tail change.

     we can do using getNodeAt(size-2);
     size-1 means last node.
     size -2 means second last node.
     so getNodeAt return second last node.

        if we have only one node.
        10k
        head pointing to  10k tail pointing to 10k size 1.
        head =null tail = null size = 0;

        TC will be O(n) because we doing getNodeAt and getNodeAt use loops for getting the node.
     */
    }

    public static void main(String[] args) throws Exception {
        LinkedListImplementation list  = new LinkedListImplementation();
        list.addLast(10);
        list.addLast(20);
        list.display();
        System.out.println();
        list.addFirst(30);
        list.display();
        System.out.println();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAt(1));
        System.out.println(list.getNodeAt(2));  // this only can use linkedlist inside function.
        list.addAt(100,2);
        list.display();
        System.out.println();
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
    }

}

