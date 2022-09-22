import java.util.*;
// 2 81 42 41 44 87 90 

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
        }else if(root.data<data){
            root.right = insert(root.right,data);
        }
        return root;
    }
  public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Node root = null;
       int n = sc.nextInt();
       int values[] = new int [n];
       int key = sc.nextInt();
       for(int i=0; i<n; i++){
         values[i] = sc.nextInt();
        root = insert(root,values[i]);
       }
      for(int i=0; i<n; i++){
        root= insert(root,key);
      }
      preOrder(root);

    }
}


You are given N nodes and have to form BST from it.
You are given a key K, if K is not present in the BST, insert a new Node with a value equal to K into the BST.
Note: If K is already present in the BST, do not modify the BST.

Input
The first line inputs N, the number of nodes and K, key.
The second line inputs the value of N nodes of the BST.

Constraints:
1 <= N <= 1000
-1000 <= Val[node],K <= 1000

Output
Print the PreOrder traversal of the BST in a new line.

Example
Input:
7 44
2 81 42 87 90 42 41
Output:
2 81 42 41 44 87 90 
Explaination:
   2
    \
    81
   /  \
  42   87
 /  \   \
41  44   90

As 44 is not present in the given nodes, so the tree will 
change and preorder of the updated tree is 2 81 42 41 66 44 87 90.