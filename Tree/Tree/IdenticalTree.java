package com.company.Trees;

public class IdenticalTree {
    public static boolean isIdentical(Node root1, Node root2)
    {

        // return true or false if both trees are identical or not
        if(root1 ==null && root2 == null){
            return true;
        }
        if(root1 == null || root2 ==null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }
        boolean ans1 = isIdentical(root1.left , root2.left);
        boolean ans2 = isIdentical(root1.right, root2.right);
        return ans1 && ans2;
    }
}
