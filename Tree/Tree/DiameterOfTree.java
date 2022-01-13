package com.company.Trees;

class Pair{
    int height;
    int diameter;
}
public class DiameterOfTree {
    public static void main(String[] args) {
        Node root = TreeInputOutput.input();
        System.out.println(diameterTree(root));
    }


   public static int diameterTree(Node root){
       Pair ans = diameter(root);
       return ans.diameter;
   }
   public static Pair diameter(Node root){
       Pair ans = new Pair();
       if(root ==null){
           ans.height=0;
           ans.diameter=0;
           return ans;
       }
       Pair leftAns = diameter(root.left);
       Pair rightAns = diameter(root.right);
       ans.height = Math.max(leftAns.height, rightAns.height)+1;
       ans.diameter=Math.max(leftAns.height + rightAns.height, Math.max(leftAns.diameter,rightAns.diameter));
       return ans;
   }

   // O(N);
    public int height(Node root){
       if(root==null){
           return 0;
       }
       return Math.max(height(root.left),height(root.right))+1;
    }
}

/*
*
*  // for evry node, we are calc the height
    // O(n^2).
    public int diameterTree(TreeNode root) {
        // if (root == null) {
        //     return 0;
        // }
        // int lh = height(root.left);
        // int rh = height(root.right);
        // int ld = diameterOfBinaryTree(root.left);
        // int rd = diameterOfBinaryTree(root.right);
        // return Math.max(lh + rh, Math.max(rd, ld));
*
* */
