https://leetcode.com/problems/merge-two-sorted-lists/


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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode dummyTail = dummy;
        
        while(list1!=null && list2!=null){
            if(list1.val <=list2.val){
                dummyTail.next = list1;         // putting the value next of the dummytail. 
                list1 = list1.next;     // example i++;
            }else{
                dummyTail.next = list2;
                list2 = list2.next;         // example j++;
            }
            dummyTail = dummyTail.next;     // example  k ++;
        }
        
        // if some list size no equal. any list left then put it on dummy list.
        if(list1!=null) dummyTail.next = list1;
        if(list2!=null) dummyTail.next = list2;
        
        return dummy.next;    // dummy null 1 1  2 3 so se return dummy.next;
        
    }
}


