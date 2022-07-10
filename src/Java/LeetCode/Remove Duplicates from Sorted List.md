```class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head;
        while(current_node!=null && current_node.next!=null){
            if(current_node.next.val == current_node.val){
                current_node.next = current_node.next.next;
            }else{
                current_node = current_node.next;
            }
        }
        return head;
    }
}

```
```
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode pre = head;
        
        while (cur != null) {
            if (cur.val == pre.val) {
                cur = cur.next;
            }
            else {
                pre.next = cur;
                pre = pre.next;
            }
        }
        if (pre != null)// handle [1,1,1] etc...
            pre.next = null;
        
        return head;
    }
}
```