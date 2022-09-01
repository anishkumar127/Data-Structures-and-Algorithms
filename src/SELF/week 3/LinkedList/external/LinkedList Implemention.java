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

    private class Node{     // private because client class not able to new it class.
        int data;
        Node next;
    }
    private Node head;      // make private, because client class can't access or make it new and change it.
    private Node tail;
    private int size;


    public void display(){

        Node current_node = head;
        while(current_node!=null){
            System.out.print(current_node.data+" -> ");
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
    public void addLast(int item){
        // create a new node.
        Node newNode = new Node();   // creating empty new node.
        newNode.data = item;             // put data into newNode.
        newNode.next = null;              // pointing to next null of newNode.

        // attach.
        if(size>=1){
            tail.next = newNode;
        }
        // summary object updation. this will update 2 way if size 0 or size 1 or >.
        if(size==0){
            // adding first time Node.
            head =newNode;
            tail = newNode;
            size++;
        }else{          // if size not 0;
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
public void addFirst(int item){
        // create new node.
    Node newNode = new Node();
    newNode.data = item;
    newNode.next = null;
        // attach
    if(size>=1){            // 10k point to head. then 20 point to head. then 30k point to head.
        newNode.next = head;
    }
        // summary object update.
    if(size==0){
        head=newNode;
        tail = newNode;
        size++;
    }else{
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
public int getFirst() throws Exception{
        if(size==0){
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
    public int getLast()throws Exception{
        if(size==0){
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
    public int getAt(int idx) throws Exception{

        if(size==0){
            throw new Exception("LL is empty!");
        }
        if(idx<0 || idx>= size){
            throw  new Exception("Invalid Index");
        }

        Node current_node = head;
        for(int i=1; i<=idx; i++){   // break loop when i reached equal to idx. and after that that idx point and we return it.
            current_node= current_node.next;
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


    private Node getNodeAt(int idx) throws Exception{
        if(size==0){
            throw new Exception("LL is Empty!");
        }
        if(idx<0 || idx>=size){
            throw new Exception("Invalid Index");
        }
        Node current_node = head;
        for(int i=1; i<=idx; i++){
            current_node=current_node.next;
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
    }
}

