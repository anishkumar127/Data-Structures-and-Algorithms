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
    static int count =Integer.MAX_VALUE; 
  public static void InOrder(Node root){
        if(root==null) return;
       
        count = Math.min(count,root.data);
        InOrder(root.left);
      // System.out.print(root.data+" ");
        InOrder(root.right);
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Node root = null;
       int n = sc.nextInt();
       int values[] = new int [n];
    
       for(int i=0; i<n; i++){
         values[i] = sc.nextInt();
        root = insert(root,values[i]);
       }
       
      InOrder(root);
      System.out.println(count);

    }
}


You are given N nodes and have to form BST from it. The task is to find the minimum element in this BST.

Input
The first line inputs N, the number of nodes.
The second line inputs the value of N nodes of the BST.

Constraints:
1 <= N <= 1000
-1000 <= Val[node] <= 1000

Output
Print the minimum value of the BST in a new line.

Example
Input:
7
2 81 42 87 90 41 66
Output:
2
Explaination:
     2
      \
      81
     /  \
   42    87
  /  \    \
 41   66   90

The minimum in the BST is 2.