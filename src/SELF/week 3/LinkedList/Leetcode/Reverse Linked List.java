// using stack. Tc O(N) SC O(n):;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
     
       Stack<Integer> valueStack = new Stack<>();  // creating new stack.
        
        while(head!=null){                        // pushing value into stack until head not null.
            valueStack.push(head.val);
            head   = head.next;
        }
        
        ListNode reversedList = new ListNode(Integer.MIN_VALUE);      // creating minus infinity linkedlist.
        ListNode pointer = reversedList;                              //  minus infinity starting pointer.
        
        while(!valueStack.isEmpty()){                                  // pop from stack until stack not empty();
            pointer.next = new ListNode(valueStack.pop());             // putting pop() value into pointer.next.
            pointer = pointer.next;                                   // move forward the pointer.
        }
        
        return reversedList.next;                              // reversedList pointing to minus infinity so we return next. to point value.
    }
 
}








// TC O(n)  SC O(1); /

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
     
      if(head==null) return null;
      if(head.next==null) return head;
        
        ListNode currNode = head;
        ListNode prevNode = null;
        
        while(currNode!=null){
            ListNode nextNode = currNode.next;   
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        
        head = prevNode; // head pointing to head of the linked list.
        return head;
        
    }
 
}



























// theory part.
//  1 2 3 4 5
     
//      5 4 3 2 1
//      current 1 
     
//      1 next 2 
     
     
//      1.next = null
     
//      2. next = 1
//      3.next 2.
//      4. next 3.
//      5. next 4.

// current .next = current.next.next;


/*
public ListNode reverseList(ListNode head) {
        ListNode prevHead = null;
        while(head != null){
            // 2 | 3 | 4 | 5 | null
            ListNode recordNext = head.next;  
            // null | 1 | 2 | 3
            head.next = prevHead;
            // 1 | 2 | 3 | 4
            prevHead = head;
            // 2 | 3 | 4 | 5
            head = recordNext;
        }
        return prevHead; 1 2 3 4 
    }


 1 2 3 4 5
     5 4 3 2 1 
     
     */
     