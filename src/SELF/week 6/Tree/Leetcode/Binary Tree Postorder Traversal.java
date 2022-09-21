/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void helper(TreeNode root, List<Integer>ref){
        if(root==null)return;
        helper(root.left,ref);
        helper(root.right,ref);
        ref.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        helper(root,ans);
        return ans;
        
    }
}