tc O(n);
sc O(n);


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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode>  que = new LinkedList<>();
        if(root==null) return ans;
        que.offer(root);
        int levelCount=0;
        while(!que.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            Stack<Integer> reversal = new Stack();
            int n = que.size();
            while(n-->0){
                TreeNode curr = que.poll();
                if(levelCount%2==0){
                    level.add(curr.val); 
                }else{
                    reversal.add(curr.val);
                }
              
                if(curr.left!=null) que.offer(curr.left);
                if(curr.right!=null) que.offer(curr.right);
            }
            levelCount++;
            while(!reversal.isEmpty()){
                level.add(reversal.pop());
            }
            ans.add(level);
        }
        return ans;
    }
}