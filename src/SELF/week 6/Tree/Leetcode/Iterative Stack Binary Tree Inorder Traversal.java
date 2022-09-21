
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            list.add(curr.val);
            curr=curr.right;
        }
        
        return list;
    }
}


/*
simple run loop. until any condition null.
like root null or stack is empty;

so. 

first curr!= null then push element into stack. 
and push left of tree into stack.
when left reach null.
loop break.
and then pop value.
and add value into list.
and then
put right of tree into curr.
and curr not null. then it will process same.
if will go that right node left. if left null. then it will come out from loop.
and then pop and push into list.
one more case.
if no left. and no right.
then check if stack is empty or not.
if not empty then pop into stack. and push into list.
and then stack become empty.
and curr while also point to null.
because of.
curr = curr.right. and curr have null. so both condition are false. 
loop will break. and we come out from the stack.
and return the list.
*/











I use pushAllLeft() to push all the left children of one Node into the stack, so that my idea looks clear:

We push all the left children of root into the stack until there's no more nodes.
Then we pop from the stack which we'd call cur.
Add cur to result list
Recursively call pushAllLeft() on cur's right child.
Below is my Java code.

public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;

    Stack<TreeNode> stack = new Stack<>();
    pushAllLeft(root, stack);
    while (!stack.isEmpty()) {
        TreeNode cur = stack.pop();
        res.add(cur.val);
        pushAllLeft(cur.right, stack);
    }
    return res;
}

public void pushAllLeft(TreeNode node, Stack stack){
    while (node != null) {
        stack.add(node);
        node = node.left;
    }
}

