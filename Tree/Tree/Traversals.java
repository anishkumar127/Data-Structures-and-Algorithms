package com.company.Trees;

import java.util.Stack;

// Depth First Search
// Recursively
public class Traversals {
    public static void main(String[] args) {
        Node root = TreeInputOutput.input();
        preOrder(root); // recursive
        System.out.println();
        inOrder(root); // recursive
        System.out.println();
        postOrder(root);  // recursive

        // iterative start.
        System.out.println();
        preOrderIterative(root);  // iterative
        System.out.println();
        postOrderIterative(root); // iterative
        System.out.println();
        inOrderIterative(root); //iterative
    }
//    root left right
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // left right root
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // left root right
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // iterative start //    root left right
    public static void preOrderIterative(Node root){
        if(root ==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right !=null){
                stack.push(temp.right);
            }
            if(temp.left !=null){
                stack.push(temp.left);
            }
        }
    }
//        Iterative // left right root
    public static void postOrderIterative(Node root){
        Node current = root;
        Stack<Node> stack = new Stack<>();
        while (current!=null || !stack.isEmpty()) {
            if(current !=null){
                stack.push(current);
                current= current.left;
            }else{
                Node temp = stack.peek().right;
                if(temp ==null){
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                    while(!stack.isEmpty() && temp ==stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else{
                    current=temp;
                }
            }
        }
    }

    // itrative
    public static void inOrderIterative(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while(!stack.isEmpty() || temp!=null){
            if(temp !=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }

}
