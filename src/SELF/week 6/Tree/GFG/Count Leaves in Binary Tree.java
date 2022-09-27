/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Tree
{
    private int count = 0;
    int countLeaves(Node root) 
    {
        if(root==null) return 0;
        
        if(root.left==null && root.right==null) {
            count++;
        }
         countLeaves(root.left);
         countLeaves(root.right);
         return count;
        
    }
}


