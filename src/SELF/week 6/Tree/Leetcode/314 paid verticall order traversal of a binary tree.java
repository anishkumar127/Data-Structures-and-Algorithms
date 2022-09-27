
https://leetcode.com/problems/binary-tree-vertical-order-traversal/
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer,List<Integer>> tmap = new TreeMap<>();
        if(root==null) return ans;
        levelOrder(root,0,tmap);
        ans.addAll(tmap.values());
        return ans;
    }
    void levelOrder(TreeNode root, int index ,TreeMap<Integer,List<Integer>>tmap){
         Queue<TreeNode> que = new LinkedList<>();
         Queue<Integer> lines = new LinkedList<>();
         que.add(root);
         lines.add(0);
        while(que.size()>0){
            TreeNode curr = que.poll();
            int idx = lines.poll();
            
            if(!tmap.containsKey(idx)){
               tmap.put(idx, new ArrayList<>());
            }
               tmap.get(idx).add(curr.val);
            
            if(curr.left!=null){
                que.add(curr.left);
                lines.add(idx-1);
            }
            if(curr.right!=null){
                que.add(curr.right);
                lines.add(idx+1);
            }
        }
    }
}