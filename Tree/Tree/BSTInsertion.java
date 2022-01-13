package com.company.Trees;

public class BSTInsertion {

    static Node insertInBST(Node root,int key)
    {
        if(root == null)
            root = new Node(key);

        if(root.data > key)
            root.left = insertInBST(root.left, key);

        if(root.data < key)
            root.right = insertInBST(root.right, key);

        return root;
    }
}
 /*
    // Information about the Node class
    class Node
    {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    */
/*
Input:
2
2 1 3
4
2 1 3 N N N 6 4
1

Output:
1 2 3 4
1 2 3 4 6

Explanation:
Testcase 1: After inserting the node 4 the tree will be
                                          2
                                      /        \
                                    1          3
                                                   \
                                                    4
Inorder traversal will be 1 2 3 4.
Testcase 2: After inserting the node 1 the tree will be
                                         2
                                    /           \
                                  1            3
                                /     \       /     \
                              N     N     N     6
                                                   /
                                                 4
Inorder traversal of the above tree will be 1 2 3 4 6.
 */