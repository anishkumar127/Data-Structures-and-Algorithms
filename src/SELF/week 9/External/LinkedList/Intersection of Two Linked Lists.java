import java.util.*;

class Main{
	
static Node head1 = null;
static Node head2 = null;


static class Node
{
	int data;
	Node next;
    Node(int x)
	{
		data = x;
		next = null;
	}
}

static Node intersectingNode(Node headA, Node headB)
{
	//write code here
            if(headA ==null || headB==null) return null;
        
        Node a_pointer = headA;
        Node b_pointer = headB;
        
        while(a_pointer != b_pointer){
            
            if(a_pointer ==null){
                a_pointer = headB;
            }else{
                a_pointer = a_pointer.next;
            }
            
            if(b_pointer ==null){
                b_pointer = headA;
            }else{
                b_pointer = b_pointer.next;
            }
        }
        return a_pointer;
}

static void formLinkList(int n,int m,int k,int[] a, int[] b)
{
    head1= new Node(a[0]);
    Node temp =head1;
    int i=1;
    Node need= null;
    while(i<n){       
        temp.next = new Node(a[i]);
        temp=temp.next;
        if(i==k) need = temp;
        i++;
    }

	head2 = new Node(b[0]);
    i=1;
    temp = head2;
    while(i<m){       
        temp.next = new Node(b[i]);
        temp=temp.next;
        i++;
    }
    temp.next=need;
	return;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int t=0;
    t = sc.nextInt();
    while(t-->0){
        head1=null;
        head2=null;
        int n=0,m=0,k=0;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int[] a  =new int[n];
        int[] b  =new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        formLinkList(n,m,k,a,b);
    	System.out.println(Math.abs(intersectingNode(head1, head2).data));
    }
    sc.close();
    return;
}
}



Your are given two linked List consisting of N nodes and M nodes consisting of a common intersection point.

Your task is to find the value of the intersection point of the two linked list.

Input Format
The first line contains the number of test cases.

For each test case: You are given two head pointer for each linked list.

Output Format
For each test case print an integer in a new line, denoting the value of the intersection point.

Example 1
Input

L1: 3 - 6 - 9 - 15 - 30 

L2: 10 - 15 - 30

3
 \
  6
   \
    9    10   
     \  /
      15
      |
          30

Output

15
Explanation

The value of the intersection node is 15. Thus answer is 15

Example 2
Input

L1: 1 - 2 - 3 - 4 - 5

L2: 3 - 4 - 5

1
 \
  2
   \
    3    3   
     \  /
      4
      |
           5

Output

4
Explanation

The value of intersection node is 4. Thus answer is 4.

Constraints
1 <= T <= 10

1 <= N <= 10000

1 <= M <= 10000

1 <= L1[i] <= 100000

1 <= L2[i] <= 100000