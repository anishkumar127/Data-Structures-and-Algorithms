class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null) return -1;
        
        Node curr = node;
        while(curr.left!=null){
            curr = curr.left;
        }
        return curr.data;
    }
}



class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        if(root==null) return -1;
        
        if(root.left!=null) return minValue(root.left);
        
        return root.data;
    }
}









// failing this way.
class Tree {
    // Function to find the minimum element in the given BST.
     static int min = Integer.MAX_VALUE;
    int minValue(Node node) {
       InOrder(node);
       return min;
    }
    private static void InOrder(Node node){
        if(node==null) return;
          InOrder(node.left);
          min = Math.min(min,node.data);
          InOrder(node.right);
         
    }
}
