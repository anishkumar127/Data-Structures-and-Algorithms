/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    public static int findMax(Node root){
       if(root==null) return 0;
       if(root.right!=null) return findMax(root.right);
       return root.data;
    }
    public static int findMin(Node root){
       if(root==null) return 0;
       if(root.left!=null) return findMin(root.left);
       return root.data;
    }
}

///

class Solution{
    public static int findMax(Node root){
       if(root==null) return Integer.MIN_VALUE;
       else return Math.max(root.data, Math.max(findMax(root.left),findMax(root.right)));
    }
    public static int findMin(Node root){
       if(root==null) return Integer.MAX_VALUE;
       else return Math.min(root.data, Math.min(findMin(root.left),findMin(root.right)));
    }
}



// array list. sorting high tc and sc

class Solution{
   ArrayList<Integer> al = new ArrayList<>();
   public void inorder(Node root){
       if(root==null)return ;
       inorder(root.left);
       al.add(root.data);
       inorder(root.right);
   }
   public  int findMax(Node root){
     inorder(root);
     Collections.sort(al);
     return al.get(al.size()-1);
   }
   public  int findMin(Node root){
     inorder(root);
     Collections.sort(al);
     return al.get(0);
   }

}



Given a Binary Tree, find maximum and minimum elements in it.

Example 1:

Input: 
           
Output: 11 1
Explanation:                           
 The maximum and minimum element in 
this binary tree is 11 and 1 respectively.
Example 2:

Input: 
           6
        / \
       5   8
      /
     2
Output: 8 2
Your Task:
You don't need to read input or print anything. Your task is to complete findMax() and findMin() functions which take root node of the tree as input parameter and return the maximum and minimum elements in the binary tree respectively.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105