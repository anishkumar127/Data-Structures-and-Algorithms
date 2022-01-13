package com.company.Trees;

public class LCABST {

    static Node LCA(Node node, int n1, int n2)
    {
        if (node == null)
            return null;

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2)
            return LCA(node.left, n1, n2);

        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2)
            return LCA(node.right, n1, n2);

        return node;
    }
}
    /*
// Information about the class Node
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
Sample Input
2
5 4 6 3 N N 7 N N N 8
7 8
2 1 3
1 3

Sample Output
7
2

Explanation:
Testcase1:
The BST in above test case will look like
    5
   /  \
  4  6
 /      \
3        7
            \
             8
Here the LCA of 7 and 8 is 7.
 */
