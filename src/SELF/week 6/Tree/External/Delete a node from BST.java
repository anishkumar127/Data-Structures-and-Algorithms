import java.util.*;
// 2 81 66 41 87 90 
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
  public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
  }

  // delete node

    public static Node delete(Node root, int data){
        // search part.
        if(root==null) return root;
        if(root.data>data){
            root.left = delete(root.left,data);
        }else if(root.data<data){
            root.right = delete(root.right,data);
        }
        else{
            // root.data == data.

            // case 1. leaf node. left null right null

            if(root.left==null && root.right==null){
                return null; // return null to root parent. it will delete.
            }

            // case 2.  root left null OR root right null.
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            // case 3.  InOrder Successor.
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data; // we will put. inside root data is INORDEr Successor  data.
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    public static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
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
        
        delete(root,key);
        preOrder(root);

    }
}



Delete a node from BST
You are given N nodes and have to form BST from it.You are given a key K, delete node with value K.
Note: If K is not present in the BST, do not modify the BST.

Input
The first line inputs N, the number of nodes and K, key.
The second line inputs the value of N nodes of the BST.

Constraints:
1 <= N <= 1000
-1000 <= Val[node],K <= 1000

Output
Print the preorder traversal of the updated BST in a new line.

Example
Input:
7 42
2 81 42 87 90 41 66
Output:
2 81 66 41 87 90 
Explaination:
     2
      \
      81
     /  \
   42    87
  /  \    \
 41   66   90

As 42 is present in the given nodes, so the node 42 will deleted and the updated tree will be like 

     2
      \
      81
     /  \
   66    87
  /       \
 41       90

The preorder will be 2 81 66 41 87 90.