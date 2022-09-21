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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if(root==null) return list;
        
        s.push(root);
        while(!s.isEmpty()){
            TreeNode curr = s.pop();
            list.add(curr.val);
            if(curr.right!=null) s.push(curr.right);
            if(curr.left!=null) s.push(curr.left);
        }
        
        return list;
    }
}