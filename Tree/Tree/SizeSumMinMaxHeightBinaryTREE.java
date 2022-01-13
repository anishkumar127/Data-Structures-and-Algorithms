package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SizeSumMinMaxHeightBinaryTREE {
    // Size and Sum Same BST & TREE.
    public static void main(String[] args) {
        int [] arr={1, 2, 3 ,4 ,5 ,6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        // 1 2 3 4 5 6 7 8 9 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
        Node root =input(arr);
        int size = size(root);
        int sum = sum(root);
        int max=max(root);
        System.out.println(size); // 9
        System.out.println(sum); //45
        System.out.println(max); // 9

        display(root);

    }
    public static int size(Node root){
        if(root ==null){
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        int totalSize = leftSize+rightSize+1;
        return totalSize;
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

    public static int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftMax = max(root.left);
        int rightMax=max(root.right);
        int totalMax=Math.max(root.data,Math.max(leftMax,rightMax));
        return totalMax;
    }
    public static int height(Node root){
//        depth of depeest node is height
        if(root ==null){
            return -1; // -1 for eges , 0 for nodes.
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int totalHeight = Math.max(leftHeight,rightHeight)+1;
        return totalHeight;
    }

    // input level order
    public static Node input(int arr[]){
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
// display
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
