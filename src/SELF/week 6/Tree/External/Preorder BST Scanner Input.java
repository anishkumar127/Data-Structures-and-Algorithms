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
      int[] arr= new int[n];
      
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      for(int i=0; i<n; i++){
        root = insert(root,arr[i]);
      }
        preOrder(root);
        System.out.println();
    }
}
