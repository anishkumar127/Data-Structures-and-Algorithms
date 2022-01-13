package com.company.Trees;

public class Mirror {
    public static boolean checkIfMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        boolean ans1 = checkIfMirror(root1.left, root2.right);
        boolean ans2 = checkIfMirror(root1.right, root2.left);
        return ans1 && ans2;
    }
}


/*
Given two Binary Trees, write a function that returns true if two trees are mirror of each other, else false.
For example, the function should return true for following input trees

                     1                                     1
                 3       2                           2            3
                       5    4                  4         5

 */


