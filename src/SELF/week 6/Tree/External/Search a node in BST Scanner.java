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
  public static boolean search(Node root,int key){
        if(root==null) return false;

        if(root.data>key){
            // left search
            return search(root.left,key);
        }else if(root.data==key){
            return true;
        }else{
            return search(root.right,key);
        }
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Node root = null;
       int n = sc.nextInt();
       int values[] = new int [n];
       int key = sc.nextInt();
       for(int i=0; i<n; i++){
         values[i]= sc.nextInt();
         root = insert(root,values[i]);
       }
        // inOrder(root);
        if(search(root,key)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

      
    }
}



Search a node in BST
You are given N nodes and have to form BST from it. You are given a node value X, find if node with value X is present in the formed BST or not.

Input
The first line inputs N, the number of nodes and X, value of the node to find.
The second line inputs the value of N nodes of the BST.

Constraints:
1 <= N <= 1000
-1000 <= val[node] <= 1000

Output
Print "YES" if node is present else "NO" in a new line.

Example
Input:
7 87
2 81 42 87 90 42 45 66
Output:
YES
Explaination:
   2
    \
    81
   /  \
  42   87
 /  \   \
45  66   90

As 87 is present in the given nodes , so the output will be YES.