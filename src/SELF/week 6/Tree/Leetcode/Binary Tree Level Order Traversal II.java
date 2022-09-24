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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root==null)return ans;
        
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int n = q.size();
          // for(int i=0; i<n; i++){
            while(n-->0){
              TreeNode temp = q.poll();
              list.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
              if(temp.right!=null){
                q.offer(temp.right);
              }
                // n--;
          }  
            ans.add(list);
        }
        
// [[3],[9,20],[15,7]] before
        Collections.reverse(ans);  // after [[15,7],[9,20],[3]]
        return ans;
    }
}