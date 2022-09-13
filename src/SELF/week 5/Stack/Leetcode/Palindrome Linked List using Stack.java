tc O(n);
sc O(n);

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
        ListNode temp_node = head;
        Stack<Integer> stack = new Stack<>();
        
        while(temp_node!=null){
            stack.push(temp_node.val);
            temp_node = temp_node.next;
        }
        
        temp_node = head;
        
        while(temp_node!=null){
            if(temp_node.val!=stack.pop()){
                return false;
            }
            
            temp_node = temp_node.next;
        }
        
        return true;
    }
}