package com.company.Trees;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
/*
 7
2 4
5 3
-1 -1
-1 7
6 -1
-1 -1
-1 -1
* // output :- 3
* */
public class CountLeavs {
        static int count=0;
        public static class Node {
            int x;
            int y;

            Node(int x , int y) {
                this.x=x;
                this.y=y;

            }
            int getx()
            {
                return x;
            }
            int gety()
            {
                return y;
            }
        }
        public static void preorder(Node[] tree , int val)
        {
            if(val==-1)
            {
                return;
            }
            if(tree[val].x==-1 && tree[val].y==-1)
            {
                count++;
            }
            preorder(tree,tree[val].x);
            preorder(tree,tree[val].y);

        }

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int i,a,b;
            Node tree[] = new Node[n+1];
            for(i=1; i<=n; i++)
            {
                a=sc.nextInt();
                b=sc.nextInt();
                tree[i]=new Node(a,b);
            }
            preorder(tree,1);
            System.out.println(count);


        }
    }

    /*
    Explanation: Given binary tree
                1
               /  \
             2     4
            / \      \
          5    3     7
         /
       6
Node 3, 6, 7 are the leaves here

     */
