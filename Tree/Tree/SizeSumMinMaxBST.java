package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SizeSumMinMaxBST {
// Size and Sum Same BST & TREE.
public static void main(String[] args) {
    int [] arr={12,25,37,50,62,75,87};
//    Node root =construct(arr,0,arr.length-1);
    Node root = construct(arr,0, arr.length-1);
    int size = size(root);
    int sum = sum(root);
    int max=max(root);
    int min=min(root);
    boolean find=find(root,75);
    System.out.println(size); // 7
    System.out.println(sum); //348
    System.out.println(max); // 87
    System.out.println(min); //12
    System.out.println(find); //true
    display(root);

}
    public static int size(Node root){
        if(root ==null){
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        int totalSize = leftSize+rightSize+1;
        return  totalSize;
    }

    public static int sum(Node root){
        if(root ==null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int totalSum = leftSum+rightSum+root.data;
        return  totalSum;
    }
//    BST max
    public static int max(Node root){
        if(root.right!=null){
            return max(root.right);
        }else{
            return root.data;
        }
    }
    public static int min(Node root){
    if(root.left!=null){
        return min(root.left);
    }else{
        return root.data;
    }
    }
// logn BST & O(N) TREE.
    public static boolean find(Node root,int data){
        if(root==null){
            return false;
        }
        if(data>root.data){
            return find(root.right,data);
        }else if(data<root.data){
            return find(root.left,data);
        }else{
            return true;
        }
    }
    // construct array in BST.
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
