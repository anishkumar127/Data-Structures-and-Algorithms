package com.company.Trees;

public class LCATree {

    public static void main(String[] args) {
        Node root = TreeInputOutput.input();
//        System.out.println(lca(root,4,5));
    }

    public static Node LcaTreeNode(Node root, Node p, Node q){
        return lca(root,p,q);
    }

    public static Node lca(Node root, Node p, Node q){
        if(root ==null){
            return  null;
        }
        if(root.data == p.data || root.data == q.data){
            return root;
        }

        Node leftAns = lca(root.left,p,q);
        Node rightAns = lca(root.right,p,q);
// p and q are prsent in diff subtree

        if(leftAns !=null && rightAns !=null){
            return root;
        }
        if(leftAns!=null){
            return leftAns;
        }
        return  rightAns;

    }

    public static  boolean isPresent(Node root, int el){
        if(root ==null){
            return false;
        }
        if(root.data==el){
            return true;
        }

        boolean leftAns = isPresent(root.left,el);
        boolean rightAns = isPresent(root.right,el);
        return leftAns || rightAns;
    }
}

//
//class Solution {

    /*
    LCA - lowest common ancestor
    -> if A is ancestor to B, then A is LCA of(A, B)
    LCA of 0, 8 = 1
    LCA of 7, 2 = 2
    LCA for 6, 7 = 5
    LCA of 2, 8 = 3
    LCA of 7,3 = 3
    LCA of 7, 5 = 5

    LCA of 7, 0 = ?

    root is equal to eoither p or q, root is the answer

    {Hey rec, go ahead and find me the ay of the nodes which is present in
    left or right subtree}

    leftAns = hey rec, find the lca in left subtree = 6
    rightAns = hey rec, find the lca in right subtree = null

    if leftAns and rightAns, both are not null, root is the answer.

    case1 : if root is either p or q
    case 2 : p is in leftSubtree and q in right subtree
    case 3: p and q, both are in leftsubtree
    leftAns != null , rightAns == null, leftAns is your answer.
    case 4 : p and q are in right subtree
    rightAns != null , leftAns == null, rightAns is your answer
    */

//1st method
//     return lca(root,p, q);
// }
// return null;