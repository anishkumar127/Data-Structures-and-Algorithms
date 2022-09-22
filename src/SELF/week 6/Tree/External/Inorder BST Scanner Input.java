import java.util.*;

public class Main {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int data){
        if(root==null){
            root=new Node(data);
            return root;
        }

        if(root.data>data){
            // left subtree
           root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }
  public static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       Node root = null;

      int n = sc.nextInt();
      int[] arr= new int[n];
      
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      for(int i=0; i<n; i++){
        root = insert(root,arr[i]);
      }
        inOrder(root);
        System.out.println();
    }
}



You are given the number of nodes present in the tree. You have to input the nodes and form a Binary Search Tree (BST).

BST should be formed in way like:

Let us consider an array named Val having the values of the nodes. Here, Val[0] will the root of BST. Then, you have to insert Val[1] in the BST, then insert Val[2] in the BST and so on....

After forming the BST, print the Inorder traversal of the BST.

Input
The first line contains an integer n, the number of nodes.
The next line inputs the value of n nodes.

Constraints:
1 <= n <= 500
-1000 <= Val[node] <= 1000

Output
Print the inorder traversal of the tree as a single line of space-separated values.

Example
Input:
6

1 2 5 3 4 6
Output:
1 2 3 4 5 6 
Explanation:
The BST is like :-
     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4
  
So,the inorder traversal of tree results in 1,2,3,4,5,6 
as the required result.
