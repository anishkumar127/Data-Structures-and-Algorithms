https://leetcode.com/problems/intersection-of-two-linked-lists/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA ==null || headB==null) return null;
        
        ListNode a_pointer = headA;
        ListNode b_pointer = headB;
        
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
}


