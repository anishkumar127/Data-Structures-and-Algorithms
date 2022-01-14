package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightTreeIterative {
    static Node root;
    public static void main(String[] args) {
        HeightTreeIterative tree = new HeightTreeIterative();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(5);
        tree.root.right.left= new Node(6);
        tree.root.right.right= new Node(7);
        System.out.println(tree.heightIterative(root));
    }
    public int heightIterative(Node root){
        if(root==null){
            return -1;
        }
        Queue<Node>que = new LinkedList<>();

        que.add(root);
        int height =0;

        while(true){
            int size = que.size();
            if(size==0){
                break;
            }
            while (size>0){
                Node t = que.remove();
                if(t.left !=null){
                    que.add(t.left);
                }
                if(t.right!=null){
                    que.add(t.right);
                }
                size--;
            }
            height = height+1;
        }
        return height;
    }
}
