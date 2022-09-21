
/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    private void helper(Node root, ArrayList<Integer>refVal){
        if(root==null) return;
        helper(root.left,refVal);
        refVal.add(root.data);
        helper(root.right,refVal);
    }
}
