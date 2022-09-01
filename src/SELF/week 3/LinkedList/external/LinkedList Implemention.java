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

 this.head; because i intensionally want to this head. this.head means class head. i don't want parameter head.
  if we do only head then its not create problem if only one head.
  if there are many head then it will create problem.

Node temp = 1k
     temp = head;
      temp = 1k.
      sout (temp.data); get temp data.
      temp = temp.next is equal to when we do i++; in for loop. its similar to for loop. we just increment.
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

    public static void main(String[] args) {
        LinkedListImplementation list  = new LinkedListImplementation();
        list.addLast(10);
        list.addLast(20);
        list.display();
    }
}

