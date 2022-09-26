class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>  ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root==null) return ans;
         TreeNode node = root;
        while(!st.isEmpty() || node!=null ){
                if(node!=null){
                    st.push(node);  // also push into stack. node to after reach null get access.
                    node = node.left; // go to left most. until not reach null.
                }else{
                     node = st.pop(); // get node direction. from top of stack.
                     ans.add(node.val);  // print it.
                     node = node.right; // move to right.
                } 
        }
        return ans;
    }
}