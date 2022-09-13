
// 7ms


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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null){
            return true;
        }
        ListNode  slow =head;
        ListNode fast=head;
        
        // find the middle
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse the right half.
        slow.next=reverse(slow.next);
        
        // move slow to right half.
        slow = slow.next;
        
        // check for left half and right half equal or not.
        while(slow!=null){
            if(head.val!=slow.val){
                return false;
            }
            head= head.next;
            slow = slow.next;
        }
        
        return true;
    }
    private static ListNode reverse(ListNode head){

    ListNode dummyHead = null;
        while(head!=null){
            ListNode next = head.next; // head next stored.
            head.next= dummyHead;  // head poinnting to now null;
            dummyHead = head ; /// update dummy head;
            head = next ;   // update head now . next is now our head.
        }
        return dummyHead;
    }
}





Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?


