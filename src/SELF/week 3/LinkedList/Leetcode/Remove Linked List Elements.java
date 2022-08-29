https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val ==val){            // if single value. and remove head. 
            head = head.next;
        }
        ListNode current_node = head;
       
        while(current_node!=null && current_node.next!=null ){
          
            if(current_node.next.val== val){            // if current next is equal to val. then we skip.
               current_node.next = current_node.next.next;          // skip current.next to current next next.
            }
            
          else  current_node=current_node.next;      // if not want remove then move forward.
        }
      
        return head;
    }
}




// theory part

Hello, what's the difference between using a dummy head and without a dummy head?

 we use dummy node so that we don't lose the reference to the head pointer. What if the head.val is the val which we want to delete? Then our reference will be gone. So we use dummy node to keep track of it.

 "curr" will point to the last node while "head" pointing the first one.