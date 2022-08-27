https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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
    public ListNode deleteMiddle(ListNode head) {
        if(head ==null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevOfSlow = null;
        
        while(fast!=null && fast.next!=null){
            prevOfSlow = slow;          // updating the prev node to slow node.
            slow = slow.next;           // move 1 ahead
            fast = fast.next.next;      // move 2 head.
        }
        // slow is the middle node.
        prevOfSlow.next= slow.next;
        return head;
        
    }
}