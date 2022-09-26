// class Node
// {
//     int data;
//     Node left, right;

//           public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    int ans =-1;
    int count =1;
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int k) {
        int count=1;
       inOrder(root,k);
        return ans;
    }
   
    public void inOrder(Node root, int k){
        if(root==null) return;
        inOrder(root.left,k);
        if(count==k){
             ans = root.data;
             count++;
             return;
        }else{
            count++;
        }
        inOrder(root.right,k);
    }
}