// https://leetcode.com/problems/linked-list-cycle-ii/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
         if(head==null || head.next==null) return null;
         ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
             if(slow==fast){
                 break;  // detect the loop and break the loop. go outside the loop and start finding cycling.
             }  
        }
        if(fast==null || fast.next==null)   // if anyone is null return null.
            return null;
      
        slow = head; // slow again become head. and fast let it same position.
        while(slow!=fast){  // move pointer until not become == and where slow become equal to fast return the fast.
            slow =slow.next;
            fast = fast.next;
        }
        return slow;
            
    }
}
