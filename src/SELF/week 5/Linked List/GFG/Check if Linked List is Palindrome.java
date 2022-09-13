/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        
        if(head==null || head.next==null)return true;
        
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // revere right half.
        slow.next = reverse(slow.next);
        slow = slow.next; // now slow on right half side. slow open step ahead;
        
        while(slow!=null){
            if(head.data!=slow.data){
                return false;
            }
            slow  = slow.next;
            head = head.next;
        }
        return true;
    }   
    
    private static Node reverse(Node head){
        Node dummyHead = null;
        while(head!=null){
            Node next = head.next; // storing next
            head.next = dummyHead; // head now pointing to null. 
            dummyHead = head;
            head = next;
        }
        return dummyHead;
    }
}

