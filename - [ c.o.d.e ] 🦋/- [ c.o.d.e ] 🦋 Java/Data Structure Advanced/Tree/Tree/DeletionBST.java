package com.company.Trees;

public class DeletionBST {

    public static Node deleteInBST(Node root, int k)
    {
        // Base case
        if (root == null)
            return root;

        // Recursive calls for ancestors of
        // node to be deleted
        if (root.data > k)
        {
            root.left = deleteInBST(root.left, k);
            return root;
        }
        else if (root.data < k)
        {
            root.right = deleteInBST(root.right, k);
            return root;
        }

        // We reach here when root is the node
        // to be deleted.

        // If one of the children is empty
        if (root.left == null)
        {
            Node temp = root.right;
            return temp;
        }
        else if (root.right == null)
        {
            Node temp = root.left;
            return temp;
        }

        // If both children exist
        else
        {
            Node succParent = root;

            // Find successor
            Node succ = root.right;

            while (succ.left != null)
            {
                succParent = succ;
                succ = succ.left;
            }

            // Delete successor. Since successor
            // is always left child of its parent
            // we can safely make successor's right
            // right child as left of its parent.
            // If there is no succ, then assign
            // succ->right to succParent->right
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;

            // Copy Successor Data to root
            root.data = succ.data;

            return root;
        }
    }
}
/*
// Information about the class
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
/*
Input:
2
3
2 1 3 N N N N
2
9
1 N 2 N 8 5 11 4 7 9 12
9

Output:
1 3
1 2 4 5 7 8 11 12

Explanation:-
Fortest1:-
before deletion:-
                                   2
                                 /   \
                               1      3

after deletion:-
                                     1
                                       \
                                         3
 */