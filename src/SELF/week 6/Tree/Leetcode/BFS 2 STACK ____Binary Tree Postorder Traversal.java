class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        if(root==null) return ans;
        st1.push(root);  // first push root into stack1.
        while(!st1.isEmpty()){
            TreeNode curr = st1.pop(); // pop out 1st value.
            st2.push(curr); // push into stack 2.
            if(curr.left!=null) st1.push(curr.left); // before push store left and right value into stack 1.
            if(curr.right!=null) st1.push(curr.right);
        }
        
        while(!st2.isEmpty()){     // construct postorder into stack 2. and push into list.
            ans.add(st2.pop().val);
        }
        return ans;
    }
}