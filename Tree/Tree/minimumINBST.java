package com.company.Trees;

public class minimumINBST {

    static int minValue(Node node)
    {
        if(node==null)
        {
            return Integer.MAX_VALUE;
        }
        int lm=minValue(node.left);
        int rm=minValue(node.right);
        int tm=Math.min(node.data,Math.min(lm,rm));
        return tm;

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
Input:
2
5 4 6 3 N N 7 1
9 N 10 N 11

Output:
1
9

Explanation:
Testcase 1: We construct the following BST by inserting given values one by one in an empty BST.
            5
          /     \
       4         6
     /              \
   3                7
   /
 1

The minimum value in the given BST is 1.
Testcase 2: We construct the following BST by inserting given values one by one in an empty BST.
             9
                \
                10
                    \
                    11
The minimum value in the given BST is 9.
 */