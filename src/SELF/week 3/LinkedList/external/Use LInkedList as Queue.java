package LinkedList.Course;

public class LinkedListAsQueue {
    /*
    Q. how to use linkedlist as a queue?

    front -> 20 -> 30 -> 40 -> 50 -> 60 - 70


    head 10 20 30 40tail X
    enqueue = 50.
    addLast
    10 20 30 40 50tail X

  ->  we use addLast method in Queue.
    enqueue -> O(1);  addLast in LinkedList.
    dequeue -> O(1);  removeFirst in LinkedList.
  -> we use removeFirst method in dequeue.

    front -> O(1);   getFirst in LinkedList.
  -> we use getFirst method in front -> getFirst();

  size-> O(1);     size of linkedList() method.
  isEmpty-> O(1); is linked list empty or not method.
  display -> O(n);  linkedList display method.

     */

    // code
        private LinkedListImplementation queue;
        // constructor.
        public LinkedListAsQueue(){
            this.queue = new LinkedListImplementation();
        }

        public int size(){
            return this.queue.size();

        }
        public boolean  isEmpty(){
            return this.queue.isEmpty();
        }
    public void enqueue(int data){
            this.queue.addLast(data);
    }
    public int dequeue() throws Exception{
        return  this.queue.removeFirst();
    }
    public int front() throws Exception{
      return this.queue.getFirst();
    }
    public void display(){
            this.queue.display();
    }

    public static void main(String[] args)throws Exception {
        LinkedListAsQueue queue = new LinkedListAsQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.front());
    }
}
