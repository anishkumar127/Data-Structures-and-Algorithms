// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    private static void helper(Node root, ArrayList<Integer>ref){
        if(root==null) return;
        
        // root left right . preOrder
        
        ref.add(root.data);
        helper(root.left,ref);
        helper(root.right,ref);
    }

}
