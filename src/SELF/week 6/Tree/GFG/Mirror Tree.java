// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
       if(root == null) return ;

        mirror(root.left);
        mirror(root.right);
        // swap
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}


Given a Binary Tree, convert it into its mirror.
MirrorTree1            

Example 1:

Input:
      1
    /  \
   2    3
Output: 3 1 2
Explanation: The tree is
   1    (mirror)  1
 /  \    =>      /  \
2    3          3    2
The inorder of mirror is 3 1 2
Example 2:

Input:
      10
     /  \
    20   30
   /  \
  40  60
Output: 30 10 60 20 40
Explanation: The tree is
      10               10
    /    \  (mirror) /    \
   20    30    =>   30    20
  /  \                   /   \
 40  60                 60   40
The inroder traversal of mirror is
30 10 60 20 40.
Your Task:
Just complete the function mirror() that takes node as paramter  and convert it into its mirror. The printing is done by the driver code only.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105