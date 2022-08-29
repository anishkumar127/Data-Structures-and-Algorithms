https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

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
    ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        while(head!=null){
            if(head.next!=null && head.val == head.next.val){
                // skip the nodes whose value are equal to head.
                while(head.next !=null && head.val== head.next.val){
                    head = head.next;        // equal move forward.
                }
                prev.next = head.next;  // put prev next is head.next;   //prev's next point to the head next
            }
             else{
            prev = prev.next;  // move forward if not equal
        }
            head = head.next; // move forward.
        }
       
       return dummy.next;
    }
}

