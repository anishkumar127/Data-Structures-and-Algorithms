https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem

public static int height(Node root) {
      	if(root==null) return -1;
        return 1+ Math.max(height(root.left),height(root.right));
    }