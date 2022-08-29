https://leetcode.com/problems/remove-duplicates-from-sorted-list/

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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode current = head;
        while(current!=null && current.next!=null){     // if not null current and current next value. means not single node.
            if(current.next.val == current.val){     // if current next is equal to current node.
                current.next = current.next.next;       // than current next is put current next next node.
            }
             else current = current.next;           // else not equal then move forward.
        }
           return head;                     // return head.
    }
}