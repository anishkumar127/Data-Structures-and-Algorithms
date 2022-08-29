// https://leetcode.com/problems/delete-node-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode prev = node;       // prev=null;
        while(node.next!=null){       
            node.val = node.next.val;  
            prev = node;                
            node = node.next;         
        }
        prev.next = null;             
        
    }
}

// 0ms  


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        
        // method 1. 
        
        // ListNode prev = node;     
        // while(node.next!=null){       
        //     node.val = node.next.val;  
        //     prev = node;                
        //     node = node.next;         
        // }
        // prev.next = null;         
        
        // method 2.
        
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}



/**
 3 1 4 5 7

 delete node 4

 prev =4
 node = 4

 node.val = node.next.val  =  4 = 5   = > 5

 prev = 4;
 node = node.next = 4 =5  => 5

2nd time loop
 node.val = node.next.val =  5 = 7  = 7

 prev = 5;

 node= node.next = 5 = 7 = 7;

 loop exit.
prev 5. prev.next  == null.

 */