https://leetcode.com/problems/add-two-numbers/

// 3ms 

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);           // creating dummy node.
        ListNode current = dummy;                 //  current pointing to 0; dummy node.
        int carry =0;
        
        while(l1!=null || l2!=null){            // if anyone not null.
            int l1_val = l1!=null ? l1.val:0;   //  // if value not null then put l1.val present if not and its null then put fake value 0;
            int l2_val = l2!=null ? l2.val:0;
            int current_sum = l1_val + l2_val + carry;       // current sum of l1 and l2 and carry.
            carry = current_sum/10;                         // getting carry from current_sum /10   10/10 = 1.;
            int last_digit = current_sum%10;                // getting last digit     10%10 = 0;
            current.next = new ListNode(last_digit);        // putting current.next is last digit. is 0;
            current = current.next;                         // current move forward.
            if(l1!=null) l1 = l1.next;                      // move forward l1.
            if(l2!=null) l2 = l2.next;                      // move forward l2.
            
        }
        
        if(carry>0) current.next = new ListNode(carry);         // if carry >0  put current.next is carry node.
        
        return dummy.next;                                  // dummy is pointing to 0. so we return next .
        
    }
}





// 4ms 

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy= new ListNode();
        ListNode current = dummy;
        int carry =0;
        while(l1!=null || l2!=null || carry ==1){
            int current_sum =0;
            if(l1!=null){
                current_sum +=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                current_sum+=l2.val;
                l2=l2.next;
            }
            
            current_sum+=carry;
            carry = current_sum/10;
            int last_digit = current_sum%10;
            ListNode newNode = new ListNode(last_digit);
            current.next = newNode;
            current=current.next;
            
        }
        
        return dummy.next;
        
    }
}

