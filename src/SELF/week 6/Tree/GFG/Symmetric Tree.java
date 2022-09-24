/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
     if(root==null) return true;
     return isMirror(root.left,root.right);
    }
    public static boolean isMirror(Node left , Node right){
        if(left==null && right==null) return true;
        if(left==null || right == null) return false;
        if(left.data!=right.data) return false;
        return isMirror(left.left, right.right) && isMirror(left.right,right.left);        
    }
}


Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.

Example 1:

Input:
         5
       /   \
      1     1
     /       \
    2         2
Output: True
Explanation: Tree is mirror image of
itself i.e. tree is symmetric
Example 2:

Input:
         5
       /   \
      10     10
     /  \     \
    20  20     30
Output: False
Your Task:
You don't need to read input or print anything. Your task is to complete the function isSymmetric() which takes the root of the Binary Tree as its input and returns True if the given Binary Tree is the same as the Mirror image of itself. Else, it returns False.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
0<=Number of nodes<=100