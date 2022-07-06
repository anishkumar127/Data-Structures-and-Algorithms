package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;
/*
Note:- this should be inside Node.java file otherwises not work
   public Node(int data, Node leftChild, Node rightChild) {
        this.data = data;
        this.left=leftChild;
        this.right=rightChild;
    }
 */
public class ConstructBST {

    public static void main(String[] args) {
        int [] arr={12,25,37,50,62,75,87};
        Node root =construct(arr,0,arr.length-1);
        display(root);

    }
    public static Node construct(int[] arr,int lo, int hi){
        if(lo>hi){
            return null;
        }
        int mid = (lo+hi)/2;
        int data = arr[mid];
        Node leftChild =construct(arr,lo,mid-1); // small value.
        Node rightChild = construct(arr,mid+1,hi); // big value.

        Node node = new Node(data,leftChild,rightChild);
        return  node;
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
