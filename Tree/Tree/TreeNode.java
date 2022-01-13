//package com.company.Trees;
//
//public class TreeNode {
//    public static void main(String[] args) {
//
//    }
//}
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//
//class Pair {
//    int height;
//    int diameter;
//}
//
//class Solution {
//    // for evry node, we are calc the height
//    // O(n^2).
//    public int diameterOfBinaryTree(Node root) {
//        // if (root == null) {
//        //     return 0;
//        // }
//        // int lh = height(root.left);
//        // int rh = height(root.right);
//        // int ld = diameterOfBinaryTree(root.left);
//        // int rd = diameterOfBinaryTree(root.right);
//        // return Math.max(lh + rh, Math.max(rd, ld));
//        Pair ans = diameter(root);
//        return ans.diameter;
//    }
//
//    public Pair diameter(Node root) {
//        Pair ans = new Pair();
//        if (root == null) {
//            ans.height = 0;
//            ans.diameter = 0;
//            return ans;
//        }
//        Pair leftAns = diameter(root.left);
//        Pair rightAns = diameter(root.right);
//
//        ans.height = Math.max(leftAns.height, rightAns.height) + 1;
//        ans.diameter = Math.max(leftAns.height + rightAns.height, Math.max(leftAns.diameter,                                                                  rightAns.diameter));
//        return ans;
//    }
//
//    // O(n)
//    public int height(Node root) {
//        if (root == null) {
//            return 0;
//        }
//        return Math.max(height(root.left), height(root.right)) + 1;
//    }
//}