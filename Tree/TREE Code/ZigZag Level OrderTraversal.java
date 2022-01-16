
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null){
            return ans;
        }
        
        int level = 0;
        LinkedList<TreeNode> mq = new LinkedList<>();
        LinkedList<TreeNode> cq = new LinkedList<>();
        
        mq.add(root);
        List<Integer> list = new ArrayList<>();
        while(!mq.isEmpty()){
            TreeNode node = mq.removeLast();
            
            list.add(node.val);
            
            if(level%2 == 0){
                if(node.left != null){
                    cq.add(node.left);
                }
                if(node.right != null){
                    cq.add(node.right);
                }
            }else{
                if(node.right != null){
                    cq.add(node.right);
                }
                if(node.left != null){
                    cq.add(node.left);
                }
            }
            
            if(mq.isEmpty()){
                mq = new LinkedList<>(cq);
                cq.clear();
                ans.add(new ArrayList<>(list));
                list.clear();
                level++;
            }
        }
        
        return ans;
    }
}

// 2nd solution


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     
       
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean flag = false;

        if(root==null){
              return res;
        }
          
        q.add(root);
    
        while(!q.isEmpty()){
                int nodeCount = q.size();
                List<Integer> li = new ArrayList<>();

                while(nodeCount> 0)
                {
                    TreeNode node = q.poll();
                    li.add(node.val);
                    if(node.left != null){
                        q.add(node.left);
                    } 
                    if(node.right != null) {
                        q.add(node.right);
                    }
                    nodeCount--;
                }
                if(flag)
                    Collections.reverse(li);
                     res.add(li);
                     flag = !flag;
            }
        return res;
    }
}








/*
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
*/

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
