package com.company.Trees;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
        this.left =null;
        this.right=null;
    }

    public Node(int data, Node leftChild, Node rightChild) {
        this.data = data;
        this.left=leftChild;
        this.right=rightChild;
    }
}
