O(n^2);

class Solution {
    // Function to return the diameter of a Binary Tree.
     int diameter(Node root) {
      if(root==null) return 0;   
        int lhs = diameter(root.left);
        int rhs = diameter(root.right);
        int h = height(root.left) + height(root.right)+1;
        return Math.max(h,Math.max(lhs,rhs));
    }
    private int height(Node root){
        if(root==null) return 0;
        int lhs = height(root.left);
        int rhs = height(root.right);
        return Math.max(lhs,rhs)+1;
    }
}

/*
get left sub tree
get right sub tree
get hiight of lef and right +1 root.
and found max.
and then return max. 


*/