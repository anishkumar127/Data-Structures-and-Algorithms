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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next!=null) return slow.next;
        return slow;
    }
}

/*

brue force can be.

time complexity is O(n); traversing . for counting.
and one more traversal  to rich the middle node.  O(n/2);
so total is   O(n) + O(n/2);  
sc = O(1);
1 2 3 4 5  count it  and  5/2 = 2+1 = 3;
even case 1 2 3 4 5 6   count it and 6/2 = 3+1 = 4;


optimal solution.
tc  O(n/2);
sc  = O(1);
slow and fast method.

1 2 3 4 5 odd case.  = 3.
1 2 3 4 5 6  even case.  = 4. 
*/