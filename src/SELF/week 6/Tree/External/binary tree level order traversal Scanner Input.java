package Tree.DiameterTree;

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

    // diameter
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht= ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter(Node root){
        if(root==null){
           return new TreeInfo(0,0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        int height = Math.max(left.ht,right.ht)+1;

        int dia1 = left.diam;
        int dia2 = right.diam;
        int diam3 = left.ht+right.ht+1;

        int mydia = Math.max(Math.max(dia1,dia2),diam3);

        TreeInfo info = new TreeInfo(height,mydia);
        return info;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
13
1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
 */
        int n = sc.nextInt();
        int nodes[] = new int[n];
        for(int i=0; i<n; i++){
            nodes[i]  = sc.nextInt();
        }
//        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        leverOrder(root);
        System.out.println(diameter(root).diam);
    }
    public static void leverOrder(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // its we will use for print level order. for next line printing. level by level. not single line.

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null){  // if null then we do something next line and queue is empty then break.
                System.out.println();
                if(q.isEmpty()){  // if q is empty then we will break it.
                    break;
                }else{    // if not empty then we put null again bcz next line each level.
                    q.add(null);
                }
            }else{   // if not null then we do something.
                System.out.print(curr.data+" ");  // printing the data.
                // checking if anyone not null then putting into queue.
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);

            }
        }
    }

}
