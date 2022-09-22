package Tree;

import java.util.*;

public class Main {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);

            return newNode;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        6
//        1 2 5 3 4 6

        int n = sc.nextInt();
        int nodes[] = new int[n];
        for(int i=0; i<n; i++){
            nodes[i]  = sc.nextInt();
        }
//        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);
        System.out.println("Preorder");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder");
        postOrder(root);

    }
    static void preOrder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root==null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}