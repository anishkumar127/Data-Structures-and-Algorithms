
/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       
       ArrayList<Integer> ans = new ArrayList<>();
       helper(root,ans);
       return ans;
    }
    private void helper(Node root, ArrayList<Integer>ref){
        if(root==null) return;
        
        // left right root postOrder
        
        helper(root.left,ref);
        helper(root.right,ref);
        ref.add(root.data);
    }
}
