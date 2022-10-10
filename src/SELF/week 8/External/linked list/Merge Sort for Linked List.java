import java.util.*;
import java.lang.*;
import java.io.*;

class linkedList {
	
  node head = null;
  
  static	 class node {
		int val;
		node next;

		public node(int val)
		{
			this.val = val;
		}
	}
  void push(int new_data)
	{
		node new_node = new node(new_data);
		new_node.next = head;
		head = new_node;
	}

  void printList(node headref)
	{
		while (headref != null) {
			System.out.print(headref.val + " ");
			headref = headref.next;
		}
	}

	node sortedMerge(node a, node b)
	{
		node result = null;
		/* Base cases */
		if (a == null)
			return b;
		if (b == null)
			return a;

		/* Pick either a or b, and recur */
		if (a.val <= b.val) {
			result = a;
			result.next = sortedMerge(a.next, b);
		}
		else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}

	node mergeSort(node h)
	{
		// Base case : if head is null
		if (h == null || h.next == null) {
			return h;
		}

		// get the middle of the list
		node middle = getMiddle(h);
		node nextofmiddle = middle.next;

		// set the next of middle node to null
		middle.next = null;

		// Apply mergeSort on left list
		node left = mergeSort(h);

		// Apply mergeSort on right list
		node right = mergeSort(nextofmiddle);

		// Merge the left and right lists
		node sortedlist = sortedMerge(left, right);
		return sortedlist;
	}
	public static node getMiddle(node head)
	{
		if (head == null)
			return head;

		node slow = head;
        node fast = head;

		while (fast.next != null && fast.next.next != null) 
        {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
public class Main{
	public static void main(String[] args)
	{ 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
      linkedList li =new linkedList();
      for(int i=0; i<n; i++)
        {
          li.push(input.nextInt());
        }
      
		li.head = li.mergeSort(li.head);
      
		li.printList(li.head);
	}
}




Given a linked list of N nodes, the task is to sort the given linked list using Merge Sort.

Input
The first line inputs N ,the size of the linked list.
The second line inputs the value of N nodes of the linked list.

Constraints:
1 <= N <= 10^5

Output
Print the linked list in sorted order using Merge Sort in a new line.

Example
Input:
5
3 5 2 4 1
Output:
1 2 3 4 5