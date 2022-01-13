package com.company.Trees;
// Level order Traversal.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeInputOutput {
    public static void main(String[] args) {
        Node root = input();
        display(root);
    }
    public static Node input(){
        Scanner sc= new Scanner(System.in);
        Queue<Node> que= new LinkedList<>();
        int n = sc.nextInt();
        if(n==-1){
            return null;
        }
        Node root = new Node(n);
        que.add(root);
        while(!que.isEmpty()){
            Node curr = que.poll();
            int left = sc.nextInt();
            if(left!=-1){
                Node leftChild = new Node(left);
                que.add(leftChild);
                curr.left=leftChild;
            }
            int right = sc.nextInt();
            if(right !=-1){
                Node rightChild = new Node(right);
                que.add(rightChild);
                curr.right=rightChild;
            }
        }
        return root;
    }
    public static void display(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int size = que.size();
            while(size -- >0){
                // size>0
                Node curr = que.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
                // size--; levelSize
            }
            System.out.println();
        }
    }
}
